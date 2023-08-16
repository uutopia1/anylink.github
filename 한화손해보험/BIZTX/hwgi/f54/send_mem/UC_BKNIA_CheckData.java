package hwgi.f54.send_mem;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import proframe.dbio.system.util.LoggableStatement;
import hwgi.f54.FT_54PP_0000_000_DH0;
import hwgi.f54.FT_54PP_6000_00X_DB0;

import com.tmax.anylink.api.serviceflow.ActivityContext;
import com.tmax.anylink.api.serviceflow.DefaultUserActivity;
import com.tmax.anylink.common.AnyLinkException;
import com.tmax.anylink.logging.Logger;

public class UC_BKNIA_CheckData extends DefaultUserActivity {

	private static final Logger logger = Logger.getLogger(UC_BKNIA_CheckData.class.getName());

	private static final String OPR_TRXCD  = "54"; //고정값
	private static final String TRCODE_KEY = "${sys:F54_MEM_TRCODE}";
	private static final String DS_COMFTP  = "DS_comftp";


	@Override
	public void action(ActivityContext ctx) throws AnyLinkException {
		
		FT_54PP_0000_000_DH0         var_FT_54PP_0000_000_DH0         = (FT_54PP_0000_000_DH0)ctx.getVariableContent("var_FT_54PP_0000_000_DH0");
		FT_54PP_6000_00X_DB0         var_FT_54PP_6000_00X_DB0         = (FT_54PP_6000_00X_DB0)ctx.getVariableContent("var_FT_54PP_6000_00X_DB0");
		FT_54PP_MSF_DIST_BBS_SEL_DB0 var_FT_54PP_MSF_DIST_BBS_SEL_DB0 = (FT_54PP_MSF_DIST_BBS_SEL_DB0)ctx.getVariableContent("var_FT_54PP_MSF_DIST_BBS_SEL_DB0");
		
		Context initCxt = null;
		DataSource ds = null;
		
		// 개시전문 검증 필요 항목
		String tranCode = var_FT_54PP_0000_000_DH0.getTranCode().trim();  //(000_DH0)트랜젝션코드
		String orgCd    = var_FT_54PP_0000_000_DH0.getOrgCode();          //(000_DH0)송신기관코드
		String fileCode = var_FT_54PP_0000_000_DH0.getFileCode();         //(000_DH0)거래구분코드(파일코드)
		String tranDate = var_FT_54PP_6000_00X_DB0.getTranDate();         //(00X_DB0)전문기준일자
		String userId   = var_FT_54PP_6000_00X_DB0.getSendUserId().trim();//(00X_DB0)송신자명
		
		// ■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■[개시전문 체크로직 공통 #01]■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
		// 01. TRANSACTION CODE 체크
		//     ▶ 시스템 환경별 TRANSACTION CODE 확인 (운영/테스트)
		//     ▶ 체크오류 시 : 301
		String sysTranCode = ctx.getProcessContext().getenv(TRCODE_KEY);
		if(sysTranCode != null && tranCode.equals(sysTranCode)) {
			if(logger.isLoggable(Level.SEVERE)) {
				logger.severe("-Check.#1 [성공] 트랜젝션코드 체크 [코드:" + sysTranCode +  " | 수신코드:" + tranCode + "]");
			}
		}
		else {
			if(logger.isLoggable(Level.SEVERE)) {
				logger.severe("-Check.#1 [실패] 트랜젝션코드 체크 [코드:" + sysTranCode +  " | 수신코드:" + tranCode + "]");
			}

			var_FT_54PP_0000_000_DH0.setResCode(301);
			throw new AnyLinkException("[실패] 트랜젝션코드 체크 [코드:" + sysTranCode +  " | 수신코드:" + tranCode + "]", "301");
		}

		// ■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■[개시전문 체크로직 공통 #02]■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
		// 02. 기관코드 체크
		//     ▶ 체크오류 시 : 803
		String start_ep_sysid = ctx.getProcessContext().getenv("startendpoint.sysid");
		if(start_ep_sysid != null && start_ep_sysid.indexOf(orgCd) > 0) {
			if(logger.isLoggable(Level.SEVERE)) {
				logger.severe("-Check.#2 [성공] 기관코드 체크 [수신코드:" + orgCd + " | 앤드포인트:" + start_ep_sysid.split("\\.")[start_ep_sysid.split("\\.").length-1] + "]");
			}
		}
		else {
			if(logger.isLoggable(Level.SEVERE)) {
				logger.severe("-Check.#2 [실패] 기관코드 체크 [수신코드:" + orgCd + " | 앤드포인트:" + start_ep_sysid.split("\\.")[start_ep_sysid.split("\\.").length-1] + "]");
			}
			
			var_FT_54PP_0000_000_DH0.setResCode(803);
			throw new AnyLinkException("[실패] 기관코드 체크 [수신코드:" + orgCd + " | 앤드포인트:" + start_ep_sysid.split("\\.")[start_ep_sysid.split("\\.").length-1] + "]", "803");
		}

		// ■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■[개시전문 체크로직 공통 #03]■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
		// 03. 거래구분코드(파일코드) 체크
		//     ▶ OPERATION_CFG 테이블에서 OPR_TRXCD='54' AND OPR_UNIONCD='거래구분코드(파일코드)'로 검색
		//     ▶ 미검색시 : 805
		StringBuffer sql_select_OPERATION_CFG = new StringBuffer();
		sql_select_OPERATION_CFG.append("SELECT COUNT(1)"         + "\n");
		sql_select_OPERATION_CFG.append("  FROM OPERATION_CFG "   + "\n");
		sql_select_OPERATION_CFG.append(" WHERE OPR_TRXCD   = ? " + "\n");// PARAM[1], STRING
		sql_select_OPERATION_CFG.append("   AND OPR_UNIONCD = ? " + "\n");// PARAM[2], STRING

		try {
			initCxt = new InitialContext();
			ds = (DataSource) initCxt.lookup(DS_COMFTP);

			try (Connection connection = ds.getConnection()) {
//				try (PreparedStatement pstmt = connection.prepareStatement(sql_select_OPERATION_CFG.toString())) {
				try (PreparedStatement pstmt = new LoggableStatement(connection, sql_select_OPERATION_CFG.toString()) ) {	
					pstmt.setString(1, OPR_TRXCD);// SET PARAM[1], STRING
					pstmt.setString(2, fileCode); // SET PARAM[2], STRING
					
					try(ResultSet rs = pstmt.executeQuery()) {
						int rsCount = -1;
						while(rs.next()) { rsCount = rs.getInt(1); }
						if(rsCount > 0) {
							if(logger.isLoggable(Level.INFO)) {
								logger.info  ("-Check.#3 [성공] 거래구분(파일)코드 체크 [수신코드:" + fileCode + "]\n"
											+ ((LoggableStatement)pstmt).getQueryString());
							}
							else if(logger.isLoggable(Level.SEVERE)) {
								logger.severe("-Check.#3 [성공] 거래구분(파일)코드 체크 [수신코드:" + fileCode + "]");
							}
						}
						else {
							if(logger.isLoggable(Level.INFO)) {
								logger.info  ("-Check.#3 [실패] 거래구분(파일)코드 체크 [수신코드:" + fileCode + "]\n"
											+ ((LoggableStatement)pstmt).getQueryString());
							}
							else if(logger.isLoggable(Level.SEVERE)) {
								logger.severe("-Check.#3 [실패] 거래구분(파일)코드 체크 [수신코드:" + fileCode + "]");
							}
							
							var_FT_54PP_0000_000_DH0.setResCode(805);
							throw new AnyLinkException("[실패] 거래구분(파일)코드 체크 [수신코드:" + fileCode + "]", "805");
						}
					}
				}
			}
		} catch (AnyLinkException ae) {
			throw ae;
		} catch (Exception e) {
			logger.logp(Level.SEVERE, null, null, "DB 오류 발생", e);
			var_FT_54PP_0000_000_DH0.setResCode(328);
			throw new AnyLinkException("DB 오류 발생", "328");
		} finally {
			try { if(initCxt!=null) initCxt.close(); } catch (NamingException e) {}
		}

		// ■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■[개시전문 체크로직 공통 #04]■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
		// 04. 사용자 ID
		//     ▶  FTP_USR_INFO 테이블에서 USRNM='사용자 ID' 로 검색
		//     ▶ 미검색시 : 809
		StringBuffer sql_select_FTP_USR_INFO = new StringBuffer();
		sql_select_FTP_USR_INFO.append("SELECT COUNT(1) "     + "\n");
		sql_select_FTP_USR_INFO.append("  FROM FTP_USR_INFO " + "\n");
		sql_select_FTP_USR_INFO.append(" WHERE ORGCD = ? "    + "\n");// PARAM[1], STRING
		sql_select_FTP_USR_INFO.append("   AND USRNM = ? "    + "\n");// PARAM[2], STRING

		try {
			initCxt = new InitialContext();
			ds = (DataSource) initCxt.lookup(DS_COMFTP);

			try (Connection connection = ds.getConnection()) {
//				try (PreparedStatement pstmt = connection.prepareStatement(sql_select_FTP_USR_INFO.toString())) {
				try (PreparedStatement pstmt = new LoggableStatement(connection, sql_select_FTP_USR_INFO.toString()) ) {
					pstmt.setString(1, orgCd); // SET PARAM[1], STRING
					pstmt.setString(2, userId);// SET PARAM[2], STRING

					try(ResultSet rs = pstmt.executeQuery()) {
						int rsCount = -1;
						while(rs.next()) { rsCount = rs.getInt(1); }
						if(rsCount > 0) {
							if(logger.isLoggable(Level.INFO)) {
								logger.info  ("-Check.#4 [성공] 사용자ID 체크 [기관코드:" + orgCd + " | 사용자ID:" + userId + "]\n"
											+ ((LoggableStatement)pstmt).getQueryString());
							}
							else if(logger.isLoggable(Level.SEVERE)) {
								logger.severe("-Check.#4 [성공] 사용자ID 체크 [기관코드:" + orgCd + " | 사용자ID:" + userId + "]");
							}
						}
						else {
							if(logger.isLoggable(Level.INFO)) {
								logger.info  ("-Check.#4 [실패] 사용자ID 체크 [기관코드:" + orgCd + " | 사용자ID:" + userId + "]\n"
											+ ((LoggableStatement)pstmt).getQueryString());
							}
							else if(logger.isLoggable(Level.SEVERE)) {
								logger.severe("-Check.#4 [실패] 사용자ID 체크 [기관코드:" + orgCd + " | 사용자ID:" + userId + "]");
							}
							
							var_FT_54PP_0000_000_DH0.setResCode(809);
							throw new AnyLinkException("[실패] 사용자ID 체크 [기관코드:" + orgCd + " | 사용자ID:" + userId + "]", "809");
						}
					}
				}
			}
		} catch (AnyLinkException ae) {
			throw ae;
		} catch (Exception e) {
			logger.logp(Level.SEVERE, null, null, "DB 오류 발생", e);
			var_FT_54PP_0000_000_DH0.setResCode(328);
			throw new AnyLinkException("DB 오류 발생", "328");
		} finally {
			try { if(initCxt!=null) initCxt.close(); initCxt=null; } catch (NamingException e) {}
		}

		// ▩▩▩▩▩▩▩▩▩▩▩▩▩▩▩▩▩▩▩▩▩▩▩▩▩▩▩▩[개시전문 체크로직 송신업무 #01]▩▩▩▩▩▩▩▩▩▩▩▩▩▩▩▩▩▩▩▩▩▩▩▩▩▩▩▩
		// 05. 해당일자 자료유무 확인
		//     ▶  MSF_DIST_BBS 테이블에서 TRXCD='54' AND BDATE='기준일자' AND ORGCD='회사코드' AND FTPCD='거래구분코드(파일코드)', ★ SEQNO가 가장 최신인 데이터만 검색
		//     ▶ 미검색시 : 801
		StringBuffer sql_select_MSF_DIST_BBS = new StringBuffer();
		sql_select_MSF_DIST_BBS.append("SELECT RDATE, SEQNO, FNAME "    + "\n");
		sql_select_MSF_DIST_BBS.append("  FROM ( "                      + "\n");
		sql_select_MSF_DIST_BBS.append("       SELECT * "               + "\n");
		sql_select_MSF_DIST_BBS.append("         FROM MSF_DIST_BBS "    + "\n");
		sql_select_MSF_DIST_BBS.append("        WHERE TRXCD = ? "       + "\n");// PARAM[1], STRING
		sql_select_MSF_DIST_BBS.append("          AND BDATE = ? "       + "\n");// PARAM[2], STRING
		sql_select_MSF_DIST_BBS.append("          AND ORGCD = ? "       + "\n");// PARAM[3], STRING
		sql_select_MSF_DIST_BBS.append("          AND FTPCD = ? "       + "\n");// PARAM[4], STRING
		sql_select_MSF_DIST_BBS.append("        ORDER BY SEQNO DESC ) " + "\n");// ★ SEQNO가 가장 최신
		sql_select_MSF_DIST_BBS.append(" WHERE ROWNUM = 1 "             + "\n");

		try {
			initCxt = new InitialContext();
			ds = (DataSource) initCxt.lookup(DS_COMFTP);

			try (Connection connection = ds.getConnection()) {
//				try (PreparedStatement pstmt = connection.prepareStatement(sql_select_MSF_DIST_BBS.toString())) {
				try (PreparedStatement pstmt = new LoggableStatement(connection, sql_select_MSF_DIST_BBS.toString()) ) {
					pstmt.setString(1, OPR_TRXCD);// SET PARAM[1], STRING
					pstmt.setString(2, tranDate); // SET PARAM[2], STRING
					pstmt.setString(3, orgCd);    // SET PARAM[3], STRING
					pstmt.setString(4, fileCode); // SET PARAM[4], STRING

					try(ResultSet rs = pstmt.executeQuery()) {
						String rdate = "";
						String seqno = "";
						String fname = "";
						while(rs.next()) {
							rdate = rs.getString(1);
							seqno = rs.getString(2);
							fname = rs.getString(3);
							var_FT_54PP_MSF_DIST_BBS_SEL_DB0.setRDATE(rdate);
							var_FT_54PP_MSF_DIST_BBS_SEL_DB0.setSEQNO(seqno);
							var_FT_54PP_MSF_DIST_BBS_SEL_DB0.setFNAME(fname);
						}
						
						if(!"".equals(rdate) && !"".equals(seqno) && !"".equals(fname)) {
							if(logger.isLoggable(Level.INFO)) {
								logger.info  ("-Check.#5 [성공] 해당일자 자료유무 체크 [트랜젝션코드:" + OPR_TRXCD + " | 기준일자:" + tranDate + " | 기관코드:" + orgCd  + " | 거래구분(파일)코드:" + fileCode+ "]\n"
											+ ((LoggableStatement)pstmt).getQueryString());
							}
							else if(logger.isLoggable(Level.SEVERE)) {
								logger.severe("-Check.#5 [성공] 해당일자 자료유무 체크 [트랜젝션코드:" + OPR_TRXCD + " | 기준일자:" + tranDate + " | 기관코드:" + orgCd  + " | 거래구분(파일)코드:" + fileCode+ "]");
							}
						}
						else {
							if(logger.isLoggable(Level.INFO)) {
								logger.info  ("-Check.#5 [실패] 해당일자 자료유무 체크 [트랜젝션코드:" + OPR_TRXCD + " | 기준일자:" + tranDate + " | 기관코드:" + orgCd  + " | 거래구분(파일)코드:" + fileCode+ "]\n"
											+ ((LoggableStatement)pstmt).getQueryString());
							}
							else if(logger.isLoggable(Level.SEVERE)) {
								logger.severe("-Check.#5 [실패] 해당일자 자료유무 체크 [트랜젝션코드:" + OPR_TRXCD + " | 기준일자:" + tranDate + " | 기관코드:" + orgCd  + " | 거래구분(파일)코드:" + fileCode+ "]");
							}
							
							var_FT_54PP_0000_000_DH0.setResCode(801);
							throw new AnyLinkException("[실패] 해당일자 자료유무 체크 [트랜젝션코드:" + OPR_TRXCD + " | 기준일자:" + tranDate + " | 기관코드:" + orgCd  + " | 거래구분(파일)코드:" + fileCode+ "]", "801");
						}
					}
				}
			}
		} catch (AnyLinkException ae) {
			throw ae;
		} catch (Exception e) {
			logger.logp(Level.SEVERE, null, null, "DB 오류 발생", e);
			var_FT_54PP_0000_000_DH0.setResCode(328);
			throw new AnyLinkException("DB 오류 발생", "328");
		} finally {
			try { if(initCxt!=null) initCxt.close(); initCxt=null; } catch (NamingException e) {}
		}
		
		// 모든 체크 통과 시 응답코드 800 설정
		var_FT_54PP_0000_000_DH0.setResCode(800);
	}
	
}
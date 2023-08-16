package hwgi.f54.send_mem;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
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

public class UC_BKNIA_UpdateResult extends DefaultUserActivity {

	private static final Logger logger = Logger.getLogger(UC_BKNIA_UpdateResult.class.getName());

	private static final String OPR_TRXCD = "54"; //고정값
	private static final String DS_COMFTP = "DS_comftp";
	
	
	@Override
	public void action(ActivityContext ctx) throws AnyLinkException {
		FT_54PP_0000_000_DH0         var_FT_54PP_0000_000_DH0         = (FT_54PP_0000_000_DH0)ctx.getVariableContent("var_FT_54PP_0000_000_DH0");
		FT_54PP_6000_00X_DB0         var_FT_54PP_6000_00X_DB0         = (FT_54PP_6000_00X_DB0)ctx.getVariableContent("var_FT_54PP_6000_00X_DB0");
		FT_54PP_MSF_DIST_BBS_SEL_DB0 var_FT_54PP_MSF_DIST_BBS_SEL_DB0 = (FT_54PP_MSF_DIST_BBS_SEL_DB0)ctx.getVariableContent("var_FT_54PP_MSF_DIST_BBS_SEL_DB0");
		String				         errorCode                        = (String)ctx.getVariableContent("errorCode");
		String                       errorString                      = (String)ctx.getVariableContent("errorString");
		
		Context initCxt = null;
		DataSource ds = null;

		String startTime = ctx.getProcessContext().getenv("starttime");
		String sdate = "";
		String stime = "";
		try {
			Date dStartTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").parse(startTime);
			sdate = new SimpleDateFormat("yyyyMMdd").format(dStartTime);
			stime = new SimpleDateFormat("HHmmss").format(dStartTime);
		} catch (ParseException e1) {}
		
		Date now = new Date();
		String edate    = new SimpleDateFormat("yyyyMMdd").format(now);
		String etime    = new SimpleDateFormat("HHmmss").format(now);
		
		String orgCd    = var_FT_54PP_0000_000_DH0.getOrgCode();  //(000_DH0)송신기관코드
		String fileCode = var_FT_54PP_0000_000_DH0.getFileCode(); //(000_DH0)거래구분코드(파일코드)
		String tranDate = var_FT_54PP_6000_00X_DB0.getTranDate(); //(00X_DB0)전문기준일자
		String rDate    = var_FT_54PP_MSF_DIST_BBS_SEL_DB0.getRDATE();//파일생성일자
		String seqNo    = var_FT_54PP_MSF_DIST_BBS_SEL_DB0.getSEQNO();//시퀀스
		
		String step     = "";
		int    ecode    = 0;
		String etext    = "";
		// 정상처리 시
		if( "".equals(errorCode) || errorCode == null ) {
			step = "S";
			ecode = 0;
			etext = "";
		// 검증 오류 발생 시
		} else if(!"".equals(errorCode) && errorCode != null && isNumeric(errorCode)){
			step = "F";
			ecode = Integer.parseInt(errorCode);
			etext = errorString;
		// 시스템 오류 발생 시
		} else {
			step = "F";
			ecode = 814;
			etext = "송수신중단";
		}
		
		// ▩▩▩▩▩▩▩▩▩▩▩▩▩▩▩▩▩▩▩▩▩▩▩▩▩▩▩▩[송신결과 처리 #01]▩▩▩▩▩▩▩▩▩▩▩▩▩▩▩▩▩▩▩▩▩▩▩▩▩▩▩▩
		// 01. 송신결과 UPDATE
		//     ▶  조회조건 : BDATE='기준일자' AND ORGCD='회사코드' AND FTPCD='거래구분코드(파일코드)' AND RDATE='파일생성일자' AND SEQNO='해당 SEQ'
		//     ▶  업데이트컬럼 : STEP  - 파일송신 완료(S) / 실패 (F)
		//                    SDATE - 파일송신 시작일자, STIME - 파일송신 시작일시,
		//                    EDATE - 파일송신 종료일자, ETIME - 파일송신 종료일시, ECODE - 송수신 오류코드(정상 0)
		try {
			initCxt = new InitialContext();
			ds = (DataSource) initCxt.lookup(DS_COMFTP);

			try (Connection connection = ds.getConnection()) {

				StringBuffer sql_update_MSF_DIST_BBS = new StringBuffer();
				sql_update_MSF_DIST_BBS.append("UPDATE MSF_DIST_BBS " + "\n");
				sql_update_MSF_DIST_BBS.append("   SET STEP  = ? "    + "\n");// PARAM[1], STRING
				sql_update_MSF_DIST_BBS.append("      ,SDATE = ? "    + "\n");// PARAM[2], STRING
				sql_update_MSF_DIST_BBS.append("      ,STIME = ? "    + "\n");// PARAM[3], STRING
				sql_update_MSF_DIST_BBS.append("      ,EDATE = ? "    + "\n");// PARAM[4], STRING
				sql_update_MSF_DIST_BBS.append("      ,ETIME = ? "    + "\n");// PARAM[5], STRING
				sql_update_MSF_DIST_BBS.append("      ,ECODE = ? "    + "\n");// PARAM[6], NUMBER
				sql_update_MSF_DIST_BBS.append("      ,ETEXT = ? "    + "\n");// PARAM[7], NUMBER
				sql_update_MSF_DIST_BBS.append(" WHERE TRXCD = ? "    + "\n");// PARAM[8], STRING
				sql_update_MSF_DIST_BBS.append("   AND BDATE = ? "    + "\n");// PARAM[9], STRING
				sql_update_MSF_DIST_BBS.append("   AND ORGCD = ? "    + "\n");// PARAM[10], STRING
				sql_update_MSF_DIST_BBS.append("   AND FTPCD = ? "    + "\n");// PARAM[11], STRING
				sql_update_MSF_DIST_BBS.append("   AND RDATE = ? "    + "\n");// PARAM[12], STRING
				sql_update_MSF_DIST_BBS.append("   AND SEQNO = ? "    + "\n");// PARAM[13], STRING
				//try (PreparedStatement pstmt_upd = connection.prepareStatement(sql_update_MSF_DIST_BBS.toString())) {
				try (PreparedStatement pstmt_upd = new LoggableStatement(connection, sql_update_MSF_DIST_BBS.toString()) ) {
					//-- SET
					pstmt_upd.setString(1, step);       // SET PARAM[1], STRING
					pstmt_upd.setString(2, sdate);      // SET PARAM[2], STRING
					pstmt_upd.setString(3, stime);      // SET PARAM[3], STRING
					pstmt_upd.setString(4, edate);      // SET PARAM[4], STRING
					pstmt_upd.setString(5, etime);      // SET PARAM[5], STRING
					pstmt_upd.setInt   (6, ecode);      // SET PARAM[6], NUMBER
					pstmt_upd.setString(7, etext);      // SET PARAM[7], STRING
					//-- WHERE
					pstmt_upd.setString(8, OPR_TRXCD);  // SET PARAM[8], STRING
					pstmt_upd.setString(9, tranDate);   // SET PARAM[9], STRING
					pstmt_upd.setString(10, orgCd);     // SET PARAM[10], STRING
					pstmt_upd.setString(11, fileCode);  // SET PARAM[11], STRING
					pstmt_upd.setString(12, rDate);     // SET PARAM[12], STRING
					pstmt_upd.setString(13, seqNo);     // SET PARAM[13], STRING
					
					if(logger.isLoggable(Level.INFO)) {
						logger.info  ("송신결과 업데이트 [테이블:MSF_DIST_BBS]\n"
									+ ((LoggableStatement)pstmt_upd).getQueryString());
					}
					else if(logger.isLoggable(Level.SEVERE)) {
						logger.severe("송신결과 업데이트 [테이블:MSF_DIST_BBS]");
					}
					
					pstmt_upd.executeUpdate();
					connection.commit();
				}
			}
		} catch (Exception e) {
			logger.logp(Level.SEVERE, null, null, "DB 오류 발생", e);
			var_FT_54PP_0000_000_DH0.setResCode(328);
			throw new AnyLinkException("DB 오류 발생", "328");
		} finally {
			try { if(initCxt!=null) initCxt.close(); initCxt=null; } catch (NamingException e) {}
		}
	}
	
	private boolean isNumeric(String s) {
		try {
			Double.parseDouble(s);
			return true;
		} catch(NumberFormatException e) {
			return false;
		}
	}
	
}
package hwgi.f54;

import java.util.logging.Level;

import com.tmax.anylink.api.serviceflow.ActivityContext;
import com.tmax.anylink.api.serviceflow.DefaultUserMapping;
import com.tmax.anylink.common.AnyLinkException;
import com.tmax.anylink.logging.Logger;

public class MH_54_PARSING_ERR_UH0 extends DefaultUserMapping {

	private static final Logger logger = Logger.getLogger(MH_54_PARSING_ERR_UH0.class.getName());

	private static final String systemErrorCode   = "111"; //송수신 FLAG 체크 오류코드
	private static final String orgCodeErrorCode  = "803"; //기관코드 체크 오류코드
	private static final String kindCodeErrorCode = "804"; //종별코드 체크 오류코드
	private static final String srFlagErrorCode   = "806"; //송수신 FLAG 체크 오류코드
	
	private static final int    headerSize     = 65;
	private static final int    kindCodeOffset = 13;
	private static final int    resCodeOffset  = 62;
	private static final int    resCodeLength  = 3;
	
	
	@Override
	public void mapping(ActivityContext ctx, Object[] inputParams, Object[] outputParams) throws AnyLinkException {

		// ■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■[INITIALIZE]■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
		String errorCode   = (String) inputParams[0];
		String errorString = (String) inputParams[1];
		FT_54PP_0000_000_DE0 res_FT_54PP_0000_000_DE0 = (FT_54PP_0000_000_DE0) outputParams[0];
		
		// ■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■[RES MSG SETTING]■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
		byte[] msg = (byte[]) ctx.getProcessContext().getOriginalMessage();

		int beginIndex = errorString.lastIndexOf('[') + 1;
        int endIndex = errorString.lastIndexOf(']');
        
        System.arraycopy("1".getBytes(), 0, msg, kindCodeOffset+2, 1);// 응답세팅 (ex. 6000 -> 6010)
        
		String[] parsingTree = errorString.substring(beginIndex, endIndex).split("\\.");
		switch(parsingTree.length) {
		// srFlagErrorCode   = "806"
			case 2 : {//errorString => not found child biztx[ ] - [hwgi.f54]
				System.arraycopy(srFlagErrorCode.getBytes(), 0, msg, resCodeOffset, resCodeLength);//송수신 FLAG 체크 오류코드 세팅
				if(logger.isLoggable(Level.SEVERE)) {
					logger.severe("[파싱오류] 송수신 FLAG - [응답코드 : " + srFlagErrorCode + "]");
				}
			}
			break;
		
		// kindCodeErrorCode = "804"
			case 3 : {//errorString => not found child biztx code[N99] - sysid[hwgi.f54.send_mem]
				System.arraycopy(orgCodeErrorCode.getBytes(), 0, msg, resCodeOffset, resCodeLength);//기관코드 체크 오류코드 세팅
				if(logger.isLoggable(Level.SEVERE)) {
					logger.severe("[파싱오류] 기관코드 - [응답코드 : " + orgCodeErrorCode + "]");
				}
			}
			break;
		
		// orgCodeErrorCode  = "803"
			case 4 : {//errorString => not found child biztx[6700^004] - [hwgi.f54.send_mem.mem]
				System.arraycopy(kindCodeErrorCode.getBytes(), 0, msg, resCodeOffset, resCodeLength);//종별코드 체크 오류코드 세팅
				if(logger.isLoggable(Level.SEVERE)) {
					logger.severe("[파싱오류] 종별코드 - [응답코드 : " + kindCodeErrorCode + "]");
				}
			}
			break;
			
		// systemErrorCode   = "111"
			default : {
				System.arraycopy(systemErrorCode.getBytes(), 0, msg, resCodeOffset, resCodeLength);//파싱오류 오류코드 세팅
				if(logger.isLoggable(Level.SEVERE)) {
					logger.severe("[파싱오류] 파싱오류 - [응답코드 : " + systemErrorCode + "]");
				}
			}
			break;
		}

		res_FT_54PP_0000_000_DE0.setData(msg);
	}

}

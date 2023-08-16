package hwgi.f54;

import java.util.logging.Level;

import com.tmax.anylink.api.serviceflow.ActivityContext;
import com.tmax.anylink.api.serviceflow.DefaultUserMapping;
import com.tmax.anylink.common.AnyLinkException;
import com.tmax.anylink.logging.Logger;

public class MH_54_SYSTEM_ERR_UH0 extends DefaultUserMapping {

	private static final Logger logger = Logger.getLogger(MH_54_SYSTEM_ERR_UH0.class.getName());

	private static final String systemErrorCode = "111"; //송수신 FLAG 체크 오류코드

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

		System.arraycopy("1".getBytes(), 0, msg, kindCodeOffset+2, 1);// 응답세팅 (ex. 6000 -> 6010)
		System.arraycopy(systemErrorCode.getBytes(), 0, msg, resCodeOffset, resCodeLength);//시스템오류 오류코드 세팅

		if(logger.isLoggable(Level.SEVERE)) {
			logger.severe("[시스템오류] 시스템 오류 - [응답코드 : " + systemErrorCode + "]");
		}

		res_FT_54PP_0000_000_DE0.setData(msg);
	}

}

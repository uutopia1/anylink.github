package hwgi.f54;

import java.io.UnsupportedEncodingException;
import java.util.logging.Level;

import com.tmax.anylink.api.adapter.DefaultAdapterMessageHandler;
import com.tmax.anylink.common.AnyLinkException;
import com.tmax.anylink.logging.Logger;

public class AH_54_MEM_Logging extends DefaultAdapterMessageHandler {

	private static final Logger logger = Logger.getLogger(AH_54_MEM_Logging.class.getName());
	private static final String LOCALE = "EUC-KR";
	private static final String OPR_TRXCD = "54"; //고정값

	public Object receive(Object message) throws AnyLinkException {
		byte[] bMessage = (byte[])message;
		
		if(logger.isLoggable(Level.SEVERE)) {
			try {
				logger.severe("+++ " + sysId + " (GUID:" + getConnectionGUID() + ")\n"
						+ "[RECV DATA][F"+OPR_TRXCD+"][MEM][LEN:" + String.format("%04d", bMessage.length) + "]:[" + new String(bMessage, LOCALE) + "]\n");
			} catch (UnsupportedEncodingException e) {}
		}
		
		return message;
	}

	public Object send(Object message) throws AnyLinkException {
		byte[] bMessage = (byte[])message;
		
		if(logger.isLoggable(Level.SEVERE)) {
			try {
				logger.severe("+++ " + sysId + " (GUID:" + getConnectionGUID() + ")\n"
						+ "[SEND DATA][F"+OPR_TRXCD+"][MEM][LEN:" + String.format("%04d", bMessage.length) + "]:[" + new String(bMessage, LOCALE) + "]\n");
			} catch (UnsupportedEncodingException e) {}
		}
		
		return message;
	}
}

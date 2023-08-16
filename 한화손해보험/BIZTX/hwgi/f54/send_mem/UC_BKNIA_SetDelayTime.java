package hwgi.f54.send_mem;

import java.util.logging.Level;

import hwgi.f54.FT_54PP_0000_000_DH0;

import com.tmax.anylink.api.serviceflow.ActivityContext;
import com.tmax.anylink.api.serviceflow.DefaultUserTimer;
import com.tmax.anylink.logging.Logger;

public class UC_BKNIA_SetDelayTime extends DefaultUserTimer {

	private static final Logger logger = Logger.getLogger(UC_BKNIA_SetDelayTime.class.getName());

	private static final String DEFAULT_DELAY_TIME = "50"; //단위 : ms (기본값 : 50ms)

	@Override
	public long nextTime(ActivityContext ctx) {
		FT_54PP_0000_000_DH0 var_FT_54PP_0000_000_DH0 = (FT_54PP_0000_000_DH0)ctx.getVariableContent("var_FT_54PP_0000_000_DH0");
		
		//기관코드
		String orgCode   = var_FT_54PP_0000_000_DH0.getOrgCode();
		String delayTime = ctx.getProcessContext().getenv("${sys:DELAY_TIME_" + orgCode + "}");
		
		if(delayTime == null || "".equals(delayTime)) {
			delayTime = DEFAULT_DELAY_TIME;
		}
		
		if(logger.isLoggable(Level.INFO)) {
			logger.info("===> [OrgCode:" + orgCode + "] Set DelayTime :: " + delayTime + "ms");
		}
		
		return System.currentTimeMillis() + Integer.parseInt(delayTime);
	}

	@Override
	public boolean shouldFireTimerEvent(ActivityContext ctx, long arg1) {
		return true;
	}

}

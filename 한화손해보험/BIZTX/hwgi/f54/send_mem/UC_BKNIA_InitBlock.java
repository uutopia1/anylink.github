package hwgi.f54.send_mem;

import hwgi.f54.BKNIA_FILE_BLOCK;

import com.tmax.anylink.api.serviceflow.ActivityContext;
import com.tmax.anylink.api.serviceflow.DefaultUserActivity;
import com.tmax.anylink.common.AnyLinkException;
import com.tmax.anylink.logging.Logger;

public class UC_BKNIA_InitBlock extends DefaultUserActivity {

	private static final Logger logger = Logger.getLogger(UC_BKNIA_InitBlock.class.getName());

	public void action(ActivityContext ctx) throws AnyLinkException {
		Integer          loopBlk			   = (Integer)ctx.getVariableContent("loopBlk");
		BKNIA_FILE_BLOCK var_BKNIA_FILE_BLOCK  = (BKNIA_FILE_BLOCK)ctx.getVariableContent("var_BKNIA_FILE_BLOCK");
		
		// 임시 Block 초기화
		var_BKNIA_FILE_BLOCK.clearSequences();
		
		// loopBlk_Idx 는 루프용이라 초기값 0 , 전문에서 사용하는 block_no 는 1 부터 시작
		long cur_blk_no = loopBlk.longValue() + 1;
	}

}

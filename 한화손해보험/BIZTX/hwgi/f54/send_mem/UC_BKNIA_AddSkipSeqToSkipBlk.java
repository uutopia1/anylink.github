package hwgi.f54.send_mem;

import hwgi.f54.BKNIA_FILE_BLOCK;
import hwgi.f54.BKNIA_Variables;
import hwgi.f54.FT_54PP_6000_300_DB0;

import com.tmax.anylink.api.serviceflow.ActivityContext;
import com.tmax.anylink.api.serviceflow.DefaultUserActivity;
import com.tmax.anylink.common.AnyLinkException;
import com.tmax.anylink.logging.Logger;

public class UC_BKNIA_AddSkipSeqToSkipBlk extends DefaultUserActivity {

	private static final Logger logger = Logger.getLogger(UC_BKNIA_AddSkipSeqToSkipBlk.class.getName());

	public void action(ActivityContext ctx) throws AnyLinkException {
		FT_54PP_6000_300_DB0 var_FT_54PP_6000_300_DB0  = (FT_54PP_6000_300_DB0)ctx.getVariableContent("var_FT_54PP_6000_300_DB0");
		BKNIA_Variables      var_BKNIA_Variables       = (BKNIA_Variables)ctx.getVariableContent("var_BKNIA_Variables");
		BKNIA_FILE_BLOCK     var_BKNIA_FILE_BLOCK      = (BKNIA_FILE_BLOCK)ctx.getVariableContent("var_BKNIA_FILE_BLOCK");
		BKNIA_FILE_BLOCK     var_BKNIA_FILE_SKIP_BLOCK = (BKNIA_FILE_BLOCK)ctx.getVariableContent("var_BKNIA_FILE_SKIP_BLOCK");

		// 결번 처리를 위한 Block 초기화
		var_BKNIA_FILE_SKIP_BLOCK.clearSequences();
		
		// 결번 처리를 위한 Block 재생성
		String skip_bits = var_FT_54PP_6000_300_DB0.getSkipBits();
		long skip_seq_cnt = 0;
		for(int i=0; i<skip_bits.length(); i++) {
			String skip_bit = skip_bits.substring(i, i+1);
			
			if("0".equals(skip_bit)) {
				skip_seq_cnt ++;	// 결번 총건수 + 1
				// 결번 시퀀스 추가
				var_BKNIA_FILE_SKIP_BLOCK.addSequences(var_BKNIA_FILE_BLOCK.getSequences(i));
			}
		}
		
		// 결번 총건수 설정
		var_BKNIA_Variables.setSkip_seq_cnt(skip_seq_cnt);
	}
	
}

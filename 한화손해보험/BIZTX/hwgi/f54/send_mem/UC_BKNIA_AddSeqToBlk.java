package hwgi.f54.send_mem;

import hwgi.f54.BKNIA_FILE_BLOCK;
import hwgi.f54.BKNIA_FILE_SEQ;
import hwgi.f54.BKNIA_Variables;

import com.tmax.anylink.api.serviceflow.ActivityContext;
import com.tmax.anylink.api.serviceflow.DefaultUserActivity;
import com.tmax.anylink.common.AnyLinkException;
import com.tmax.anylink.logging.Logger;

public class UC_BKNIA_AddSeqToBlk extends DefaultUserActivity {

	private static final Logger logger = Logger.getLogger(UC_BKNIA_AddSeqToBlk.class.getName());

	public void action(ActivityContext ctx) throws AnyLinkException {
		Integer				loopSeq					= (Integer)ctx.getVariableContent("loopSeq");
		BKNIA_FILE_SEQ		var_BKNIA_FILE_SEQ      = (BKNIA_FILE_SEQ)ctx.getVariableContent("var_BKNIA_FILE_SEQ");
		BKNIA_FILE_BLOCK    var_BKNIA_FILE_BLOCK	= (BKNIA_FILE_BLOCK)ctx.getVariableContent("var_BKNIA_FILE_BLOCK");
		BKNIA_Variables     var_BKNIA_Variables		= (BKNIA_Variables)ctx.getVariableContent("var_BKNIA_Variables");

		// loopSeq_Idx 는 루프용이라 초기값 0 , 전문에서 사용하는 시퀀스 번호는 1 부터 시작
		long cur_seq_no = loopSeq.longValue() + 1;
		
		// 현재 시퀀스 번호 SET
		var_BKNIA_Variables.setCur_seq_no(cur_seq_no);
		var_BKNIA_FILE_SEQ.setSequence_No(cur_seq_no);
		
		// 전송한 시퀀스 개수 + 1
		long tot_send_mem_seq_cnt = var_BKNIA_Variables.getTot_sr_seq_cnt() + 1;
		var_BKNIA_Variables.setTot_sr_seq_cnt(tot_send_mem_seq_cnt);
		
		// 남은 시퀀스 개수 - 1
		long remain_seq_cnt = var_BKNIA_Variables.getRemain_seq_cnt() - 1;
		var_BKNIA_Variables.setRemain_seq_cnt(remain_seq_cnt);
		
		// Block 에 Sequence 추가
		var_BKNIA_FILE_BLOCK.addSequences(var_BKNIA_FILE_SEQ);

	}

}

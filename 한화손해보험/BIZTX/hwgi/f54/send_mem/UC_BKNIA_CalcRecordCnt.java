package hwgi.f54.send_mem;

import hwgi.f54.BKNIA_BAT_RES;
import hwgi.f54.BKNIA_Variables;

import com.tmax.anylink.api.serviceflow.ActivityContext;
import com.tmax.anylink.api.serviceflow.DefaultUserActivity;
import com.tmax.anylink.common.AnyLinkException;
import com.tmax.anylink.logging.Logger;

public class UC_BKNIA_CalcRecordCnt extends DefaultUserActivity {

	private static final Logger logger = Logger.getLogger(UC_BKNIA_CalcRecordCnt.class.getName());

	public void action(ActivityContext ctx) throws AnyLinkException {
		BKNIA_BAT_RES     var_BKNIA_BAT_RES     = (BKNIA_BAT_RES)ctx.getVariableContent("var_BKNIA_BAT_RES");
		BKNIA_Variables   var_BKNIA_Variables   = (BKNIA_Variables)ctx.getVariableContent("var_BKNIA_Variables");
		
		int cur_record_cnt = var_BKNIA_BAT_RES.getRECORD_COUNT();
		long remain_record_cnt = var_BKNIA_Variables.getRemain_record_cnt();
		
		// 남은 레코드의 크기가 한번에 전송해야 할 레코드 개수보다 작을 경우
		// 파일을 읽을 때 Trailer 까지 읽지 않도록 딱 맞게 세팅해줘야 함.
		if(remain_record_cnt < cur_record_cnt) {
			cur_record_cnt = (int)remain_record_cnt;
			var_BKNIA_BAT_RES.setRECORD_COUNT(cur_record_cnt);
		}
		
		// 전송한 레코드 개수 SET (전송한 레코드 개수 + 현시퀀스 내 레코드 개수)
		long tot_sr_record_cnt = var_BKNIA_Variables.getTot_sr_record_cnt() + cur_record_cnt;
		var_BKNIA_Variables.setTot_sr_record_cnt(tot_sr_record_cnt);
		
		// 남은 레코드 개수 SET (남은 레코드 개수 - 현 시퀀스 내 레코드 개수)
		remain_record_cnt = var_BKNIA_Variables.getRemain_record_cnt() - cur_record_cnt;
		var_BKNIA_Variables.setRemain_record_cnt(remain_record_cnt);
	}

}

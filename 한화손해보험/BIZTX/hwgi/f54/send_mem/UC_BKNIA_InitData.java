package hwgi.f54.send_mem;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.util.logging.Level;

import hwgi.f54.BKNIA_BAT_RES;
import hwgi.f54.BKNIA_Variables;

import com.tmax.anylink.api.serviceflow.ActivityContext;
import com.tmax.anylink.api.serviceflow.DefaultUserActivity;
import com.tmax.anylink.common.AnyLinkException;
import com.tmax.anylink.logging.Logger;

public class UC_BKNIA_InitData extends DefaultUserActivity {

	private static final Logger logger = Logger.getLogger(UC_BKNIA_InitData.class.getName());

	public void action(ActivityContext ctx) throws AnyLinkException {
		BKNIA_BAT_RES     var_BKNIA_BAT_RES     = (BKNIA_BAT_RES)ctx.getVariableContent("var_BKNIA_BAT_RES");
		BKNIA_Variables   var_BKNIA_Variables   = (BKNIA_Variables)ctx.getVariableContent("var_BKNIA_Variables");
		
		String file_path = var_BKNIA_BAT_RES.getFILE_PATH();
		String file_name = var_BKNIA_BAT_RES.getFILE_NAME();
		File batch_file = new File(file_path + File.separator + file_name);
		
		if(!isFileExist(batch_file)) {
			logger.info("File[" + batch_file + "] is not exist.");
			throw new AnyLinkException("File[" + batch_file + "] is not exist.");
		}
		
		int skip_bit_check_cnt  = var_BKNIA_BAT_RES.getSKIP_COUNT();
		int record_size         = var_BKNIA_BAT_RES.getRECORD_SIZE();
		int record_cnt          = var_BKNIA_BAT_RES.getRECORD_COUNT();
		String line_feed_temp   = var_BKNIA_BAT_RES.getLINEFEED();
		String line_feed = "";
		
		if(line_feed_temp == null)
			line_feed = "";
		else if(line_feed_temp.equals("\\n"))
			line_feed = "\n";
		else if(line_feed_temp.equals("\\r\\n"))
			line_feed = "\r\n";

		// #실제 파일크기
		//BigInteger tot_file_size = getTotalFileSize(batch_file);
		BigInteger tot_file_size = BigInteger.valueOf(batch_file.length());

		// #개행제외 파일크기
		BigInteger file_size = getFileSizeWithoutLineFeed(batch_file, record_size, line_feed);

		// #전체 레코드 개수 = (Header, Trailer 제외한 Record 들로 계산)
		long tot_record_cnt = getTotalRecordCnt(file_size, record_size, record_cnt);
		
		// #전체 시퀀스 개수 (Header , Trailer 제외한 Record들로 계산)
		long tot_sequence_cnt = getTotalSequenceCnt(tot_record_cnt, record_cnt);

		// #전체 블록 개수 (Header , Trailer 제외한 Sequence들로 계산)
		long tot_block_cnt = getTotalBlockCnt(tot_sequence_cnt, skip_bit_check_cnt);
		
		// 배치플로우변수 초기값 설정
		var_BKNIA_Variables.setTot_file_size(tot_file_size);		// 개행포함 파일크기 SET
		var_BKNIA_Variables.setFile_size(file_size);				// 개행제외 파일크기 SET
		
		var_BKNIA_Variables.setTot_blk_cnt(tot_block_cnt);			// 전체 블록 개수 SET
		var_BKNIA_Variables.setTot_seq_cnt(tot_sequence_cnt);		// 전체 시퀀스 개수 SET
		var_BKNIA_Variables.setTot_record_cnt(tot_record_cnt);		// 전체 레코드 개수 SET
		
		var_BKNIA_Variables.setRemain_blk_cnt(tot_block_cnt);		// 남은 블록 개수 SET (=전체 블록 개수)
		var_BKNIA_Variables.setRemain_seq_cnt(tot_sequence_cnt);	// 남은 시퀀스 개수 SET (=전체 시퀀스 개수)
		var_BKNIA_Variables.setRemain_record_cnt(tot_record_cnt);	// 남은 레코드 개수 SET (=전체 레코드 개수)
		
		var_BKNIA_Variables.setTot_sr_blk_cnt(0);					// 전송한 블록 개수 초기화
		var_BKNIA_Variables.setTot_sr_seq_cnt(0);					// 전송한 시퀀스 개수 초기화
		var_BKNIA_Variables.setTot_sr_record_cnt(0);				// 전송한 레코드 개수 초기화		
		
		var_BKNIA_Variables.setCur_blk_no(0);						// 현재 블록 번호  초기화
		var_BKNIA_Variables.setCur_seq_no(0);						// 현재 시퀀스 번호 초기화

		var_BKNIA_Variables.setSkip_seq_cnt(0);						// 결번 개수 초기화
		
		logger.info("\n#####[var_BKNIA_BAT_RES]#####\n" + var_BKNIA_BAT_RES + "\n"
				  + "#####[var_BKNIA_Variables]#####\n" + var_BKNIA_Variables);
	}

	/**
	 * 파일 존재유무 확인
	 * @param batch_file
	 * @return
	 */
	private boolean isFileExist(File batch_file) {
		return batch_file.exists();
	}

	/**
	 * 실제 파일 Size 를 계산한다.
	 * @param batch_file
	 * @return
	 */
	private BigInteger getTotalFileSize(File batch_file) {
		return BigInteger.valueOf(batch_file.length());
	}
	
	/**
	 * 실제 파일에서 개행을 제외한 파일 Size 를 계산한다.
	 * @param batch_file
	 * @param record_size
	 * @param line_feed
	 * @return
	 */
	private BigInteger getFileSizeWithoutLineFeed(File batch_file, int record_size, String line_feed) {
		FileInputStream fis = null;
		int line_count = 0;
		
		try {
			fis = new FileInputStream(batch_file);
			int line_length = record_size + line_feed.getBytes().length;
			int read_length = 0;
			
			byte[] readbytes = new byte[line_length];
			while((read_length=fis.read(readbytes, 0, readbytes.length)) != -1) {
				if(line_length == read_length) {// 마지막 줄 개행문자 없을 경우 라인 카운트를 추가하지 않기 위한 처리
					if( (new String(readbytes)).endsWith(line_feed) ) {
						line_count ++;	
					}
				}
			}
			
			fis.close(); fis=null;
		} 
		catch (Exception e) {
			logger.logp(Level.SEVERE, null, null, "UserClass Exception", e);
		}
		finally {
			if(fis!=null) { try {fis.close();fis = null;	} catch (IOException e) {e.printStackTrace();} }
		}
		
		long line_feed_length = line_count * line_feed.length();
		
		return BigInteger.valueOf(batch_file.length() - line_feed_length);
	}

	
	/**
	 * 개행을 제외한 파일에서 전체 레코드 개수를 계산한다.
	 * Header , Trailer 제외한 Record개수
	 * @param file_size
	 * @param record_size
	 * @param record_cnt
	 * @return
	 */
	private long getTotalRecordCnt(BigInteger file_size, int record_size, int record_cnt) {
		
		long total_record_cnt = 0;
		
		// 개행제외 파일크기에서 Header, Trailer 제외한 레코드 부분의 사이즈
		long record_part_size = file_size.longValue() - (record_size*2);
		total_record_cnt = (long) Math.ceil((double)record_part_size / record_size);
		
		return total_record_cnt;
	}

	
	/**
	 * 개행을 제외한 파일에서 전체 Sequence 개수를 계산한다.
	 * Header , Trailer 제외한 Record들로 계산
	 * @param total_record_cnt
	 * @param record_cnt
	 * @return
	 */
	private long getTotalSequenceCnt(long total_record_cnt, int record_cnt) {
		
		long total_sequence_cnt = 0;
		total_sequence_cnt = (long) Math.ceil((double)total_record_cnt / record_cnt);
		
		return total_sequence_cnt;
	}

	
	/**
	 * 개행을 제외한 파일에서 전체 Block 개수를 계산한다.
	 * Header , Trailer 제외한 Sequence들로 계산
	 * @param tot_sequence_count
	 * @param skip_bit_check_cnt
	 * @return
	 */
	private long getTotalBlockCnt(long tot_sequence_cnt, long skip_bit_check_cnt) {
	
		long total_block_cnt = 0;
		total_block_cnt = (long) Math.ceil((double)tot_sequence_cnt / skip_bit_check_cnt);
		
		return total_block_cnt;
	}

}
/*
 * 작성된 날짜: Aug 16, 2023
 * Copyright (c) 2023 TmaxSoft co., Ltd. All rights reserved.
 */
package hwgi.f54;

import com.tmax.promapper.engine.base.ProMapperDataObject;
import java.util.ArrayList;
import java.util.Map;
import java.util.LinkedHashMap;
import java.util.List;
import proframe.tool.record.common.*;
import com.tmax.promapper.engine.base.ResourceMeta;
import com.tmax.promapper.engine.util.StringUtil;
import java.math.BigInteger;


/**
 * @file              hwgi.f54.BKNIA_Variables.java
 * @filetype          java source file
 * @brief            
 * @version           1.0
 * @history
 * 성 명              일 자                     근 거 자 료                      변 경 내 용
 * -----------        --------                  --------------                   --------------------------    
 * AnyLink :       Aug 16, 2023                AnyLink 개발 :                신규 작성
 * 
 */

public class BKNIA_Variables extends ProMapperDataObject implements ResourceMeta {
    private static final long serialVersionUID= 1L;
    public BKNIA_Variables() {
            super();
    }
    private boolean _setFlag = false;
    private BigInteger tot_file_size = null;
    
    public BigInteger getTot_file_size() {
        return tot_file_size;
    }

    public String getTot_file_size(boolean _masked) {
        return StringUtil.nullableStringValueOf(getTot_file_size());
    }
                      
    public void setTot_file_size(BigInteger tot_file_size) {
        this.tot_file_size = tot_file_size;
        _setFlag = true;
    }

    public void setTot_file_size(BigInteger tot_file_size, boolean _masked) {
        setTot_file_size(tot_file_size);
    }


            
    private BigInteger file_size = null;
    
    public BigInteger getFile_size() {
        return file_size;
    }

    public String getFile_size(boolean _masked) {
        return StringUtil.nullableStringValueOf(getFile_size());
    }
                      
    public void setFile_size(BigInteger file_size) {
        this.file_size = file_size;
        _setFlag = true;
    }

    public void setFile_size(BigInteger file_size, boolean _masked) {
        setFile_size(file_size);
    }


            
    private long sr_byte_size;
    
    public long getSr_byte_size() {
        return sr_byte_size;
    }

    public String getSr_byte_size(boolean _masked) {
        return String.valueOf(getSr_byte_size());
    }
                      
    public void setSr_byte_size(long sr_byte_size) {
        this.sr_byte_size = sr_byte_size;
        _setFlag = true;
    }

    public void setSr_byte_size(long sr_byte_size, boolean _masked) {
        setSr_byte_size(sr_byte_size);
    }


            
    private long send_byte_size;
    
    public long getSend_byte_size() {
        return send_byte_size;
    }

    public String getSend_byte_size(boolean _masked) {
        return String.valueOf(getSend_byte_size());
    }
                      
    public void setSend_byte_size(long send_byte_size) {
        this.send_byte_size = send_byte_size;
        _setFlag = true;
    }

    public void setSend_byte_size(long send_byte_size, boolean _masked) {
        setSend_byte_size(send_byte_size);
    }


            
    private long tot_blk_cnt;
    
    public long getTot_blk_cnt() {
        return tot_blk_cnt;
    }

    public String getTot_blk_cnt(boolean _masked) {
        return String.valueOf(getTot_blk_cnt());
    }
                      
    public void setTot_blk_cnt(long tot_blk_cnt) {
        this.tot_blk_cnt = tot_blk_cnt;
        _setFlag = true;
    }

    public void setTot_blk_cnt(long tot_blk_cnt, boolean _masked) {
        setTot_blk_cnt(tot_blk_cnt);
    }


            
    private long tot_seq_cnt;
    
    public long getTot_seq_cnt() {
        return tot_seq_cnt;
    }

    public String getTot_seq_cnt(boolean _masked) {
        return String.valueOf(getTot_seq_cnt());
    }
                      
    public void setTot_seq_cnt(long tot_seq_cnt) {
        this.tot_seq_cnt = tot_seq_cnt;
        _setFlag = true;
    }

    public void setTot_seq_cnt(long tot_seq_cnt, boolean _masked) {
        setTot_seq_cnt(tot_seq_cnt);
    }


            
    private long tot_record_cnt;
    
    public long getTot_record_cnt() {
        return tot_record_cnt;
    }

    public String getTot_record_cnt(boolean _masked) {
        return String.valueOf(getTot_record_cnt());
    }
                      
    public void setTot_record_cnt(long tot_record_cnt) {
        this.tot_record_cnt = tot_record_cnt;
        _setFlag = true;
    }

    public void setTot_record_cnt(long tot_record_cnt, boolean _masked) {
        setTot_record_cnt(tot_record_cnt);
    }


            
    private long cur_blk_no;
    
    public long getCur_blk_no() {
        return cur_blk_no;
    }

    public String getCur_blk_no(boolean _masked) {
        return String.valueOf(getCur_blk_no());
    }
                      
    public void setCur_blk_no(long cur_blk_no) {
        this.cur_blk_no = cur_blk_no;
        _setFlag = true;
    }

    public void setCur_blk_no(long cur_blk_no, boolean _masked) {
        setCur_blk_no(cur_blk_no);
    }


            
    private long cur_seq_no;
    
    public long getCur_seq_no() {
        return cur_seq_no;
    }

    public String getCur_seq_no(boolean _masked) {
        return String.valueOf(getCur_seq_no());
    }
                      
    public void setCur_seq_no(long cur_seq_no) {
        this.cur_seq_no = cur_seq_no;
        _setFlag = true;
    }

    public void setCur_seq_no(long cur_seq_no, boolean _masked) {
        setCur_seq_no(cur_seq_no);
    }


            
    private long tot_sr_blk_cnt;
    
    public long getTot_sr_blk_cnt() {
        return tot_sr_blk_cnt;
    }

    public String getTot_sr_blk_cnt(boolean _masked) {
        return String.valueOf(getTot_sr_blk_cnt());
    }
                      
    public void setTot_sr_blk_cnt(long tot_sr_blk_cnt) {
        this.tot_sr_blk_cnt = tot_sr_blk_cnt;
        _setFlag = true;
    }

    public void setTot_sr_blk_cnt(long tot_sr_blk_cnt, boolean _masked) {
        setTot_sr_blk_cnt(tot_sr_blk_cnt);
    }


            
    private long tot_sr_seq_cnt;
    
    public long getTot_sr_seq_cnt() {
        return tot_sr_seq_cnt;
    }

    public String getTot_sr_seq_cnt(boolean _masked) {
        return String.valueOf(getTot_sr_seq_cnt());
    }
                      
    public void setTot_sr_seq_cnt(long tot_sr_seq_cnt) {
        this.tot_sr_seq_cnt = tot_sr_seq_cnt;
        _setFlag = true;
    }

    public void setTot_sr_seq_cnt(long tot_sr_seq_cnt, boolean _masked) {
        setTot_sr_seq_cnt(tot_sr_seq_cnt);
    }


            
    private long tot_sr_record_cnt;
    
    public long getTot_sr_record_cnt() {
        return tot_sr_record_cnt;
    }

    public String getTot_sr_record_cnt(boolean _masked) {
        return String.valueOf(getTot_sr_record_cnt());
    }
                      
    public void setTot_sr_record_cnt(long tot_sr_record_cnt) {
        this.tot_sr_record_cnt = tot_sr_record_cnt;
        _setFlag = true;
    }

    public void setTot_sr_record_cnt(long tot_sr_record_cnt, boolean _masked) {
        setTot_sr_record_cnt(tot_sr_record_cnt);
    }


            
    private long remain_blk_cnt;
    
    public long getRemain_blk_cnt() {
        return remain_blk_cnt;
    }

    public String getRemain_blk_cnt(boolean _masked) {
        return String.valueOf(getRemain_blk_cnt());
    }
                      
    public void setRemain_blk_cnt(long remain_blk_cnt) {
        this.remain_blk_cnt = remain_blk_cnt;
        _setFlag = true;
    }

    public void setRemain_blk_cnt(long remain_blk_cnt, boolean _masked) {
        setRemain_blk_cnt(remain_blk_cnt);
    }


            
    private long remain_seq_cnt;
    
    public long getRemain_seq_cnt() {
        return remain_seq_cnt;
    }

    public String getRemain_seq_cnt(boolean _masked) {
        return String.valueOf(getRemain_seq_cnt());
    }
                      
    public void setRemain_seq_cnt(long remain_seq_cnt) {
        this.remain_seq_cnt = remain_seq_cnt;
        _setFlag = true;
    }

    public void setRemain_seq_cnt(long remain_seq_cnt, boolean _masked) {
        setRemain_seq_cnt(remain_seq_cnt);
    }


            
    private long remain_record_cnt;
    
    public long getRemain_record_cnt() {
        return remain_record_cnt;
    }

    public String getRemain_record_cnt(boolean _masked) {
        return String.valueOf(getRemain_record_cnt());
    }
                      
    public void setRemain_record_cnt(long remain_record_cnt) {
        this.remain_record_cnt = remain_record_cnt;
        _setFlag = true;
    }

    public void setRemain_record_cnt(long remain_record_cnt, boolean _masked) {
        setRemain_record_cnt(remain_record_cnt);
    }


            
    private long skip_seq_cnt;
    
    public long getSkip_seq_cnt() {
        return skip_seq_cnt;
    }

    public String getSkip_seq_cnt(boolean _masked) {
        return String.valueOf(getSkip_seq_cnt());
    }
                      
    public void setSkip_seq_cnt(long skip_seq_cnt) {
        this.skip_seq_cnt = skip_seq_cnt;
        _setFlag = true;
    }

    public void setSkip_seq_cnt(long skip_seq_cnt, boolean _masked) {
        setSkip_seq_cnt(skip_seq_cnt);
    }


            
    private String sendHist_003 = null;
    
    public String getSendHist_003() {
        return sendHist_003;
    }

    public String getSendHist_003(boolean _masked) {
        return StringUtil.nullableStringValueOf(getSendHist_003());
    }
                      
    public void setSendHist_003(String sendHist_003) {
        this.sendHist_003 = sendHist_003;
        _setFlag = true;
    }

    public void setSendHist_003(String sendHist_003, boolean _masked) {
        setSendHist_003(sendHist_003);
    }


            
    private String sendHist_004 = null;
    
    public String getSendHist_004() {
        return sendHist_004;
    }

    public String getSendHist_004(boolean _masked) {
        return StringUtil.nullableStringValueOf(getSendHist_004());
    }
                      
    public void setSendHist_004(String sendHist_004) {
        this.sendHist_004 = sendHist_004;
        _setFlag = true;
    }

    public void setSendHist_004(String sendHist_004, boolean _masked) {
        setSendHist_004(sendHist_004);
    }


            
    private String session_key = null;
    
    public String getSession_key() {
        return session_key;
    }

    public String getSession_key(boolean _masked) {
        return StringUtil.nullableStringValueOf(getSession_key());
    }
                      
    public void setSession_key(String session_key) {
        this.session_key = session_key;
        _setFlag = true;
    }

    public void setSession_key(String session_key, boolean _masked) {
        setSession_key(session_key);
    }


            
    public Object clone() {
        BKNIA_Variables copyObj = new BKNIA_Variables();
        clone(copyObj);
        return copyObj;
    }
    public void clone(proframe.dto.DataObject __bKNIA_Variables) {
        BKNIA_Variables _bKNIA_Variables = (BKNIA_Variables) __bKNIA_Variables;
        _bKNIA_Variables.setTot_file_size(tot_file_size);
        _bKNIA_Variables.setFile_size(file_size);
        _bKNIA_Variables.setSr_byte_size(sr_byte_size);
        _bKNIA_Variables.setSend_byte_size(send_byte_size);
        _bKNIA_Variables.setTot_blk_cnt(tot_blk_cnt);
        _bKNIA_Variables.setTot_seq_cnt(tot_seq_cnt);
        _bKNIA_Variables.setTot_record_cnt(tot_record_cnt);
        _bKNIA_Variables.setCur_blk_no(cur_blk_no);
        _bKNIA_Variables.setCur_seq_no(cur_seq_no);
        _bKNIA_Variables.setTot_sr_blk_cnt(tot_sr_blk_cnt);
        _bKNIA_Variables.setTot_sr_seq_cnt(tot_sr_seq_cnt);
        _bKNIA_Variables.setTot_sr_record_cnt(tot_sr_record_cnt);
        _bKNIA_Variables.setRemain_blk_cnt(remain_blk_cnt);
        _bKNIA_Variables.setRemain_seq_cnt(remain_seq_cnt);
        _bKNIA_Variables.setRemain_record_cnt(remain_record_cnt);
        _bKNIA_Variables.setSkip_seq_cnt(skip_seq_cnt);
        _bKNIA_Variables.setSendHist_003(sendHist_003);
        _bKNIA_Variables.setSendHist_004(sendHist_004);
        _bKNIA_Variables.setSession_key(session_key);
    }
    public String toString() {
        StringBuilder buffer = new StringBuilder();
        buffer.append(super.toString());

            buffer.append('\n');
            toString_0(buffer);
        
        return buffer.toString();
    }
    
    private void toString_0(StringBuilder buffer) {
        int _size = 0; // field가 array인 경우 array size를 저장하는 변수
            buffer.append("tot_file_size : ").append(tot_file_size).append("\n");
            buffer.append("file_size : ").append(file_size).append("\n");
            buffer.append("sr_byte_size : ").append(sr_byte_size).append("\n");
            buffer.append("send_byte_size : ").append(send_byte_size).append("\n");
            buffer.append("tot_blk_cnt : ").append(tot_blk_cnt).append("\n");
            buffer.append("tot_seq_cnt : ").append(tot_seq_cnt).append("\n");
            buffer.append("tot_record_cnt : ").append(tot_record_cnt).append("\n");
            buffer.append("cur_blk_no : ").append(cur_blk_no).append("\n");
            buffer.append("cur_seq_no : ").append(cur_seq_no).append("\n");
            buffer.append("tot_sr_blk_cnt : ").append(tot_sr_blk_cnt).append("\n");
            buffer.append("tot_sr_seq_cnt : ").append(tot_sr_seq_cnt).append("\n");
            buffer.append("tot_sr_record_cnt : ").append(tot_sr_record_cnt).append("\n");
            buffer.append("remain_blk_cnt : ").append(remain_blk_cnt).append("\n");
            buffer.append("remain_seq_cnt : ").append(remain_seq_cnt).append("\n");
            buffer.append("remain_record_cnt : ").append(remain_record_cnt).append("\n");
            buffer.append("skip_seq_cnt : ").append(skip_seq_cnt).append("\n");
            buffer.append("sendHist_003 : ").append(sendHist_003).append("\n");
            buffer.append("sendHist_004 : ").append(sendHist_004).append("\n");
            buffer.append("session_key : ").append(session_key).append("\n");
    }    
    public String toString(int limit) {
        StringBuilder buffer = new StringBuilder();
        buffer.append(super.toString());
        int _size = 0; // field가 array인 경우 array size를 저장하는 변수
        
            buffer.append('\n');
            toString_0(buffer, limit);
        
        return buffer.toString();
    }
    
    private void toString_0(StringBuilder buffer, int limit) {
        int _size = 0; // field가 array인 경우 array size를 저장하는 변수
        if(buffer.length() < limit) {
            buffer.append("tot_file_size : ").append(tot_file_size).append("\n");
        }
        if(buffer.length() < limit) {
            buffer.append("file_size : ").append(file_size).append("\n");
        }
        if(buffer.length() < limit) {
            buffer.append("sr_byte_size : ").append(sr_byte_size).append("\n");
        }
        if(buffer.length() < limit) {
            buffer.append("send_byte_size : ").append(send_byte_size).append("\n");
        }
        if(buffer.length() < limit) {
            buffer.append("tot_blk_cnt : ").append(tot_blk_cnt).append("\n");
        }
        if(buffer.length() < limit) {
            buffer.append("tot_seq_cnt : ").append(tot_seq_cnt).append("\n");
        }
        if(buffer.length() < limit) {
            buffer.append("tot_record_cnt : ").append(tot_record_cnt).append("\n");
        }
        if(buffer.length() < limit) {
            buffer.append("cur_blk_no : ").append(cur_blk_no).append("\n");
        }
        if(buffer.length() < limit) {
            buffer.append("cur_seq_no : ").append(cur_seq_no).append("\n");
        }
        if(buffer.length() < limit) {
            buffer.append("tot_sr_blk_cnt : ").append(tot_sr_blk_cnt).append("\n");
        }
        if(buffer.length() < limit) {
            buffer.append("tot_sr_seq_cnt : ").append(tot_sr_seq_cnt).append("\n");
        }
        if(buffer.length() < limit) {
            buffer.append("tot_sr_record_cnt : ").append(tot_sr_record_cnt).append("\n");
        }
        if(buffer.length() < limit) {
            buffer.append("remain_blk_cnt : ").append(remain_blk_cnt).append("\n");
        }
        if(buffer.length() < limit) {
            buffer.append("remain_seq_cnt : ").append(remain_seq_cnt).append("\n");
        }
        if(buffer.length() < limit) {
            buffer.append("remain_record_cnt : ").append(remain_record_cnt).append("\n");
        }
        if(buffer.length() < limit) {
            buffer.append("skip_seq_cnt : ").append(skip_seq_cnt).append("\n");
        }
        if(buffer.length() < limit) {
            buffer.append("sendHist_003 : ").append(sendHist_003).append("\n");
        }
        if(buffer.length() < limit) {
            buffer.append("sendHist_004 : ").append(sendHist_004).append("\n");
        }
        if(buffer.length() < limit) {
            buffer.append("session_key : ").append(session_key).append("\n");
        }
    }    
    private static final Map fieldPropertyMap = null;
    
/*    static {
        parentfieldPropertyMap = ProMapperDataObject.getFieldPropertyMapByStatic();
        fieldPropertyMap = new java.util.LinkedHashMap( parentfieldPropertyMap.size() + 19);
        fieldPropertyMap.putAll( parentfieldPropertyMap );

        fieldPropertyMap.put("tot_file_size"
                            , FieldPropertyFactory.getFieldProperty( FieldProperty.TYPE_OBJECT_BIG_INTEGER, -1, null, null));
        fieldPropertyMap.put("file_size"
                            , FieldPropertyFactory.getFieldProperty( FieldProperty.TYPE_OBJECT_BIG_INTEGER, -1, null, null));
        fieldPropertyMap.put("sr_byte_size"
                            , FieldPropertyFactory.getFieldProperty( FieldProperty.TYPE_ABSTRACT_INTEGER, -1, null, null));
        fieldPropertyMap.put("send_byte_size"
                            , FieldPropertyFactory.getFieldProperty( FieldProperty.TYPE_ABSTRACT_INTEGER, -1, null, null));
        fieldPropertyMap.put("tot_blk_cnt"
                            , FieldPropertyFactory.getFieldProperty( FieldProperty.TYPE_ABSTRACT_INTEGER, -1, null, null));
        fieldPropertyMap.put("tot_seq_cnt"
                            , FieldPropertyFactory.getFieldProperty( FieldProperty.TYPE_ABSTRACT_INTEGER, -1, null, null));
        fieldPropertyMap.put("tot_record_cnt"
                            , FieldPropertyFactory.getFieldProperty( FieldProperty.TYPE_ABSTRACT_INTEGER, -1, null, null));
        fieldPropertyMap.put("cur_blk_no"
                            , FieldPropertyFactory.getFieldProperty( FieldProperty.TYPE_ABSTRACT_INTEGER, -1, null, null));
        fieldPropertyMap.put("cur_seq_no"
                            , FieldPropertyFactory.getFieldProperty( FieldProperty.TYPE_ABSTRACT_INTEGER, -1, null, null));
        fieldPropertyMap.put("tot_sr_blk_cnt"
                            , FieldPropertyFactory.getFieldProperty( FieldProperty.TYPE_ABSTRACT_INTEGER, -1, null, null));
        fieldPropertyMap.put("tot_sr_seq_cnt"
                            , FieldPropertyFactory.getFieldProperty( FieldProperty.TYPE_ABSTRACT_INTEGER, -1, null, null));
        fieldPropertyMap.put("tot_sr_record_cnt"
                            , FieldPropertyFactory.getFieldProperty( FieldProperty.TYPE_ABSTRACT_INTEGER, -1, null, null));
        fieldPropertyMap.put("remain_blk_cnt"
                            , FieldPropertyFactory.getFieldProperty( FieldProperty.TYPE_ABSTRACT_INTEGER, -1, null, null));
        fieldPropertyMap.put("remain_seq_cnt"
                            , FieldPropertyFactory.getFieldProperty( FieldProperty.TYPE_ABSTRACT_INTEGER, -1, null, null));
        fieldPropertyMap.put("remain_record_cnt"
                            , FieldPropertyFactory.getFieldProperty( FieldProperty.TYPE_ABSTRACT_INTEGER, -1, null, null));
        fieldPropertyMap.put("skip_seq_cnt"
                            , FieldPropertyFactory.getFieldProperty( FieldProperty.TYPE_ABSTRACT_INTEGER, -1, null, null));
        fieldPropertyMap.put("sendHist_003"
                            , FieldPropertyFactory.getFieldProperty( FieldProperty.TYPE_ABSTRACT_STRING, -1, null, null));
        fieldPropertyMap.put("sendHist_004"
                            , FieldPropertyFactory.getFieldProperty( FieldProperty.TYPE_ABSTRACT_STRING, -1, null, null));
        fieldPropertyMap.put("session_key"
                            , FieldPropertyFactory.getFieldProperty( FieldProperty.TYPE_ABSTRACT_STRING, -1, null, null));
    }*/
    
    public Map getFieldPropertyMap() {
        return fieldPropertyMap;
    }
    
    public static Map getFieldPropertyMapByStatic() {
        return fieldPropertyMap;
    }
    private static final List<String> fieldNameList = new ArrayList<String>(19);
    
    static {        
        fieldNameList.add("tot_file_size");
        fieldNameList.add("file_size");
        fieldNameList.add("sr_byte_size");
        fieldNameList.add("send_byte_size");
        fieldNameList.add("tot_blk_cnt");
        fieldNameList.add("tot_seq_cnt");
        fieldNameList.add("tot_record_cnt");
        fieldNameList.add("cur_blk_no");
        fieldNameList.add("cur_seq_no");
        fieldNameList.add("tot_sr_blk_cnt");
        fieldNameList.add("tot_sr_seq_cnt");
        fieldNameList.add("tot_sr_record_cnt");
        fieldNameList.add("remain_blk_cnt");
        fieldNameList.add("remain_seq_cnt");
        fieldNameList.add("remain_record_cnt");
        fieldNameList.add("skip_seq_cnt");
        fieldNameList.add("sendHist_003");
        fieldNameList.add("sendHist_004");
        fieldNameList.add("session_key");
    }
    
    public List<String> getFieldNameList(){
        return fieldNameList;
    }
    
    public boolean getSetFlag(){
        return _setFlag;
    }

    public Object get(String fieldName) {
        int hashCode = fieldName.hashCode();
        
        switch(hashCode) {
            case 970084734 : return getTot_file_size();
            case -1316310812 : return getFile_size();
            case -274498824 : return Long.valueOf(getSr_byte_size());
            case 888970465 : return Long.valueOf(getSend_byte_size());
            case 495555749 : return Long.valueOf(getTot_blk_cnt());
            case -1791613789 : return Long.valueOf(getTot_seq_cnt());
            case -1400963295 : return Long.valueOf(getTot_record_cnt());
            case -859676610 : return Long.valueOf(getCur_blk_no());
            case -379266944 : return Long.valueOf(getCur_seq_no());
            case -818811311 : return Long.valueOf(getTot_sr_blk_cnt());
            case 1188986447 : return Long.valueOf(getTot_sr_seq_cnt());
            case -493210123 : return Long.valueOf(getTot_sr_record_cnt());
            case -766127432 : return Long.valueOf(getRemain_blk_cnt());
            case 1241670326 : return Long.valueOf(getRemain_seq_cnt());
            case 1349166126 : return Long.valueOf(getRemain_record_cnt());
            case -1020345655 : return Long.valueOf(getSkip_seq_cnt());
            case -908029122 : return getSendHist_003();
            case -908029121 : return getSendHist_004();
            case -22145738 : return getSession_key();
            default : return null;
        }
    }
    public void set(String fieldName, Object arg) {
        int hashCode = fieldName.hashCode();
        
        switch(hashCode) {
            case 970084734 : setTot_file_size((BigInteger)arg);break;
            case -1316310812 : setFile_size((BigInteger)arg);break;
            case -274498824 : setSr_byte_size(((Long)arg).longValue());break;
            case 888970465 : setSend_byte_size(((Long)arg).longValue());break;
            case 495555749 : setTot_blk_cnt(((Long)arg).longValue());break;
            case -1791613789 : setTot_seq_cnt(((Long)arg).longValue());break;
            case -1400963295 : setTot_record_cnt(((Long)arg).longValue());break;
            case -859676610 : setCur_blk_no(((Long)arg).longValue());break;
            case -379266944 : setCur_seq_no(((Long)arg).longValue());break;
            case -818811311 : setTot_sr_blk_cnt(((Long)arg).longValue());break;
            case 1188986447 : setTot_sr_seq_cnt(((Long)arg).longValue());break;
            case -493210123 : setTot_sr_record_cnt(((Long)arg).longValue());break;
            case -766127432 : setRemain_blk_cnt(((Long)arg).longValue());break;
            case 1241670326 : setRemain_seq_cnt(((Long)arg).longValue());break;
            case 1349166126 : setRemain_record_cnt(((Long)arg).longValue());break;
            case -1020345655 : setSkip_seq_cnt(((Long)arg).longValue());break;
            case -908029122 : setSendHist_003((String)arg);break;
            case -908029121 : setSendHist_004((String)arg);break;
            case -22145738 : setSession_key((String)arg);break;
            default : return;
        }
    }
    public boolean isEmptyDataObjectMethod(){ 
        if (tot_file_size != null) return false;
        if (file_size != null) return false;
        if(true) return false;
        if(true) return false;
        if(true) return false;
        if(true) return false;
        if(true) return false;
        if(true) return false;
        if(true) return false;
        if(true) return false;
        if(true) return false;
        if(true) return false;
        if(true) return false;
        if(true) return false;
        if(true) return false;
        if(true) return false;
        if (sendHist_003 != null) return false;
        if (sendHist_004 != null) return false;
        if (session_key != null) return false;

        return true;
    }

    /**
     * @param input 
     *  values of input variable are 
     *                                         physicalname
     *                                        versionno
     *                                        logicalname
     *                                        resourceid
     *                                   resourceType
     *                                   resourcePath
     *                                   resourceGroup
     * @return 
     */
    public String getMetaData(String input) {

        if (input.equalsIgnoreCase(META_PHYSICAL_NAME)) {
            return "BKNIA_Variables";
        } else if (input.equalsIgnoreCase(META_VERSION_NO)){
            return "0";
        } else if (input.equalsIgnoreCase(META_LOGICAL_NAME)){
            return "BKNIA_Variables";
        } else if (input.equalsIgnoreCase(META_RESOURCE_ID)){
            return "hwgi.f54:BKNIA_Variables.umsg";
        } else if (input.equalsIgnoreCase(META_RESOURCE_TYPE)){
            return "STRUCTURE";
        } else if (input.equalsIgnoreCase(META_RESOURCE_PATH)){
            return "hwgi.f54";
        } else if (input.equalsIgnoreCase(META_RESOURCE_GROUP)){
            return "";
        } else {
            String msg = "Expecting one of " + META_PHYSICAL_NAME + ", "
                    + META_VERSION_NO + ", " + META_LOGICAL_NAME + ", "
                    + META_RESOURCE_ID + ", " + META_RESOURCE_TYPE + ", "
                    + META_RESOURCE_PATH + ", " + META_RESOURCE_GROUP;
            throw new IllegalArgumentException(msg);
        }
    }
}

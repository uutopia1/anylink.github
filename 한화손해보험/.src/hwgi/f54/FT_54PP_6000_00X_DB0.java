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


/**
 * @file              hwgi.f54.FT_54PP_6000_00X_DB0.java
 * @filetype          java source file
 * @brief            
 * @version           1.0
 * @history
 * 성 명              일 자                     근 거 자 료                      변 경 내 용
 * -----------        --------                  --------------                   --------------------------    
 * AnyLink :       Aug 16, 2023                AnyLink 개발 :                신규 작성
 * 
 */

public class FT_54PP_6000_00X_DB0 extends ProMapperDataObject implements ResourceMeta {
    private static final long serialVersionUID= 1L;
    public FT_54PP_6000_00X_DB0() {
            super();
    }
    private boolean _setFlag = false;
    private String SnrCode = null;
    
    public String getSnrCode() {
        return SnrCode;
    }

    public String getSnrCode(boolean _masked) {
        return StringUtil.nullableStringValueOf(getSnrCode());
    }
                      
    public void setSnrCode(String SnrCode) {
        this.SnrCode = SnrCode;
        _setFlag = true;
    }

    public void setSnrCode(String SnrCode, boolean _masked) {
        setSnrCode(SnrCode);
    }


            
    private String OprCode = null;
    
    public String getOprCode() {
        return OprCode;
    }

    public String getOprCode(boolean _masked) {
        return StringUtil.nullableStringValueOf(getOprCode());
    }
                      
    public void setOprCode(String OprCode) {
        this.OprCode = OprCode;
        _setFlag = true;
    }

    public void setOprCode(String OprCode, boolean _masked) {
        setOprCode(OprCode);
    }


            
    private long TotBlockNo;
    
    public long getTotBlockNo() {
        return TotBlockNo;
    }

    public String getTotBlockNo(boolean _masked) {
        return String.valueOf(getTotBlockNo());
    }
                      
    public void setTotBlockNo(long TotBlockNo) {
        this.TotBlockNo = TotBlockNo;
        _setFlag = true;
    }

    public void setTotBlockNo(long TotBlockNo, boolean _masked) {
        setTotBlockNo(TotBlockNo);
    }


            
    private long TotSeqNo;
    
    public long getTotSeqNo() {
        return TotSeqNo;
    }

    public String getTotSeqNo(boolean _masked) {
        return String.valueOf(getTotSeqNo());
    }
                      
    public void setTotSeqNo(long TotSeqNo) {
        this.TotSeqNo = TotSeqNo;
        _setFlag = true;
    }

    public void setTotSeqNo(long TotSeqNo, boolean _masked) {
        setTotSeqNo(TotSeqNo);
    }


            
    private String TranDate = null;
    
    public String getTranDate() {
        return TranDate;
    }

    public String getTranDate(boolean _masked) {
        return StringUtil.nullableStringValueOf(getTranDate());
    }
                      
    public void setTranDate(String TranDate) {
        this.TranDate = TranDate;
        _setFlag = true;
    }

    public void setTranDate(String TranDate, boolean _masked) {
        setTranDate(TranDate);
    }


            
    private long SendCnt;
    
    public long getSendCnt() {
        return SendCnt;
    }

    public String getSendCnt(boolean _masked) {
        return String.valueOf(getSendCnt());
    }
                      
    public void setSendCnt(long SendCnt) {
        this.SendCnt = SendCnt;
        _setFlag = true;
    }

    public void setSendCnt(long SendCnt, boolean _masked) {
        setSendCnt(SendCnt);
    }


            
    private String SendUserId = null;
    
    public String getSendUserId() {
        return SendUserId;
    }

    public String getSendUserId(boolean _masked) {
        return StringUtil.nullableStringValueOf(getSendUserId());
    }
                      
    public void setSendUserId(String SendUserId) {
        this.SendUserId = SendUserId;
        _setFlag = true;
    }

    public void setSendUserId(String SendUserId, boolean _masked) {
        setSendUserId(SendUserId);
    }


            
    private String SendPassword = null;
    
    public String getSendPassword() {
        return SendPassword;
    }

    public String getSendPassword(boolean _masked) {
        return StringUtil.nullableStringValueOf(getSendPassword());
    }
                      
    public void setSendPassword(String SendPassword) {
        this.SendPassword = SendPassword;
        _setFlag = true;
    }

    public void setSendPassword(String SendPassword, boolean _masked) {
        setSendPassword(SendPassword);
    }


            
    public Object clone() {
        FT_54PP_6000_00X_DB0 copyObj = new FT_54PP_6000_00X_DB0();
        clone(copyObj);
        return copyObj;
    }
    public void clone(proframe.dto.DataObject __fT_54PP_6000_00X_DB0) {
        FT_54PP_6000_00X_DB0 _fT_54PP_6000_00X_DB0 = (FT_54PP_6000_00X_DB0) __fT_54PP_6000_00X_DB0;
        _fT_54PP_6000_00X_DB0.setSnrCode(SnrCode);
        _fT_54PP_6000_00X_DB0.setOprCode(OprCode);
        _fT_54PP_6000_00X_DB0.setTotBlockNo(TotBlockNo);
        _fT_54PP_6000_00X_DB0.setTotSeqNo(TotSeqNo);
        _fT_54PP_6000_00X_DB0.setTranDate(TranDate);
        _fT_54PP_6000_00X_DB0.setSendCnt(SendCnt);
        _fT_54PP_6000_00X_DB0.setSendUserId(SendUserId);
        _fT_54PP_6000_00X_DB0.setSendPassword(SendPassword);
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
            buffer.append("SnrCode : ").append(SnrCode).append("\n");
            buffer.append("OprCode : ").append(OprCode).append("\n");
            buffer.append("TotBlockNo : ").append(TotBlockNo).append("\n");
            buffer.append("TotSeqNo : ").append(TotSeqNo).append("\n");
            buffer.append("TranDate : ").append(TranDate).append("\n");
            buffer.append("SendCnt : ").append(SendCnt).append("\n");
            buffer.append("SendUserId : ").append(SendUserId).append("\n");
            buffer.append("SendPassword : ").append(SendPassword).append("\n");
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
            buffer.append("SnrCode : ").append(SnrCode).append("\n");
        }
        if(buffer.length() < limit) {
            buffer.append("OprCode : ").append(OprCode).append("\n");
        }
        if(buffer.length() < limit) {
            buffer.append("TotBlockNo : ").append(TotBlockNo).append("\n");
        }
        if(buffer.length() < limit) {
            buffer.append("TotSeqNo : ").append(TotSeqNo).append("\n");
        }
        if(buffer.length() < limit) {
            buffer.append("TranDate : ").append(TranDate).append("\n");
        }
        if(buffer.length() < limit) {
            buffer.append("SendCnt : ").append(SendCnt).append("\n");
        }
        if(buffer.length() < limit) {
            buffer.append("SendUserId : ").append(SendUserId).append("\n");
        }
        if(buffer.length() < limit) {
            buffer.append("SendPassword : ").append(SendPassword).append("\n");
        }
    }    
    private static final Map fieldPropertyMap = null;
    
/*    static {
        parentfieldPropertyMap = ProMapperDataObject.getFieldPropertyMapByStatic();
        fieldPropertyMap = new java.util.LinkedHashMap( parentfieldPropertyMap.size() + 8);
        fieldPropertyMap.putAll( parentfieldPropertyMap );

        fieldPropertyMap.put("SnrCode"
                            , FieldPropertyFactory.getFieldProperty( FieldProperty.TYPE_ABSTRACT_STRING, -1, null, null));
        fieldPropertyMap.put("OprCode"
                            , FieldPropertyFactory.getFieldProperty( FieldProperty.TYPE_ABSTRACT_STRING, -1, null, null));
        fieldPropertyMap.put("TotBlockNo"
                            , FieldPropertyFactory.getFieldProperty( FieldProperty.TYPE_ABSTRACT_INTEGER, -1, null, null));
        fieldPropertyMap.put("TotSeqNo"
                            , FieldPropertyFactory.getFieldProperty( FieldProperty.TYPE_ABSTRACT_INTEGER, -1, null, null));
        fieldPropertyMap.put("TranDate"
                            , FieldPropertyFactory.getFieldProperty( FieldProperty.TYPE_ABSTRACT_STRING, -1, null, null));
        fieldPropertyMap.put("SendCnt"
                            , FieldPropertyFactory.getFieldProperty( FieldProperty.TYPE_ABSTRACT_INTEGER, -1, null, null));
        fieldPropertyMap.put("SendUserId"
                            , FieldPropertyFactory.getFieldProperty( FieldProperty.TYPE_ABSTRACT_STRING, -1, null, null));
        fieldPropertyMap.put("SendPassword"
                            , FieldPropertyFactory.getFieldProperty( FieldProperty.TYPE_ABSTRACT_STRING, -1, null, null));
    }*/
    
    public Map getFieldPropertyMap() {
        return fieldPropertyMap;
    }
    
    public static Map getFieldPropertyMapByStatic() {
        return fieldPropertyMap;
    }
    private static final List<String> fieldNameList = new ArrayList<String>(8);
    
    static {        
        fieldNameList.add("SnrCode");
        fieldNameList.add("OprCode");
        fieldNameList.add("TotBlockNo");
        fieldNameList.add("TotSeqNo");
        fieldNameList.add("TranDate");
        fieldNameList.add("SendCnt");
        fieldNameList.add("SendUserId");
        fieldNameList.add("SendPassword");
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
            case -390011932 : return getSnrCode();
            case 412198942 : return getOprCode();
            case -440464459 : return Long.valueOf(getTotBlockNo());
            case -798372665 : return Long.valueOf(getTotSeqNo());
            case 1344122265 : return getTranDate();
            case -650427231 : return Long.valueOf(getSendCnt());
            case -1760559090 : return getSendUserId();
            case 1803631203 : return getSendPassword();
            default : return null;
        }
    }
    public void set(String fieldName, Object arg) {
        int hashCode = fieldName.hashCode();
        
        switch(hashCode) {
            case -390011932 : setSnrCode((String)arg);break;
            case 412198942 : setOprCode((String)arg);break;
            case -440464459 : setTotBlockNo(((Long)arg).longValue());break;
            case -798372665 : setTotSeqNo(((Long)arg).longValue());break;
            case 1344122265 : setTranDate((String)arg);break;
            case -650427231 : setSendCnt(((Long)arg).longValue());break;
            case -1760559090 : setSendUserId((String)arg);break;
            case 1803631203 : setSendPassword((String)arg);break;
            default : return;
        }
    }
    public boolean isEmptyDataObjectMethod(){ 
        if (SnrCode != null) return false;
        if (OprCode != null) return false;
        if(true) return false;
        if(true) return false;
        if (TranDate != null) return false;
        if(true) return false;
        if (SendUserId != null) return false;
        if (SendPassword != null) return false;

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
            return "FT_54PP_6000_00X_DB0";
        } else if (input.equalsIgnoreCase(META_VERSION_NO)){
            return "0";
        } else if (input.equalsIgnoreCase(META_LOGICAL_NAME)){
            return "FT_54PP_6000_00X_DB0_업무관리";
        } else if (input.equalsIgnoreCase(META_RESOURCE_ID)){
            return "hwgi.f54:FT_54PP_6000_00X_DB0.umsg";
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

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
 * @file              hwgi.f54.FT_54PP_0000_000_DH0.java
 * @filetype          java source file
 * @brief            
 * @version           1.0
 * @history
 * 성 명              일 자                     근 거 자 료                      변 경 내 용
 * -----------        --------                  --------------                   --------------------------    
 * AnyLink :       Aug 16, 2023                AnyLink 개발 :                신규 작성
 * 
 */

public class FT_54PP_0000_000_DH0 extends ProMapperDataObject implements ResourceMeta {
    private static final long serialVersionUID= 1L;
    public FT_54PP_0000_000_DH0() {
            super();
    }
    private boolean _setFlag = false;
    private String TranCode = null;
    
    public String getTranCode() {
        return TranCode;
    }

    public String getTranCode(boolean _masked) {
        return StringUtil.nullableStringValueOf(getTranCode());
    }
                      
    public void setTranCode(String TranCode) {
        this.TranCode = TranCode;
        _setFlag = true;
    }

    public void setTranCode(String TranCode, boolean _masked) {
        setTranCode(TranCode);
    }


            
    private String KniaText = null;
    
    public String getKniaText() {
        return KniaText;
    }

    public String getKniaText(boolean _masked) {
        return StringUtil.nullableStringValueOf(getKniaText());
    }
                      
    public void setKniaText(String KniaText) {
        this.KniaText = KniaText;
        _setFlag = true;
    }

    public void setKniaText(String KniaText, boolean _masked) {
        setKniaText(KniaText);
    }


            
    private String KindCode = null;
    
    public String getKindCode() {
        return KindCode;
    }

    public String getKindCode(boolean _masked) {
        return StringUtil.nullableStringValueOf(getKindCode());
    }
                      
    public void setKindCode(String KindCode) {
        this.KindCode = KindCode;
        _setFlag = true;
    }

    public void setKindCode(String KindCode, boolean _masked) {
        setKindCode(KindCode);
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


            
    private String SendDate = null;
    
    public String getSendDate() {
        return SendDate;
    }

    public String getSendDate(boolean _masked) {
        return StringUtil.nullableStringValueOf(getSendDate());
    }
                      
    public void setSendDate(String SendDate) {
        this.SendDate = SendDate;
        _setFlag = true;
    }

    public void setSendDate(String SendDate, boolean _masked) {
        setSendDate(SendDate);
    }


            
    private String MsgNo = null;
    
    public String getMsgNo() {
        return MsgNo;
    }

    public String getMsgNo(boolean _masked) {
        return StringUtil.nullableStringValueOf(getMsgNo());
    }
                      
    public void setMsgNo(String MsgNo) {
        this.MsgNo = MsgNo;
        _setFlag = true;
    }

    public void setMsgNo(String MsgNo, boolean _masked) {
        setMsgNo(MsgNo);
    }


            
    private String OrgCode = null;
    
    public String getOrgCode() {
        return OrgCode;
    }

    public String getOrgCode(boolean _masked) {
        return StringUtil.nullableStringValueOf(getOrgCode());
    }
                      
    public void setOrgCode(String OrgCode) {
        this.OrgCode = OrgCode;
        _setFlag = true;
    }

    public void setOrgCode(String OrgCode, boolean _masked) {
        setOrgCode(OrgCode);
    }


            
    private String TtyNo = null;
    
    public String getTtyNo() {
        return TtyNo;
    }

    public String getTtyNo(boolean _masked) {
        return StringUtil.nullableStringValueOf(getTtyNo());
    }
                      
    public void setTtyNo(String TtyNo) {
        this.TtyNo = TtyNo;
        _setFlag = true;
    }

    public void setTtyNo(String TtyNo, boolean _masked) {
        setTtyNo(TtyNo);
    }


            
    private String FileCode = null;
    
    public String getFileCode() {
        return FileCode;
    }

    public String getFileCode(boolean _masked) {
        return StringUtil.nullableStringValueOf(getFileCode());
    }
                      
    public void setFileCode(String FileCode) {
        this.FileCode = FileCode;
        _setFlag = true;
    }

    public void setFileCode(String FileCode, boolean _masked) {
        setFileCode(FileCode);
    }


            
    private int DataLength;
    
    public int getDataLength() {
        return DataLength;
    }

    public String getDataLength(boolean _masked) {
        return String.valueOf(getDataLength());
    }
                      
    public void setDataLength(int DataLength) {
        this.DataLength = DataLength;
        _setFlag = true;
    }

    public void setDataLength(int DataLength, boolean _masked) {
        setDataLength(DataLength);
    }


            
    private int ResCode;
    
    public int getResCode() {
        return ResCode;
    }

    public String getResCode(boolean _masked) {
        return String.valueOf(getResCode());
    }
                      
    public void setResCode(int ResCode) {
        this.ResCode = ResCode;
        _setFlag = true;
    }

    public void setResCode(int ResCode, boolean _masked) {
        setResCode(ResCode);
    }


            
    public Object clone() {
        FT_54PP_0000_000_DH0 copyObj = new FT_54PP_0000_000_DH0();
        clone(copyObj);
        return copyObj;
    }
    public void clone(proframe.dto.DataObject __fT_54PP_0000_000_DH0) {
        FT_54PP_0000_000_DH0 _fT_54PP_0000_000_DH0 = (FT_54PP_0000_000_DH0) __fT_54PP_0000_000_DH0;
        _fT_54PP_0000_000_DH0.setTranCode(TranCode);
        _fT_54PP_0000_000_DH0.setKniaText(KniaText);
        _fT_54PP_0000_000_DH0.setKindCode(KindCode);
        _fT_54PP_0000_000_DH0.setOprCode(OprCode);
        _fT_54PP_0000_000_DH0.setSendDate(SendDate);
        _fT_54PP_0000_000_DH0.setMsgNo(MsgNo);
        _fT_54PP_0000_000_DH0.setOrgCode(OrgCode);
        _fT_54PP_0000_000_DH0.setTtyNo(TtyNo);
        _fT_54PP_0000_000_DH0.setFileCode(FileCode);
        _fT_54PP_0000_000_DH0.setDataLength(DataLength);
        _fT_54PP_0000_000_DH0.setResCode(ResCode);
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
            buffer.append("TranCode : ").append(TranCode).append("\n");
            buffer.append("KniaText : ").append(KniaText).append("\n");
            buffer.append("KindCode : ").append(KindCode).append("\n");
            buffer.append("OprCode : ").append(OprCode).append("\n");
            buffer.append("SendDate : ").append(SendDate).append("\n");
            buffer.append("MsgNo : ").append(MsgNo).append("\n");
            buffer.append("OrgCode : ").append(OrgCode).append("\n");
            buffer.append("TtyNo : ").append(TtyNo).append("\n");
            buffer.append("FileCode : ").append(FileCode).append("\n");
            buffer.append("DataLength : ").append(DataLength).append("\n");
            buffer.append("ResCode : ").append(ResCode).append("\n");
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
            buffer.append("TranCode : ").append(TranCode).append("\n");
        }
        if(buffer.length() < limit) {
            buffer.append("KniaText : ").append(KniaText).append("\n");
        }
        if(buffer.length() < limit) {
            buffer.append("KindCode : ").append(KindCode).append("\n");
        }
        if(buffer.length() < limit) {
            buffer.append("OprCode : ").append(OprCode).append("\n");
        }
        if(buffer.length() < limit) {
            buffer.append("SendDate : ").append(SendDate).append("\n");
        }
        if(buffer.length() < limit) {
            buffer.append("MsgNo : ").append(MsgNo).append("\n");
        }
        if(buffer.length() < limit) {
            buffer.append("OrgCode : ").append(OrgCode).append("\n");
        }
        if(buffer.length() < limit) {
            buffer.append("TtyNo : ").append(TtyNo).append("\n");
        }
        if(buffer.length() < limit) {
            buffer.append("FileCode : ").append(FileCode).append("\n");
        }
        if(buffer.length() < limit) {
            buffer.append("DataLength : ").append(DataLength).append("\n");
        }
        if(buffer.length() < limit) {
            buffer.append("ResCode : ").append(ResCode).append("\n");
        }
    }    
    private static final Map fieldPropertyMap = null;
    
/*    static {
        parentfieldPropertyMap = ProMapperDataObject.getFieldPropertyMapByStatic();
        fieldPropertyMap = new java.util.LinkedHashMap( parentfieldPropertyMap.size() + 11);
        fieldPropertyMap.putAll( parentfieldPropertyMap );

        fieldPropertyMap.put("TranCode"
                            , FieldPropertyFactory.getFieldProperty( FieldProperty.TYPE_ABSTRACT_STRING, -1, null, null));
        fieldPropertyMap.put("KniaText"
                            , FieldPropertyFactory.getFieldProperty( FieldProperty.TYPE_ABSTRACT_STRING, -1, null, null));
        fieldPropertyMap.put("KindCode"
                            , FieldPropertyFactory.getFieldProperty( FieldProperty.TYPE_ABSTRACT_STRING, -1, null, null));
        fieldPropertyMap.put("OprCode"
                            , FieldPropertyFactory.getFieldProperty( FieldProperty.TYPE_ABSTRACT_STRING, -1, null, null));
        fieldPropertyMap.put("SendDate"
                            , FieldPropertyFactory.getFieldProperty( FieldProperty.TYPE_ABSTRACT_STRING, -1, null, null));
        fieldPropertyMap.put("MsgNo"
                            , FieldPropertyFactory.getFieldProperty( FieldProperty.TYPE_ABSTRACT_STRING, -1, null, null));
        fieldPropertyMap.put("OrgCode"
                            , FieldPropertyFactory.getFieldProperty( FieldProperty.TYPE_ABSTRACT_STRING, -1, null, null));
        fieldPropertyMap.put("TtyNo"
                            , FieldPropertyFactory.getFieldProperty( FieldProperty.TYPE_ABSTRACT_STRING, -1, null, null));
        fieldPropertyMap.put("FileCode"
                            , FieldPropertyFactory.getFieldProperty( FieldProperty.TYPE_ABSTRACT_STRING, -1, null, null));
        fieldPropertyMap.put("DataLength"
                            , FieldPropertyFactory.getFieldProperty( FieldProperty.TYPE_PRIMITIVE_INT, -1, null, null));
        fieldPropertyMap.put("ResCode"
                            , FieldPropertyFactory.getFieldProperty( FieldProperty.TYPE_PRIMITIVE_INT, -1, null, null));
    }*/
    
    public Map getFieldPropertyMap() {
        return fieldPropertyMap;
    }
    
    public static Map getFieldPropertyMapByStatic() {
        return fieldPropertyMap;
    }
    private static final List<String> fieldNameList = new ArrayList<String>(11);
    
    static {        
        fieldNameList.add("TranCode");
        fieldNameList.add("KniaText");
        fieldNameList.add("KindCode");
        fieldNameList.add("OprCode");
        fieldNameList.add("SendDate");
        fieldNameList.add("MsgNo");
        fieldNameList.add("OrgCode");
        fieldNameList.add("TtyNo");
        fieldNameList.add("FileCode");
        fieldNameList.add("DataLength");
        fieldNameList.add("ResCode");
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
            case 1344105432 : return getTranCode();
            case -493808216 : return getKniaText();
            case -490940479 : return getKindCode();
            case 412198942 : return getOprCode();
            case 1311609718 : return getSendDate();
            case 74638594 : return getMsgNo();
            case 459298513 : return getOrgCode();
            case 81150330 : return getTtyNo();
            case -671392343 : return getFileCode();
            case -1238889648 : return Integer.valueOf(getDataLength());
            case -1534254451 : return Integer.valueOf(getResCode());
            default : return null;
        }
    }
    public void set(String fieldName, Object arg) {
        int hashCode = fieldName.hashCode();
        
        switch(hashCode) {
            case 1344105432 : setTranCode((String)arg);break;
            case -493808216 : setKniaText((String)arg);break;
            case -490940479 : setKindCode((String)arg);break;
            case 412198942 : setOprCode((String)arg);break;
            case 1311609718 : setSendDate((String)arg);break;
            case 74638594 : setMsgNo((String)arg);break;
            case 459298513 : setOrgCode((String)arg);break;
            case 81150330 : setTtyNo((String)arg);break;
            case -671392343 : setFileCode((String)arg);break;
            case -1238889648 : setDataLength(((Integer)arg).intValue());break;
            case -1534254451 : setResCode(((Integer)arg).intValue());break;
            default : return;
        }
    }
    public boolean isEmptyDataObjectMethod(){ 
        if (TranCode != null) return false;
        if (KniaText != null) return false;
        if (KindCode != null) return false;
        if (OprCode != null) return false;
        if (SendDate != null) return false;
        if (MsgNo != null) return false;
        if (OrgCode != null) return false;
        if (TtyNo != null) return false;
        if (FileCode != null) return false;
        if(true) return false;
        if(true) return false;

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
            return "FT_54PP_0000_000_DH0";
        } else if (input.equalsIgnoreCase(META_VERSION_NO)){
            return "0";
        } else if (input.equalsIgnoreCase(META_LOGICAL_NAME)){
            return "FT_54PP_0000_000_DH0_공통헤더";
        } else if (input.equalsIgnoreCase(META_RESOURCE_ID)){
            return "hwgi.f54:FT_54PP_0000_000_DH0.umsg";
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

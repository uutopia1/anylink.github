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
 * @file              hwgi.f54.OL_54PP_0000_000_DH0.java
 * @filetype          java source file
 * @brief            
 * @version           1.0
 * @history
 * 성 명              일 자                     근 거 자 료                      변 경 내 용
 * -----------        --------                  --------------                   --------------------------    
 * AnyLink :       Aug 16, 2023                AnyLink 개발 :                신규 작성
 * 
 */

public class OL_54PP_0000_000_DH0 extends ProMapperDataObject implements ResourceMeta {
    private static final long serialVersionUID= 1L;
    public OL_54PP_0000_000_DH0() {
            super();
    }
    private boolean _setFlag = false;
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


            
    private String SeqNo = null;
    
    public String getSeqNo() {
        return SeqNo;
    }

    public String getSeqNo(boolean _masked) {
        return StringUtil.nullableStringValueOf(getSeqNo());
    }
                      
    public void setSeqNo(String SeqNo) {
        this.SeqNo = SeqNo;
        _setFlag = true;
    }

    public void setSeqNo(String SeqNo, boolean _masked) {
        setSeqNo(SeqNo);
    }


            
    public Object clone() {
        OL_54PP_0000_000_DH0 copyObj = new OL_54PP_0000_000_DH0();
        clone(copyObj);
        return copyObj;
    }
    public void clone(proframe.dto.DataObject __oL_54PP_0000_000_DH0) {
        OL_54PP_0000_000_DH0 _oL_54PP_0000_000_DH0 = (OL_54PP_0000_000_DH0) __oL_54PP_0000_000_DH0;
        _oL_54PP_0000_000_DH0.setResCode(ResCode);
        _oL_54PP_0000_000_DH0.setTranCode(TranCode);
        _oL_54PP_0000_000_DH0.setFileCode(FileCode);
        _oL_54PP_0000_000_DH0.setOrgCode(OrgCode);
        _oL_54PP_0000_000_DH0.setTranDate(TranDate);
        _oL_54PP_0000_000_DH0.setSeqNo(SeqNo);
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
            buffer.append("ResCode : ").append(ResCode).append("\n");
            buffer.append("TranCode : ").append(TranCode).append("\n");
            buffer.append("FileCode : ").append(FileCode).append("\n");
            buffer.append("OrgCode : ").append(OrgCode).append("\n");
            buffer.append("TranDate : ").append(TranDate).append("\n");
            buffer.append("SeqNo : ").append(SeqNo).append("\n");
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
            buffer.append("ResCode : ").append(ResCode).append("\n");
        }
        if(buffer.length() < limit) {
            buffer.append("TranCode : ").append(TranCode).append("\n");
        }
        if(buffer.length() < limit) {
            buffer.append("FileCode : ").append(FileCode).append("\n");
        }
        if(buffer.length() < limit) {
            buffer.append("OrgCode : ").append(OrgCode).append("\n");
        }
        if(buffer.length() < limit) {
            buffer.append("TranDate : ").append(TranDate).append("\n");
        }
        if(buffer.length() < limit) {
            buffer.append("SeqNo : ").append(SeqNo).append("\n");
        }
    }    
    private static final Map fieldPropertyMap = null;
    
/*    static {
        parentfieldPropertyMap = ProMapperDataObject.getFieldPropertyMapByStatic();
        fieldPropertyMap = new java.util.LinkedHashMap( parentfieldPropertyMap.size() + 6);
        fieldPropertyMap.putAll( parentfieldPropertyMap );

        fieldPropertyMap.put("ResCode"
                            , FieldPropertyFactory.getFieldProperty( FieldProperty.TYPE_PRIMITIVE_INT, -1, null, null));
        fieldPropertyMap.put("TranCode"
                            , FieldPropertyFactory.getFieldProperty( FieldProperty.TYPE_ABSTRACT_STRING, -1, null, null));
        fieldPropertyMap.put("FileCode"
                            , FieldPropertyFactory.getFieldProperty( FieldProperty.TYPE_ABSTRACT_STRING, -1, null, null));
        fieldPropertyMap.put("OrgCode"
                            , FieldPropertyFactory.getFieldProperty( FieldProperty.TYPE_ABSTRACT_STRING, -1, null, null));
        fieldPropertyMap.put("TranDate"
                            , FieldPropertyFactory.getFieldProperty( FieldProperty.TYPE_ABSTRACT_STRING, -1, null, null));
        fieldPropertyMap.put("SeqNo"
                            , FieldPropertyFactory.getFieldProperty( FieldProperty.TYPE_ABSTRACT_STRING, -1, null, null));
    }*/
    
    public Map getFieldPropertyMap() {
        return fieldPropertyMap;
    }
    
    public static Map getFieldPropertyMapByStatic() {
        return fieldPropertyMap;
    }
    private static final List<String> fieldNameList = new ArrayList<String>(6);
    
    static {        
        fieldNameList.add("ResCode");
        fieldNameList.add("TranCode");
        fieldNameList.add("FileCode");
        fieldNameList.add("OrgCode");
        fieldNameList.add("TranDate");
        fieldNameList.add("SeqNo");
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
            case -1534254451 : return Integer.valueOf(getResCode());
            case 1344105432 : return getTranCode();
            case -671392343 : return getFileCode();
            case 459298513 : return getOrgCode();
            case 1344122265 : return getTranDate();
            case 79772256 : return getSeqNo();
            default : return null;
        }
    }
    public void set(String fieldName, Object arg) {
        int hashCode = fieldName.hashCode();
        
        switch(hashCode) {
            case -1534254451 : setResCode(((Integer)arg).intValue());break;
            case 1344105432 : setTranCode((String)arg);break;
            case -671392343 : setFileCode((String)arg);break;
            case 459298513 : setOrgCode((String)arg);break;
            case 1344122265 : setTranDate((String)arg);break;
            case 79772256 : setSeqNo((String)arg);break;
            default : return;
        }
    }
    public boolean isEmptyDataObjectMethod(){ 
        if(true) return false;
        if (TranCode != null) return false;
        if (FileCode != null) return false;
        if (OrgCode != null) return false;
        if (TranDate != null) return false;
        if (SeqNo != null) return false;

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
            return "OL_54PP_0000_000_DH0";
        } else if (input.equalsIgnoreCase(META_VERSION_NO)){
            return "0";
        } else if (input.equalsIgnoreCase(META_LOGICAL_NAME)){
            return "OL_54PP_0000_000_DH0_배치서버호출";
        } else if (input.equalsIgnoreCase(META_RESOURCE_ID)){
            return "hwgi.f54:OL_54PP_0000_000_DH0.umsg";
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

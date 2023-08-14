/*
 * 작성된 날짜: Aug 14, 2023
 * Copyright (c) 2023 TmaxSoft co., Ltd. All rights reserved.
 */
package hwgi.o28.mem;

import com.tmax.promapper.engine.base.ProMapperDataObject;
import java.util.ArrayList;
import java.util.Map;
import java.util.LinkedHashMap;
import java.util.List;
import proframe.tool.record.common.*;
import com.tmax.promapper.engine.base.ResourceMeta;
import com.tmax.promapper.engine.util.StringUtil;


/**
 * @file              hwgi.o28.mem.CommonHeader.java
 * @filetype          java source file
 * @brief            
 * @version           1.0
 * @history
 * 성 명              일 자                     근 거 자 료                      변 경 내 용
 * -----------        --------                  --------------                   --------------------------    
 * AnyLink :       Aug 14, 2023                AnyLink 개발 :                신규 작성
 * 
 */

public class CommonHeader extends ProMapperDataObject implements ResourceMeta {
    private static final long serialVersionUID= 1L;
    public CommonHeader() {
            super();
    }
    private boolean _setFlag = false;
    private String tranCode = null;
    
    public String getTranCode() {
        return tranCode;
    }

    public String getTranCode(boolean _masked) {
        return StringUtil.nullableStringValueOf(getTranCode());
    }
                      
    public void setTranCode(String tranCode) {
        this.tranCode = tranCode;
        _setFlag = true;
    }

    public void setTranCode(String tranCode, boolean _masked) {
        setTranCode(tranCode);
    }


            
    private long kindCode;
    
    public long getKindCode() {
        return kindCode;
    }

    public String getKindCode(boolean _masked) {
        return String.valueOf(getKindCode());
    }
                      
    public void setKindCode(long kindCode) {
        this.kindCode = kindCode;
        _setFlag = true;
    }

    public void setKindCode(long kindCode, boolean _masked) {
        setKindCode(kindCode);
    }


            
    private long oprCode;
    
    public long getOprCode() {
        return oprCode;
    }

    public String getOprCode(boolean _masked) {
        return String.valueOf(getOprCode());
    }
                      
    public void setOprCode(long oprCode) {
        this.oprCode = oprCode;
        _setFlag = true;
    }

    public void setOprCode(long oprCode, boolean _masked) {
        setOprCode(oprCode);
    }


            
    private String sendOrgCode = null;
    
    public String getSendOrgCode() {
        return sendOrgCode;
    }

    public String getSendOrgCode(boolean _masked) {
        return StringUtil.nullableStringValueOf(getSendOrgCode());
    }
                      
    public void setSendOrgCode(String sendOrgCode) {
        this.sendOrgCode = sendOrgCode;
        _setFlag = true;
    }

    public void setSendOrgCode(String sendOrgCode, boolean _masked) {
        setSendOrgCode(sendOrgCode);
    }


            
    private String recvOrgCode = null;
    
    public String getRecvOrgCode() {
        return recvOrgCode;
    }

    public String getRecvOrgCode(boolean _masked) {
        return StringUtil.nullableStringValueOf(getRecvOrgCode());
    }
                      
    public void setRecvOrgCode(String recvOrgCode) {
        this.recvOrgCode = recvOrgCode;
        _setFlag = true;
    }

    public void setRecvOrgCode(String recvOrgCode, boolean _masked) {
        setRecvOrgCode(recvOrgCode);
    }


            
    private String userId = null;
    
    public String getUserId() {
        return userId;
    }

    public String getUserId(boolean _masked) {
        return StringUtil.nullableStringValueOf(getUserId());
    }
                      
    public void setUserId(String userId) {
        this.userId = userId;
        _setFlag = true;
    }

    public void setUserId(String userId, boolean _masked) {
        setUserId(userId);
    }


            
    public Object clone() {
        CommonHeader copyObj = new CommonHeader();
        clone(copyObj);
        return copyObj;
    }
    public void clone(proframe.dto.DataObject __commonHeader) {
        CommonHeader _commonHeader = (CommonHeader) __commonHeader;
        _commonHeader.setTranCode(tranCode);
        _commonHeader.setKindCode(kindCode);
        _commonHeader.setOprCode(oprCode);
        _commonHeader.setSendOrgCode(sendOrgCode);
        _commonHeader.setRecvOrgCode(recvOrgCode);
        _commonHeader.setUserId(userId);
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
            buffer.append("tranCode : ").append(tranCode).append("\n");
            buffer.append("kindCode : ").append(kindCode).append("\n");
            buffer.append("oprCode : ").append(oprCode).append("\n");
            buffer.append("sendOrgCode : ").append(sendOrgCode).append("\n");
            buffer.append("recvOrgCode : ").append(recvOrgCode).append("\n");
            buffer.append("userId : ").append(userId).append("\n");
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
            buffer.append("tranCode : ").append(tranCode).append("\n");
        }
        if(buffer.length() < limit) {
            buffer.append("kindCode : ").append(kindCode).append("\n");
        }
        if(buffer.length() < limit) {
            buffer.append("oprCode : ").append(oprCode).append("\n");
        }
        if(buffer.length() < limit) {
            buffer.append("sendOrgCode : ").append(sendOrgCode).append("\n");
        }
        if(buffer.length() < limit) {
            buffer.append("recvOrgCode : ").append(recvOrgCode).append("\n");
        }
        if(buffer.length() < limit) {
            buffer.append("userId : ").append(userId).append("\n");
        }
    }    
    private static final Map fieldPropertyMap = null;
    
/*    static {
        parentfieldPropertyMap = ProMapperDataObject.getFieldPropertyMapByStatic();
        fieldPropertyMap = new java.util.LinkedHashMap( parentfieldPropertyMap.size() + 6);
        fieldPropertyMap.putAll( parentfieldPropertyMap );

        fieldPropertyMap.put("tranCode"
                            , FieldPropertyFactory.getFieldProperty( FieldProperty.TYPE_ABSTRACT_STRING, -1, null, null));
        fieldPropertyMap.put("kindCode"
                            , FieldPropertyFactory.getFieldProperty( FieldProperty.TYPE_PRIMITIVE_LONG, -1, null, null));
        fieldPropertyMap.put("oprCode"
                            , FieldPropertyFactory.getFieldProperty( FieldProperty.TYPE_PRIMITIVE_LONG, -1, null, null));
        fieldPropertyMap.put("sendOrgCode"
                            , FieldPropertyFactory.getFieldProperty( FieldProperty.TYPE_ABSTRACT_STRING, -1, null, null));
        fieldPropertyMap.put("recvOrgCode"
                            , FieldPropertyFactory.getFieldProperty( FieldProperty.TYPE_ABSTRACT_STRING, -1, null, null));
        fieldPropertyMap.put("userId"
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
        fieldNameList.add("tranCode");
        fieldNameList.add("kindCode");
        fieldNameList.add("oprCode");
        fieldNameList.add("sendOrgCode");
        fieldNameList.add("recvOrgCode");
        fieldNameList.add("userId");
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
            case 1279461304 : return getTranCode();
            case -555584607 : return Long.valueOf(getKindCode());
            case -1252454338 : return Long.valueOf(getOprCode());
            case -1468826039 : return getSendOrgCode();
            case 41102891 : return getRecvOrgCode();
            case -836030906 : return getUserId();
            default : return null;
        }
    }
    public void set(String fieldName, Object arg) {
        int hashCode = fieldName.hashCode();
        
        switch(hashCode) {
            case 1279461304 : setTranCode((String)arg);break;
            case -555584607 : setKindCode(((Long)arg).longValue());break;
            case -1252454338 : setOprCode(((Long)arg).longValue());break;
            case -1468826039 : setSendOrgCode((String)arg);break;
            case 41102891 : setRecvOrgCode((String)arg);break;
            case -836030906 : setUserId((String)arg);break;
            default : return;
        }
    }
    public boolean isEmptyDataObjectMethod(){ 
        if (tranCode != null) return false;
        if(true) return false;
        if(true) return false;
        if (sendOrgCode != null) return false;
        if (recvOrgCode != null) return false;
        if (userId != null) return false;

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
            return "CommonHeader";
        } else if (input.equalsIgnoreCase(META_VERSION_NO)){
            return null;
        } else if (input.equalsIgnoreCase(META_LOGICAL_NAME)){
            return "commonHeader";
        } else if (input.equalsIgnoreCase(META_RESOURCE_ID)){
            return "hwgi.o28.mem:CommonHeader.umsg";
        } else if (input.equalsIgnoreCase(META_RESOURCE_TYPE)){
            return "STRUCTURE";
        } else if (input.equalsIgnoreCase(META_RESOURCE_PATH)){
            return "hwgi.o28.mem";
        } else if (input.equalsIgnoreCase(META_RESOURCE_GROUP)){
            return null;
        } else {
            String msg = "Expecting one of " + META_PHYSICAL_NAME + ", "
                    + META_VERSION_NO + ", " + META_LOGICAL_NAME + ", "
                    + META_RESOURCE_ID + ", " + META_RESOURCE_TYPE + ", "
                    + META_RESOURCE_PATH + ", " + META_RESOURCE_GROUP;
            throw new IllegalArgumentException(msg);
        }
    }
}

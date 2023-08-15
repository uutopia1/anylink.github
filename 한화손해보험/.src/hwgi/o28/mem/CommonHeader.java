/*
 * 작성된 날짜: Aug 15, 2023
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
 * AnyLink :       Aug 15, 2023                AnyLink 개발 :                신규 작성
 * 
 */

public class CommonHeader extends ProMapperDataObject implements ResourceMeta {
    private static final long serialVersionUID= 1L;
    public CommonHeader() {
            super();
    }
    private boolean _setFlag = false;
    private String serviceName = null;
    
    public String getServiceName() {
        return serviceName;
    }

    public String getServiceName(boolean _masked) {
        return StringUtil.nullableStringValueOf(getServiceName());
    }
                      
    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
        _setFlag = true;
    }

    public void setServiceName(String serviceName, boolean _masked) {
        setServiceName(serviceName);
    }


            
    private String useSystemCode = null;
    
    public String getUseSystemCode() {
        return useSystemCode;
    }

    public String getUseSystemCode(boolean _masked) {
        return StringUtil.nullableStringValueOf(getUseSystemCode());
    }
                      
    public void setUseSystemCode(String useSystemCode) {
        this.useSystemCode = useSystemCode;
        _setFlag = true;
    }

    public void setUseSystemCode(String useSystemCode, boolean _masked) {
        setUseSystemCode(useSystemCode);
    }


            
    private String certServerId = null;
    
    public String getCertServerId() {
        return certServerId;
    }

    public String getCertServerId(boolean _masked) {
        return StringUtil.nullableStringValueOf(getCertServerId());
    }
                      
    public void setCertServerId(String certServerId) {
        this.certServerId = certServerId;
        _setFlag = true;
    }

    public void setCertServerId(String certServerId, boolean _masked) {
        setCertServerId(certServerId);
    }


            
    private String transactionUniqueId = null;
    
    public String getTransactionUniqueId() {
        return transactionUniqueId;
    }

    public String getTransactionUniqueId(boolean _masked) {
        return StringUtil.nullableStringValueOf(getTransactionUniqueId());
    }
                      
    public void setTransactionUniqueId(String transactionUniqueId) {
        this.transactionUniqueId = transactionUniqueId;
        _setFlag = true;
    }

    public void setTransactionUniqueId(String transactionUniqueId, boolean _masked) {
        setTransactionUniqueId(transactionUniqueId);
    }


            
    private String userDeptCode = null;
    
    public String getUserDeptCode() {
        return userDeptCode;
    }

    public String getUserDeptCode(boolean _masked) {
        return StringUtil.nullableStringValueOf(getUserDeptCode());
    }
                      
    public void setUserDeptCode(String userDeptCode) {
        this.userDeptCode = userDeptCode;
        _setFlag = true;
    }

    public void setUserDeptCode(String userDeptCode, boolean _masked) {
        setUserDeptCode(userDeptCode);
    }


            
    private String userName = null;
    
    public String getUserName() {
        return userName;
    }

    public String getUserName(boolean _masked) {
        return StringUtil.nullableStringValueOf(getUserName());
    }
                      
    public void setUserName(String userName) {
        this.userName = userName;
        _setFlag = true;
    }

    public void setUserName(String userName, boolean _masked) {
        setUserName(userName);
    }


            
    public Object clone() {
        CommonHeader copyObj = new CommonHeader();
        clone(copyObj);
        return copyObj;
    }
    public void clone(proframe.dto.DataObject __commonHeader) {
        CommonHeader _commonHeader = (CommonHeader) __commonHeader;
        _commonHeader.setServiceName(serviceName);
        _commonHeader.setUseSystemCode(useSystemCode);
        _commonHeader.setCertServerId(certServerId);
        _commonHeader.setTransactionUniqueId(transactionUniqueId);
        _commonHeader.setUserDeptCode(userDeptCode);
        _commonHeader.setUserName(userName);
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
            buffer.append("serviceName : ").append(serviceName).append("\n");
            buffer.append("useSystemCode : ").append(useSystemCode).append("\n");
            buffer.append("certServerId : ").append(certServerId).append("\n");
            buffer.append("transactionUniqueId : ").append(transactionUniqueId).append("\n");
            buffer.append("userDeptCode : ").append(userDeptCode).append("\n");
            buffer.append("userName : ").append(userName).append("\n");
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
            buffer.append("serviceName : ").append(serviceName).append("\n");
        }
        if(buffer.length() < limit) {
            buffer.append("useSystemCode : ").append(useSystemCode).append("\n");
        }
        if(buffer.length() < limit) {
            buffer.append("certServerId : ").append(certServerId).append("\n");
        }
        if(buffer.length() < limit) {
            buffer.append("transactionUniqueId : ").append(transactionUniqueId).append("\n");
        }
        if(buffer.length() < limit) {
            buffer.append("userDeptCode : ").append(userDeptCode).append("\n");
        }
        if(buffer.length() < limit) {
            buffer.append("userName : ").append(userName).append("\n");
        }
    }    
    private static final Map fieldPropertyMap = null;
    
/*    static {
        parentfieldPropertyMap = ProMapperDataObject.getFieldPropertyMapByStatic();
        fieldPropertyMap = new java.util.LinkedHashMap( parentfieldPropertyMap.size() + 6);
        fieldPropertyMap.putAll( parentfieldPropertyMap );

        fieldPropertyMap.put("serviceName"
                            , FieldPropertyFactory.getFieldProperty( FieldProperty.TYPE_ABSTRACT_STRING, -1, null, null));
        fieldPropertyMap.put("useSystemCode"
                            , FieldPropertyFactory.getFieldProperty( FieldProperty.TYPE_ABSTRACT_STRING, -1, null, null));
        fieldPropertyMap.put("certServerId"
                            , FieldPropertyFactory.getFieldProperty( FieldProperty.TYPE_ABSTRACT_STRING, -1, null, null));
        fieldPropertyMap.put("transactionUniqueId"
                            , FieldPropertyFactory.getFieldProperty( FieldProperty.TYPE_ABSTRACT_STRING, -1, null, null));
        fieldPropertyMap.put("userDeptCode"
                            , FieldPropertyFactory.getFieldProperty( FieldProperty.TYPE_ABSTRACT_STRING, -1, null, null));
        fieldPropertyMap.put("userName"
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
        fieldNameList.add("serviceName");
        fieldNameList.add("useSystemCode");
        fieldNameList.add("certServerId");
        fieldNameList.add("transactionUniqueId");
        fieldNameList.add("userDeptCode");
        fieldNameList.add("userName");
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
            case -1928572192 : return getServiceName();
            case -771389021 : return getUseSystemCode();
            case 95550978 : return getCertServerId();
            case -2007736886 : return getTransactionUniqueId();
            case 178703037 : return getUserDeptCode();
            case -266666762 : return getUserName();
            default : return null;
        }
    }
    public void set(String fieldName, Object arg) {
        int hashCode = fieldName.hashCode();
        
        switch(hashCode) {
            case -1928572192 : setServiceName((String)arg);break;
            case -771389021 : setUseSystemCode((String)arg);break;
            case 95550978 : setCertServerId((String)arg);break;
            case -2007736886 : setTransactionUniqueId((String)arg);break;
            case 178703037 : setUserDeptCode((String)arg);break;
            case -266666762 : setUserName((String)arg);break;
            default : return;
        }
    }
    public boolean isEmptyDataObjectMethod(){ 
        if (serviceName != null) return false;
        if (useSystemCode != null) return false;
        if (certServerId != null) return false;
        if (transactionUniqueId != null) return false;
        if (userDeptCode != null) return false;
        if (userName != null) return false;

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

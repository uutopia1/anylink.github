/*
 * 작성된 날짜: Aug 17, 2023
 * Copyright (c) 2023 TmaxSoft co., Ltd. All rights reserved.
 */
package hwgi.o28.mem.txGrp_1000.tx_220;

import com.tmax.promapper.engine.base.ProMapperDataObject;
import java.util.ArrayList;
import java.util.Map;
import java.util.LinkedHashMap;
import java.util.List;
import proframe.tool.record.common.*;
import com.tmax.promapper.engine.base.ResourceMeta;
import com.tmax.promapper.engine.util.StringUtil;


/**
 * @file              hwgi.o28.mem.txGrp_1000.tx_220.Response.java
 * @filetype          java source file
 * @brief            
 * @version           1.0
 * @history
 * 성 명              일 자                     근 거 자 료                      변 경 내 용
 * -----------        --------                  --------------                   --------------------------    
 * AnyLink :       Aug 17, 2023                AnyLink 개발 :                신규 작성
 * 
 */

public class Response extends ProMapperDataObject implements ResourceMeta {
    private static final long serialVersionUID= 1L;
    public Response() {
            super();
    }
    private boolean _setFlag = false;
    private String ifid = null;
    
    public String getIfid() {
        return ifid;
    }

    public String getIfid(boolean _masked) {
        return StringUtil.nullableStringValueOf(getIfid());
    }
                      
    public void setIfid(String ifid) {
        this.ifid = ifid;
        _setFlag = true;
    }

    public void setIfid(String ifid, boolean _masked) {
        setIfid(ifid);
    }


            
    private String requestDate = null;
    
    public String getRequestDate() {
        return requestDate;
    }

    public String getRequestDate(boolean _masked) {
        return StringUtil.nullableStringValueOf(getRequestDate());
    }
                      
    public void setRequestDate(String requestDate) {
        this.requestDate = requestDate;
        _setFlag = true;
    }

    public void setRequestDate(String requestDate, boolean _masked) {
        setRequestDate(requestDate);
    }


            
    private String requestNo = null;
    
    public String getRequestNo() {
        return requestNo;
    }

    public String getRequestNo(boolean _masked) {
        return StringUtil.nullableStringValueOf(getRequestNo());
    }
                      
    public void setRequestNo(String requestNo) {
        this.requestNo = requestNo;
        _setFlag = true;
    }

    public void setRequestNo(String requestNo, boolean _masked) {
        setRequestNo(requestNo);
    }


            
    private String systemId = null;
    
    public String getSystemId() {
        return systemId;
    }

    public String getSystemId(boolean _masked) {
        return StringUtil.nullableStringValueOf(getSystemId());
    }
                      
    public void setSystemId(String systemId) {
        this.systemId = systemId;
        _setFlag = true;
    }

    public void setSystemId(String systemId, boolean _masked) {
        setSystemId(systemId);
    }


            
    private long resultCode;
    
    public long getResultCode() {
        return resultCode;
    }

    public String getResultCode(boolean _masked) {
        return String.valueOf(getResultCode());
    }
                      
    public void setResultCode(long resultCode) {
        this.resultCode = resultCode;
        _setFlag = true;
    }

    public void setResultCode(long resultCode, boolean _masked) {
        setResultCode(resultCode);
    }


            
    
    private hwgi.o28.mem.txGrp_1000.tx_220.Body body = new hwgi.o28.mem.txGrp_1000.tx_220.Body();
    
    public hwgi.o28.mem.txGrp_1000.tx_220.Body getBody() {
        return body;
    }
    
    public void setBody(hwgi.o28.mem.txGrp_1000.tx_220.Body body) {
        this.body = body;
        _setFlag = true;
    }
    
    
    public Object clone() {
        Response copyObj = new Response();
        clone(copyObj);
        return copyObj;
    }
    public void clone(proframe.dto.DataObject __response) {
        Response _response = (Response) __response;
        _response.setIfid(ifid);
        _response.setRequestDate(requestDate);
        _response.setRequestNo(requestNo);
        _response.setSystemId(systemId);
        _response.setResultCode(resultCode);
            _response.setBody((hwgi.o28.mem.txGrp_1000.tx_220.Body)body.clone());
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
            buffer.append("ifid : ").append(ifid).append("\n");
            buffer.append("requestDate : ").append(requestDate).append("\n");
            buffer.append("requestNo : ").append(requestNo).append("\n");
            buffer.append("systemId : ").append(systemId).append("\n");
            buffer.append("resultCode : ").append(resultCode).append("\n");
            buffer.append("body : ").append(body).append("\n");
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
            buffer.append("ifid : ").append(ifid).append("\n");
        }
        if(buffer.length() < limit) {
            buffer.append("requestDate : ").append(requestDate).append("\n");
        }
        if(buffer.length() < limit) {
            buffer.append("requestNo : ").append(requestNo).append("\n");
        }
        if(buffer.length() < limit) {
            buffer.append("systemId : ").append(systemId).append("\n");
        }
        if(buffer.length() < limit) {
            buffer.append("resultCode : ").append(resultCode).append("\n");
        }
        if(buffer.length() < limit) {
            buffer.append("body : ").append(body).append("\n");
        }
    }    
    private static final Map fieldPropertyMap = null;
    
/*    static {
        parentfieldPropertyMap = ProMapperDataObject.getFieldPropertyMapByStatic();
        fieldPropertyMap = new java.util.LinkedHashMap( parentfieldPropertyMap.size() + 6);
        fieldPropertyMap.putAll( parentfieldPropertyMap );

        fieldPropertyMap.put("ifid"
                            , FieldPropertyFactory.getFieldProperty( FieldProperty.TYPE_ABSTRACT_STRING, -1, null, null));
        fieldPropertyMap.put("requestDate"
                            , FieldPropertyFactory.getFieldProperty( FieldProperty.TYPE_ABSTRACT_STRING, -1, null, null));
        fieldPropertyMap.put("requestNo"
                            , FieldPropertyFactory.getFieldProperty( FieldProperty.TYPE_ABSTRACT_STRING, -1, null, null));
        fieldPropertyMap.put("systemId"
                            , FieldPropertyFactory.getFieldProperty( FieldProperty.TYPE_ABSTRACT_STRING, -1, null, null));
        fieldPropertyMap.put("resultCode"
                            , FieldPropertyFactory.getFieldProperty( FieldProperty.TYPE_PRIMITIVE_LONG, -1, null, null));
        fieldPropertyMap.put("body"
                            , FieldPropertyFactory.getFieldProperty( FieldProperty.TYPE_ABSTRACT_INCLUDE, -1, null, "hwgi.o28.mem.txGrp_1000.tx_220.Body"));
    }*/
    
    public Map getFieldPropertyMap() {
        return fieldPropertyMap;
    }
    
    public static Map getFieldPropertyMapByStatic() {
        return fieldPropertyMap;
    }
    private static final List<String> fieldNameList = new ArrayList<String>(6);
    
    static {        
        fieldNameList.add("ifid");
        fieldNameList.add("requestDate");
        fieldNameList.add("requestNo");
        fieldNameList.add("systemId");
        fieldNameList.add("resultCode");
        fieldNameList.add("body");
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
            case 3229432 : return getIfid();
            case 1149597405 : return getRequestDate();
            case 693933232 : return getRequestNo();
            case 1976085418 : return getSystemId();
            case -572353622 : return Long.valueOf(getResultCode());
            case 3029410 : return getBody();
            default : return null;
        }
    }
    public void set(String fieldName, Object arg) {
        int hashCode = fieldName.hashCode();
        
        switch(hashCode) {
            case 3229432 : setIfid((String)arg);break;
            case 1149597405 : setRequestDate((String)arg);break;
            case 693933232 : setRequestNo((String)arg);break;
            case 1976085418 : setSystemId((String)arg);break;
            case -572353622 : setResultCode(((Long)arg).longValue());break;
            case 3029410 : setBody((hwgi.o28.mem.txGrp_1000.tx_220.Body)arg);break;
            default : return;
        }
    }
    public boolean isEmptyDataObjectMethod(){ 
        if (ifid != null) return false;
        if (requestDate != null) return false;
        if (requestNo != null) return false;
        if (systemId != null) return false;
        if(true) return false;
      	if (!((hwgi.o28.mem.txGrp_1000.tx_220.Body)body).isEmptyDataObjectMethod()) return false;

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
            return "Response";
        } else if (input.equalsIgnoreCase(META_VERSION_NO)){
            return null;
        } else if (input.equalsIgnoreCase(META_LOGICAL_NAME)){
            return "response";
        } else if (input.equalsIgnoreCase(META_RESOURCE_ID)){
            return "hwgi.o28.mem.txGrp_1000.tx_220:Response.umsg";
        } else if (input.equalsIgnoreCase(META_RESOURCE_TYPE)){
            return "STRUCTURE";
        } else if (input.equalsIgnoreCase(META_RESOURCE_PATH)){
            return "hwgi.o28.mem.txGrp_1000.tx_220";
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

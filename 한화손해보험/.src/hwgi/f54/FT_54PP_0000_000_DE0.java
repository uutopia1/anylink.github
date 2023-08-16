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
 * @file              hwgi.f54.FT_54PP_0000_000_DE0.java
 * @filetype          java source file
 * @brief            
 * @version           1.0
 * @history
 * 성 명              일 자                     근 거 자 료                      변 경 내 용
 * -----------        --------                  --------------                   --------------------------    
 * AnyLink :       Aug 16, 2023                AnyLink 개발 :                신규 작성
 * 
 */

public class FT_54PP_0000_000_DE0 extends ProMapperDataObject implements ResourceMeta {
    private static final long serialVersionUID= 1L;
    public FT_54PP_0000_000_DE0() {
            super();
    }
    private boolean _setFlag = false;
    
    private byte[] Data = null;
    
    public byte[] getData() {
        return Data;
    }
    
    public void setData(byte[] Data) {
        this.Data = Data;
        _setFlag = true;
    }
    
    
    public Object clone() {
        FT_54PP_0000_000_DE0 copyObj = new FT_54PP_0000_000_DE0();
        clone(copyObj);
        return copyObj;
    }
    public void clone(proframe.dto.DataObject __fT_54PP_0000_000_DE0) {
        FT_54PP_0000_000_DE0 _fT_54PP_0000_000_DE0 = (FT_54PP_0000_000_DE0) __fT_54PP_0000_000_DE0;
        _fT_54PP_0000_000_DE0.setData(Data);
    }
    public String toString() {
        StringBuilder buffer = new StringBuilder();
        buffer.append(super.toString());

            buffer.append('\n');
            toString_0(buffer);
        
        return buffer.toString();
    }
    
    private void toString_0(StringBuilder buffer) {
        com.tmax.promapper.engine.util.HexView hexView = new com.tmax.promapper.engine.util.HexView(); 
        int _size = 0; // field가 array인 경우 array size를 저장하는 변수
                buffer.append("Data : \n");
                if(Data == null) {
                    buffer.append("null\n");
                } else {
                    buffer.append(hexView.dumpStringBuilder(Data, 0, Data.length, 0)).append("\n");
                }
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
        com.tmax.promapper.engine.util.HexView hexView = new com.tmax.promapper.engine.util.HexView(); 
        int _size = 0; // field가 array인 경우 array size를 저장하는 변수
            if(buffer.length() < limit) {
                buffer.append("Data : \n");
                if(Data == null) {
                    buffer.append("null\n");
                } else {
                    buffer.append(hexView.dumpStringBuilder(Data, 0, Data.length, 0)).append("\n");
                }
            }
    }    
    private static final Map fieldPropertyMap = null;
    
/*    static {
        parentfieldPropertyMap = ProMapperDataObject.getFieldPropertyMapByStatic();
        fieldPropertyMap = new java.util.LinkedHashMap( parentfieldPropertyMap.size() + 1);
        fieldPropertyMap.putAll( parentfieldPropertyMap );

        fieldPropertyMap.put("Data"
                            , FieldPropertyFactory.getFieldProperty( FieldProperty.TYPE_ABSTRACT_BINARY, -1, null, null));
    }*/
    
    public Map getFieldPropertyMap() {
        return fieldPropertyMap;
    }
    
    public static Map getFieldPropertyMapByStatic() {
        return fieldPropertyMap;
    }
    private static final List<String> fieldNameList = new ArrayList<String>(1);
    
    static {        
        fieldNameList.add("Data");
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
            case 2122698 : return getData();
            default : return null;
        }
    }
    public void set(String fieldName, Object arg) {
        int hashCode = fieldName.hashCode();
        
        switch(hashCode) {
            case 2122698 : setData((byte[])arg);break;
            default : return;
        }
    }
    public boolean isEmptyDataObjectMethod(){ 
        if (Data != null) return false;

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
            return "FT_54PP_0000_000_DE0";
        } else if (input.equalsIgnoreCase(META_VERSION_NO)){
            return "0";
        } else if (input.equalsIgnoreCase(META_LOGICAL_NAME)){
            return "FT_54PP_0000_000_DE0_오류처리";
        } else if (input.equalsIgnoreCase(META_RESOURCE_ID)){
            return "hwgi.f54:FT_54PP_0000_000_DE0.umsg";
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

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
 * @file              hwgi.o28.mem.txGrp_1000.tx_220.MSG.java
 * @filetype          java source file
 * @brief            
 * @version           1.0
 * @history
 * 성 명              일 자                     근 거 자 료                      변 경 내 용
 * -----------        --------                  --------------                   --------------------------    
 * AnyLink :       Aug 17, 2023                AnyLink 개발 :                신규 작성
 * 
 */

public class MSG extends ProMapperDataObject implements ResourceMeta {
    private static final long serialVersionUID= 1L;
    public MSG() {
            super();
    }
    private boolean _setFlag = false;
    private String data1 = null;
    
    public String getData1() {
        return data1;
    }

    public String getData1(boolean _masked) {
        return StringUtil.nullableStringValueOf(getData1());
    }
                      
    public void setData1(String data1) {
        this.data1 = data1;
        _setFlag = true;
    }

    public void setData1(String data1, boolean _masked) {
        setData1(data1);
    }


            
    private String data2 = null;
    
    public String getData2() {
        return data2;
    }

    public String getData2(boolean _masked) {
        return StringUtil.nullableStringValueOf(getData2());
    }
                      
    public void setData2(String data2) {
        this.data2 = data2;
        _setFlag = true;
    }

    public void setData2(String data2, boolean _masked) {
        setData2(data2);
    }


            
    public Object clone() {
        MSG copyObj = new MSG();
        clone(copyObj);
        return copyObj;
    }
    public void clone(proframe.dto.DataObject __mSG) {
        MSG _mSG = (MSG) __mSG;
        _mSG.setData1(data1);
        _mSG.setData2(data2);
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
            buffer.append("data1 : ").append(data1).append("\n");
            buffer.append("data2 : ").append(data2).append("\n");
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
            buffer.append("data1 : ").append(data1).append("\n");
        }
        if(buffer.length() < limit) {
            buffer.append("data2 : ").append(data2).append("\n");
        }
    }    
    private static final Map fieldPropertyMap = null;
    
/*    static {
        parentfieldPropertyMap = ProMapperDataObject.getFieldPropertyMapByStatic();
        fieldPropertyMap = new java.util.LinkedHashMap( parentfieldPropertyMap.size() + 2);
        fieldPropertyMap.putAll( parentfieldPropertyMap );

        fieldPropertyMap.put("data1"
                            , FieldPropertyFactory.getFieldProperty( FieldProperty.TYPE_ABSTRACT_STRING, -1, null, null));
        fieldPropertyMap.put("data2"
                            , FieldPropertyFactory.getFieldProperty( FieldProperty.TYPE_ABSTRACT_STRING, -1, null, null));
    }*/
    
    public Map getFieldPropertyMap() {
        return fieldPropertyMap;
    }
    
    public static Map getFieldPropertyMapByStatic() {
        return fieldPropertyMap;
    }
    private static final List<String> fieldNameList = new ArrayList<String>(2);
    
    static {        
        fieldNameList.add("data1");
        fieldNameList.add("data2");
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
            case 95356359 : return getData1();
            case 95356360 : return getData2();
            default : return null;
        }
    }
    public void set(String fieldName, Object arg) {
        int hashCode = fieldName.hashCode();
        
        switch(hashCode) {
            case 95356359 : setData1((String)arg);break;
            case 95356360 : setData2((String)arg);break;
            default : return;
        }
    }
    public boolean isEmptyDataObjectMethod(){ 
        if (data1 != null) return false;
        if (data2 != null) return false;

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
            return "MSG";
        } else if (input.equalsIgnoreCase(META_VERSION_NO)){
            return null;
        } else if (input.equalsIgnoreCase(META_LOGICAL_NAME)){
            return "MSG";
        } else if (input.equalsIgnoreCase(META_RESOURCE_ID)){
            return "hwgi.o28.mem.txGrp_1000.tx_220:MSG.umsg";
        } else if (input.equalsIgnoreCase(META_RESOURCE_TYPE)){
            return "STRUCTURE";
        } else if (input.equalsIgnoreCase(META_RESOURCE_PATH)){
            return "hwgi.o28.mem.txGrp_1000.tx_220";
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

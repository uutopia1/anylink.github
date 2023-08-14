/*
 * 작성된 날짜: Aug 14, 2023
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
 * @file              hwgi.f54.BKNIA_FILE_SEQ.java
 * @filetype          java source file
 * @brief            
 * @version           1.0
 * @history
 * 성 명              일 자                     근 거 자 료                      변 경 내 용
 * -----------        --------                  --------------                   --------------------------    
 * AnyLink :       Aug 14, 2023                AnyLink 개발 :                신규 작성
 * 
 */

public class BKNIA_FILE_SEQ extends ProMapperDataObject implements ResourceMeta {
    private static final long serialVersionUID= 1L;
    public BKNIA_FILE_SEQ() {
            super();
    }
    private boolean _setFlag = false;
    private long Sequence_No;
    
    public long getSequence_No() {
        return Sequence_No;
    }

    public String getSequence_No(boolean _masked) {
        return String.valueOf(getSequence_No());
    }
                      
    public void setSequence_No(long Sequence_No) {
        this.Sequence_No = Sequence_No;
        _setFlag = true;
    }

    public void setSequence_No(long Sequence_No, boolean _masked) {
        setSequence_No(Sequence_No);
    }


            
        private ArrayList<hwgi.f54.BKNIA_FILE_RECORD> Records = new ArrayList<hwgi.f54.BKNIA_FILE_RECORD>();
    
    public void clearRecords() {
        Records.clear();
    }
    
    public void ensureCapacityRecords(int minCapacity) {
        Records.ensureCapacity( minCapacity );
    }
    public void createRecords(int _size) {
        Records.ensureCapacity(_size);
        for(int i = Records.size(); i < _size; i++) {
            Records.add(new hwgi.f54.BKNIA_FILE_RECORD());
        }
    }
     public BKNIA_FILE_SEQ fillRecords(int _index) {
        createRecords(_index+1);
        return this;
    }
    
    public int sizeRecords() {
        if (Records != null)
            return Records.size();
        else
            return 0;
    }
    
    public hwgi.f54.BKNIA_FILE_RECORD[] getRecords() {
        return (hwgi.f54.BKNIA_FILE_RECORD[])Records.toArray(new hwgi.f54.BKNIA_FILE_RECORD[Records.size()]);
    }
    public hwgi.f54.BKNIA_FILE_RECORD getRecords(int _index) {
        return Records.get(_index);
    }
    
    public void setRecords(hwgi.f54.BKNIA_FILE_RECORD[] Records) {
        this.Records.clear();
        for(int i = 0; i < Records.length; i++) {
            this.Records.add(Records[i]);
        }
        _setFlag = true;
    }
    public void setRecords(int _index, hwgi.f54.BKNIA_FILE_RECORD Records) {
        this.Records.set(_index, Records);
        _setFlag = true;
    }
    
    public void addRecords(int _index, hwgi.f54.BKNIA_FILE_RECORD Records) {
        this.Records.add(_index, Records);
        _setFlag = true;
    }
    public void addRecords(hwgi.f54.BKNIA_FILE_RECORD Records) {
        this.Records.add(Records);
        _setFlag = true;
    }
    
    public hwgi.f54.BKNIA_FILE_RECORD removeRecords(int _index) {
        return this.Records.remove(_index);
    }
    
    
    public Object clone() {
        BKNIA_FILE_SEQ copyObj = new BKNIA_FILE_SEQ();
        clone(copyObj);
        return copyObj;
    }
    public void clone(proframe.dto.DataObject __bKNIA_FILE_SEQ) {
        BKNIA_FILE_SEQ _bKNIA_FILE_SEQ = (BKNIA_FILE_SEQ) __bKNIA_FILE_SEQ;
        _bKNIA_FILE_SEQ.setSequence_No(Sequence_No);
        for (int index0 = 0; index0 < getRecords().length; index0++) {
            _bKNIA_FILE_SEQ.addRecords(index0, (hwgi.f54.BKNIA_FILE_RECORD)getRecords(index0).clone());
        }
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
            buffer.append("Sequence_No : ").append(Sequence_No).append("\n");
        _size = sizeRecords();
        if (_size == 0) {
                buffer.append("Records : null\n");
        }
        for (int index = 0; index < _size; index++) {
                buffer.append("Records(").append(index).append(") : ").append(getRecords(index)).append(" ");
        }
                            
        
            if(_size != 0 ) {
                buffer.append("\n");
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
        int _size = 0; // field가 array인 경우 array size를 저장하는 변수
        if(buffer.length() < limit) {
            buffer.append("Sequence_No : ").append(Sequence_No).append("\n");
        }
        _size = sizeRecords();
        if (_size == 0) {
            if(buffer.length() < limit) {
                buffer.append("Records : null\n");
            }
        }
        for (int index = 0; index < _size; index++) {
            if (buffer.length() < limit) {
                buffer.append("Records(").append(index).append(") : ").append(getRecords(index)).append(" ");
            }
        }
                            
        if(buffer.length() < limit) {
        
            if(_size != 0 ) {
                buffer.append("\n");
            }
        }
    }    
    private static final Map fieldPropertyMap = null;
    
/*    static {
        parentfieldPropertyMap = ProMapperDataObject.getFieldPropertyMapByStatic();
        fieldPropertyMap = new java.util.LinkedHashMap( parentfieldPropertyMap.size() + 2);
        fieldPropertyMap.putAll( parentfieldPropertyMap );

        fieldPropertyMap.put("Sequence_No"
                            , FieldPropertyFactory.getFieldProperty( FieldProperty.TYPE_ABSTRACT_INTEGER, -1, null, null));
        fieldPropertyMap.put("Records"
                            , FieldPropertyFactory.getFieldProperty( FieldProperty.TYPE_ABSTRACT_INCLUDE, -1, "unbounded" , "hwgi.f54.BKNIA_FILE_RECORD"));
    }*/
    
    public Map getFieldPropertyMap() {
        return fieldPropertyMap;
    }
    
    public static Map getFieldPropertyMapByStatic() {
        return fieldPropertyMap;
    }
    private static final List<String> fieldNameList = new ArrayList<String>(2);
    
    static {        
        fieldNameList.add("Sequence_No");
        fieldNameList.add("Records");
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
            case 862649087 : return Long.valueOf(getSequence_No());
            case -1547717086 : return getRecords();
            default : return null;
        }
    }
    public void set(String fieldName, Object arg) {
        int hashCode = fieldName.hashCode();
        
        switch(hashCode) {
            case 862649087 : setSequence_No(((Long)arg).longValue());break;
            case -1547717086 : setRecords((hwgi.f54.BKNIA_FILE_RECORD[])arg);break;
            default : return;
        }
    }
    public boolean isEmptyDataObjectMethod(){ 
        if(true) return false;
        if (Records.size() > 0) return false;

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
            return "BKNIA_FILE_SEQ";
        } else if (input.equalsIgnoreCase(META_VERSION_NO)){
            return "0";
        } else if (input.equalsIgnoreCase(META_LOGICAL_NAME)){
            return "BKNIA_파일_SEQ";
        } else if (input.equalsIgnoreCase(META_RESOURCE_ID)){
            return "hwgi.f54:BKNIA_FILE_SEQ.umsg";
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

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
 * @file              hwgi.f54.BKNIA_FILE_BLOCK.java
 * @filetype          java source file
 * @brief            
 * @version           1.0
 * @history
 * 성 명              일 자                     근 거 자 료                      변 경 내 용
 * -----------        --------                  --------------                   --------------------------    
 * AnyLink :       Aug 14, 2023                AnyLink 개발 :                신규 작성
 * 
 */

public class BKNIA_FILE_BLOCK extends ProMapperDataObject implements ResourceMeta {
    private static final long serialVersionUID= 1L;
    public BKNIA_FILE_BLOCK() {
            super();
    }
    private boolean _setFlag = false;
        private ArrayList<hwgi.f54.BKNIA_FILE_SEQ> Sequences = new ArrayList<hwgi.f54.BKNIA_FILE_SEQ>();
    
    public void clearSequences() {
        Sequences.clear();
    }
    
    public void ensureCapacitySequences(int minCapacity) {
        Sequences.ensureCapacity( minCapacity );
    }
    public void createSequences(int _size) {
        Sequences.ensureCapacity(_size);
        for(int i = Sequences.size(); i < _size; i++) {
            Sequences.add(new hwgi.f54.BKNIA_FILE_SEQ());
        }
    }
     public BKNIA_FILE_BLOCK fillSequences(int _index) {
        createSequences(_index+1);
        return this;
    }
    
    public int sizeSequences() {
        if (Sequences != null)
            return Sequences.size();
        else
            return 0;
    }
    
    public hwgi.f54.BKNIA_FILE_SEQ[] getSequences() {
        return (hwgi.f54.BKNIA_FILE_SEQ[])Sequences.toArray(new hwgi.f54.BKNIA_FILE_SEQ[Sequences.size()]);
    }
    public hwgi.f54.BKNIA_FILE_SEQ getSequences(int _index) {
        return Sequences.get(_index);
    }
    
    public void setSequences(hwgi.f54.BKNIA_FILE_SEQ[] Sequences) {
        this.Sequences.clear();
        for(int i = 0; i < Sequences.length; i++) {
            this.Sequences.add(Sequences[i]);
        }
        _setFlag = true;
    }
    public void setSequences(int _index, hwgi.f54.BKNIA_FILE_SEQ Sequences) {
        this.Sequences.set(_index, Sequences);
        _setFlag = true;
    }
    
    public void addSequences(int _index, hwgi.f54.BKNIA_FILE_SEQ Sequences) {
        this.Sequences.add(_index, Sequences);
        _setFlag = true;
    }
    public void addSequences(hwgi.f54.BKNIA_FILE_SEQ Sequences) {
        this.Sequences.add(Sequences);
        _setFlag = true;
    }
    
    public hwgi.f54.BKNIA_FILE_SEQ removeSequences(int _index) {
        return this.Sequences.remove(_index);
    }
    
    
    public Object clone() {
        BKNIA_FILE_BLOCK copyObj = new BKNIA_FILE_BLOCK();
        clone(copyObj);
        return copyObj;
    }
    public void clone(proframe.dto.DataObject __bKNIA_FILE_BLOCK) {
        BKNIA_FILE_BLOCK _bKNIA_FILE_BLOCK = (BKNIA_FILE_BLOCK) __bKNIA_FILE_BLOCK;
        for (int index0 = 0; index0 < getSequences().length; index0++) {
            _bKNIA_FILE_BLOCK.addSequences(index0, (hwgi.f54.BKNIA_FILE_SEQ)getSequences(index0).clone());
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
        _size = sizeSequences();
        if (_size == 0) {
                buffer.append("Sequences : null\n");
        }
        for (int index = 0; index < _size; index++) {
                buffer.append("Sequences(").append(index).append(") : ").append(getSequences(index)).append(" ");
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
        _size = sizeSequences();
        if (_size == 0) {
            if(buffer.length() < limit) {
                buffer.append("Sequences : null\n");
            }
        }
        for (int index = 0; index < _size; index++) {
            if (buffer.length() < limit) {
                buffer.append("Sequences(").append(index).append(") : ").append(getSequences(index)).append(" ");
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
        fieldPropertyMap = new java.util.LinkedHashMap( parentfieldPropertyMap.size() + 1);
        fieldPropertyMap.putAll( parentfieldPropertyMap );

        fieldPropertyMap.put("Sequences"
                            , FieldPropertyFactory.getFieldProperty( FieldProperty.TYPE_ABSTRACT_INCLUDE, -1, "unbounded" , "hwgi.f54.BKNIA_FILE_SEQ"));
    }*/
    
    public Map getFieldPropertyMap() {
        return fieldPropertyMap;
    }
    
    public static Map getFieldPropertyMapByStatic() {
        return fieldPropertyMap;
    }
    private static final List<String> fieldNameList = new ArrayList<String>(1);
    
    static {        
        fieldNameList.add("Sequences");
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
            case 890282162 : return getSequences();
            default : return null;
        }
    }
    public void set(String fieldName, Object arg) {
        int hashCode = fieldName.hashCode();
        
        switch(hashCode) {
            case 890282162 : setSequences((hwgi.f54.BKNIA_FILE_SEQ[])arg);break;
            default : return;
        }
    }
    public boolean isEmptyDataObjectMethod(){ 
        if (Sequences.size() > 0) return false;

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
            return "BKNIA_FILE_BLOCK";
        } else if (input.equalsIgnoreCase(META_VERSION_NO)){
            return "0";
        } else if (input.equalsIgnoreCase(META_LOGICAL_NAME)){
            return "BKNIA_파일_BLOCK";
        } else if (input.equalsIgnoreCase(META_RESOURCE_ID)){
            return "hwgi.f54:BKNIA_FILE_BLOCK.umsg";
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

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
 * @file              hwgi.f54.FT_54PP_6000_320_DB0.java
 * @filetype          java source file
 * @brief            
 * @version           1.0
 * @history
 * 성 명              일 자                     근 거 자 료                      변 경 내 용
 * -----------        --------                  --------------                   --------------------------    
 * AnyLink :       Aug 16, 2023                AnyLink 개발 :                신규 작성
 * 
 */

public class FT_54PP_6000_320_DB0 extends ProMapperDataObject implements ResourceMeta {
    private static final long serialVersionUID= 1L;
    public FT_54PP_6000_320_DB0() {
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


            
    private long BlockNo;
    
    public long getBlockNo() {
        return BlockNo;
    }

    public String getBlockNo(boolean _masked) {
        return String.valueOf(getBlockNo());
    }
                      
    public void setBlockNo(long BlockNo) {
        this.BlockNo = BlockNo;
        _setFlag = true;
    }

    public void setBlockNo(long BlockNo, boolean _masked) {
        setBlockNo(BlockNo);
    }


            
    private long SeqNo;
    
    public long getSeqNo() {
        return SeqNo;
    }

    public String getSeqNo(boolean _masked) {
        return String.valueOf(getSeqNo());
    }
                      
    public void setSeqNo(long SeqNo) {
        this.SeqNo = SeqNo;
        _setFlag = true;
    }

    public void setSeqNo(long SeqNo, boolean _masked) {
        setSeqNo(SeqNo);
    }


            
    private long RecordCnt;
    
    public long getRecordCnt() {
        return RecordCnt;
    }

    public String getRecordCnt(boolean _masked) {
        return String.valueOf(getRecordCnt());
    }
                      
    public void setRecordCnt(long RecordCnt) {
        this.RecordCnt = RecordCnt;
        _setFlag = true;
    }

    public void setRecordCnt(long RecordCnt, boolean _masked) {
        setRecordCnt(RecordCnt);
    }


            
        private ArrayList<hwgi.f54.FT_54PP_6000_320_DB1> Records = new ArrayList<hwgi.f54.FT_54PP_6000_320_DB1>();
    
    public void clearRecords() {
        Records.clear();
    }
    
    public void ensureCapacityRecords(int minCapacity) {
        Records.ensureCapacity( minCapacity );
    }
    public void createRecords(int _size) {
        Records.ensureCapacity(_size);
        for(int i = Records.size(); i < _size; i++) {
            Records.add(new hwgi.f54.FT_54PP_6000_320_DB1());
        }
    }
     public FT_54PP_6000_320_DB0 fillRecords(int _index) {
        createRecords(_index+1);
        return this;
    }
    
    public int sizeRecords() {
        if (Records != null)
            return Records.size();
        else
            return 0;
    }
    
    public hwgi.f54.FT_54PP_6000_320_DB1[] getRecords() {
        return (hwgi.f54.FT_54PP_6000_320_DB1[])Records.toArray(new hwgi.f54.FT_54PP_6000_320_DB1[Records.size()]);
    }
    public hwgi.f54.FT_54PP_6000_320_DB1 getRecords(int _index) {
        return Records.get(_index);
    }
    
    public void setRecords(hwgi.f54.FT_54PP_6000_320_DB1[] Records) {
        this.Records.clear();
        for(int i = 0; i < Records.length; i++) {
            this.Records.add(Records[i]);
        }
        _setFlag = true;
    }
    public void setRecords(int _index, hwgi.f54.FT_54PP_6000_320_DB1 Records) {
        this.Records.set(_index, Records);
        _setFlag = true;
    }
    
    public void addRecords(int _index, hwgi.f54.FT_54PP_6000_320_DB1 Records) {
        this.Records.add(_index, Records);
        _setFlag = true;
    }
    public void addRecords(hwgi.f54.FT_54PP_6000_320_DB1 Records) {
        this.Records.add(Records);
        _setFlag = true;
    }
    
    public hwgi.f54.FT_54PP_6000_320_DB1 removeRecords(int _index) {
        return this.Records.remove(_index);
    }
    
    
    public Object clone() {
        FT_54PP_6000_320_DB0 copyObj = new FT_54PP_6000_320_DB0();
        clone(copyObj);
        return copyObj;
    }
    public void clone(proframe.dto.DataObject __fT_54PP_6000_320_DB0) {
        FT_54PP_6000_320_DB0 _fT_54PP_6000_320_DB0 = (FT_54PP_6000_320_DB0) __fT_54PP_6000_320_DB0;
        _fT_54PP_6000_320_DB0.setSnrCode(SnrCode);
        _fT_54PP_6000_320_DB0.setBlockNo(BlockNo);
        _fT_54PP_6000_320_DB0.setSeqNo(SeqNo);
        _fT_54PP_6000_320_DB0.setRecordCnt(RecordCnt);
        for (int index0 = 0; index0 < getRecords().length; index0++) {
            _fT_54PP_6000_320_DB0.addRecords(index0, (hwgi.f54.FT_54PP_6000_320_DB1)getRecords(index0).clone());
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
            buffer.append("SnrCode : ").append(SnrCode).append("\n");
            buffer.append("BlockNo : ").append(BlockNo).append("\n");
            buffer.append("SeqNo : ").append(SeqNo).append("\n");
            buffer.append("RecordCnt : ").append(RecordCnt).append("\n");
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
            buffer.append("SnrCode : ").append(SnrCode).append("\n");
        }
        if(buffer.length() < limit) {
            buffer.append("BlockNo : ").append(BlockNo).append("\n");
        }
        if(buffer.length() < limit) {
            buffer.append("SeqNo : ").append(SeqNo).append("\n");
        }
        if(buffer.length() < limit) {
            buffer.append("RecordCnt : ").append(RecordCnt).append("\n");
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
        fieldPropertyMap = new java.util.LinkedHashMap( parentfieldPropertyMap.size() + 5);
        fieldPropertyMap.putAll( parentfieldPropertyMap );

        fieldPropertyMap.put("SnrCode"
                            , FieldPropertyFactory.getFieldProperty( FieldProperty.TYPE_ABSTRACT_STRING, -1, null, null));
        fieldPropertyMap.put("BlockNo"
                            , FieldPropertyFactory.getFieldProperty( FieldProperty.TYPE_ABSTRACT_INTEGER, -1, null, null));
        fieldPropertyMap.put("SeqNo"
                            , FieldPropertyFactory.getFieldProperty( FieldProperty.TYPE_ABSTRACT_INTEGER, -1, null, null));
        fieldPropertyMap.put("RecordCnt"
                            , FieldPropertyFactory.getFieldProperty( FieldProperty.TYPE_ABSTRACT_INTEGER, -1, null, null));
        fieldPropertyMap.put("Records"
                            , FieldPropertyFactory.getFieldProperty( FieldProperty.TYPE_ABSTRACT_INCLUDE, -1, "RecordCnt" , "hwgi.f54.FT_54PP_6000_320_DB1"));
    }*/
    
    public Map getFieldPropertyMap() {
        return fieldPropertyMap;
    }
    
    public static Map getFieldPropertyMapByStatic() {
        return fieldPropertyMap;
    }
    private static final List<String> fieldNameList = new ArrayList<String>(5);
    
    static {        
        fieldNameList.add("SnrCode");
        fieldNameList.add("BlockNo");
        fieldNameList.add("SeqNo");
        fieldNameList.add("RecordCnt");
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
            case -390011932 : return getSnrCode();
            case 1643214606 : return Long.valueOf(getBlockNo());
            case 79772256 : return Long.valueOf(getSeqNo());
            case -1297477832 : return Long.valueOf(getRecordCnt());
            case -1547717086 : return getRecords();
            default : return null;
        }
    }
    public void set(String fieldName, Object arg) {
        int hashCode = fieldName.hashCode();
        
        switch(hashCode) {
            case -390011932 : setSnrCode((String)arg);break;
            case 1643214606 : setBlockNo(((Long)arg).longValue());break;
            case 79772256 : setSeqNo(((Long)arg).longValue());break;
            case -1297477832 : setRecordCnt(((Long)arg).longValue());break;
            case -1547717086 : setRecords((hwgi.f54.FT_54PP_6000_320_DB1[])arg);break;
            default : return;
        }
    }
    public boolean isEmptyDataObjectMethod(){ 
        if (SnrCode != null) return false;
        if(true) return false;
        if(true) return false;
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
            return "FT_54PP_6000_320_DB0";
        } else if (input.equalsIgnoreCase(META_VERSION_NO)){
            return "0";
        } else if (input.equalsIgnoreCase(META_LOGICAL_NAME)){
            return "FT_54PP_6000_320_DB0_데이터";
        } else if (input.equalsIgnoreCase(META_RESOURCE_ID)){
            return "hwgi.f54:FT_54PP_6000_320_DB0.umsg";
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

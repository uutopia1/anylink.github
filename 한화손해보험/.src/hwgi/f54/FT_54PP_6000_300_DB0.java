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
 * @file              hwgi.f54.FT_54PP_6000_300_DB0.java
 * @filetype          java source file
 * @brief            
 * @version           1.0
 * @history
 * 성 명              일 자                     근 거 자 료                      변 경 내 용
 * -----------        --------                  --------------                   --------------------------    
 * AnyLink :       Aug 16, 2023                AnyLink 개발 :                신규 작성
 * 
 */

public class FT_54PP_6000_300_DB0 extends ProMapperDataObject implements ResourceMeta {
    private static final long serialVersionUID= 1L;
    public FT_54PP_6000_300_DB0() {
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


            
    private long SkipCount;
    
    public long getSkipCount() {
        return SkipCount;
    }

    public String getSkipCount(boolean _masked) {
        return String.valueOf(getSkipCount());
    }
                      
    public void setSkipCount(long SkipCount) {
        this.SkipCount = SkipCount;
        _setFlag = true;
    }

    public void setSkipCount(long SkipCount, boolean _masked) {
        setSkipCount(SkipCount);
    }


            
    private String SkipBits = null;
    
    public String getSkipBits() {
        return SkipBits;
    }

    public String getSkipBits(boolean _masked) {
        return StringUtil.nullableStringValueOf(getSkipBits());
    }
                      
    public void setSkipBits(String SkipBits) {
        this.SkipBits = SkipBits;
        _setFlag = true;
    }

    public void setSkipBits(String SkipBits, boolean _masked) {
        setSkipBits(SkipBits);
    }


            
    public Object clone() {
        FT_54PP_6000_300_DB0 copyObj = new FT_54PP_6000_300_DB0();
        clone(copyObj);
        return copyObj;
    }
    public void clone(proframe.dto.DataObject __fT_54PP_6000_300_DB0) {
        FT_54PP_6000_300_DB0 _fT_54PP_6000_300_DB0 = (FT_54PP_6000_300_DB0) __fT_54PP_6000_300_DB0;
        _fT_54PP_6000_300_DB0.setSnrCode(SnrCode);
        _fT_54PP_6000_300_DB0.setBlockNo(BlockNo);
        _fT_54PP_6000_300_DB0.setSeqNo(SeqNo);
        _fT_54PP_6000_300_DB0.setSkipCount(SkipCount);
        _fT_54PP_6000_300_DB0.setSkipBits(SkipBits);
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
            buffer.append("SkipCount : ").append(SkipCount).append("\n");
            buffer.append("SkipBits : ").append(SkipBits).append("\n");
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
            buffer.append("SkipCount : ").append(SkipCount).append("\n");
        }
        if(buffer.length() < limit) {
            buffer.append("SkipBits : ").append(SkipBits).append("\n");
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
        fieldPropertyMap.put("SkipCount"
                            , FieldPropertyFactory.getFieldProperty( FieldProperty.TYPE_ABSTRACT_INTEGER, -1, null, null));
        fieldPropertyMap.put("SkipBits"
                            , FieldPropertyFactory.getFieldProperty( FieldProperty.TYPE_ABSTRACT_STRING, -1, null, null));
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
        fieldNameList.add("SkipCount");
        fieldNameList.add("SkipBits");
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
            case -222350672 : return Long.valueOf(getSkipCount());
            case -2085418171 : return getSkipBits();
            default : return null;
        }
    }
    public void set(String fieldName, Object arg) {
        int hashCode = fieldName.hashCode();
        
        switch(hashCode) {
            case -390011932 : setSnrCode((String)arg);break;
            case 1643214606 : setBlockNo(((Long)arg).longValue());break;
            case 79772256 : setSeqNo(((Long)arg).longValue());break;
            case -222350672 : setSkipCount(((Long)arg).longValue());break;
            case -2085418171 : setSkipBits((String)arg);break;
            default : return;
        }
    }
    public boolean isEmptyDataObjectMethod(){ 
        if (SnrCode != null) return false;
        if(true) return false;
        if(true) return false;
        if(true) return false;
        if (SkipBits != null) return false;

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
            return "FT_54PP_6000_300_DB0";
        } else if (input.equalsIgnoreCase(META_VERSION_NO)){
            return "0";
        } else if (input.equalsIgnoreCase(META_LOGICAL_NAME)){
            return "FT_54PP_6000_300_DB0_결번전문송신";
        } else if (input.equalsIgnoreCase(META_RESOURCE_ID)){
            return "hwgi.f54:FT_54PP_6000_300_DB0.umsg";
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

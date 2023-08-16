/*
 * 작성된 날짜: Aug 16, 2023
 * Copyright (c) 2023 TmaxSoft co., Ltd. All rights reserved.
 */
package hwgi.f54.send_mem;

import com.tmax.promapper.engine.base.ProMapperDataObject;
import java.util.ArrayList;
import java.util.Map;
import java.util.LinkedHashMap;
import java.util.List;
import proframe.tool.record.common.*;
import com.tmax.promapper.engine.base.ResourceMeta;
import com.tmax.promapper.engine.util.StringUtil;


/**
 * @file              hwgi.f54.send_mem.FT_54PP_MSF_DIST_BBS_SEL_DB0.java
 * @filetype          java source file
 * @brief            
 * @version           1.0
 * @history
 * 성 명              일 자                     근 거 자 료                      변 경 내 용
 * -----------        --------                  --------------                   --------------------------    
 * AnyLink :       Aug 16, 2023                AnyLink 개발 :                신규 작성
 * 
 */

public class FT_54PP_MSF_DIST_BBS_SEL_DB0 extends ProMapperDataObject implements ResourceMeta {
    private static final long serialVersionUID= 1L;
    public FT_54PP_MSF_DIST_BBS_SEL_DB0() {
            super();
    }
    private boolean _setFlag = false;
    private String RDATE = null;
    
    public String getRDATE() {
        return RDATE;
    }

    public String getRDATE(boolean _masked) {
        return StringUtil.nullableStringValueOf(getRDATE());
    }
                      
    public void setRDATE(String RDATE) {
        this.RDATE = RDATE;
        _setFlag = true;
    }

    public void setRDATE(String RDATE, boolean _masked) {
        setRDATE(RDATE);
    }


            
    private String SEQNO = null;
    
    public String getSEQNO() {
        return SEQNO;
    }

    public String getSEQNO(boolean _masked) {
        return StringUtil.nullableStringValueOf(getSEQNO());
    }
                      
    public void setSEQNO(String SEQNO) {
        this.SEQNO = SEQNO;
        _setFlag = true;
    }

    public void setSEQNO(String SEQNO, boolean _masked) {
        setSEQNO(SEQNO);
    }


            
    private String FNAME = null;
    
    public String getFNAME() {
        return FNAME;
    }

    public String getFNAME(boolean _masked) {
        return StringUtil.nullableStringValueOf(getFNAME());
    }
                      
    public void setFNAME(String FNAME) {
        this.FNAME = FNAME;
        _setFlag = true;
    }

    public void setFNAME(String FNAME, boolean _masked) {
        setFNAME(FNAME);
    }


            
    public Object clone() {
        FT_54PP_MSF_DIST_BBS_SEL_DB0 copyObj = new FT_54PP_MSF_DIST_BBS_SEL_DB0();
        clone(copyObj);
        return copyObj;
    }
    public void clone(proframe.dto.DataObject __fT_54PP_MSF_DIST_BBS_SEL_DB0) {
        FT_54PP_MSF_DIST_BBS_SEL_DB0 _fT_54PP_MSF_DIST_BBS_SEL_DB0 = (FT_54PP_MSF_DIST_BBS_SEL_DB0) __fT_54PP_MSF_DIST_BBS_SEL_DB0;
        _fT_54PP_MSF_DIST_BBS_SEL_DB0.setRDATE(RDATE);
        _fT_54PP_MSF_DIST_BBS_SEL_DB0.setSEQNO(SEQNO);
        _fT_54PP_MSF_DIST_BBS_SEL_DB0.setFNAME(FNAME);
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
            buffer.append("RDATE : ").append(RDATE).append("\n");
            buffer.append("SEQNO : ").append(SEQNO).append("\n");
            buffer.append("FNAME : ").append(FNAME).append("\n");
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
            buffer.append("RDATE : ").append(RDATE).append("\n");
        }
        if(buffer.length() < limit) {
            buffer.append("SEQNO : ").append(SEQNO).append("\n");
        }
        if(buffer.length() < limit) {
            buffer.append("FNAME : ").append(FNAME).append("\n");
        }
    }    
    private static final Map fieldPropertyMap = null;
    
/*    static {
        parentfieldPropertyMap = ProMapperDataObject.getFieldPropertyMapByStatic();
        fieldPropertyMap = new java.util.LinkedHashMap( parentfieldPropertyMap.size() + 3);
        fieldPropertyMap.putAll( parentfieldPropertyMap );

        fieldPropertyMap.put("RDATE"
                            , FieldPropertyFactory.getFieldProperty( FieldProperty.TYPE_ABSTRACT_STRING, -1, null, null));
        fieldPropertyMap.put("SEQNO"
                            , FieldPropertyFactory.getFieldProperty( FieldProperty.TYPE_ABSTRACT_STRING, -1, null, null));
        fieldPropertyMap.put("FNAME"
                            , FieldPropertyFactory.getFieldProperty( FieldProperty.TYPE_ABSTRACT_STRING, -1, null, null));
    }*/
    
    public Map getFieldPropertyMap() {
        return fieldPropertyMap;
    }
    
    public static Map getFieldPropertyMapByStatic() {
        return fieldPropertyMap;
    }
    private static final List<String> fieldNameList = new ArrayList<String>(3);
    
    static {        
        fieldNameList.add("RDATE");
        fieldNameList.add("SEQNO");
        fieldNameList.add("FNAME");
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
            case 77819648 : return getRDATE();
            case 78788160 : return getSEQNO();
            case 67035089 : return getFNAME();
            default : return null;
        }
    }
    public void set(String fieldName, Object arg) {
        int hashCode = fieldName.hashCode();
        
        switch(hashCode) {
            case 77819648 : setRDATE((String)arg);break;
            case 78788160 : setSEQNO((String)arg);break;
            case 67035089 : setFNAME((String)arg);break;
            default : return;
        }
    }
    public boolean isEmptyDataObjectMethod(){ 
        if (RDATE != null) return false;
        if (SEQNO != null) return false;
        if (FNAME != null) return false;

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
            return "FT_54PP_MSF_DIST_BBS_SEL_DB0";
        } else if (input.equalsIgnoreCase(META_VERSION_NO)){
            return "0";
        } else if (input.equalsIgnoreCase(META_LOGICAL_NAME)){
            return "FT_54PP_MSF_DIST_BBS_SEL_DB0_송신테이블조회";
        } else if (input.equalsIgnoreCase(META_RESOURCE_ID)){
            return "hwgi.f54.send_mem:FT_54PP_MSF_DIST_BBS_SEL_DB0.umsg";
        } else if (input.equalsIgnoreCase(META_RESOURCE_TYPE)){
            return "STRUCTURE";
        } else if (input.equalsIgnoreCase(META_RESOURCE_PATH)){
            return "hwgi.f54.send_mem";
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

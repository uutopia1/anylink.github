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
 * @file              hwgi.f54.BKNIA_BAT_REQ.java
 * @filetype          java source file
 * @brief            
 * @version           1.0
 * @history
 * 성 명              일 자                     근 거 자 료                      변 경 내 용
 * -----------        --------                  --------------                   --------------------------    
 * AnyLink :       Aug 16, 2023                AnyLink 개발 :                신규 작성
 * 
 */

public class BKNIA_BAT_REQ extends ProMapperDataObject implements ResourceMeta {
    private static final long serialVersionUID= 1L;
    public BKNIA_BAT_REQ() {
            super();
    }
    private boolean _setFlag = false;
    private String ORG_CODE = null;
    
    public String getORG_CODE() {
        return ORG_CODE;
    }

    public String getORG_CODE(boolean _masked) {
        return StringUtil.nullableStringValueOf(getORG_CODE());
    }
                      
    public void setORG_CODE(String ORG_CODE) {
        this.ORG_CODE = ORG_CODE;
        _setFlag = true;
    }

    public void setORG_CODE(String ORG_CODE, boolean _masked) {
        setORG_CODE(ORG_CODE);
    }


            
    private String FILE_CODE = null;
    
    public String getFILE_CODE() {
        return FILE_CODE;
    }

    public String getFILE_CODE(boolean _masked) {
        return StringUtil.nullableStringValueOf(getFILE_CODE());
    }
                      
    public void setFILE_CODE(String FILE_CODE) {
        this.FILE_CODE = FILE_CODE;
        _setFlag = true;
    }

    public void setFILE_CODE(String FILE_CODE, boolean _masked) {
        setFILE_CODE(FILE_CODE);
    }


            
    private String TX_DATE = null;
    
    public String getTX_DATE() {
        return TX_DATE;
    }

    public String getTX_DATE(boolean _masked) {
        return StringUtil.nullableStringValueOf(getTX_DATE());
    }
                      
    public void setTX_DATE(String TX_DATE) {
        this.TX_DATE = TX_DATE;
        _setFlag = true;
    }

    public void setTX_DATE(String TX_DATE, boolean _masked) {
        setTX_DATE(TX_DATE);
    }


            
    private String FILLER = null;
    
    public String getFILLER() {
        return FILLER;
    }

    public String getFILLER(boolean _masked) {
        return StringUtil.nullableStringValueOf(getFILLER());
    }
                      
    public void setFILLER(String FILLER) {
        this.FILLER = FILLER;
        _setFlag = true;
    }

    public void setFILLER(String FILLER, boolean _masked) {
        setFILLER(FILLER);
    }


            
    private String FILLER1 = null;
    
    public String getFILLER1() {
        return FILLER1;
    }

    public String getFILLER1(boolean _masked) {
        return StringUtil.nullableStringValueOf(getFILLER1());
    }
                      
    public void setFILLER1(String FILLER1) {
        this.FILLER1 = FILLER1;
        _setFlag = true;
    }

    public void setFILLER1(String FILLER1, boolean _masked) {
        setFILLER1(FILLER1);
    }


            
    private String FILLER2 = null;
    
    public String getFILLER2() {
        return FILLER2;
    }

    public String getFILLER2(boolean _masked) {
        return StringUtil.nullableStringValueOf(getFILLER2());
    }
                      
    public void setFILLER2(String FILLER2) {
        this.FILLER2 = FILLER2;
        _setFlag = true;
    }

    public void setFILLER2(String FILLER2, boolean _masked) {
        setFILLER2(FILLER2);
    }


            
    private String FILLER3 = null;
    
    public String getFILLER3() {
        return FILLER3;
    }

    public String getFILLER3(boolean _masked) {
        return StringUtil.nullableStringValueOf(getFILLER3());
    }
                      
    public void setFILLER3(String FILLER3) {
        this.FILLER3 = FILLER3;
        _setFlag = true;
    }

    public void setFILLER3(String FILLER3, boolean _masked) {
        setFILLER3(FILLER3);
    }


            
    private String FILLER4 = null;
    
    public String getFILLER4() {
        return FILLER4;
    }

    public String getFILLER4(boolean _masked) {
        return StringUtil.nullableStringValueOf(getFILLER4());
    }
                      
    public void setFILLER4(String FILLER4) {
        this.FILLER4 = FILLER4;
        _setFlag = true;
    }

    public void setFILLER4(String FILLER4, boolean _masked) {
        setFILLER4(FILLER4);
    }


            
    private String FILLER5 = null;
    
    public String getFILLER5() {
        return FILLER5;
    }

    public String getFILLER5(boolean _masked) {
        return StringUtil.nullableStringValueOf(getFILLER5());
    }
                      
    public void setFILLER5(String FILLER5) {
        this.FILLER5 = FILLER5;
        _setFlag = true;
    }

    public void setFILLER5(String FILLER5, boolean _masked) {
        setFILLER5(FILLER5);
    }


            
    private String FILLER6 = null;
    
    public String getFILLER6() {
        return FILLER6;
    }

    public String getFILLER6(boolean _masked) {
        return StringUtil.nullableStringValueOf(getFILLER6());
    }
                      
    public void setFILLER6(String FILLER6) {
        this.FILLER6 = FILLER6;
        _setFlag = true;
    }

    public void setFILLER6(String FILLER6, boolean _masked) {
        setFILLER6(FILLER6);
    }


            
    public Object clone() {
        BKNIA_BAT_REQ copyObj = new BKNIA_BAT_REQ();
        clone(copyObj);
        return copyObj;
    }
    public void clone(proframe.dto.DataObject __bKNIA_BAT_REQ) {
        BKNIA_BAT_REQ _bKNIA_BAT_REQ = (BKNIA_BAT_REQ) __bKNIA_BAT_REQ;
        _bKNIA_BAT_REQ.setORG_CODE(ORG_CODE);
        _bKNIA_BAT_REQ.setFILE_CODE(FILE_CODE);
        _bKNIA_BAT_REQ.setTX_DATE(TX_DATE);
        _bKNIA_BAT_REQ.setFILLER(FILLER);
        _bKNIA_BAT_REQ.setFILLER1(FILLER1);
        _bKNIA_BAT_REQ.setFILLER2(FILLER2);
        _bKNIA_BAT_REQ.setFILLER3(FILLER3);
        _bKNIA_BAT_REQ.setFILLER4(FILLER4);
        _bKNIA_BAT_REQ.setFILLER5(FILLER5);
        _bKNIA_BAT_REQ.setFILLER6(FILLER6);
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
            buffer.append("ORG_CODE : ").append(ORG_CODE).append("\n");
            buffer.append("FILE_CODE : ").append(FILE_CODE).append("\n");
            buffer.append("TX_DATE : ").append(TX_DATE).append("\n");
            buffer.append("FILLER : ").append(FILLER).append("\n");
            buffer.append("FILLER1 : ").append(FILLER1).append("\n");
            buffer.append("FILLER2 : ").append(FILLER2).append("\n");
            buffer.append("FILLER3 : ").append(FILLER3).append("\n");
            buffer.append("FILLER4 : ").append(FILLER4).append("\n");
            buffer.append("FILLER5 : ").append(FILLER5).append("\n");
            buffer.append("FILLER6 : ").append(FILLER6).append("\n");
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
            buffer.append("ORG_CODE : ").append(ORG_CODE).append("\n");
        }
        if(buffer.length() < limit) {
            buffer.append("FILE_CODE : ").append(FILE_CODE).append("\n");
        }
        if(buffer.length() < limit) {
            buffer.append("TX_DATE : ").append(TX_DATE).append("\n");
        }
        if(buffer.length() < limit) {
            buffer.append("FILLER : ").append(FILLER).append("\n");
        }
        if(buffer.length() < limit) {
            buffer.append("FILLER1 : ").append(FILLER1).append("\n");
        }
        if(buffer.length() < limit) {
            buffer.append("FILLER2 : ").append(FILLER2).append("\n");
        }
        if(buffer.length() < limit) {
            buffer.append("FILLER3 : ").append(FILLER3).append("\n");
        }
        if(buffer.length() < limit) {
            buffer.append("FILLER4 : ").append(FILLER4).append("\n");
        }
        if(buffer.length() < limit) {
            buffer.append("FILLER5 : ").append(FILLER5).append("\n");
        }
        if(buffer.length() < limit) {
            buffer.append("FILLER6 : ").append(FILLER6).append("\n");
        }
    }    
    private static final Map fieldPropertyMap = null;
    
/*    static {
        parentfieldPropertyMap = ProMapperDataObject.getFieldPropertyMapByStatic();
        fieldPropertyMap = new java.util.LinkedHashMap( parentfieldPropertyMap.size() + 10);
        fieldPropertyMap.putAll( parentfieldPropertyMap );

        fieldPropertyMap.put("ORG_CODE"
                            , FieldPropertyFactory.getFieldProperty( FieldProperty.TYPE_ABSTRACT_STRING, -1, null, null));
        fieldPropertyMap.put("FILE_CODE"
                            , FieldPropertyFactory.getFieldProperty( FieldProperty.TYPE_ABSTRACT_STRING, -1, null, null));
        fieldPropertyMap.put("TX_DATE"
                            , FieldPropertyFactory.getFieldProperty( FieldProperty.TYPE_ABSTRACT_STRING, -1, null, null));
        fieldPropertyMap.put("FILLER"
                            , FieldPropertyFactory.getFieldProperty( FieldProperty.TYPE_ABSTRACT_STRING, -1, null, null));
        fieldPropertyMap.put("FILLER1"
                            , FieldPropertyFactory.getFieldProperty( FieldProperty.TYPE_ABSTRACT_STRING, -1, null, null));
        fieldPropertyMap.put("FILLER2"
                            , FieldPropertyFactory.getFieldProperty( FieldProperty.TYPE_ABSTRACT_STRING, -1, null, null));
        fieldPropertyMap.put("FILLER3"
                            , FieldPropertyFactory.getFieldProperty( FieldProperty.TYPE_ABSTRACT_STRING, -1, null, null));
        fieldPropertyMap.put("FILLER4"
                            , FieldPropertyFactory.getFieldProperty( FieldProperty.TYPE_ABSTRACT_STRING, -1, null, null));
        fieldPropertyMap.put("FILLER5"
                            , FieldPropertyFactory.getFieldProperty( FieldProperty.TYPE_ABSTRACT_STRING, -1, null, null));
        fieldPropertyMap.put("FILLER6"
                            , FieldPropertyFactory.getFieldProperty( FieldProperty.TYPE_ABSTRACT_STRING, -1, null, null));
    }*/
    
    public Map getFieldPropertyMap() {
        return fieldPropertyMap;
    }
    
    public static Map getFieldPropertyMapByStatic() {
        return fieldPropertyMap;
    }
    private static final List<String> fieldNameList = new ArrayList<String>(10);
    
    static {        
        fieldNameList.add("ORG_CODE");
        fieldNameList.add("FILE_CODE");
        fieldNameList.add("TX_DATE");
        fieldNameList.add("FILLER");
        fieldNameList.add("FILLER1");
        fieldNameList.add("FILLER2");
        fieldNameList.add("FILLER3");
        fieldNameList.add("FILLER4");
        fieldNameList.add("FILLER5");
        fieldNameList.add("FILLER6");
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
            case 2126399112 : return getORG_CODE();
            case 1499365072 : return getFILE_CODE();
            case -149911415 : return getTX_DATE();
            case 2073796976 : return getFILLER();
            case -136803135 : return getFILLER1();
            case -136803134 : return getFILLER2();
            case -136803133 : return getFILLER3();
            case -136803132 : return getFILLER4();
            case -136803131 : return getFILLER5();
            case -136803130 : return getFILLER6();
            default : return null;
        }
    }
    public void set(String fieldName, Object arg) {
        int hashCode = fieldName.hashCode();
        
        switch(hashCode) {
            case 2126399112 : setORG_CODE((String)arg);break;
            case 1499365072 : setFILE_CODE((String)arg);break;
            case -149911415 : setTX_DATE((String)arg);break;
            case 2073796976 : setFILLER((String)arg);break;
            case -136803135 : setFILLER1((String)arg);break;
            case -136803134 : setFILLER2((String)arg);break;
            case -136803133 : setFILLER3((String)arg);break;
            case -136803132 : setFILLER4((String)arg);break;
            case -136803131 : setFILLER5((String)arg);break;
            case -136803130 : setFILLER6((String)arg);break;
            default : return;
        }
    }
    public boolean isEmptyDataObjectMethod(){ 
        if (ORG_CODE != null) return false;
        if (FILE_CODE != null) return false;
        if (TX_DATE != null) return false;
        if (FILLER != null) return false;
        if (FILLER1 != null) return false;
        if (FILLER2 != null) return false;
        if (FILLER3 != null) return false;
        if (FILLER4 != null) return false;
        if (FILLER5 != null) return false;
        if (FILLER6 != null) return false;

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
            return "BKNIA_BAT_REQ";
        } else if (input.equalsIgnoreCase(META_VERSION_NO)){
            return "0";
        } else if (input.equalsIgnoreCase(META_LOGICAL_NAME)){
            return "BKNIA_BAT_REQ";
        } else if (input.equalsIgnoreCase(META_RESOURCE_ID)){
            return "hwgi.f54:BKNIA_BAT_REQ.umsg";
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

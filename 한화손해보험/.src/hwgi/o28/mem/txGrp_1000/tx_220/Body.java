/*
 * 작성된 날짜: Aug 15, 2023
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
 * @file              hwgi.o28.mem.txGrp_1000.tx_220.Body.java
 * @filetype          java source file
 * @brief            
 * @version           1.0
 * @history
 * 성 명              일 자                     근 거 자 료                      변 경 내 용
 * -----------        --------                  --------------                   --------------------------    
 * AnyLink :       Aug 15, 2023                AnyLink 개발 :                신규 작성
 * 
 */

public class Body extends ProMapperDataObject implements ResourceMeta {
    private static final long serialVersionUID= 1L;
    public Body() {
            super();
    }
    private boolean _setFlag = false;
    private String mgmBldrgstPk = null;
    
    public String getMgmBldrgstPk() {
        return mgmBldrgstPk;
    }

    public String getMgmBldrgstPk(boolean _masked) {
        return StringUtil.nullableStringValueOf(getMgmBldrgstPk());
    }
                      
    public void setMgmBldrgstPk(String mgmBldrgstPk) {
        this.mgmBldrgstPk = mgmBldrgstPk;
        _setFlag = true;
    }

    public void setMgmBldrgstPk(String mgmBldrgstPk, boolean _masked) {
        setMgmBldrgstPk(mgmBldrgstPk);
    }


            
    private String regstrGbCd = null;
    
    public String getRegstrGbCd() {
        return regstrGbCd;
    }

    public String getRegstrGbCd(boolean _masked) {
        return StringUtil.nullableStringValueOf(getRegstrGbCd());
    }
                      
    public void setRegstrGbCd(String regstrGbCd) {
        this.regstrGbCd = regstrGbCd;
        _setFlag = true;
    }

    public void setRegstrGbCd(String regstrGbCd, boolean _masked) {
        setRegstrGbCd(regstrGbCd);
    }


            
    private String regstrKindCd = null;
    
    public String getRegstrKindCd() {
        return regstrKindCd;
    }

    public String getRegstrKindCd(boolean _masked) {
        return StringUtil.nullableStringValueOf(getRegstrKindCd());
    }
                      
    public void setRegstrKindCd(String regstrKindCd) {
        this.regstrKindCd = regstrKindCd;
        _setFlag = true;
    }

    public void setRegstrKindCd(String regstrKindCd, boolean _masked) {
        setRegstrKindCd(regstrKindCd);
    }


            
    private String bldNm = null;
    
    public String getBldNm() {
        return bldNm;
    }

    public String getBldNm(boolean _masked) {
        return StringUtil.nullableStringValueOf(getBldNm());
    }
                      
    public void setBldNm(String bldNm) {
        this.bldNm = bldNm;
        _setFlag = true;
    }

    public void setBldNm(String bldNm, boolean _masked) {
        setBldNm(bldNm);
    }


            
    private String totarea = null;
    
    public String getTotarea() {
        return totarea;
    }

    public String getTotarea(boolean _masked) {
        return StringUtil.nullableStringValueOf(getTotarea());
    }
                      
    public void setTotarea(String totarea) {
        this.totarea = totarea;
        _setFlag = true;
    }

    public void setTotarea(String totarea, boolean _masked) {
        setTotarea(totarea);
    }


            
    public Object clone() {
        Body copyObj = new Body();
        clone(copyObj);
        return copyObj;
    }
    public void clone(proframe.dto.DataObject __body) {
        Body _body = (Body) __body;
        _body.setMgmBldrgstPk(mgmBldrgstPk);
        _body.setRegstrGbCd(regstrGbCd);
        _body.setRegstrKindCd(regstrKindCd);
        _body.setBldNm(bldNm);
        _body.setTotarea(totarea);
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
            buffer.append("mgmBldrgstPk : ").append(mgmBldrgstPk).append("\n");
            buffer.append("regstrGbCd : ").append(regstrGbCd).append("\n");
            buffer.append("regstrKindCd : ").append(regstrKindCd).append("\n");
            buffer.append("bldNm : ").append(bldNm).append("\n");
            buffer.append("totarea : ").append(totarea).append("\n");
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
            buffer.append("mgmBldrgstPk : ").append(mgmBldrgstPk).append("\n");
        }
        if(buffer.length() < limit) {
            buffer.append("regstrGbCd : ").append(regstrGbCd).append("\n");
        }
        if(buffer.length() < limit) {
            buffer.append("regstrKindCd : ").append(regstrKindCd).append("\n");
        }
        if(buffer.length() < limit) {
            buffer.append("bldNm : ").append(bldNm).append("\n");
        }
        if(buffer.length() < limit) {
            buffer.append("totarea : ").append(totarea).append("\n");
        }
    }    
    private static final Map fieldPropertyMap = null;
    
/*    static {
        parentfieldPropertyMap = ProMapperDataObject.getFieldPropertyMapByStatic();
        fieldPropertyMap = new java.util.LinkedHashMap( parentfieldPropertyMap.size() + 5);
        fieldPropertyMap.putAll( parentfieldPropertyMap );

        fieldPropertyMap.put("mgmBldrgstPk"
                            , FieldPropertyFactory.getFieldProperty( FieldProperty.TYPE_ABSTRACT_STRING, -1, null, null));
        fieldPropertyMap.put("regstrGbCd"
                            , FieldPropertyFactory.getFieldProperty( FieldProperty.TYPE_ABSTRACT_STRING, -1, null, null));
        fieldPropertyMap.put("regstrKindCd"
                            , FieldPropertyFactory.getFieldProperty( FieldProperty.TYPE_ABSTRACT_STRING, -1, null, null));
        fieldPropertyMap.put("bldNm"
                            , FieldPropertyFactory.getFieldProperty( FieldProperty.TYPE_ABSTRACT_STRING, -1, null, null));
        fieldPropertyMap.put("totarea"
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
        fieldNameList.add("mgmBldrgstPk");
        fieldNameList.add("regstrGbCd");
        fieldNameList.add("regstrKindCd");
        fieldNameList.add("bldNm");
        fieldNameList.add("totarea");
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
            case -1326898952 : return getMgmBldrgstPk();
            case -1558956711 : return getRegstrGbCd();
            case 908451474 : return getRegstrKindCd();
            case 93821113 : return getBldNm();
            case -1135788698 : return getTotarea();
            default : return null;
        }
    }
    public void set(String fieldName, Object arg) {
        int hashCode = fieldName.hashCode();
        
        switch(hashCode) {
            case -1326898952 : setMgmBldrgstPk((String)arg);break;
            case -1558956711 : setRegstrGbCd((String)arg);break;
            case 908451474 : setRegstrKindCd((String)arg);break;
            case 93821113 : setBldNm((String)arg);break;
            case -1135788698 : setTotarea((String)arg);break;
            default : return;
        }
    }
    public boolean isEmptyDataObjectMethod(){ 
        if (mgmBldrgstPk != null) return false;
        if (regstrGbCd != null) return false;
        if (regstrKindCd != null) return false;
        if (bldNm != null) return false;
        if (totarea != null) return false;

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
            return "Body";
        } else if (input.equalsIgnoreCase(META_VERSION_NO)){
            return null;
        } else if (input.equalsIgnoreCase(META_LOGICAL_NAME)){
            return "body";
        } else if (input.equalsIgnoreCase(META_RESOURCE_ID)){
            return "hwgi.o28.mem.txGrp_1000.tx_220:Body.umsg";
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

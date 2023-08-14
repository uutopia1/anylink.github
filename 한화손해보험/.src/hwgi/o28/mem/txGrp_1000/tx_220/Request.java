/*
 * 작성된 날짜: Aug 14, 2023
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
 * @file              hwgi.o28.mem.txGrp_1000.tx_220.Request.java
 * @filetype          java source file
 * @brief            
 * @version           1.0
 * @history
 * 성 명              일 자                     근 거 자 료                      변 경 내 용
 * -----------        --------                  --------------                   --------------------------    
 * AnyLink :       Aug 14, 2023                AnyLink 개발 :                신규 작성
 * 
 */

public class Request extends ProMapperDataObject implements ResourceMeta {
    private static final long serialVersionUID= 1L;
    public Request() {
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


            
    private String sigunguCd = null;
    
    public String getSigunguCd() {
        return sigunguCd;
    }

    public String getSigunguCd(boolean _masked) {
        return StringUtil.nullableStringValueOf(getSigunguCd());
    }
                      
    public void setSigunguCd(String sigunguCd) {
        this.sigunguCd = sigunguCd;
        _setFlag = true;
    }

    public void setSigunguCd(String sigunguCd, boolean _masked) {
        setSigunguCd(sigunguCd);
    }


            
    private String bjdongCd = null;
    
    public String getBjdongCd() {
        return bjdongCd;
    }

    public String getBjdongCd(boolean _masked) {
        return StringUtil.nullableStringValueOf(getBjdongCd());
    }
                      
    public void setBjdongCd(String bjdongCd) {
        this.bjdongCd = bjdongCd;
        _setFlag = true;
    }

    public void setBjdongCd(String bjdongCd, boolean _masked) {
        setBjdongCd(bjdongCd);
    }


            
    private String platGbCd = null;
    
    public String getPlatGbCd() {
        return platGbCd;
    }

    public String getPlatGbCd(boolean _masked) {
        return StringUtil.nullableStringValueOf(getPlatGbCd());
    }
                      
    public void setPlatGbCd(String platGbCd) {
        this.platGbCd = platGbCd;
        _setFlag = true;
    }

    public void setPlatGbCd(String platGbCd, boolean _masked) {
        setPlatGbCd(platGbCd);
    }


            
    private String bun = null;
    
    public String getBun() {
        return bun;
    }

    public String getBun(boolean _masked) {
        return StringUtil.nullableStringValueOf(getBun());
    }
                      
    public void setBun(String bun) {
        this.bun = bun;
        _setFlag = true;
    }

    public void setBun(String bun, boolean _masked) {
        setBun(bun);
    }


            
    private String ji = null;
    
    public String getJi() {
        return ji;
    }

    public String getJi(boolean _masked) {
        return StringUtil.nullableStringValueOf(getJi());
    }
                      
    public void setJi(String ji) {
        this.ji = ji;
        _setFlag = true;
    }

    public void setJi(String ji, boolean _masked) {
        setJi(ji);
    }


            
    private String naRoadCd = null;
    
    public String getNaRoadCd() {
        return naRoadCd;
    }

    public String getNaRoadCd(boolean _masked) {
        return StringUtil.nullableStringValueOf(getNaRoadCd());
    }
                      
    public void setNaRoadCd(String naRoadCd) {
        this.naRoadCd = naRoadCd;
        _setFlag = true;
    }

    public void setNaRoadCd(String naRoadCd, boolean _masked) {
        setNaRoadCd(naRoadCd);
    }


            
    private String naBjdongCd = null;
    
    public String getNaBjdongCd() {
        return naBjdongCd;
    }

    public String getNaBjdongCd(boolean _masked) {
        return StringUtil.nullableStringValueOf(getNaBjdongCd());
    }
                      
    public void setNaBjdongCd(String naBjdongCd) {
        this.naBjdongCd = naBjdongCd;
        _setFlag = true;
    }

    public void setNaBjdongCd(String naBjdongCd, boolean _masked) {
        setNaBjdongCd(naBjdongCd);
    }


            
    private String naUgrndCd = null;
    
    public String getNaUgrndCd() {
        return naUgrndCd;
    }

    public String getNaUgrndCd(boolean _masked) {
        return StringUtil.nullableStringValueOf(getNaUgrndCd());
    }
                      
    public void setNaUgrndCd(String naUgrndCd) {
        this.naUgrndCd = naUgrndCd;
        _setFlag = true;
    }

    public void setNaUgrndCd(String naUgrndCd, boolean _masked) {
        setNaUgrndCd(naUgrndCd);
    }


            
    private String naMainBun = null;
    
    public String getNaMainBun() {
        return naMainBun;
    }

    public String getNaMainBun(boolean _masked) {
        return StringUtil.nullableStringValueOf(getNaMainBun());
    }
                      
    public void setNaMainBun(String naMainBun) {
        this.naMainBun = naMainBun;
        _setFlag = true;
    }

    public void setNaMainBun(String naMainBun, boolean _masked) {
        setNaMainBun(naMainBun);
    }


            
    private String naSubBun = null;
    
    public String getNaSubBun() {
        return naSubBun;
    }

    public String getNaSubBun(boolean _masked) {
        return StringUtil.nullableStringValueOf(getNaSubBun());
    }
                      
    public void setNaSubBun(String naSubBun) {
        this.naSubBun = naSubBun;
        _setFlag = true;
    }

    public void setNaSubBun(String naSubBun, boolean _masked) {
        setNaSubBun(naSubBun);
    }


            
    public Object clone() {
        Request copyObj = new Request();
        clone(copyObj);
        return copyObj;
    }
    public void clone(proframe.dto.DataObject __request) {
        Request _request = (Request) __request;
        _request.setIfid(ifid);
        _request.setRequestDate(requestDate);
        _request.setRequestNo(requestNo);
        _request.setSystemId(systemId);
        _request.setRegstrGbCd(regstrGbCd);
        _request.setSigunguCd(sigunguCd);
        _request.setBjdongCd(bjdongCd);
        _request.setPlatGbCd(platGbCd);
        _request.setBun(bun);
        _request.setJi(ji);
        _request.setNaRoadCd(naRoadCd);
        _request.setNaBjdongCd(naBjdongCd);
        _request.setNaUgrndCd(naUgrndCd);
        _request.setNaMainBun(naMainBun);
        _request.setNaSubBun(naSubBun);
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
            buffer.append("regstrGbCd : ").append(regstrGbCd).append("\n");
            buffer.append("sigunguCd : ").append(sigunguCd).append("\n");
            buffer.append("bjdongCd : ").append(bjdongCd).append("\n");
            buffer.append("platGbCd : ").append(platGbCd).append("\n");
            buffer.append("bun : ").append(bun).append("\n");
            buffer.append("ji : ").append(ji).append("\n");
            buffer.append("naRoadCd : ").append(naRoadCd).append("\n");
            buffer.append("naBjdongCd : ").append(naBjdongCd).append("\n");
            buffer.append("naUgrndCd : ").append(naUgrndCd).append("\n");
            buffer.append("naMainBun : ").append(naMainBun).append("\n");
            buffer.append("naSubBun : ").append(naSubBun).append("\n");
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
            buffer.append("regstrGbCd : ").append(regstrGbCd).append("\n");
        }
        if(buffer.length() < limit) {
            buffer.append("sigunguCd : ").append(sigunguCd).append("\n");
        }
        if(buffer.length() < limit) {
            buffer.append("bjdongCd : ").append(bjdongCd).append("\n");
        }
        if(buffer.length() < limit) {
            buffer.append("platGbCd : ").append(platGbCd).append("\n");
        }
        if(buffer.length() < limit) {
            buffer.append("bun : ").append(bun).append("\n");
        }
        if(buffer.length() < limit) {
            buffer.append("ji : ").append(ji).append("\n");
        }
        if(buffer.length() < limit) {
            buffer.append("naRoadCd : ").append(naRoadCd).append("\n");
        }
        if(buffer.length() < limit) {
            buffer.append("naBjdongCd : ").append(naBjdongCd).append("\n");
        }
        if(buffer.length() < limit) {
            buffer.append("naUgrndCd : ").append(naUgrndCd).append("\n");
        }
        if(buffer.length() < limit) {
            buffer.append("naMainBun : ").append(naMainBun).append("\n");
        }
        if(buffer.length() < limit) {
            buffer.append("naSubBun : ").append(naSubBun).append("\n");
        }
    }    
    private static final Map fieldPropertyMap = null;
    
/*    static {
        parentfieldPropertyMap = ProMapperDataObject.getFieldPropertyMapByStatic();
        fieldPropertyMap = new java.util.LinkedHashMap( parentfieldPropertyMap.size() + 15);
        fieldPropertyMap.putAll( parentfieldPropertyMap );

        fieldPropertyMap.put("ifid"
                            , FieldPropertyFactory.getFieldProperty( FieldProperty.TYPE_ABSTRACT_STRING, -1, null, null));
        fieldPropertyMap.put("requestDate"
                            , FieldPropertyFactory.getFieldProperty( FieldProperty.TYPE_ABSTRACT_STRING, -1, null, null));
        fieldPropertyMap.put("requestNo"
                            , FieldPropertyFactory.getFieldProperty( FieldProperty.TYPE_ABSTRACT_STRING, -1, null, null));
        fieldPropertyMap.put("systemId"
                            , FieldPropertyFactory.getFieldProperty( FieldProperty.TYPE_ABSTRACT_STRING, -1, null, null));
        fieldPropertyMap.put("regstrGbCd"
                            , FieldPropertyFactory.getFieldProperty( FieldProperty.TYPE_ABSTRACT_STRING, -1, null, null));
        fieldPropertyMap.put("sigunguCd"
                            , FieldPropertyFactory.getFieldProperty( FieldProperty.TYPE_ABSTRACT_STRING, -1, null, null));
        fieldPropertyMap.put("bjdongCd"
                            , FieldPropertyFactory.getFieldProperty( FieldProperty.TYPE_ABSTRACT_STRING, -1, null, null));
        fieldPropertyMap.put("platGbCd"
                            , FieldPropertyFactory.getFieldProperty( FieldProperty.TYPE_ABSTRACT_STRING, -1, null, null));
        fieldPropertyMap.put("bun"
                            , FieldPropertyFactory.getFieldProperty( FieldProperty.TYPE_ABSTRACT_STRING, -1, null, null));
        fieldPropertyMap.put("ji"
                            , FieldPropertyFactory.getFieldProperty( FieldProperty.TYPE_ABSTRACT_STRING, -1, null, null));
        fieldPropertyMap.put("naRoadCd"
                            , FieldPropertyFactory.getFieldProperty( FieldProperty.TYPE_ABSTRACT_STRING, -1, null, null));
        fieldPropertyMap.put("naBjdongCd"
                            , FieldPropertyFactory.getFieldProperty( FieldProperty.TYPE_ABSTRACT_STRING, -1, null, null));
        fieldPropertyMap.put("naUgrndCd"
                            , FieldPropertyFactory.getFieldProperty( FieldProperty.TYPE_ABSTRACT_STRING, -1, null, null));
        fieldPropertyMap.put("naMainBun"
                            , FieldPropertyFactory.getFieldProperty( FieldProperty.TYPE_ABSTRACT_STRING, -1, null, null));
        fieldPropertyMap.put("naSubBun"
                            , FieldPropertyFactory.getFieldProperty( FieldProperty.TYPE_ABSTRACT_STRING, -1, null, null));
    }*/
    
    public Map getFieldPropertyMap() {
        return fieldPropertyMap;
    }
    
    public static Map getFieldPropertyMapByStatic() {
        return fieldPropertyMap;
    }
    private static final List<String> fieldNameList = new ArrayList<String>(15);
    
    static {        
        fieldNameList.add("ifid");
        fieldNameList.add("requestDate");
        fieldNameList.add("requestNo");
        fieldNameList.add("systemId");
        fieldNameList.add("regstrGbCd");
        fieldNameList.add("sigunguCd");
        fieldNameList.add("bjdongCd");
        fieldNameList.add("platGbCd");
        fieldNameList.add("bun");
        fieldNameList.add("ji");
        fieldNameList.add("naRoadCd");
        fieldNameList.add("naBjdongCd");
        fieldNameList.add("naUgrndCd");
        fieldNameList.add("naMainBun");
        fieldNameList.add("naSubBun");
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
            case -1558956711 : return getRegstrGbCd();
            case 1285605401 : return getSigunguCd();
            case 1551634765 : return getBjdongCd();
            case 1873746539 : return getPlatGbCd();
            case 97915 : return getBun();
            case 3391 : return getJi();
            case 1077208884 : return getNaRoadCd();
            case -2049761248 : return getNaBjdongCd();
            case 1483243428 : return getNaUgrndCd();
            case -1501936433 : return getNaMainBun();
            case 1111377838 : return getNaSubBun();
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
            case -1558956711 : setRegstrGbCd((String)arg);break;
            case 1285605401 : setSigunguCd((String)arg);break;
            case 1551634765 : setBjdongCd((String)arg);break;
            case 1873746539 : setPlatGbCd((String)arg);break;
            case 97915 : setBun((String)arg);break;
            case 3391 : setJi((String)arg);break;
            case 1077208884 : setNaRoadCd((String)arg);break;
            case -2049761248 : setNaBjdongCd((String)arg);break;
            case 1483243428 : setNaUgrndCd((String)arg);break;
            case -1501936433 : setNaMainBun((String)arg);break;
            case 1111377838 : setNaSubBun((String)arg);break;
            default : return;
        }
    }
    public boolean isEmptyDataObjectMethod(){ 
        if (ifid != null) return false;
        if (requestDate != null) return false;
        if (requestNo != null) return false;
        if (systemId != null) return false;
        if (regstrGbCd != null) return false;
        if (sigunguCd != null) return false;
        if (bjdongCd != null) return false;
        if (platGbCd != null) return false;
        if (bun != null) return false;
        if (ji != null) return false;
        if (naRoadCd != null) return false;
        if (naBjdongCd != null) return false;
        if (naUgrndCd != null) return false;
        if (naMainBun != null) return false;
        if (naSubBun != null) return false;

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
            return "request";
        } else if (input.equalsIgnoreCase(META_VERSION_NO)){
            return null;
        } else if (input.equalsIgnoreCase(META_LOGICAL_NAME)){
            return "request";
        } else if (input.equalsIgnoreCase(META_RESOURCE_ID)){
            return "hwgi.o28.mem.txGrp_1000.tx_220:request.umsg";
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

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
 * @file              hwgi.f54.BKNIA_BAT_RES.java
 * @filetype          java source file
 * @brief            
 * @version           1.0
 * @history
 * 성 명              일 자                     근 거 자 료                      변 경 내 용
 * -----------        --------                  --------------                   --------------------------    
 * AnyLink :       Aug 16, 2023                AnyLink 개발 :                신규 작성
 * 
 */

public class BKNIA_BAT_RES extends ProMapperDataObject implements ResourceMeta {
    private static final long serialVersionUID= 1L;
    public BKNIA_BAT_RES() {
            super();
    }
    private boolean _setFlag = false;
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


            
    private String FILE_PATH = null;
    
    public String getFILE_PATH() {
        return FILE_PATH;
    }

    public String getFILE_PATH(boolean _masked) {
        return StringUtil.nullableStringValueOf(getFILE_PATH());
    }
                      
    public void setFILE_PATH(String FILE_PATH) {
        this.FILE_PATH = FILE_PATH;
        _setFlag = true;
    }

    public void setFILE_PATH(String FILE_PATH, boolean _masked) {
        setFILE_PATH(FILE_PATH);
    }


            
    private String SUCCESS_FILE_PATH = null;
    
    public String getSUCCESS_FILE_PATH() {
        return SUCCESS_FILE_PATH;
    }

    public String getSUCCESS_FILE_PATH(boolean _masked) {
        return StringUtil.nullableStringValueOf(getSUCCESS_FILE_PATH());
    }
                      
    public void setSUCCESS_FILE_PATH(String SUCCESS_FILE_PATH) {
        this.SUCCESS_FILE_PATH = SUCCESS_FILE_PATH;
        _setFlag = true;
    }

    public void setSUCCESS_FILE_PATH(String SUCCESS_FILE_PATH, boolean _masked) {
        setSUCCESS_FILE_PATH(SUCCESS_FILE_PATH);
    }


            
    private String FAILURE_FILE_PATH = null;
    
    public String getFAILURE_FILE_PATH() {
        return FAILURE_FILE_PATH;
    }

    public String getFAILURE_FILE_PATH(boolean _masked) {
        return StringUtil.nullableStringValueOf(getFAILURE_FILE_PATH());
    }
                      
    public void setFAILURE_FILE_PATH(String FAILURE_FILE_PATH) {
        this.FAILURE_FILE_PATH = FAILURE_FILE_PATH;
        _setFlag = true;
    }

    public void setFAILURE_FILE_PATH(String FAILURE_FILE_PATH, boolean _masked) {
        setFAILURE_FILE_PATH(FAILURE_FILE_PATH);
    }


            
    private String FILE_NAME = null;
    
    public String getFILE_NAME() {
        return FILE_NAME;
    }

    public String getFILE_NAME(boolean _masked) {
        return StringUtil.nullableStringValueOf(getFILE_NAME());
    }
                      
    public void setFILE_NAME(String FILE_NAME) {
        this.FILE_NAME = FILE_NAME;
        _setFlag = true;
    }

    public void setFILE_NAME(String FILE_NAME, boolean _masked) {
        setFILE_NAME(FILE_NAME);
    }


            
    private String TRANSACTION_CODE = null;
    
    public String getTRANSACTION_CODE() {
        return TRANSACTION_CODE;
    }

    public String getTRANSACTION_CODE(boolean _masked) {
        return StringUtil.nullableStringValueOf(getTRANSACTION_CODE());
    }
                      
    public void setTRANSACTION_CODE(String TRANSACTION_CODE) {
        this.TRANSACTION_CODE = TRANSACTION_CODE;
        _setFlag = true;
    }

    public void setTRANSACTION_CODE(String TRANSACTION_CODE, boolean _masked) {
        setTRANSACTION_CODE(TRANSACTION_CODE);
    }


            
    private String SYSTEM_ID = null;
    
    public String getSYSTEM_ID() {
        return SYSTEM_ID;
    }

    public String getSYSTEM_ID(boolean _masked) {
        return StringUtil.nullableStringValueOf(getSYSTEM_ID());
    }
                      
    public void setSYSTEM_ID(String SYSTEM_ID) {
        this.SYSTEM_ID = SYSTEM_ID;
        _setFlag = true;
    }

    public void setSYSTEM_ID(String SYSTEM_ID, boolean _masked) {
        setSYSTEM_ID(SYSTEM_ID);
    }


            
    private String BANK_CODE = null;
    
    public String getBANK_CODE() {
        return BANK_CODE;
    }

    public String getBANK_CODE(boolean _masked) {
        return StringUtil.nullableStringValueOf(getBANK_CODE());
    }
                      
    public void setBANK_CODE(String BANK_CODE) {
        this.BANK_CODE = BANK_CODE;
        _setFlag = true;
    }

    public void setBANK_CODE(String BANK_CODE, boolean _masked) {
        setBANK_CODE(BANK_CODE);
    }


            
    private String BANK_NAME = null;
    
    public String getBANK_NAME() {
        return BANK_NAME;
    }

    public String getBANK_NAME(boolean _masked) {
        return StringUtil.nullableStringValueOf(getBANK_NAME());
    }
                      
    public void setBANK_NAME(String BANK_NAME) {
        this.BANK_NAME = BANK_NAME;
        _setFlag = true;
    }

    public void setBANK_NAME(String BANK_NAME, boolean _masked) {
        setBANK_NAME(BANK_NAME);
    }


            
    private String SEND_USERID = null;
    
    public String getSEND_USERID() {
        return SEND_USERID;
    }

    public String getSEND_USERID(boolean _masked) {
        return StringUtil.nullableStringValueOf(getSEND_USERID());
    }
                      
    public void setSEND_USERID(String SEND_USERID) {
        this.SEND_USERID = SEND_USERID;
        _setFlag = true;
    }

    public void setSEND_USERID(String SEND_USERID, boolean _masked) {
        setSEND_USERID(SEND_USERID);
    }


            
    private String SEND_USER_PSWD = null;
    
    public String getSEND_USER_PSWD() {
        return SEND_USER_PSWD;
    }

    public String getSEND_USER_PSWD(boolean _masked) {
        return StringUtil.nullableStringValueOf(getSEND_USER_PSWD());
    }
                      
    public void setSEND_USER_PSWD(String SEND_USER_PSWD) {
        this.SEND_USER_PSWD = SEND_USER_PSWD;
        _setFlag = true;
    }

    public void setSEND_USER_PSWD(String SEND_USER_PSWD, boolean _masked) {
        setSEND_USER_PSWD(SEND_USER_PSWD);
    }


            
    private int HEADER_SIZE;
    
    public int getHEADER_SIZE() {
        return HEADER_SIZE;
    }

    public String getHEADER_SIZE(boolean _masked) {
        return String.valueOf(getHEADER_SIZE());
    }
                      
    public void setHEADER_SIZE(int HEADER_SIZE) {
        this.HEADER_SIZE = HEADER_SIZE;
        _setFlag = true;
    }

    public void setHEADER_SIZE(int HEADER_SIZE, boolean _masked) {
        setHEADER_SIZE(HEADER_SIZE);
    }


            
    private int PACKET_SIZE;
    
    public int getPACKET_SIZE() {
        return PACKET_SIZE;
    }

    public String getPACKET_SIZE(boolean _masked) {
        return String.valueOf(getPACKET_SIZE());
    }
                      
    public void setPACKET_SIZE(int PACKET_SIZE) {
        this.PACKET_SIZE = PACKET_SIZE;
        _setFlag = true;
    }

    public void setPACKET_SIZE(int PACKET_SIZE, boolean _masked) {
        setPACKET_SIZE(PACKET_SIZE);
    }


            
    private int SKIP_COUNT;
    
    public int getSKIP_COUNT() {
        return SKIP_COUNT;
    }

    public String getSKIP_COUNT(boolean _masked) {
        return String.valueOf(getSKIP_COUNT());
    }
                      
    public void setSKIP_COUNT(int SKIP_COUNT) {
        this.SKIP_COUNT = SKIP_COUNT;
        _setFlag = true;
    }

    public void setSKIP_COUNT(int SKIP_COUNT, boolean _masked) {
        setSKIP_COUNT(SKIP_COUNT);
    }


            
    private int RECORD_SIZE;
    
    public int getRECORD_SIZE() {
        return RECORD_SIZE;
    }

    public String getRECORD_SIZE(boolean _masked) {
        return String.valueOf(getRECORD_SIZE());
    }
                      
    public void setRECORD_SIZE(int RECORD_SIZE) {
        this.RECORD_SIZE = RECORD_SIZE;
        _setFlag = true;
    }

    public void setRECORD_SIZE(int RECORD_SIZE, boolean _masked) {
        setRECORD_SIZE(RECORD_SIZE);
    }


            
    private int RECORD_COUNT;
    
    public int getRECORD_COUNT() {
        return RECORD_COUNT;
    }

    public String getRECORD_COUNT(boolean _masked) {
        return String.valueOf(getRECORD_COUNT());
    }
                      
    public void setRECORD_COUNT(int RECORD_COUNT) {
        this.RECORD_COUNT = RECORD_COUNT;
        _setFlag = true;
    }

    public void setRECORD_COUNT(int RECORD_COUNT, boolean _masked) {
        setRECORD_COUNT(RECORD_COUNT);
    }


            
    private String LINEFEED = null;
    
    public String getLINEFEED() {
        return LINEFEED;
    }

    public String getLINEFEED(boolean _masked) {
        return StringUtil.nullableStringValueOf(getLINEFEED());
    }
                      
    public void setLINEFEED(String LINEFEED) {
        this.LINEFEED = LINEFEED;
        _setFlag = true;
    }

    public void setLINEFEED(String LINEFEED, boolean _masked) {
        setLINEFEED(LINEFEED);
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


            
    private String DIFF_DATE = null;
    
    public String getDIFF_DATE() {
        return DIFF_DATE;
    }

    public String getDIFF_DATE(boolean _masked) {
        return StringUtil.nullableStringValueOf(getDIFF_DATE());
    }
                      
    public void setDIFF_DATE(String DIFF_DATE) {
        this.DIFF_DATE = DIFF_DATE;
        _setFlag = true;
    }

    public void setDIFF_DATE(String DIFF_DATE, boolean _masked) {
        setDIFF_DATE(DIFF_DATE);
    }


            
    private String DUP_RECV_FLAG = null;
    
    public String getDUP_RECV_FLAG() {
        return DUP_RECV_FLAG;
    }

    public String getDUP_RECV_FLAG(boolean _masked) {
        return StringUtil.nullableStringValueOf(getDUP_RECV_FLAG());
    }
                      
    public void setDUP_RECV_FLAG(String DUP_RECV_FLAG) {
        this.DUP_RECV_FLAG = DUP_RECV_FLAG;
        _setFlag = true;
    }

    public void setDUP_RECV_FLAG(String DUP_RECV_FLAG, boolean _masked) {
        setDUP_RECV_FLAG(DUP_RECV_FLAG);
    }


            
    private String BIZ_CODE = null;
    
    public String getBIZ_CODE() {
        return BIZ_CODE;
    }

    public String getBIZ_CODE(boolean _masked) {
        return StringUtil.nullableStringValueOf(getBIZ_CODE());
    }
                      
    public void setBIZ_CODE(String BIZ_CODE) {
        this.BIZ_CODE = BIZ_CODE;
        _setFlag = true;
    }

    public void setBIZ_CODE(String BIZ_CODE, boolean _masked) {
        setBIZ_CODE(BIZ_CODE);
    }


            
    private String AFTER_ACTION_ID = null;
    
    public String getAFTER_ACTION_ID() {
        return AFTER_ACTION_ID;
    }

    public String getAFTER_ACTION_ID(boolean _masked) {
        return StringUtil.nullableStringValueOf(getAFTER_ACTION_ID());
    }
                      
    public void setAFTER_ACTION_ID(String AFTER_ACTION_ID) {
        this.AFTER_ACTION_ID = AFTER_ACTION_ID;
        _setFlag = true;
    }

    public void setAFTER_ACTION_ID(String AFTER_ACTION_ID, boolean _masked) {
        setAFTER_ACTION_ID(AFTER_ACTION_ID);
    }


            
    private int FILE_COUNT;
    
    public int getFILE_COUNT() {
        return FILE_COUNT;
    }

    public String getFILE_COUNT(boolean _masked) {
        return String.valueOf(getFILE_COUNT());
    }
                      
    public void setFILE_COUNT(int FILE_COUNT) {
        this.FILE_COUNT = FILE_COUNT;
        _setFlag = true;
    }

    public void setFILE_COUNT(int FILE_COUNT, boolean _masked) {
        setFILE_COUNT(FILE_COUNT);
    }


            
    public Object clone() {
        BKNIA_BAT_RES copyObj = new BKNIA_BAT_RES();
        clone(copyObj);
        return copyObj;
    }
    public void clone(proframe.dto.DataObject __bKNIA_BAT_RES) {
        BKNIA_BAT_RES _bKNIA_BAT_RES = (BKNIA_BAT_RES) __bKNIA_BAT_RES;
        _bKNIA_BAT_RES.setFILE_CODE(FILE_CODE);
        _bKNIA_BAT_RES.setFILE_PATH(FILE_PATH);
        _bKNIA_BAT_RES.setSUCCESS_FILE_PATH(SUCCESS_FILE_PATH);
        _bKNIA_BAT_RES.setFAILURE_FILE_PATH(FAILURE_FILE_PATH);
        _bKNIA_BAT_RES.setFILE_NAME(FILE_NAME);
        _bKNIA_BAT_RES.setTRANSACTION_CODE(TRANSACTION_CODE);
        _bKNIA_BAT_RES.setSYSTEM_ID(SYSTEM_ID);
        _bKNIA_BAT_RES.setBANK_CODE(BANK_CODE);
        _bKNIA_BAT_RES.setBANK_NAME(BANK_NAME);
        _bKNIA_BAT_RES.setSEND_USERID(SEND_USERID);
        _bKNIA_BAT_RES.setSEND_USER_PSWD(SEND_USER_PSWD);
        _bKNIA_BAT_RES.setHEADER_SIZE(HEADER_SIZE);
        _bKNIA_BAT_RES.setPACKET_SIZE(PACKET_SIZE);
        _bKNIA_BAT_RES.setSKIP_COUNT(SKIP_COUNT);
        _bKNIA_BAT_RES.setRECORD_SIZE(RECORD_SIZE);
        _bKNIA_BAT_RES.setRECORD_COUNT(RECORD_COUNT);
        _bKNIA_BAT_RES.setLINEFEED(LINEFEED);
        _bKNIA_BAT_RES.setTX_DATE(TX_DATE);
        _bKNIA_BAT_RES.setDIFF_DATE(DIFF_DATE);
        _bKNIA_BAT_RES.setDUP_RECV_FLAG(DUP_RECV_FLAG);
        _bKNIA_BAT_RES.setBIZ_CODE(BIZ_CODE);
        _bKNIA_BAT_RES.setAFTER_ACTION_ID(AFTER_ACTION_ID);
        _bKNIA_BAT_RES.setFILE_COUNT(FILE_COUNT);
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
            buffer.append("FILE_CODE : ").append(FILE_CODE).append("\n");
            buffer.append("FILE_PATH : ").append(FILE_PATH).append("\n");
            buffer.append("SUCCESS_FILE_PATH : ").append(SUCCESS_FILE_PATH).append("\n");
            buffer.append("FAILURE_FILE_PATH : ").append(FAILURE_FILE_PATH).append("\n");
            buffer.append("FILE_NAME : ").append(FILE_NAME).append("\n");
            buffer.append("TRANSACTION_CODE : ").append(TRANSACTION_CODE).append("\n");
            buffer.append("SYSTEM_ID : ").append(SYSTEM_ID).append("\n");
            buffer.append("BANK_CODE : ").append(BANK_CODE).append("\n");
            buffer.append("BANK_NAME : ").append(BANK_NAME).append("\n");
            buffer.append("SEND_USERID : ").append(SEND_USERID).append("\n");
            buffer.append("SEND_USER_PSWD : ").append(SEND_USER_PSWD).append("\n");
            buffer.append("HEADER_SIZE : ").append(HEADER_SIZE).append("\n");
            buffer.append("PACKET_SIZE : ").append(PACKET_SIZE).append("\n");
            buffer.append("SKIP_COUNT : ").append(SKIP_COUNT).append("\n");
            buffer.append("RECORD_SIZE : ").append(RECORD_SIZE).append("\n");
            buffer.append("RECORD_COUNT : ").append(RECORD_COUNT).append("\n");
            buffer.append("LINEFEED : ").append(LINEFEED).append("\n");
            buffer.append("TX_DATE : ").append(TX_DATE).append("\n");
            buffer.append("DIFF_DATE : ").append(DIFF_DATE).append("\n");
            buffer.append("DUP_RECV_FLAG : ").append(DUP_RECV_FLAG).append("\n");
            buffer.append("BIZ_CODE : ").append(BIZ_CODE).append("\n");
            buffer.append("AFTER_ACTION_ID : ").append(AFTER_ACTION_ID).append("\n");
            buffer.append("FILE_COUNT : ").append(FILE_COUNT).append("\n");
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
            buffer.append("FILE_CODE : ").append(FILE_CODE).append("\n");
        }
        if(buffer.length() < limit) {
            buffer.append("FILE_PATH : ").append(FILE_PATH).append("\n");
        }
        if(buffer.length() < limit) {
            buffer.append("SUCCESS_FILE_PATH : ").append(SUCCESS_FILE_PATH).append("\n");
        }
        if(buffer.length() < limit) {
            buffer.append("FAILURE_FILE_PATH : ").append(FAILURE_FILE_PATH).append("\n");
        }
        if(buffer.length() < limit) {
            buffer.append("FILE_NAME : ").append(FILE_NAME).append("\n");
        }
        if(buffer.length() < limit) {
            buffer.append("TRANSACTION_CODE : ").append(TRANSACTION_CODE).append("\n");
        }
        if(buffer.length() < limit) {
            buffer.append("SYSTEM_ID : ").append(SYSTEM_ID).append("\n");
        }
        if(buffer.length() < limit) {
            buffer.append("BANK_CODE : ").append(BANK_CODE).append("\n");
        }
        if(buffer.length() < limit) {
            buffer.append("BANK_NAME : ").append(BANK_NAME).append("\n");
        }
        if(buffer.length() < limit) {
            buffer.append("SEND_USERID : ").append(SEND_USERID).append("\n");
        }
        if(buffer.length() < limit) {
            buffer.append("SEND_USER_PSWD : ").append(SEND_USER_PSWD).append("\n");
        }
        if(buffer.length() < limit) {
            buffer.append("HEADER_SIZE : ").append(HEADER_SIZE).append("\n");
        }
        if(buffer.length() < limit) {
            buffer.append("PACKET_SIZE : ").append(PACKET_SIZE).append("\n");
        }
        if(buffer.length() < limit) {
            buffer.append("SKIP_COUNT : ").append(SKIP_COUNT).append("\n");
        }
        if(buffer.length() < limit) {
            buffer.append("RECORD_SIZE : ").append(RECORD_SIZE).append("\n");
        }
        if(buffer.length() < limit) {
            buffer.append("RECORD_COUNT : ").append(RECORD_COUNT).append("\n");
        }
        if(buffer.length() < limit) {
            buffer.append("LINEFEED : ").append(LINEFEED).append("\n");
        }
        if(buffer.length() < limit) {
            buffer.append("TX_DATE : ").append(TX_DATE).append("\n");
        }
        if(buffer.length() < limit) {
            buffer.append("DIFF_DATE : ").append(DIFF_DATE).append("\n");
        }
        if(buffer.length() < limit) {
            buffer.append("DUP_RECV_FLAG : ").append(DUP_RECV_FLAG).append("\n");
        }
        if(buffer.length() < limit) {
            buffer.append("BIZ_CODE : ").append(BIZ_CODE).append("\n");
        }
        if(buffer.length() < limit) {
            buffer.append("AFTER_ACTION_ID : ").append(AFTER_ACTION_ID).append("\n");
        }
        if(buffer.length() < limit) {
            buffer.append("FILE_COUNT : ").append(FILE_COUNT).append("\n");
        }
    }    
    private static final Map fieldPropertyMap = null;
    
/*    static {
        parentfieldPropertyMap = ProMapperDataObject.getFieldPropertyMapByStatic();
        fieldPropertyMap = new java.util.LinkedHashMap( parentfieldPropertyMap.size() + 23);
        fieldPropertyMap.putAll( parentfieldPropertyMap );

        fieldPropertyMap.put("FILE_CODE"
                            , FieldPropertyFactory.getFieldProperty( FieldProperty.TYPE_ABSTRACT_STRING, -1, null, null));
        fieldPropertyMap.put("FILE_PATH"
                            , FieldPropertyFactory.getFieldProperty( FieldProperty.TYPE_ABSTRACT_STRING, -1, null, null));
        fieldPropertyMap.put("SUCCESS_FILE_PATH"
                            , FieldPropertyFactory.getFieldProperty( FieldProperty.TYPE_ABSTRACT_STRING, -1, null, null));
        fieldPropertyMap.put("FAILURE_FILE_PATH"
                            , FieldPropertyFactory.getFieldProperty( FieldProperty.TYPE_ABSTRACT_STRING, -1, null, null));
        fieldPropertyMap.put("FILE_NAME"
                            , FieldPropertyFactory.getFieldProperty( FieldProperty.TYPE_ABSTRACT_STRING, -1, null, null));
        fieldPropertyMap.put("TRANSACTION_CODE"
                            , FieldPropertyFactory.getFieldProperty( FieldProperty.TYPE_ABSTRACT_STRING, -1, null, null));
        fieldPropertyMap.put("SYSTEM_ID"
                            , FieldPropertyFactory.getFieldProperty( FieldProperty.TYPE_ABSTRACT_STRING, -1, null, null));
        fieldPropertyMap.put("BANK_CODE"
                            , FieldPropertyFactory.getFieldProperty( FieldProperty.TYPE_ABSTRACT_STRING, -1, null, null));
        fieldPropertyMap.put("BANK_NAME"
                            , FieldPropertyFactory.getFieldProperty( FieldProperty.TYPE_ABSTRACT_STRING, -1, null, null));
        fieldPropertyMap.put("SEND_USERID"
                            , FieldPropertyFactory.getFieldProperty( FieldProperty.TYPE_ABSTRACT_STRING, -1, null, null));
        fieldPropertyMap.put("SEND_USER_PSWD"
                            , FieldPropertyFactory.getFieldProperty( FieldProperty.TYPE_ABSTRACT_STRING, -1, null, null));
        fieldPropertyMap.put("HEADER_SIZE"
                            , FieldPropertyFactory.getFieldProperty( FieldProperty.TYPE_PRIMITIVE_INT, -1, null, null));
        fieldPropertyMap.put("PACKET_SIZE"
                            , FieldPropertyFactory.getFieldProperty( FieldProperty.TYPE_PRIMITIVE_INT, -1, null, null));
        fieldPropertyMap.put("SKIP_COUNT"
                            , FieldPropertyFactory.getFieldProperty( FieldProperty.TYPE_PRIMITIVE_INT, -1, null, null));
        fieldPropertyMap.put("RECORD_SIZE"
                            , FieldPropertyFactory.getFieldProperty( FieldProperty.TYPE_PRIMITIVE_INT, -1, null, null));
        fieldPropertyMap.put("RECORD_COUNT"
                            , FieldPropertyFactory.getFieldProperty( FieldProperty.TYPE_PRIMITIVE_INT, -1, null, null));
        fieldPropertyMap.put("LINEFEED"
                            , FieldPropertyFactory.getFieldProperty( FieldProperty.TYPE_ABSTRACT_STRING, -1, null, null));
        fieldPropertyMap.put("TX_DATE"
                            , FieldPropertyFactory.getFieldProperty( FieldProperty.TYPE_ABSTRACT_STRING, -1, null, null));
        fieldPropertyMap.put("DIFF_DATE"
                            , FieldPropertyFactory.getFieldProperty( FieldProperty.TYPE_ABSTRACT_STRING, -1, null, null));
        fieldPropertyMap.put("DUP_RECV_FLAG"
                            , FieldPropertyFactory.getFieldProperty( FieldProperty.TYPE_ABSTRACT_STRING, -1, null, null));
        fieldPropertyMap.put("BIZ_CODE"
                            , FieldPropertyFactory.getFieldProperty( FieldProperty.TYPE_ABSTRACT_STRING, -1, null, null));
        fieldPropertyMap.put("AFTER_ACTION_ID"
                            , FieldPropertyFactory.getFieldProperty( FieldProperty.TYPE_ABSTRACT_STRING, -1, null, null));
        fieldPropertyMap.put("FILE_COUNT"
                            , FieldPropertyFactory.getFieldProperty( FieldProperty.TYPE_PRIMITIVE_INT, -1, null, null));
    }*/
    
    public Map getFieldPropertyMap() {
        return fieldPropertyMap;
    }
    
    public static Map getFieldPropertyMapByStatic() {
        return fieldPropertyMap;
    }
    private static final List<String> fieldNameList = new ArrayList<String>(23);
    
    static {        
        fieldNameList.add("FILE_CODE");
        fieldNameList.add("FILE_PATH");
        fieldNameList.add("SUCCESS_FILE_PATH");
        fieldNameList.add("FAILURE_FILE_PATH");
        fieldNameList.add("FILE_NAME");
        fieldNameList.add("TRANSACTION_CODE");
        fieldNameList.add("SYSTEM_ID");
        fieldNameList.add("BANK_CODE");
        fieldNameList.add("BANK_NAME");
        fieldNameList.add("SEND_USERID");
        fieldNameList.add("SEND_USER_PSWD");
        fieldNameList.add("HEADER_SIZE");
        fieldNameList.add("PACKET_SIZE");
        fieldNameList.add("SKIP_COUNT");
        fieldNameList.add("RECORD_SIZE");
        fieldNameList.add("RECORD_COUNT");
        fieldNameList.add("LINEFEED");
        fieldNameList.add("TX_DATE");
        fieldNameList.add("DIFF_DATE");
        fieldNameList.add("DUP_RECV_FLAG");
        fieldNameList.add("BIZ_CODE");
        fieldNameList.add("AFTER_ACTION_ID");
        fieldNameList.add("FILE_COUNT");
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
            case 1499365072 : return getFILE_CODE();
            case 1499739400 : return getFILE_PATH();
            case -1129399380 : return getSUCCESS_FILE_PATH();
            case -862539661 : return getFAILURE_FILE_PATH();
            case 1499679598 : return getFILE_NAME();
            case 812547790 : return getTRANSACTION_CODE();
            case -379214549 : return getSYSTEM_ID();
            case 1028449808 : return getBANK_CODE();
            case 1028764334 : return getBANK_NAME();
            case 432624317 : return getSEND_USERID();
            case -865070067 : return getSEND_USER_PSWD();
            case -928331149 : return Integer.valueOf(getHEADER_SIZE());
            case -1580898984 : return Integer.valueOf(getPACKET_SIZE());
            case 1895185967 : return Integer.valueOf(getSKIP_COUNT());
            case -795034833 : return Integer.valueOf(getRECORD_SIZE());
            case 1109121921 : return Integer.valueOf(getRECORD_COUNT());
            case 1971809170 : return getLINEFEED();
            case -149911415 : return getTX_DATE();
            case -182102104 : return getDIFF_DATE();
            case 92084165 : return getDUP_RECV_FLAG();
            case 2091056569 : return getBIZ_CODE();
            case -207137535 : return getAFTER_ACTION_ID();
            case -764306324 : return Integer.valueOf(getFILE_COUNT());
            default : return null;
        }
    }
    public void set(String fieldName, Object arg) {
        int hashCode = fieldName.hashCode();
        
        switch(hashCode) {
            case 1499365072 : setFILE_CODE((String)arg);break;
            case 1499739400 : setFILE_PATH((String)arg);break;
            case -1129399380 : setSUCCESS_FILE_PATH((String)arg);break;
            case -862539661 : setFAILURE_FILE_PATH((String)arg);break;
            case 1499679598 : setFILE_NAME((String)arg);break;
            case 812547790 : setTRANSACTION_CODE((String)arg);break;
            case -379214549 : setSYSTEM_ID((String)arg);break;
            case 1028449808 : setBANK_CODE((String)arg);break;
            case 1028764334 : setBANK_NAME((String)arg);break;
            case 432624317 : setSEND_USERID((String)arg);break;
            case -865070067 : setSEND_USER_PSWD((String)arg);break;
            case -928331149 : setHEADER_SIZE(((Integer)arg).intValue());break;
            case -1580898984 : setPACKET_SIZE(((Integer)arg).intValue());break;
            case 1895185967 : setSKIP_COUNT(((Integer)arg).intValue());break;
            case -795034833 : setRECORD_SIZE(((Integer)arg).intValue());break;
            case 1109121921 : setRECORD_COUNT(((Integer)arg).intValue());break;
            case 1971809170 : setLINEFEED((String)arg);break;
            case -149911415 : setTX_DATE((String)arg);break;
            case -182102104 : setDIFF_DATE((String)arg);break;
            case 92084165 : setDUP_RECV_FLAG((String)arg);break;
            case 2091056569 : setBIZ_CODE((String)arg);break;
            case -207137535 : setAFTER_ACTION_ID((String)arg);break;
            case -764306324 : setFILE_COUNT(((Integer)arg).intValue());break;
            default : return;
        }
    }
    public boolean isEmptyDataObjectMethod(){ 
        if (FILE_CODE != null) return false;
        if (FILE_PATH != null) return false;
        if (SUCCESS_FILE_PATH != null) return false;
        if (FAILURE_FILE_PATH != null) return false;
        if (FILE_NAME != null) return false;
        if (TRANSACTION_CODE != null) return false;
        if (SYSTEM_ID != null) return false;
        if (BANK_CODE != null) return false;
        if (BANK_NAME != null) return false;
        if (SEND_USERID != null) return false;
        if (SEND_USER_PSWD != null) return false;
        if(true) return false;
        if(true) return false;
        if(true) return false;
        if(true) return false;
        if(true) return false;
        if (LINEFEED != null) return false;
        if (TX_DATE != null) return false;
        if (DIFF_DATE != null) return false;
        if (DUP_RECV_FLAG != null) return false;
        if (BIZ_CODE != null) return false;
        if (AFTER_ACTION_ID != null) return false;
        if(true) return false;

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
            return "BKNIA_BAT_RES";
        } else if (input.equalsIgnoreCase(META_VERSION_NO)){
            return "0";
        } else if (input.equalsIgnoreCase(META_LOGICAL_NAME)){
            return "BKNIA_BAT_RES";
        } else if (input.equalsIgnoreCase(META_RESOURCE_ID)){
            return "hwgi.f54:BKNIA_BAT_RES.umsg";
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

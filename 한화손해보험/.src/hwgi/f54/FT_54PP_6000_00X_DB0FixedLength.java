/*
 * 작성된 날짜: Aug 16, 2023
 * Copyright (c) 2023 TmaxSoft co., Ltd. All rights reserved.
 */
package hwgi.f54;

import com.tmax.promapper.engine.base.ProMapperDataObject;
import proframe.dto.DataObject;
import java.util.logging.Level;
import com.tmax.anylink.logging.Logger;
import com.tmax.promapper.engine.base.MessageFieldProperty;
import com.tmax.promapper.engine.base.MessageFieldType;
import com.tmax.promapper.engine.base.ResourceMeta;
import com.tmax.promapper.engine.base.Message;
import com.tmax.promapper.engine.util.Constants;
import com.tmax.promapper.engine.util.FixedLengthMarshalField;
import com.tmax.promapper.engine.util.FixedLengthMarshalFieldV2;
import com.tmax.promapper.engine.util.FixedLengthUnmarshalField;

import com.tmax.promapper.engine.base.FixedLengthMessage;

/**
 * @file              hwgi.f54.FT_54PP_6000_00X_DB0FixedLength.java
 * @filetype          java source file
 * @brief            
 * @version           1.0
 * @template-version  2014-11-12
 * @history
 * 성 명              일 자                     근 거 자 료                      변 경 내 용
 * -----------        --------                  --------------                   --------------------------    
 * AnyLink :       Aug 16, 2023                AnyLink 개발 :                신규 작성
 * 
 */



public class FT_54PP_6000_00X_DB0FixedLength extends com.tmax.promapper.engine.base.FixedLengthMessage implements ResourceMeta {

    public FT_54PP_6000_00X_DB0FixedLength() {
            super(com.tmax.promapper.engine.util.Constants.EUC_KR);
    }

    public FT_54PP_6000_00X_DB0FixedLength(int conversionType) {
        super(conversionType);
    }

    public FT_54PP_6000_00X_DB0FixedLength(String charsetName) {
        super(charsetName);
    }
    
    public void setMasked(boolean _masked) {
        super.setMasked(_masked);
    }

    /* marshal method */
    public byte [] marshalObject(Object obj) throws Exception {
        FixedLengthMarshalFieldV2 flFld = new FixedLengthMarshalFieldV2();
        hwgi.f54.FT_54PP_6000_00X_DB0 __root = (hwgi.f54.FT_54PP_6000_00X_DB0)obj;

        if(__root == null) {
            marshallNullObject(flFld);
        } else {
            
            /** SendPassword */
            flFld.setStringField(this, __root.getSendPassword(this.masked), 8, Constants.ALIGN_NON, " ", 0, true, false, Constants.ENCODE_CHAR, null);
            
            /** SendUserId */
            flFld.setStringField(this, __root.getSendUserId(this.masked), 20, Constants.ALIGN_NON, " ", 0, true, false, Constants.ENCODE_CHAR, null);
            
            /** SendCnt */
            flFld.setIntegralNumberField(this, __root.getSendCnt(), 4, Constants.ALIGN_NON, " ", 0, true, false, Constants.ENCODE_CHAR, java.nio.ByteOrder.LITTLE_ENDIAN, null);
            
            /** TranDate */
            flFld.setStringField(this, __root.getTranDate(this.masked), 8, Constants.ALIGN_NON, " ", 0, true, false, Constants.ENCODE_CHAR, null);
            
            /** TotSeqNo */
            flFld.setIntegralNumberField(this, __root.getTotSeqNo(), 3, Constants.ALIGN_NON, " ", 0, true, false, Constants.ENCODE_CHAR, java.nio.ByteOrder.BIG_ENDIAN, null);
            
            /** TotBlockNo */
            flFld.setIntegralNumberField(this, __root.getTotBlockNo(), 4, Constants.ALIGN_NON, " ", 0, true, false, Constants.ENCODE_CHAR, java.nio.ByteOrder.BIG_ENDIAN, null);
            
            /** OprCode */
            flFld.setStringField(this, __root.getOprCode(this.masked), 3, Constants.ALIGN_NON, " ", 0, true, false, Constants.ENCODE_CHAR, null);
            
            /** SnrCode */
            flFld.setStringField(this, __root.getSnrCode(this.masked), 1, Constants.ALIGN_NON, " ", 0, true, false, Constants.ENCODE_CHAR, null);
        }
        
        return flFld.getMessage();
    }

        
    private void marshallNullObject(FixedLengthMarshalFieldV2 flFld) throws Exception {
            
            /** SendPassword */

                flFld.padByteArrayField(this, 8, " ");
            
            /** SendUserId */

                flFld.padByteArrayField(this, 20, " ");
            
            /** SendCnt */

                flFld.setLongField(this, 0, 4, Constants.ALIGN_NON, " ", 0, true, false, Constants.ENCODE_CHAR);
            
            /** TranDate */

                flFld.padByteArrayField(this, 8, " ");
            
            /** TotSeqNo */

                flFld.setLongField(this, 0, 3, Constants.ALIGN_NON, " ", 0, true, false, Constants.ENCODE_CHAR);
            
            /** TotBlockNo */

                flFld.setLongField(this, 0, 4, Constants.ALIGN_NON, " ", 0, true, false, Constants.ENCODE_CHAR);
            
            /** OprCode */

                flFld.padByteArrayField(this, 3, " ");
            
            /** SnrCode */

                flFld.padByteArrayField(this, 1, " ");
    }

    /* unmarshal method */
    public Object unmarshalObject(byte[] message, int startOffset) throws Exception{
        hwgi.f54.FT_54PP_6000_00X_DB0 dataObject = new hwgi.f54.FT_54PP_6000_00X_DB0();
        setOffset(unmarshalObject(message, startOffset, dataObject));
            return dataObject;
    }
    
    public int unmarshalObject(byte[] message, int startOffset, Object dataObject) throws Exception {        

        hwgi.f54.FT_54PP_6000_00X_DB0 __root = (hwgi.f54.FT_54PP_6000_00X_DB0)dataObject;
        FixedLengthUnmarshalField flFld = new FixedLengthUnmarshalField(message, startOffset);
        
        set_SnrCode(__root, flFld);
        set_OprCode(__root, flFld);
        set_TotBlockNo(__root, flFld);
        set_TotSeqNo(__root, flFld);
        set_TranDate(__root, flFld);
        set_SendCnt(__root, flFld);
        set_SendUserId(__root, flFld);
        set_SendPassword(__root, flFld);

        setOffset(flFld.getOffset());
        __root.setMessageProperties(fieldPropertyMap);
        return getOffset();
    }

    private void set_SnrCode(hwgi.f54.FT_54PP_6000_00X_DB0 __root, FixedLengthUnmarshalField flFld) throws Exception {
        try {

        /** SnrCode */
        __root.setSnrCode(flFld.getStringField(this, 1, Constants.ALIGN_NON, " ", 0, true, false, Constants.ENCODE_CHAR, Constants.TRIM_NONE), this.masked);
    successFieldCount++;
        } catch(Exception e) {
            StringBuilder esb = new StringBuilder(e.getClass().getName()).append(" [FIELD: SnrCode] ");
            if(e.getMessage() != null)
                esb.append(": ").append(e.getMessage());
            throw new Exception(esb.toString(), e);
        }
    }
    private void set_OprCode(hwgi.f54.FT_54PP_6000_00X_DB0 __root, FixedLengthUnmarshalField flFld) throws Exception {
        try {

        /** OprCode */
        __root.setOprCode(flFld.getStringField(this, 3, Constants.ALIGN_NON, " ", 0, true, false, Constants.ENCODE_CHAR, Constants.TRIM_NONE), this.masked);
    successFieldCount++;
        } catch(Exception e) {
            StringBuilder esb = new StringBuilder(e.getClass().getName()).append(" [FIELD: OprCode] ");
            if(e.getMessage() != null)
                esb.append(": ").append(e.getMessage());
            throw new Exception(esb.toString(), e);
        }
    }
    private void set_TotBlockNo(hwgi.f54.FT_54PP_6000_00X_DB0 __root, FixedLengthUnmarshalField flFld) throws Exception {
        try {

        /** TotBlockNo */
        __root.setTotBlockNo(flFld.getLongField(this, 4, Constants.ALIGN_NON, " ", 0, true, false, Constants.ENCODE_CHAR, Constants.TRIM_NONE));
    successFieldCount++;
        } catch(Exception e) {
            StringBuilder esb = new StringBuilder(e.getClass().getName()).append(" [FIELD: TotBlockNo] ");
            if(e.getMessage() != null)
                esb.append(": ").append(e.getMessage());
            throw new Exception(esb.toString(), e);
        }
    }
    private void set_TotSeqNo(hwgi.f54.FT_54PP_6000_00X_DB0 __root, FixedLengthUnmarshalField flFld) throws Exception {
        try {

        /** TotSeqNo */
        __root.setTotSeqNo(flFld.getLongField(this, 3, Constants.ALIGN_NON, " ", 0, true, false, Constants.ENCODE_CHAR, Constants.TRIM_NONE));
    successFieldCount++;
        } catch(Exception e) {
            StringBuilder esb = new StringBuilder(e.getClass().getName()).append(" [FIELD: TotSeqNo] ");
            if(e.getMessage() != null)
                esb.append(": ").append(e.getMessage());
            throw new Exception(esb.toString(), e);
        }
    }
    private void set_TranDate(hwgi.f54.FT_54PP_6000_00X_DB0 __root, FixedLengthUnmarshalField flFld) throws Exception {
        try {

        /** TranDate */
        __root.setTranDate(flFld.getStringField(this, 8, Constants.ALIGN_NON, " ", 0, true, false, Constants.ENCODE_CHAR, Constants.TRIM_NONE), this.masked);
    successFieldCount++;
        } catch(Exception e) {
            StringBuilder esb = new StringBuilder(e.getClass().getName()).append(" [FIELD: TranDate] ");
            if(e.getMessage() != null)
                esb.append(": ").append(e.getMessage());
            throw new Exception(esb.toString(), e);
        }
    }
    private void set_SendCnt(hwgi.f54.FT_54PP_6000_00X_DB0 __root, FixedLengthUnmarshalField flFld) throws Exception {
        try {

        /** SendCnt */
        __root.setSendCnt(flFld.getLongField(this, 4, Constants.ALIGN_NON, " ", 0, true, false, Constants.ENCODE_CHAR, Constants.TRIM_NONE));
    successFieldCount++;
        } catch(Exception e) {
            StringBuilder esb = new StringBuilder(e.getClass().getName()).append(" [FIELD: SendCnt] ");
            if(e.getMessage() != null)
                esb.append(": ").append(e.getMessage());
            throw new Exception(esb.toString(), e);
        }
    }
    private void set_SendUserId(hwgi.f54.FT_54PP_6000_00X_DB0 __root, FixedLengthUnmarshalField flFld) throws Exception {
        try {

        /** SendUserId */
        __root.setSendUserId(flFld.getStringField(this, 20, Constants.ALIGN_NON, " ", 0, true, false, Constants.ENCODE_CHAR, Constants.TRIM_NONE), this.masked);
    successFieldCount++;
        } catch(Exception e) {
            StringBuilder esb = new StringBuilder(e.getClass().getName()).append(" [FIELD: SendUserId] ");
            if(e.getMessage() != null)
                esb.append(": ").append(e.getMessage());
            throw new Exception(esb.toString(), e);
        }
    }
    private void set_SendPassword(hwgi.f54.FT_54PP_6000_00X_DB0 __root, FixedLengthUnmarshalField flFld) throws Exception {
        try {

        /** SendPassword */
        __root.setSendPassword(flFld.getStringField(this, 8, Constants.ALIGN_NON, " ", 0, true, false, Constants.ENCODE_CHAR, Constants.TRIM_NONE), this.masked);
    successFieldCount++;
        } catch(Exception e) {
            StringBuilder esb = new StringBuilder(e.getClass().getName()).append(" [FIELD: SendPassword] ");
            if(e.getMessage() != null)
                esb.append(": ").append(e.getMessage());
            throw new Exception(esb.toString(), e);
        }
    }
    
    protected static java.util.Map<String, MessageFieldProperty> fieldPropertyMap = new java.util.LinkedHashMap();
    public java.util.Map<String, MessageFieldProperty> getFieldPropertyMap() {
        return fieldPropertyMap;
    }
    static {

        fieldPropertyMap.put("SnrCode", getProperty_SnrCode());
        fieldPropertyMap.put("OprCode", getProperty_OprCode());
        fieldPropertyMap.put("TotBlockNo", getProperty_TotBlockNo());
        fieldPropertyMap.put("TotSeqNo", getProperty_TotSeqNo());
        fieldPropertyMap.put("TranDate", getProperty_TranDate());
        fieldPropertyMap.put("SendCnt", getProperty_SendCnt());
        fieldPropertyMap.put("SendUserId", getProperty_SendUserId());
        fieldPropertyMap.put("SendPassword", getProperty_SendPassword());
    }

    private static MessageFieldProperty getProperty_SnrCode() {
        MessageFieldProperty fldProp = null;
        fldProp = new MessageFieldProperty("SnrCode", "송ㆍ수신 업무 구분코드", MessageFieldType.STRING, (String)null, null, "1", Constants.ALIGN_NON, " ", 0, true, false, null, null, null, null, null, Constants.TRIM_NONE, Constants.ENCODE_CHAR);
        return fldProp;
    }

    private static MessageFieldProperty getProperty_OprCode() {
        MessageFieldProperty fldProp = null;
        fldProp = new MessageFieldProperty("OprCode", "업무관리정보", MessageFieldType.STRING, (String)null, null, "3", Constants.ALIGN_NON, " ", 0, true, false, null, null, null, null, null, Constants.TRIM_NONE, Constants.ENCODE_CHAR);
        return fldProp;
    }

    private static MessageFieldProperty getProperty_TotBlockNo() {
        MessageFieldProperty fldProp = null;
        fldProp = new MessageFieldProperty("TotBlockNo", "최종Block-NO", MessageFieldType.WRAPPER_LONG, (String)null, null, "4", Constants.ALIGN_NON, " ", 0, true, false, null, null, null, null, null, Constants.TRIM_NONE, Constants.ENCODE_CHAR);
        return fldProp;
    }

    private static MessageFieldProperty getProperty_TotSeqNo() {
        MessageFieldProperty fldProp = null;
        fldProp = new MessageFieldProperty("TotSeqNo", "최종Sequence-NO", MessageFieldType.WRAPPER_LONG, (String)null, null, "3", Constants.ALIGN_NON, " ", 0, true, false, null, null, null, null, null, Constants.TRIM_NONE, Constants.ENCODE_CHAR);
        return fldProp;
    }

    private static MessageFieldProperty getProperty_TranDate() {
        MessageFieldProperty fldProp = null;
        fldProp = new MessageFieldProperty("TranDate", "전송기준일자", MessageFieldType.STRING, (String)null, null, "8", Constants.ALIGN_NON, " ", 0, true, false, null, null, null, null, null, Constants.TRIM_NONE, Constants.ENCODE_CHAR);
        return fldProp;
    }

    private static MessageFieldProperty getProperty_SendCnt() {
        MessageFieldProperty fldProp = null;
        fldProp = new MessageFieldProperty("SendCnt", "송신 집계 내역", MessageFieldType.WRAPPER_LONG, (String)null, null, "4", Constants.ALIGN_NON, " ", 0, true, false, null, null, null, null, null, Constants.TRIM_NONE, Constants.ENCODE_CHAR);
        return fldProp;
    }

    private static MessageFieldProperty getProperty_SendUserId() {
        MessageFieldProperty fldProp = null;
        fldProp = new MessageFieldProperty("SendUserId", "송신자명", MessageFieldType.STRING, (String)null, null, "20", Constants.ALIGN_NON, " ", 0, true, false, null, null, null, null, null, Constants.TRIM_NONE, Constants.ENCODE_CHAR);
        return fldProp;
    }

    private static MessageFieldProperty getProperty_SendPassword() {
        MessageFieldProperty fldProp = null;
        fldProp = new MessageFieldProperty("SendPassword", "송신자암호", MessageFieldType.STRING, (String)null, null, "8", Constants.ALIGN_NON, " ", 0, true, false, null, null, null, null, null, Constants.TRIM_NONE, Constants.ENCODE_CHAR);
        return fldProp;
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
            return "FT_54PP_6000_00X_DB0FixedLength";
        } else if (input.equalsIgnoreCase(META_VERSION_NO)) {
            return null;
        } else if (input.equalsIgnoreCase(META_LOGICAL_NAME)) {
            return "FT_54PP_6000_00X_DB0_업무관리";
        } else if (input.equalsIgnoreCase(META_RESOURCE_ID)) {
            return "hwgi.f54:FT_54PP_6000_00X_DB0FixedLength.msg";
        } else if (input.equalsIgnoreCase(META_RESOURCE_TYPE)) {
            return "MESSAGE";
        } else if (input.equalsIgnoreCase(META_RESOURCE_PATH)) {
            return "hwgi.f54";
        } else if (input.equalsIgnoreCase(META_RESOURCE_GROUP)) {
            return "";
        } else if (input.equalsIgnoreCase(META_MESSAGE_TYPE)) {
              return "FixedLength";
        } else if (input.equalsIgnoreCase(META_MESSAGE_STRUCTURE_NAME)) {
            return "FT_54PP_6000_00X_DB0";
        } else if (input.equalsIgnoreCase(META_MESSAGE_STRUCTURE_PATH)) {
            return "hwgi.f54";
        } else if (input.equalsIgnoreCase(META_MESSAGE_STRUCTURE_ID)) {
            return "hwgi.f54:FT_54PP_6000_00X_DB0.umsg";
        } else {
            String msg = "Expecting one of " + META_PHYSICAL_NAME + ", "
                    + META_VERSION_NO + ", " + META_LOGICAL_NAME + ", "
                    + META_RESOURCE_ID + ", " + META_RESOURCE_TYPE + ", "
                    + META_RESOURCE_PATH + ", " + META_RESOURCE_GROUP + " , "
                    + META_MESSAGE_TYPE + " , " + META_MESSAGE_STRUCTURE_NAME
                    + " , " + META_MESSAGE_STRUCTURE_PATH + " , "
                    + META_MESSAGE_STRUCTURE_ID;
            
            throw new IllegalArgumentException(msg);
        }
    }        
}

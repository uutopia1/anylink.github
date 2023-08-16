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
 * @file              hwgi.f54.FT_54PP_0000_000_DH0FixedLength.java
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



public class FT_54PP_0000_000_DH0FixedLength extends com.tmax.promapper.engine.base.FixedLengthMessage implements ResourceMeta {

    public FT_54PP_0000_000_DH0FixedLength() {
        super();
    }

    public FT_54PP_0000_000_DH0FixedLength(int conversionType) {
        super(conversionType);
    }

    public FT_54PP_0000_000_DH0FixedLength(String charsetName) {
        super(charsetName);
    }
    
    public void setMasked(boolean _masked) {
        super.setMasked(_masked);
    }

    /* marshal method */
    public byte [] marshalObject(Object obj) throws Exception {
        FixedLengthMarshalFieldV2 flFld = new FixedLengthMarshalFieldV2();
        hwgi.f54.FT_54PP_0000_000_DH0 __root = (hwgi.f54.FT_54PP_0000_000_DH0)obj;

        if(__root == null) {
            marshallNullObject(flFld);
        } else {
            
            /** ResCode */
            flFld.setIntegralNumberField(this, __root.getResCode(), 3, Constants.ALIGN_NON, " ", 0, true, false, Constants.ENCODE_CHAR, java.nio.ByteOrder.BIG_ENDIAN, null);
            
            /** DataLength */
            flFld.setIntegralNumberField(this, __root.getDataLength(), 4, Constants.ALIGN_NON, " ", 0, true, false, Constants.ENCODE_CHAR, java.nio.ByteOrder.BIG_ENDIAN, null);
            
            /** FileCode */
            flFld.setStringField(this, __root.getFileCode(this.masked), 6, Constants.ALIGN_NON, " ", 0, true, false, Constants.ENCODE_CHAR, null);
            
            /** TtyNo */
            flFld.setStringField(this, __root.getTtyNo(this.masked), 8, Constants.ALIGN_NON, " ", 0, true, false, Constants.ENCODE_CHAR, null);
            
            /** OrgCode */
            flFld.setStringField(this, __root.getOrgCode(this.masked), 3, Constants.ALIGN_NON, " ", 0, true, false, Constants.ENCODE_CHAR, null);
            
            /** MsgNo */
            flFld.setStringField(this, __root.getMsgNo(this.masked), 7, Constants.ALIGN_NON, " ", 0, true, false, Constants.ENCODE_CHAR, null);
            
            /** SendDate */
            flFld.setStringField(this, __root.getSendDate(this.masked), 14, Constants.ALIGN_NON, " ", 0, true, false, Constants.ENCODE_CHAR, null);
            
            /** OprCode */
            flFld.setStringField(this, __root.getOprCode(this.masked), 3, Constants.ALIGN_NON, " ", 0, true, false, Constants.ENCODE_CHAR, null);
            
            /** KindCode */
            flFld.setStringField(this, __root.getKindCode(this.masked), 4, Constants.ALIGN_NON, " ", 0, true, false, Constants.ENCODE_CHAR, null);
            
            /** KniaText */
            flFld.setStringField(this, __root.getKniaText(this.masked), 4, Constants.ALIGN_NON, " ", 0, true, false, Constants.ENCODE_CHAR, null);
            
            /** TranCode */
            flFld.setStringField(this, __root.getTranCode(this.masked), 9, Constants.ALIGN_NON, " ", 0, true, false, Constants.ENCODE_CHAR, null);
        }
        
        return flFld.getMessage();
    }

        
    private void marshallNullObject(FixedLengthMarshalFieldV2 flFld) throws Exception {
            
            /** ResCode */

                flFld.setLongField(this, 0, 3, Constants.ALIGN_NON, " ", 0, true, false, Constants.ENCODE_CHAR);
            
            /** DataLength */

                flFld.setLongField(this, 0, 4, Constants.ALIGN_NON, " ", 0, true, false, Constants.ENCODE_CHAR);
            
            /** FileCode */

                flFld.padByteArrayField(this, 6, " ");
            
            /** TtyNo */

                flFld.padByteArrayField(this, 8, " ");
            
            /** OrgCode */

                flFld.padByteArrayField(this, 3, " ");
            
            /** MsgNo */

                flFld.padByteArrayField(this, 7, " ");
            
            /** SendDate */

                flFld.padByteArrayField(this, 14, " ");
            
            /** OprCode */

                flFld.padByteArrayField(this, 3, " ");
            
            /** KindCode */

                flFld.padByteArrayField(this, 4, " ");
            
            /** KniaText */

                flFld.padByteArrayField(this, 4, " ");
            
            /** TranCode */

                flFld.padByteArrayField(this, 9, " ");
    }

    /* unmarshal method */
    public Object unmarshalObject(byte[] message, int startOffset) throws Exception{
        hwgi.f54.FT_54PP_0000_000_DH0 dataObject = new hwgi.f54.FT_54PP_0000_000_DH0();
        setOffset(unmarshalObject(message, startOffset, dataObject));
            return dataObject;
    }
    
    public int unmarshalObject(byte[] message, int startOffset, Object dataObject) throws Exception {        

        hwgi.f54.FT_54PP_0000_000_DH0 __root = (hwgi.f54.FT_54PP_0000_000_DH0)dataObject;
        FixedLengthUnmarshalField flFld = new FixedLengthUnmarshalField(message, startOffset);
        
        set_TranCode(__root, flFld);
        set_KniaText(__root, flFld);
        set_KindCode(__root, flFld);
        set_OprCode(__root, flFld);
        set_SendDate(__root, flFld);
        set_MsgNo(__root, flFld);
        set_OrgCode(__root, flFld);
        set_TtyNo(__root, flFld);
        set_FileCode(__root, flFld);
        set_DataLength(__root, flFld);
        set_ResCode(__root, flFld);

        setOffset(flFld.getOffset());
        __root.setMessageProperties(fieldPropertyMap);
        return getOffset();
    }

    private void set_TranCode(hwgi.f54.FT_54PP_0000_000_DH0 __root, FixedLengthUnmarshalField flFld) throws Exception {
        try {

        /** TranCode */
        __root.setTranCode(flFld.getStringField(this, 9, Constants.ALIGN_NON, " ", 0, true, false, Constants.ENCODE_CHAR, Constants.TRIM_NONE), this.masked);
    successFieldCount++;
        } catch(Exception e) {
            StringBuilder esb = new StringBuilder(e.getClass().getName()).append(" [FIELD: TranCode] ");
            if(e.getMessage() != null)
                esb.append(": ").append(e.getMessage());
            throw new Exception(esb.toString(), e);
        }
    }
    private void set_KniaText(hwgi.f54.FT_54PP_0000_000_DH0 __root, FixedLengthUnmarshalField flFld) throws Exception {
        try {

        /** KniaText */
        __root.setKniaText(flFld.getStringField(this, 4, Constants.ALIGN_NON, " ", 0, true, false, Constants.ENCODE_CHAR, Constants.TRIM_NONE), this.masked);
    successFieldCount++;
        } catch(Exception e) {
            StringBuilder esb = new StringBuilder(e.getClass().getName()).append(" [FIELD: KniaText] ");
            if(e.getMessage() != null)
                esb.append(": ").append(e.getMessage());
            throw new Exception(esb.toString(), e);
        }
    }
    private void set_KindCode(hwgi.f54.FT_54PP_0000_000_DH0 __root, FixedLengthUnmarshalField flFld) throws Exception {
        try {

        /** KindCode */
        __root.setKindCode(flFld.getStringField(this, 4, Constants.ALIGN_NON, " ", 0, true, false, Constants.ENCODE_CHAR, Constants.TRIM_NONE), this.masked);
    successFieldCount++;
        } catch(Exception e) {
            StringBuilder esb = new StringBuilder(e.getClass().getName()).append(" [FIELD: KindCode] ");
            if(e.getMessage() != null)
                esb.append(": ").append(e.getMessage());
            throw new Exception(esb.toString(), e);
        }
    }
    private void set_OprCode(hwgi.f54.FT_54PP_0000_000_DH0 __root, FixedLengthUnmarshalField flFld) throws Exception {
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
    private void set_SendDate(hwgi.f54.FT_54PP_0000_000_DH0 __root, FixedLengthUnmarshalField flFld) throws Exception {
        try {

        /** SendDate */
        __root.setSendDate(flFld.getStringField(this, 14, Constants.ALIGN_NON, " ", 0, true, false, Constants.ENCODE_CHAR, Constants.TRIM_NONE), this.masked);
    successFieldCount++;
        } catch(Exception e) {
            StringBuilder esb = new StringBuilder(e.getClass().getName()).append(" [FIELD: SendDate] ");
            if(e.getMessage() != null)
                esb.append(": ").append(e.getMessage());
            throw new Exception(esb.toString(), e);
        }
    }
    private void set_MsgNo(hwgi.f54.FT_54PP_0000_000_DH0 __root, FixedLengthUnmarshalField flFld) throws Exception {
        try {

        /** MsgNo */
        __root.setMsgNo(flFld.getStringField(this, 7, Constants.ALIGN_NON, " ", 0, true, false, Constants.ENCODE_CHAR, Constants.TRIM_NONE), this.masked);
    successFieldCount++;
        } catch(Exception e) {
            StringBuilder esb = new StringBuilder(e.getClass().getName()).append(" [FIELD: MsgNo] ");
            if(e.getMessage() != null)
                esb.append(": ").append(e.getMessage());
            throw new Exception(esb.toString(), e);
        }
    }
    private void set_OrgCode(hwgi.f54.FT_54PP_0000_000_DH0 __root, FixedLengthUnmarshalField flFld) throws Exception {
        try {

        /** OrgCode */
        __root.setOrgCode(flFld.getStringField(this, 3, Constants.ALIGN_NON, " ", 0, true, false, Constants.ENCODE_CHAR, Constants.TRIM_NONE), this.masked);
    successFieldCount++;
        } catch(Exception e) {
            StringBuilder esb = new StringBuilder(e.getClass().getName()).append(" [FIELD: OrgCode] ");
            if(e.getMessage() != null)
                esb.append(": ").append(e.getMessage());
            throw new Exception(esb.toString(), e);
        }
    }
    private void set_TtyNo(hwgi.f54.FT_54PP_0000_000_DH0 __root, FixedLengthUnmarshalField flFld) throws Exception {
        try {

        /** TtyNo */
        __root.setTtyNo(flFld.getStringField(this, 8, Constants.ALIGN_NON, " ", 0, true, false, Constants.ENCODE_CHAR, Constants.TRIM_NONE), this.masked);
    successFieldCount++;
        } catch(Exception e) {
            StringBuilder esb = new StringBuilder(e.getClass().getName()).append(" [FIELD: TtyNo] ");
            if(e.getMessage() != null)
                esb.append(": ").append(e.getMessage());
            throw new Exception(esb.toString(), e);
        }
    }
    private void set_FileCode(hwgi.f54.FT_54PP_0000_000_DH0 __root, FixedLengthUnmarshalField flFld) throws Exception {
        try {

        /** FileCode */
        __root.setFileCode(flFld.getStringField(this, 6, Constants.ALIGN_NON, " ", 0, true, false, Constants.ENCODE_CHAR, Constants.TRIM_NONE), this.masked);
    successFieldCount++;
        } catch(Exception e) {
            StringBuilder esb = new StringBuilder(e.getClass().getName()).append(" [FIELD: FileCode] ");
            if(e.getMessage() != null)
                esb.append(": ").append(e.getMessage());
            throw new Exception(esb.toString(), e);
        }
    }
    private void set_DataLength(hwgi.f54.FT_54PP_0000_000_DH0 __root, FixedLengthUnmarshalField flFld) throws Exception {
        try {

        /** DataLength */
        __root.setDataLength(flFld.getIntField(this, 4, Constants.ALIGN_NON, " ", 0, true, false, Constants.ENCODE_CHAR, Constants.TRIM_NONE, java.nio.ByteOrder.BIG_ENDIAN, "null", false));
    successFieldCount++;
        } catch(Exception e) {
            StringBuilder esb = new StringBuilder(e.getClass().getName()).append(" [FIELD: DataLength] ");
            if(e.getMessage() != null)
                esb.append(": ").append(e.getMessage());
            throw new Exception(esb.toString(), e);
        }
    }
    private void set_ResCode(hwgi.f54.FT_54PP_0000_000_DH0 __root, FixedLengthUnmarshalField flFld) throws Exception {
        try {

        /** ResCode */
        __root.setResCode(flFld.getIntField(this, 3, Constants.ALIGN_NON, " ", 0, true, false, Constants.ENCODE_CHAR, Constants.TRIM_NONE, java.nio.ByteOrder.BIG_ENDIAN, "null", false));
    successFieldCount++;
        } catch(Exception e) {
            StringBuilder esb = new StringBuilder(e.getClass().getName()).append(" [FIELD: ResCode] ");
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

        fieldPropertyMap.put("TranCode", getProperty_TranCode());
        fieldPropertyMap.put("KniaText", getProperty_KniaText());
        fieldPropertyMap.put("KindCode", getProperty_KindCode());
        fieldPropertyMap.put("OprCode", getProperty_OprCode());
        fieldPropertyMap.put("SendDate", getProperty_SendDate());
        fieldPropertyMap.put("MsgNo", getProperty_MsgNo());
        fieldPropertyMap.put("OrgCode", getProperty_OrgCode());
        fieldPropertyMap.put("TtyNo", getProperty_TtyNo());
        fieldPropertyMap.put("FileCode", getProperty_FileCode());
        fieldPropertyMap.put("DataLength", getProperty_DataLength());
        fieldPropertyMap.put("ResCode", getProperty_ResCode());
    }

    private static MessageFieldProperty getProperty_TranCode() {
        MessageFieldProperty fldProp = null;
        fldProp = new MessageFieldProperty("TranCode", "Transaction Code", MessageFieldType.STRING, (String)null, null, "9", Constants.ALIGN_NON, " ", 0, true, false, null, null, null, null, null, Constants.TRIM_NONE, Constants.ENCODE_CHAR);
        return fldProp;
    }

    private static MessageFieldProperty getProperty_KniaText() {
        MessageFieldProperty fldProp = null;
        fldProp = new MessageFieldProperty("KniaText", "KNIA-NET TEXT(개시문자)", MessageFieldType.STRING, (String)null, null, "4", Constants.ALIGN_NON, " ", 0, true, false, null, null, null, null, null, Constants.TRIM_NONE, Constants.ENCODE_CHAR);
        return fldProp;
    }

    private static MessageFieldProperty getProperty_KindCode() {
        MessageFieldProperty fldProp = null;
        fldProp = new MessageFieldProperty("KindCode", "전문종별코드", MessageFieldType.STRING, (String)null, null, "4", Constants.ALIGN_NON, " ", 0, true, false, null, null, null, null, null, Constants.TRIM_NONE, Constants.ENCODE_CHAR);
        return fldProp;
    }

    private static MessageFieldProperty getProperty_OprCode() {
        MessageFieldProperty fldProp = null;
        fldProp = new MessageFieldProperty("OprCode", "업무구분코드", MessageFieldType.STRING, (String)null, null, "3", Constants.ALIGN_NON, " ", 0, true, false, null, null, null, null, null, Constants.TRIM_NONE, Constants.ENCODE_CHAR);
        return fldProp;
    }

    private static MessageFieldProperty getProperty_SendDate() {
        MessageFieldProperty fldProp = null;
        fldProp = new MessageFieldProperty("SendDate", "전문전송일시", MessageFieldType.STRING, (String)null, null, "14", Constants.ALIGN_NON, " ", 0, true, false, null, null, null, null, null, Constants.TRIM_NONE, Constants.ENCODE_CHAR);
        return fldProp;
    }

    private static MessageFieldProperty getProperty_MsgNo() {
        MessageFieldProperty fldProp = null;
        fldProp = new MessageFieldProperty("MsgNo", "전문관리번호", MessageFieldType.STRING, (String)null, null, "7", Constants.ALIGN_NON, " ", 0, true, false, null, null, null, null, null, Constants.TRIM_NONE, Constants.ENCODE_CHAR);
        return fldProp;
    }

    private static MessageFieldProperty getProperty_OrgCode() {
        MessageFieldProperty fldProp = null;
        fldProp = new MessageFieldProperty("OrgCode", "송신기관코드", MessageFieldType.STRING, (String)null, null, "3", Constants.ALIGN_NON, " ", 0, true, false, null, null, null, null, null, Constants.TRIM_NONE, Constants.ENCODE_CHAR);
        return fldProp;
    }

    private static MessageFieldProperty getProperty_TtyNo() {
        MessageFieldProperty fldProp = null;
        fldProp = new MessageFieldProperty("TtyNo", "단말기번호", MessageFieldType.STRING, (String)null, null, "8", Constants.ALIGN_NON, " ", 0, true, false, null, null, null, null, null, Constants.TRIM_NONE, Constants.ENCODE_CHAR);
        return fldProp;
    }

    private static MessageFieldProperty getProperty_FileCode() {
        MessageFieldProperty fldProp = null;
        fldProp = new MessageFieldProperty("FileCode", "거래 구분 코드", MessageFieldType.STRING, (String)null, null, "6", Constants.ALIGN_NON, " ", 0, true, false, null, null, null, null, null, Constants.TRIM_NONE, Constants.ENCODE_CHAR);
        return fldProp;
    }

    private static MessageFieldProperty getProperty_DataLength() {
        MessageFieldProperty fldProp = null;
        fldProp = new MessageFieldProperty("DataLength", "DATA LENGTH", MessageFieldType.PRIMITIVE_INT, (String)null, null, "4", Constants.ALIGN_NON, " ", 0, true, false, null, null, null, null, null, Constants.TRIM_NONE, Constants.ENCODE_CHAR);
        return fldProp;
    }

    private static MessageFieldProperty getProperty_ResCode() {
        MessageFieldProperty fldProp = null;
        fldProp = new MessageFieldProperty("ResCode", "응답 코드", MessageFieldType.PRIMITIVE_INT, (String)null, null, "3", Constants.ALIGN_NON, " ", 0, true, false, null, null, null, null, null, Constants.TRIM_NONE, Constants.ENCODE_CHAR);
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
            return "FT_54PP_0000_000_DH0FixedLength";
        } else if (input.equalsIgnoreCase(META_VERSION_NO)) {
            return null;
        } else if (input.equalsIgnoreCase(META_LOGICAL_NAME)) {
            return "FT_54PP_0000_000_DH0";
        } else if (input.equalsIgnoreCase(META_RESOURCE_ID)) {
            return "hwgi.f54:FT_54PP_0000_000_DH0FixedLength.msg";
        } else if (input.equalsIgnoreCase(META_RESOURCE_TYPE)) {
            return "MESSAGE";
        } else if (input.equalsIgnoreCase(META_RESOURCE_PATH)) {
            return "hwgi.f54";
        } else if (input.equalsIgnoreCase(META_RESOURCE_GROUP)) {
            return "";
        } else if (input.equalsIgnoreCase(META_MESSAGE_TYPE)) {
              return "FixedLength";
        } else if (input.equalsIgnoreCase(META_MESSAGE_STRUCTURE_NAME)) {
            return "FT_54PP_0000_000_DH0";
        } else if (input.equalsIgnoreCase(META_MESSAGE_STRUCTURE_PATH)) {
            return "hwgi.f54";
        } else if (input.equalsIgnoreCase(META_MESSAGE_STRUCTURE_ID)) {
            return "hwgi.f54:FT_54PP_0000_000_DH0.umsg";
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

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
 * @file              hwgi.f54.OL_54PP_0000_000_DH0FixedLength.java
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



public class OL_54PP_0000_000_DH0FixedLength extends com.tmax.promapper.engine.base.FixedLengthMessage implements ResourceMeta {

    public OL_54PP_0000_000_DH0FixedLength() {
        super();
    }

    public OL_54PP_0000_000_DH0FixedLength(int conversionType) {
        super(conversionType);
    }

    public OL_54PP_0000_000_DH0FixedLength(String charsetName) {
        super(charsetName);
    }
    
    public void setMasked(boolean _masked) {
        super.setMasked(_masked);
    }

    /* marshal method */
    public byte [] marshalObject(Object obj) throws Exception {
        FixedLengthMarshalFieldV2 flFld = new FixedLengthMarshalFieldV2();
        hwgi.f54.OL_54PP_0000_000_DH0 __root = (hwgi.f54.OL_54PP_0000_000_DH0)obj;

        if(__root == null) {
            marshallNullObject(flFld);
        } else {
            
            /** SeqNo */
            flFld.setStringField(this, __root.getSeqNo(this.masked), 3, Constants.ALIGN_NON, " ", 0, true, false, Constants.ENCODE_CHAR, null);
            
            /** TranDate */
            flFld.setStringField(this, __root.getTranDate(this.masked), 8, Constants.ALIGN_NON, " ", 0, true, false, Constants.ENCODE_CHAR, null);
            
            /** OrgCode */
            flFld.setStringField(this, __root.getOrgCode(this.masked), 3, Constants.ALIGN_NON, " ", 0, true, false, Constants.ENCODE_CHAR, null);
            
            /** FileCode */
            flFld.setStringField(this, __root.getFileCode(this.masked), 6, Constants.ALIGN_NON, " ", 0, true, false, Constants.ENCODE_CHAR, null);
            
            /** TranCode */
            flFld.setStringField(this, __root.getTranCode(this.masked), 2, Constants.ALIGN_NON, " ", 0, true, false, Constants.ENCODE_CHAR, null);
            
            /** ResCode */
            flFld.setIntegralNumberField(this, __root.getResCode(), 3, Constants.ALIGN_NON, " ", 0, true, false, Constants.ENCODE_CHAR, java.nio.ByteOrder.BIG_ENDIAN, null);
        }
        
        return flFld.getMessage();
    }

        
    private void marshallNullObject(FixedLengthMarshalFieldV2 flFld) throws Exception {
            
            /** SeqNo */

                flFld.padByteArrayField(this, 3, " ");
            
            /** TranDate */

                flFld.padByteArrayField(this, 8, " ");
            
            /** OrgCode */

                flFld.padByteArrayField(this, 3, " ");
            
            /** FileCode */

                flFld.padByteArrayField(this, 6, " ");
            
            /** TranCode */

                flFld.padByteArrayField(this, 2, " ");
            
            /** ResCode */

                flFld.setLongField(this, 0, 3, Constants.ALIGN_NON, " ", 0, true, false, Constants.ENCODE_CHAR);
    }

    /* unmarshal method */
    public Object unmarshalObject(byte[] message, int startOffset) throws Exception{
        hwgi.f54.OL_54PP_0000_000_DH0 dataObject = new hwgi.f54.OL_54PP_0000_000_DH0();
        setOffset(unmarshalObject(message, startOffset, dataObject));
            return dataObject;
    }
    
    public int unmarshalObject(byte[] message, int startOffset, Object dataObject) throws Exception {        

        hwgi.f54.OL_54PP_0000_000_DH0 __root = (hwgi.f54.OL_54PP_0000_000_DH0)dataObject;
        FixedLengthUnmarshalField flFld = new FixedLengthUnmarshalField(message, startOffset);
        
        set_ResCode(__root, flFld);
        set_TranCode(__root, flFld);
        set_FileCode(__root, flFld);
        set_OrgCode(__root, flFld);
        set_TranDate(__root, flFld);
        set_SeqNo(__root, flFld);

        setOffset(flFld.getOffset());
        __root.setMessageProperties(fieldPropertyMap);
        return getOffset();
    }

    private void set_ResCode(hwgi.f54.OL_54PP_0000_000_DH0 __root, FixedLengthUnmarshalField flFld) throws Exception {
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
    private void set_TranCode(hwgi.f54.OL_54PP_0000_000_DH0 __root, FixedLengthUnmarshalField flFld) throws Exception {
        try {

        /** TranCode */
        __root.setTranCode(flFld.getStringField(this, 2, Constants.ALIGN_NON, " ", 0, true, false, Constants.ENCODE_CHAR, Constants.TRIM_NONE), this.masked);
    successFieldCount++;
        } catch(Exception e) {
            StringBuilder esb = new StringBuilder(e.getClass().getName()).append(" [FIELD: TranCode] ");
            if(e.getMessage() != null)
                esb.append(": ").append(e.getMessage());
            throw new Exception(esb.toString(), e);
        }
    }
    private void set_FileCode(hwgi.f54.OL_54PP_0000_000_DH0 __root, FixedLengthUnmarshalField flFld) throws Exception {
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
    private void set_OrgCode(hwgi.f54.OL_54PP_0000_000_DH0 __root, FixedLengthUnmarshalField flFld) throws Exception {
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
    private void set_TranDate(hwgi.f54.OL_54PP_0000_000_DH0 __root, FixedLengthUnmarshalField flFld) throws Exception {
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
    private void set_SeqNo(hwgi.f54.OL_54PP_0000_000_DH0 __root, FixedLengthUnmarshalField flFld) throws Exception {
        try {

        /** SeqNo */
        __root.setSeqNo(flFld.getStringField(this, 3, Constants.ALIGN_NON, " ", 0, true, false, Constants.ENCODE_CHAR, Constants.TRIM_NONE), this.masked);
    successFieldCount++;
        } catch(Exception e) {
            StringBuilder esb = new StringBuilder(e.getClass().getName()).append(" [FIELD: SeqNo] ");
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

        fieldPropertyMap.put("ResCode", getProperty_ResCode());
        fieldPropertyMap.put("TranCode", getProperty_TranCode());
        fieldPropertyMap.put("FileCode", getProperty_FileCode());
        fieldPropertyMap.put("OrgCode", getProperty_OrgCode());
        fieldPropertyMap.put("TranDate", getProperty_TranDate());
        fieldPropertyMap.put("SeqNo", getProperty_SeqNo());
    }

    private static MessageFieldProperty getProperty_ResCode() {
        MessageFieldProperty fldProp = null;
        fldProp = new MessageFieldProperty("ResCode", "처리결과", MessageFieldType.PRIMITIVE_INT, (String)null, null, "3", Constants.ALIGN_NON, " ", 0, true, false, null, null, null, null, null, Constants.TRIM_NONE, Constants.ENCODE_CHAR);
        return fldProp;
    }

    private static MessageFieldProperty getProperty_TranCode() {
        MessageFieldProperty fldProp = null;
        fldProp = new MessageFieldProperty("TranCode", "Transaction Code", MessageFieldType.STRING, (String)null, null, "2", Constants.ALIGN_NON, " ", 0, true, false, null, null, null, null, null, Constants.TRIM_NONE, Constants.ENCODE_CHAR);
        return fldProp;
    }

    private static MessageFieldProperty getProperty_FileCode() {
        MessageFieldProperty fldProp = null;
        fldProp = new MessageFieldProperty("FileCode", "거래구분코드", MessageFieldType.STRING, (String)null, null, "6", Constants.ALIGN_NON, " ", 0, true, false, null, null, null, null, null, Constants.TRIM_NONE, Constants.ENCODE_CHAR);
        return fldProp;
    }

    private static MessageFieldProperty getProperty_OrgCode() {
        MessageFieldProperty fldProp = null;
        fldProp = new MessageFieldProperty("OrgCode", "송신기관코드", MessageFieldType.STRING, (String)null, null, "3", Constants.ALIGN_NON, " ", 0, true, false, null, null, null, null, null, Constants.TRIM_NONE, Constants.ENCODE_CHAR);
        return fldProp;
    }

    private static MessageFieldProperty getProperty_TranDate() {
        MessageFieldProperty fldProp = null;
        fldProp = new MessageFieldProperty("TranDate", "기준일자", MessageFieldType.STRING, (String)null, null, "8", Constants.ALIGN_NON, " ", 0, true, false, null, null, null, null, null, Constants.TRIM_NONE, Constants.ENCODE_CHAR);
        return fldProp;
    }

    private static MessageFieldProperty getProperty_SeqNo() {
        MessageFieldProperty fldProp = null;
        fldProp = new MessageFieldProperty("SeqNo", "시퀀스", MessageFieldType.STRING, (String)null, null, "3", Constants.ALIGN_NON, " ", 0, true, false, null, null, null, null, null, Constants.TRIM_NONE, Constants.ENCODE_CHAR);
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
            return "OL_54PP_0000_000_DH0FixedLength";
        } else if (input.equalsIgnoreCase(META_VERSION_NO)) {
            return null;
        } else if (input.equalsIgnoreCase(META_LOGICAL_NAME)) {
            return "OL_54PP_0000_000_DH0_배치서버호출";
        } else if (input.equalsIgnoreCase(META_RESOURCE_ID)) {
            return "hwgi.f54:OL_54PP_0000_000_DH0FixedLength.msg";
        } else if (input.equalsIgnoreCase(META_RESOURCE_TYPE)) {
            return "MESSAGE";
        } else if (input.equalsIgnoreCase(META_RESOURCE_PATH)) {
            return "hwgi.f54";
        } else if (input.equalsIgnoreCase(META_RESOURCE_GROUP)) {
            return "";
        } else if (input.equalsIgnoreCase(META_MESSAGE_TYPE)) {
              return "FixedLength";
        } else if (input.equalsIgnoreCase(META_MESSAGE_STRUCTURE_NAME)) {
            return "OL_54PP_0000_000_DH0";
        } else if (input.equalsIgnoreCase(META_MESSAGE_STRUCTURE_PATH)) {
            return "hwgi.f54";
        } else if (input.equalsIgnoreCase(META_MESSAGE_STRUCTURE_ID)) {
            return "hwgi.f54:OL_54PP_0000_000_DH0.umsg";
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

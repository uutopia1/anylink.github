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
 * @file              hwgi.f54.FT_54PP_6000_320_DB0FixedLength.java
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



public class FT_54PP_6000_320_DB0FixedLength extends com.tmax.promapper.engine.base.FixedLengthMessage implements ResourceMeta {

    public FT_54PP_6000_320_DB0FixedLength() {
        super();
    }

    public FT_54PP_6000_320_DB0FixedLength(int conversionType) {
        super(conversionType);
    }

    public FT_54PP_6000_320_DB0FixedLength(String charsetName) {
        super(charsetName);
    }
    
    public void setMasked(boolean _masked) {
        super.setMasked(_masked);
    }

    /* marshal method */
    public byte [] marshalObject(Object obj) throws Exception {
        FixedLengthMarshalFieldV2 flFld = new FixedLengthMarshalFieldV2();
        hwgi.f54.FT_54PP_6000_320_DB0 __root = (hwgi.f54.FT_54PP_6000_320_DB0)obj;

        if(__root == null) {
            marshallNullObject(flFld);
        } else {
            
            /** Records */
            hwgi.f54.FT_54PP_6000_320_DB1FixedLength records = new hwgi.f54.FT_54PP_6000_320_DB1FixedLength(this.charsetName);
            if(this.masked == true) {
                records.setMasked(true);
            }
            if(__root.getRecords() == null) {
                for(int i = 0; i < __root.getRecordCnt(); i++) {
                        flFld.setIncludeField(records, null);
                }
            } else {
                int min = __root.sizeRecords() <= __root.getRecordCnt()?__root.sizeRecords():(int)__root.getRecordCnt();
                for(int i = min; i < __root.getRecordCnt(); i++)  {
                    flFld.setIncludeField(records, null);                
                }
                for(int i = min - 1; i >= 0; i--)  {
                        flFld.setIncludeField(records, __root.getRecords(i));
                }
            }
            
            /** RecordCnt */
            flFld.setIntegralNumberField(this, __root.getRecordCnt(), 3, Constants.ALIGN_NON, " ", 0, true, false, Constants.ENCODE_CHAR, java.nio.ByteOrder.LITTLE_ENDIAN, null);
            
            /** SeqNo */
            flFld.setIntegralNumberField(this, __root.getSeqNo(), 3, Constants.ALIGN_NON, " ", 0, true, false, Constants.ENCODE_CHAR, java.nio.ByteOrder.LITTLE_ENDIAN, null);
            
            /** BlockNo */
            flFld.setIntegralNumberField(this, __root.getBlockNo(), 4, Constants.ALIGN_NON, " ", 0, true, false, Constants.ENCODE_CHAR, java.nio.ByteOrder.LITTLE_ENDIAN, null);
            
            /** SnrCode */
            flFld.setStringField(this, __root.getSnrCode(this.masked), 1, Constants.ALIGN_NON, " ", 0, true, false, Constants.ENCODE_CHAR, null);
        }
        
        return flFld.getMessage();
    }

        
    private void marshallNullObject(FixedLengthMarshalFieldV2 flFld) throws Exception {
            
            /** Records */
                
            
            /** RecordCnt */

                flFld.setLongField(this, 0, 3, Constants.ALIGN_NON, " ", 0, true, false, Constants.ENCODE_CHAR);
            
            /** SeqNo */

                flFld.setLongField(this, 0, 3, Constants.ALIGN_NON, " ", 0, true, false, Constants.ENCODE_CHAR);
            
            /** BlockNo */

                flFld.setLongField(this, 0, 4, Constants.ALIGN_NON, " ", 0, true, false, Constants.ENCODE_CHAR);
            
            /** SnrCode */

                flFld.padByteArrayField(this, 1, " ");
    }

    /* unmarshal method */
    public Object unmarshalObject(byte[] message, int startOffset) throws Exception{
        hwgi.f54.FT_54PP_6000_320_DB0 dataObject = new hwgi.f54.FT_54PP_6000_320_DB0();
        setOffset(unmarshalObject(message, startOffset, dataObject));
            return dataObject;
    }
    
    public int unmarshalObject(byte[] message, int startOffset, Object dataObject) throws Exception {        

        hwgi.f54.FT_54PP_6000_320_DB0 __root = (hwgi.f54.FT_54PP_6000_320_DB0)dataObject;
        FixedLengthUnmarshalField flFld = new FixedLengthUnmarshalField(message, startOffset);
        
        set_SnrCode(__root, flFld);
        set_BlockNo(__root, flFld);
        set_SeqNo(__root, flFld);
        set_RecordCnt(__root, flFld);
        set_Records(__root, flFld);

        setOffset(flFld.getOffset());
        __root.setMessageProperties(fieldPropertyMap);
        return getOffset();
    }

    private void set_SnrCode(hwgi.f54.FT_54PP_6000_320_DB0 __root, FixedLengthUnmarshalField flFld) throws Exception {
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
    private void set_BlockNo(hwgi.f54.FT_54PP_6000_320_DB0 __root, FixedLengthUnmarshalField flFld) throws Exception {
        try {

        /** BlockNo */
        __root.setBlockNo(flFld.getLongField(this, 4, Constants.ALIGN_NON, " ", 0, true, false, Constants.ENCODE_CHAR, Constants.TRIM_NONE));
    successFieldCount++;
        } catch(Exception e) {
            StringBuilder esb = new StringBuilder(e.getClass().getName()).append(" [FIELD: BlockNo] ");
            if(e.getMessage() != null)
                esb.append(": ").append(e.getMessage());
            throw new Exception(esb.toString(), e);
        }
    }
    private void set_SeqNo(hwgi.f54.FT_54PP_6000_320_DB0 __root, FixedLengthUnmarshalField flFld) throws Exception {
        try {

        /** SeqNo */
        __root.setSeqNo(flFld.getLongField(this, 3, Constants.ALIGN_NON, " ", 0, true, false, Constants.ENCODE_CHAR, Constants.TRIM_NONE));
    successFieldCount++;
        } catch(Exception e) {
            StringBuilder esb = new StringBuilder(e.getClass().getName()).append(" [FIELD: SeqNo] ");
            if(e.getMessage() != null)
                esb.append(": ").append(e.getMessage());
            throw new Exception(esb.toString(), e);
        }
    }
    private void set_RecordCnt(hwgi.f54.FT_54PP_6000_320_DB0 __root, FixedLengthUnmarshalField flFld) throws Exception {
        try {

        /** RecordCnt */
        __root.setRecordCnt(flFld.getLongField(this, 3, Constants.ALIGN_NON, " ", 0, true, false, Constants.ENCODE_CHAR, Constants.TRIM_NONE));
    successFieldCount++;
        } catch(Exception e) {
            StringBuilder esb = new StringBuilder(e.getClass().getName()).append(" [FIELD: RecordCnt] ");
            if(e.getMessage() != null)
                esb.append(": ").append(e.getMessage());
            throw new Exception(esb.toString(), e);
        }
    }
    private void set_Records(hwgi.f54.FT_54PP_6000_320_DB0 __root, FixedLengthUnmarshalField flFld) throws Exception {
        try {

        /** Records */
        hwgi.f54.FT_54PP_6000_320_DB1FixedLength __recordsMsg = new hwgi.f54.FT_54PP_6000_320_DB1FixedLength(this.charsetName);
        for (int i = 0; i < __root.getRecordCnt(); i++) {
            if(i < MAX_ARRAY_SIZE){
                hwgi.f54.FT_54PP_6000_320_DB1 __records = new hwgi.f54.FT_54PP_6000_320_DB1();
                __root.addRecords(i, __records);
                flFld.getIncludeField(__recordsMsg, __records);
            }
            else {
                throw new Exception("unmarshal stopped since the array index exceeds maximum value of array size which is set to "+ MAX_ARRAY_SIZE);
            }
        }

    successFieldCount++;
        } catch(Exception e) {
            StringBuilder esb = new StringBuilder(e.getClass().getName()).append(" [FIELD: Records] ");
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
        fieldPropertyMap.put("BlockNo", getProperty_BlockNo());
        fieldPropertyMap.put("SeqNo", getProperty_SeqNo());
        fieldPropertyMap.put("RecordCnt", getProperty_RecordCnt());
        fieldPropertyMap.put("Records", getProperty_Records());
    }

    private static MessageFieldProperty getProperty_SnrCode() {
        MessageFieldProperty fldProp = null;
        fldProp = new MessageFieldProperty("SnrCode", "송ㆍ수신 업무 구분코드", MessageFieldType.STRING, (String)null, null, "1", Constants.ALIGN_NON, " ", 0, true, false, null, null, null, null, null, Constants.TRIM_NONE, Constants.ENCODE_CHAR);
        return fldProp;
    }

    private static MessageFieldProperty getProperty_BlockNo() {
        MessageFieldProperty fldProp = null;
        fldProp = new MessageFieldProperty("BlockNo", "Block-NO", MessageFieldType.WRAPPER_LONG, (String)null, null, "4", Constants.ALIGN_NON, " ", 0, true, false, null, null, null, null, null, Constants.TRIM_NONE, Constants.ENCODE_CHAR);
        return fldProp;
    }

    private static MessageFieldProperty getProperty_SeqNo() {
        MessageFieldProperty fldProp = null;
        fldProp = new MessageFieldProperty("SeqNo", "Sequence-NO", MessageFieldType.WRAPPER_LONG, (String)null, null, "3", Constants.ALIGN_NON, " ", 0, true, false, null, null, null, null, null, Constants.TRIM_NONE, Constants.ENCODE_CHAR);
        return fldProp;
    }

    private static MessageFieldProperty getProperty_RecordCnt() {
        MessageFieldProperty fldProp = null;
        fldProp = new MessageFieldProperty("RecordCnt", "Record 수", MessageFieldType.WRAPPER_LONG, (String)null, null, "3", Constants.ALIGN_NON, " ", 0, true, false, null, null, null, null, null, Constants.TRIM_NONE, Constants.ENCODE_CHAR);
        return fldProp;
    }

    private static MessageFieldProperty getProperty_Records() {
        MessageFieldProperty fldProp = null;
        fldProp = new MessageFieldProperty("Records", "업무별 Record", MessageFieldType.INCLUDE, (String)null, "RecordCnt", null, Constants.ALIGN_NON, " ", 0, true, false, null, null, null, null, null, Constants.TRIM_NONE, Constants.ENCODE_CHAR);
            fldProp.setIncludeMessageClass("hwgi.f54.FT_54PP_6000_320_DB1FixedLength");
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
            return "FT_54PP_6000_320_DB0FixedLength";
        } else if (input.equalsIgnoreCase(META_VERSION_NO)) {
            return null;
        } else if (input.equalsIgnoreCase(META_LOGICAL_NAME)) {
            return "FT_54PP_6000_320_DB0_DATA";
        } else if (input.equalsIgnoreCase(META_RESOURCE_ID)) {
            return "hwgi.f54:FT_54PP_6000_320_DB0FixedLength.msg";
        } else if (input.equalsIgnoreCase(META_RESOURCE_TYPE)) {
            return "MESSAGE";
        } else if (input.equalsIgnoreCase(META_RESOURCE_PATH)) {
            return "hwgi.f54";
        } else if (input.equalsIgnoreCase(META_RESOURCE_GROUP)) {
            return "";
        } else if (input.equalsIgnoreCase(META_MESSAGE_TYPE)) {
              return "FixedLength";
        } else if (input.equalsIgnoreCase(META_MESSAGE_STRUCTURE_NAME)) {
            return "FT_54PP_6000_320_DB0";
        } else if (input.equalsIgnoreCase(META_MESSAGE_STRUCTURE_PATH)) {
            return "hwgi.f54";
        } else if (input.equalsIgnoreCase(META_MESSAGE_STRUCTURE_ID)) {
            return "hwgi.f54:FT_54PP_6000_320_DB0.umsg";
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

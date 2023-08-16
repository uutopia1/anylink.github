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
 * @file              hwgi.f54.BKNIA_FILE_SEQFixedLength.java
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



public class BKNIA_FILE_SEQFixedLength extends com.tmax.promapper.engine.base.FixedLengthMessage implements ResourceMeta {

    public BKNIA_FILE_SEQFixedLength() {
            super(com.tmax.promapper.engine.util.Constants.EUC_KR);
    }

    public BKNIA_FILE_SEQFixedLength(int conversionType) {
        super(conversionType);
    }

    public BKNIA_FILE_SEQFixedLength(String charsetName) {
        super(charsetName);
    }
    
    public void setMasked(boolean _masked) {
        super.setMasked(_masked);
    }

    /* marshal method */
    public byte [] marshalObject(Object obj) throws Exception {
        FixedLengthMarshalFieldV2 flFld = new FixedLengthMarshalFieldV2();
        hwgi.f54.BKNIA_FILE_SEQ __root = (hwgi.f54.BKNIA_FILE_SEQ)obj;

        if(__root == null) {
            marshallNullObject(flFld);
        } else {
            
            /** Records */
            hwgi.f54.BKNIA_FILE_RECORDFixedLength records = new hwgi.f54.BKNIA_FILE_RECORDFixedLength(this.charsetName);
            if(this.masked == true) {
                records.setMasked(true);
            }
            if(__root.getRecords() == null) {
                for(int i = 0; i < __root.sizeRecords(); i++) {
                        flFld.setIncludeField(records, null);
                }
            } else {
                int min = __root.sizeRecords() <= __root.sizeRecords()?__root.sizeRecords():(int)__root.sizeRecords();
                for(int i = min; i < __root.sizeRecords(); i++)  {
                    flFld.setIncludeField(records, null);                
                }
                for(int i = min - 1; i >= 0; i--)  {
                        flFld.setIncludeField(records, __root.getRecords(i));
                }
            }
            
            /** Sequence_No */
            flFld.setIntegralNumberField(this, __root.getSequence_No(), 3, Constants.ALIGN_NON, " ", 0, true, false, Constants.ENCODE_CHAR, java.nio.ByteOrder.BIG_ENDIAN, null);
        }
        
        return flFld.getMessage();
    }

        
    private void marshallNullObject(FixedLengthMarshalFieldV2 flFld) throws Exception {
            
            /** Records */
                
            
            /** Sequence_No */

                flFld.setLongField(this, 0, 3, Constants.ALIGN_NON, " ", 0, true, false, Constants.ENCODE_CHAR);
    }

    /* unmarshal method */
    public Object unmarshalObject(byte[] message, int startOffset) throws Exception{
        hwgi.f54.BKNIA_FILE_SEQ dataObject = new hwgi.f54.BKNIA_FILE_SEQ();
        setOffset(unmarshalObject(message, startOffset, dataObject));
            return dataObject;
    }
    
    public int unmarshalObject(byte[] message, int startOffset, Object dataObject) throws Exception {        

        hwgi.f54.BKNIA_FILE_SEQ __root = (hwgi.f54.BKNIA_FILE_SEQ)dataObject;
        FixedLengthUnmarshalField flFld = new FixedLengthUnmarshalField(message, startOffset);
        
        set_Sequence_No(__root, flFld);
        set_Records(__root, flFld);

        setOffset(flFld.getOffset());
        __root.setMessageProperties(fieldPropertyMap);
        return getOffset();
    }

    private void set_Sequence_No(hwgi.f54.BKNIA_FILE_SEQ __root, FixedLengthUnmarshalField flFld) throws Exception {
        try {

        /** Sequence_No */
        __root.setSequence_No(flFld.getLongField(this, 3, Constants.ALIGN_NON, " ", 0, true, false, Constants.ENCODE_CHAR, Constants.TRIM_NONE));
    successFieldCount++;
        } catch(Exception e) {
            StringBuilder esb = new StringBuilder(e.getClass().getName()).append(" [FIELD: Sequence_No] ");
            if(e.getMessage() != null)
                esb.append(": ").append(e.getMessage());
            throw new Exception(esb.toString(), e);
        }
    }
    private void set_Records(hwgi.f54.BKNIA_FILE_SEQ __root, FixedLengthUnmarshalField flFld) throws Exception {
        try {

        /** Records */
        hwgi.f54.BKNIA_FILE_RECORDFixedLength __recordsMsg = new hwgi.f54.BKNIA_FILE_RECORDFixedLength(this.charsetName);
        for (int i = 0; i < __root.sizeRecords(); i++) {
            if(i < MAX_ARRAY_SIZE){
                hwgi.f54.BKNIA_FILE_RECORD __records = new hwgi.f54.BKNIA_FILE_RECORD();
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

        fieldPropertyMap.put("Sequence_No", getProperty_Sequence_No());
        fieldPropertyMap.put("Records", getProperty_Records());
    }

    private static MessageFieldProperty getProperty_Sequence_No() {
        MessageFieldProperty fldProp = null;
        fldProp = new MessageFieldProperty("Sequence_No", "Sequence_No", MessageFieldType.WRAPPER_LONG, (String)null, null, "3", Constants.ALIGN_NON, " ", 0, true, false, null, null, null, null, null, Constants.TRIM_NONE, Constants.ENCODE_CHAR);
        return fldProp;
    }

    private static MessageFieldProperty getProperty_Records() {
        MessageFieldProperty fldProp = null;
        fldProp = new MessageFieldProperty("Records", "Records", MessageFieldType.INCLUDE, (String)null, "unbounded", null, Constants.ALIGN_NON, " ", 0, true, false, null, null, null, null, null, Constants.TRIM_NONE, Constants.ENCODE_CHAR);
            fldProp.setIncludeMessageClass("hwgi.f54.BKNIA_FILE_RECORDFixedLength");
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
            return "BKNIA_FILE_SEQFixedLength";
        } else if (input.equalsIgnoreCase(META_VERSION_NO)) {
            return null;
        } else if (input.equalsIgnoreCase(META_LOGICAL_NAME)) {
            return "BKNIA_파일_SEQ";
        } else if (input.equalsIgnoreCase(META_RESOURCE_ID)) {
            return "hwgi.f54:BKNIA_FILE_SEQFixedLength.msg";
        } else if (input.equalsIgnoreCase(META_RESOURCE_TYPE)) {
            return "MESSAGE";
        } else if (input.equalsIgnoreCase(META_RESOURCE_PATH)) {
            return "hwgi.f54";
        } else if (input.equalsIgnoreCase(META_RESOURCE_GROUP)) {
            return "";
        } else if (input.equalsIgnoreCase(META_MESSAGE_TYPE)) {
              return "FixedLength";
        } else if (input.equalsIgnoreCase(META_MESSAGE_STRUCTURE_NAME)) {
            return "BKNIA_FILE_SEQ";
        } else if (input.equalsIgnoreCase(META_MESSAGE_STRUCTURE_PATH)) {
            return "hwgi.f54";
        } else if (input.equalsIgnoreCase(META_MESSAGE_STRUCTURE_ID)) {
            return "hwgi.f54:BKNIA_FILE_SEQ.umsg";
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

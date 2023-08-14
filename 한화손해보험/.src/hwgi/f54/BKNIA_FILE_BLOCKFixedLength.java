/*
 * 작성된 날짜: Aug 14, 2023
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
 * @file              hwgi.f54.BKNIA_FILE_BLOCKFixedLength.java
 * @filetype          java source file
 * @brief            
 * @version           1.0
 * @template-version  2014-11-12
 * @history
 * 성 명              일 자                     근 거 자 료                      변 경 내 용
 * -----------        --------                  --------------                   --------------------------    
 * AnyLink :       Aug 14, 2023                AnyLink 개발 :                신규 작성
 * 
 */



public class BKNIA_FILE_BLOCKFixedLength extends com.tmax.promapper.engine.base.FixedLengthMessage implements ResourceMeta {

    public BKNIA_FILE_BLOCKFixedLength() {
            super(com.tmax.promapper.engine.util.Constants.EUC_KR);
    }

    public BKNIA_FILE_BLOCKFixedLength(int conversionType) {
        super(conversionType);
    }

    public BKNIA_FILE_BLOCKFixedLength(String charsetName) {
        super(charsetName);
    }
    
    public void setMasked(boolean _masked) {
        super.setMasked(_masked);
    }

    /* marshal method */
    public byte [] marshalObject(Object obj) throws Exception {
        FixedLengthMarshalFieldV2 flFld = new FixedLengthMarshalFieldV2();
        hwgi.f54.BKNIA_FILE_BLOCK __root = (hwgi.f54.BKNIA_FILE_BLOCK)obj;

        if(__root == null) {
            marshallNullObject(flFld);
        } else {
            
            /** Sequences */
            hwgi.f54.BKNIA_FILE_SEQFixedLength sequences = new hwgi.f54.BKNIA_FILE_SEQFixedLength(this.charsetName);
            if(this.masked == true) {
                sequences.setMasked(true);
            }
            if(__root.getSequences() == null) {
                for(int i = 0; i < __root.sizeSequences(); i++) {
                        flFld.setIncludeField(sequences, null);
                }
            } else {
                int min = __root.sizeSequences() <= __root.sizeSequences()?__root.sizeSequences():(int)__root.sizeSequences();
                for(int i = min; i < __root.sizeSequences(); i++)  {
                    flFld.setIncludeField(sequences, null);                
                }
                for(int i = min - 1; i >= 0; i--)  {
                        flFld.setIncludeField(sequences, __root.getSequences(i));
                }
            }
        }
        
        return flFld.getMessage();
    }

        
    private void marshallNullObject(FixedLengthMarshalFieldV2 flFld) throws Exception {
            
            /** Sequences */
                
    }

    /* unmarshal method */
    public Object unmarshalObject(byte[] message, int startOffset) throws Exception{
        hwgi.f54.BKNIA_FILE_BLOCK dataObject = new hwgi.f54.BKNIA_FILE_BLOCK();
        setOffset(unmarshalObject(message, startOffset, dataObject));
            return dataObject;
    }
    
    public int unmarshalObject(byte[] message, int startOffset, Object dataObject) throws Exception {        

        hwgi.f54.BKNIA_FILE_BLOCK __root = (hwgi.f54.BKNIA_FILE_BLOCK)dataObject;
        FixedLengthUnmarshalField flFld = new FixedLengthUnmarshalField(message, startOffset);
        
        set_Sequences(__root, flFld);

        setOffset(flFld.getOffset());
        __root.setMessageProperties(fieldPropertyMap);
        return getOffset();
    }

    private void set_Sequences(hwgi.f54.BKNIA_FILE_BLOCK __root, FixedLengthUnmarshalField flFld) throws Exception {
        try {

        /** Sequences */
        hwgi.f54.BKNIA_FILE_SEQFixedLength __sequencesMsg = new hwgi.f54.BKNIA_FILE_SEQFixedLength(this.charsetName);
        for (int i = 0; i < __root.sizeSequences(); i++) {
            if(i < MAX_ARRAY_SIZE){
                hwgi.f54.BKNIA_FILE_SEQ __sequences = new hwgi.f54.BKNIA_FILE_SEQ();
                __root.addSequences(i, __sequences);
                flFld.getIncludeField(__sequencesMsg, __sequences);
            }
            else {
                throw new Exception("unmarshal stopped since the array index exceeds maximum value of array size which is set to "+ MAX_ARRAY_SIZE);
            }
        }

    successFieldCount++;
        } catch(Exception e) {
            StringBuilder esb = new StringBuilder(e.getClass().getName()).append(" [FIELD: Sequences] ");
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

        fieldPropertyMap.put("Sequences", getProperty_Sequences());
    }

    private static MessageFieldProperty getProperty_Sequences() {
        MessageFieldProperty fldProp = null;
        fldProp = new MessageFieldProperty("Sequences", "Sequences", MessageFieldType.INCLUDE, (String)null, "unbounded", null, Constants.ALIGN_NON, " ", 0, true, false, null, null, null, null, null, Constants.TRIM_NONE, Constants.ENCODE_CHAR);
            fldProp.setIncludeMessageClass("hwgi.f54.BKNIA_FILE_SEQFixedLength");
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
            return "BKNIA_FILE_BLOCKFixedLength";
        } else if (input.equalsIgnoreCase(META_VERSION_NO)) {
            return null;
        } else if (input.equalsIgnoreCase(META_LOGICAL_NAME)) {
            return "BKNIA_파일_BLOCK";
        } else if (input.equalsIgnoreCase(META_RESOURCE_ID)) {
            return "hwgi.f54:BKNIA_FILE_BLOCKFixedLength.msg";
        } else if (input.equalsIgnoreCase(META_RESOURCE_TYPE)) {
            return "MESSAGE";
        } else if (input.equalsIgnoreCase(META_RESOURCE_PATH)) {
            return "hwgi.f54";
        } else if (input.equalsIgnoreCase(META_RESOURCE_GROUP)) {
            return "";
        } else if (input.equalsIgnoreCase(META_MESSAGE_TYPE)) {
              return "FixedLength";
        } else if (input.equalsIgnoreCase(META_MESSAGE_STRUCTURE_NAME)) {
            return "BKNIA_FILE_BLOCK";
        } else if (input.equalsIgnoreCase(META_MESSAGE_STRUCTURE_PATH)) {
            return "hwgi.f54";
        } else if (input.equalsIgnoreCase(META_MESSAGE_STRUCTURE_ID)) {
            return "hwgi.f54:BKNIA_FILE_BLOCK.umsg";
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

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
 * @file              hwgi.f54.FT_54PP_0000_000_DE0FixedLength.java
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



public class FT_54PP_0000_000_DE0FixedLength extends com.tmax.promapper.engine.base.FixedLengthMessage implements ResourceMeta {

    public FT_54PP_0000_000_DE0FixedLength() {
        super();
    }

    public FT_54PP_0000_000_DE0FixedLength(int conversionType) {
        super(conversionType);
    }

    public FT_54PP_0000_000_DE0FixedLength(String charsetName) {
        super(charsetName);
    }
    
    public void setMasked(boolean _masked) {
        super.setMasked(_masked);
    }

    /* marshal method */
    public byte [] marshalObject(Object obj) throws Exception {
        FixedLengthMarshalFieldV2 flFld = new FixedLengthMarshalFieldV2();
        hwgi.f54.FT_54PP_0000_000_DE0 __root = (hwgi.f54.FT_54PP_0000_000_DE0)obj;

        if(__root == null) {
            marshallNullObject(flFld);
        } else {
            
            /** Data */
            flFld.setBinaryField(this, __root.getData());
        }
        
        return flFld.getMessage();
    }

        
    private void marshallNullObject(FixedLengthMarshalFieldV2 flFld) throws Exception {
            
            /** Data */

    }

    /* unmarshal method */
    public Object unmarshalObject(byte[] message, int startOffset) throws Exception{
        hwgi.f54.FT_54PP_0000_000_DE0 dataObject = new hwgi.f54.FT_54PP_0000_000_DE0();
        setOffset(unmarshalObject(message, startOffset, dataObject));
            return dataObject;
    }
    
    public int unmarshalObject(byte[] message, int startOffset, Object dataObject) throws Exception {        

        hwgi.f54.FT_54PP_0000_000_DE0 __root = (hwgi.f54.FT_54PP_0000_000_DE0)dataObject;
        FixedLengthUnmarshalField flFld = new FixedLengthUnmarshalField(message, startOffset);
        
        set_Data(__root, flFld);

        setOffset(flFld.getOffset());
        __root.setMessageProperties(fieldPropertyMap);
        return getOffset();
    }

    private void set_Data(hwgi.f54.FT_54PP_0000_000_DE0 __root, FixedLengthUnmarshalField flFld) throws Exception {
        try {

        /** Data */
        __root.setData(flFld.getBinaryField(this));
    successFieldCount++;
        } catch(Exception e) {
            StringBuilder esb = new StringBuilder(e.getClass().getName()).append(" [FIELD: Data] ");
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

        fieldPropertyMap.put("Data", getProperty_Data());
    }

    private static MessageFieldProperty getProperty_Data() {
        MessageFieldProperty fldProp = null;
        fldProp = new MessageFieldProperty("Data", "Data", MessageFieldType.BINARY, (String)null, null, null, Constants.ALIGN_NON, " ", 0, true, false, null, null, null, null, null, Constants.TRIM_NONE, Constants.ENCODE_CHAR);
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
            return "FT_54PP_0000_000_DE0FixedLength";
        } else if (input.equalsIgnoreCase(META_VERSION_NO)) {
            return null;
        } else if (input.equalsIgnoreCase(META_LOGICAL_NAME)) {
            return "FT_54PP_0000_000_DE0";
        } else if (input.equalsIgnoreCase(META_RESOURCE_ID)) {
            return "hwgi.f54:FT_54PP_0000_000_DE0FixedLength.msg";
        } else if (input.equalsIgnoreCase(META_RESOURCE_TYPE)) {
            return "MESSAGE";
        } else if (input.equalsIgnoreCase(META_RESOURCE_PATH)) {
            return "hwgi.f54";
        } else if (input.equalsIgnoreCase(META_RESOURCE_GROUP)) {
            return "";
        } else if (input.equalsIgnoreCase(META_MESSAGE_TYPE)) {
              return "FixedLength";
        } else if (input.equalsIgnoreCase(META_MESSAGE_STRUCTURE_NAME)) {
            return "FT_54PP_0000_000_DE0";
        } else if (input.equalsIgnoreCase(META_MESSAGE_STRUCTURE_PATH)) {
            return "hwgi.f54";
        } else if (input.equalsIgnoreCase(META_MESSAGE_STRUCTURE_ID)) {
            return "hwgi.f54:FT_54PP_0000_000_DE0.umsg";
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

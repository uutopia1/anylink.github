/*
 * 작성된 날짜: Aug 14, 2023
 * Copyright (c) 2023 TmaxSoft co., Ltd. All rights reserved.
 */
package hwgi.o28.mem.txGrp_1000.tx_210;

import com.tmax.promapper.engine.base.ProMapperDataObject;
import proframe.dto.DataObject;
import java.util.logging.Level;
import com.tmax.anylink.logging.Logger;
import com.tmax.promapper.engine.base.MessageFieldProperty;
import com.tmax.promapper.engine.base.MessageFieldType;
import com.tmax.promapper.engine.base.ResourceMeta;
import java.io.InputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import com.tmax.promapper.engine.util.JSONUtil;
import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonToken;
import java.util.Map;
import java.util.HashMap;
import com.tmax.promapper.engine.exception.UnmarshallException;

import com.tmax.promapper.engine.base.JSONMessage;

/**
 * @file              hwgi.o28.mem.txGrp_1000.tx_210.BodyJSON.java
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



public class BodyJSON extends com.tmax.promapper.engine.base.JSONMessage implements ResourceMeta {
    private static Logger logger = Logger.getLogger(JSONMessage.class.getName());
    
    public BodyJSON() {
        super();
    }

    public BodyJSON(int conversionType) {
        super(conversionType);
    }

    public BodyJSON(String charsetName) {
        super(charsetName);
    }
    private static Map<String, Integer> fieldNameMap = new HashMap<String, Integer>(5);
    
    static {
        fieldNameMap.put("mgmBldrgstPk", 0);
        fieldNameMap.put("regstrGbCd", 1);
        fieldNameMap.put("regstrKindCd", 2);
        fieldNameMap.put("bldNm", 3);
        fieldNameMap.put("totarea", 4);
    }

  
    public byte[] marshalObject(Object obj) throws Exception {
        ByteArrayOutputStream bout = new ByteArrayOutputStream();
        JsonGenerator writer = JSONUtil.createJsonGenerator(this, bout);
        
        hwgi.o28.mem.txGrp_1000.tx_210.Body __root = (hwgi.o28.mem.txGrp_1000.tx_210.Body)obj;
        
        marshalObject(__root, writer);
        
        writer.close();
        
        return bout.toByteArray();
    }
    
    public void marshalObject(Object dataObject, JsonGenerator writer) throws Exception {
        hwgi.o28.mem.txGrp_1000.tx_210.Body __root = (hwgi.o28.mem.txGrp_1000.tx_210.Body)dataObject;
        writer.writeStartObject();
        
        marshalJsonBody(__root, writer);
        
        writer.writeEndObject();
    }

    public void marshalObjectNonRoot(Object dataObject, JsonGenerator writer) throws Exception {
        marshalObject(dataObject, writer);
    }
      
    public void marshalJsonBody(hwgi.o28.mem.txGrp_1000.tx_210.Body __root, JsonGenerator writer) throws Exception {
            String strVal;
            int size;
            strVal = __root.getMgmBldrgstPk(this.masked);
            if (strVal != null) {
                writer.writeStringField("mgmBldrgstPk", strVal);
            } else {
                writer.writeNullField("mgmBldrgstPk");
            }
            strVal = __root.getRegstrGbCd(this.masked);
            if (strVal != null) {
                writer.writeStringField("regstrGbCd", strVal);
            } else {
                writer.writeNullField("regstrGbCd");
            }
            strVal = __root.getRegstrKindCd(this.masked);
            if (strVal != null) {
                writer.writeStringField("regstrKindCd", strVal);
            } else {
                writer.writeNullField("regstrKindCd");
            }
            strVal = __root.getBldNm(this.masked);
            if (strVal != null) {
                writer.writeStringField("bldNm", strVal);
            } else {
                writer.writeNullField("bldNm");
            }
            strVal = __root.getTotarea(this.masked);
            if (strVal != null) {
                writer.writeStringField("totarea", strVal);
            } else {
                writer.writeNullField("totarea");
            }
    }
    public Object unmarshalObject(byte[] msg, int offset) throws Exception {
        InputStream bin = new ByteArrayInputStream(msg, offset, msg.length-offset);
        JsonParser reader = JSONUtil.createJsonParser(bin);
        
        Object struct = new hwgi.o28.mem.txGrp_1000.tx_210.Body();
        struct = unmarshalObject(reader, struct);
        
        setOffset((int) reader.getTokenLocation().getCharOffset());
        bin.close();

        return struct;
    }

    public Object unmarshalObject(byte[] msg, int offset, String jsonPointer) throws Exception {
        if (jsonPointer == null || jsonPointer.length() == 0) {
            return unmarshalObject(msg, offset);
        }

        String[] paths = com.tmax.promapper.engine.util.StringUtil.split(jsonPointer, '/');
        if (paths.length == 0) {
            return unmarshalObject(msg, offset);
        }

        InputStream bin = new ByteArrayInputStream(msg, offset, msg.length - offset);
        JsonParser reader = JSONUtil.createJsonParser(bin);
        for (int i = 0; i < paths.length; i++) {
            skipField(reader, paths[i]);
        }
        
        Object struct = new hwgi.o28.mem.txGrp_1000.tx_210.Body();
  
        struct = unmarshalObject(reader, struct);
        
        setOffset(msg.length - bin.available());
        bin.close();

        return struct;
    }

    public Object unmarshalObjectNonRoot(JsonParser jsonParser) throws Exception {

        Object struct = new hwgi.o28.mem.txGrp_1000.tx_210.Body();
        return unmarshalObject(jsonParser, struct);
    }

    private void skipField(JsonParser reader, String fieldName) throws Exception {
        if(!reader.hasCurrentToken()) //Include일 경우는 nextToken()을 call하면 안됨
            reader.nextToken();
        JsonToken token;
        while((token = reader.nextToken()) != JsonToken.END_OBJECT && token != null) {
            String currentName = reader.getCurrentName();
            token = reader.nextToken();
            if (token == null) {
                throw new UnmarshallException("cannot find json data corresponding to pointer path named, " + fieldName);
            }

            if (currentName.equals(fieldName)) {
                return;
            }
            reader.skipChildren();
        }
    }

    public int unmarshalObject(byte[] msg, int offset, Object obj) throws Exception {
        int length = msg.length;
        InputStream bin = new ByteArrayInputStream(msg, offset, length);
        JsonParser reader = JSONUtil.createJsonParser(bin);
        unmarshalObject(reader, obj);
        bin.close();
        int newOffset = offset+length;
        setOffset(newOffset);
        return newOffset;
    }
    
    public Object unmarshalObject(JsonParser reader, Object struct) throws Exception {
        if(!reader.hasCurrentToken()) //Include일 경우는 nextToken()을 call하면 안됨
            reader.nextToken();
        JsonToken token;
        com.tmax.promapper.generator.util.JsonArraySizeValidator arraySizeValidator = new com.tmax.promapper.generator.util.JsonArraySizeValidator(struct);
        while((token = reader.nextToken()) != JsonToken.END_OBJECT && token != null) {
            String fieldName = reader.getCurrentName();
            token = reader.nextToken();
            if (token == null) {
                break;
            }
            
            Integer fieldIndex = fieldNameMap.get(fieldName);
            if(fieldIndex != null) {
                setJsonFields(reader, struct, fieldIndex, arraySizeValidator, fieldName);
            } else {
                if (this.ignoreUnknownFields) {
                    logger.severe("cannot find structureField corresponding to field named, " + fieldName);
                    reader.skipChildren();
                } else {
                    throw new UnmarshallException("cannot find structureField corresponding to field named, " + fieldName);
                }
            }
        }
        
        try { 
        	arraySizeValidator.validate();
        } catch (Exception e) {
        	logger.log(Level.WARNING, "", e);
        }
        
        return struct;
    
    }
    
    private void setJsonFields(JsonParser reader, Object struct, Integer index, com.tmax.promapper.generator.util.JsonArraySizeValidator arraySizeValidator, String fieldName) throws Exception {
        try {
            switch(index){
            case 0:
                setJsonField_0(reader, struct, arraySizeValidator, fieldName);
                break;
            case 1:
                setJsonField_1(reader, struct, arraySizeValidator, fieldName);
                break;
            case 2:
                setJsonField_2(reader, struct, arraySizeValidator, fieldName);
                break;
            case 3:
                setJsonField_3(reader, struct, arraySizeValidator, fieldName);
                break;
            case 4:
                setJsonField_4(reader, struct, arraySizeValidator, fieldName);
                break;
            }
        } catch(Exception e) {
            StringBuilder esb = new StringBuilder(e.getClass().getName()).append(" [FIELD: ").append(fieldName).append("] ");
            if(e.getMessage() != null) 
                esb.append(": ").append(e.getMessage());
            throw new Exception(esb.toString(), e);
        }
    }

    private void setJsonField_0(JsonParser reader, Object struct, com.tmax.promapper.generator.util.JsonArraySizeValidator arraySizeValidator, String fieldName ) throws Exception {
        hwgi.o28.mem.txGrp_1000.tx_210.Body dataObject = (hwgi.o28.mem.txGrp_1000.tx_210.Body)struct;
        java.text.SimpleDateFormat df;
        java.util.Calendar cal;
        int arraySize;
        if (reader.getCurrentToken() == JsonToken.START_OBJECT || reader.getCurrentToken() == JsonToken.START_ARRAY) {
            throw new UnmarshallException("cannot find structureField corresponding to field named, " + fieldName);
        }
        if(!reader.getText().equals("null")) {
 
            dataObject.setMgmBldrgstPk(reader.getText(), this.masked);
        } else {
            if (reader.getCurrentToken() == JsonToken.VALUE_NULL) {
                dataObject.setMgmBldrgstPk(null, this.masked);
            } else {
                dataObject.setMgmBldrgstPk("null", this.masked);
            }
        }
    }

    private void setJsonField_1(JsonParser reader, Object struct, com.tmax.promapper.generator.util.JsonArraySizeValidator arraySizeValidator, String fieldName ) throws Exception {
        hwgi.o28.mem.txGrp_1000.tx_210.Body dataObject = (hwgi.o28.mem.txGrp_1000.tx_210.Body)struct;
        java.text.SimpleDateFormat df;
        java.util.Calendar cal;
        int arraySize;
        if (reader.getCurrentToken() == JsonToken.START_OBJECT || reader.getCurrentToken() == JsonToken.START_ARRAY) {
            throw new UnmarshallException("cannot find structureField corresponding to field named, " + fieldName);
        }
        if(!reader.getText().equals("null")) {
 
            dataObject.setRegstrGbCd(reader.getText(), this.masked);
        } else {
            if (reader.getCurrentToken() == JsonToken.VALUE_NULL) {
                dataObject.setRegstrGbCd(null, this.masked);
            } else {
                dataObject.setRegstrGbCd("null", this.masked);
            }
        }
    }

    private void setJsonField_2(JsonParser reader, Object struct, com.tmax.promapper.generator.util.JsonArraySizeValidator arraySizeValidator, String fieldName ) throws Exception {
        hwgi.o28.mem.txGrp_1000.tx_210.Body dataObject = (hwgi.o28.mem.txGrp_1000.tx_210.Body)struct;
        java.text.SimpleDateFormat df;
        java.util.Calendar cal;
        int arraySize;
        if (reader.getCurrentToken() == JsonToken.START_OBJECT || reader.getCurrentToken() == JsonToken.START_ARRAY) {
            throw new UnmarshallException("cannot find structureField corresponding to field named, " + fieldName);
        }
        if(!reader.getText().equals("null")) {
 
            dataObject.setRegstrKindCd(reader.getText(), this.masked);
        } else {
            if (reader.getCurrentToken() == JsonToken.VALUE_NULL) {
                dataObject.setRegstrKindCd(null, this.masked);
            } else {
                dataObject.setRegstrKindCd("null", this.masked);
            }
        }
    }

    private void setJsonField_3(JsonParser reader, Object struct, com.tmax.promapper.generator.util.JsonArraySizeValidator arraySizeValidator, String fieldName ) throws Exception {
        hwgi.o28.mem.txGrp_1000.tx_210.Body dataObject = (hwgi.o28.mem.txGrp_1000.tx_210.Body)struct;
        java.text.SimpleDateFormat df;
        java.util.Calendar cal;
        int arraySize;
        if (reader.getCurrentToken() == JsonToken.START_OBJECT || reader.getCurrentToken() == JsonToken.START_ARRAY) {
            throw new UnmarshallException("cannot find structureField corresponding to field named, " + fieldName);
        }
        if(!reader.getText().equals("null")) {
 
            dataObject.setBldNm(reader.getText(), this.masked);
        } else {
            if (reader.getCurrentToken() == JsonToken.VALUE_NULL) {
                dataObject.setBldNm(null, this.masked);
            } else {
                dataObject.setBldNm("null", this.masked);
            }
        }
    }

    private void setJsonField_4(JsonParser reader, Object struct, com.tmax.promapper.generator.util.JsonArraySizeValidator arraySizeValidator, String fieldName ) throws Exception {
        hwgi.o28.mem.txGrp_1000.tx_210.Body dataObject = (hwgi.o28.mem.txGrp_1000.tx_210.Body)struct;
        java.text.SimpleDateFormat df;
        java.util.Calendar cal;
        int arraySize;
        if (reader.getCurrentToken() == JsonToken.START_OBJECT || reader.getCurrentToken() == JsonToken.START_ARRAY) {
            throw new UnmarshallException("cannot find structureField corresponding to field named, " + fieldName);
        }
        if(!reader.getText().equals("null")) {
 
            dataObject.setTotarea(reader.getText(), this.masked);
        } else {
            if (reader.getCurrentToken() == JsonToken.VALUE_NULL) {
                dataObject.setTotarea(null, this.masked);
            } else {
                dataObject.setTotarea("null", this.masked);
            }
        }
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
            return "BodyJSON";
        } else if (input.equalsIgnoreCase(META_VERSION_NO)) {
            return null;
        } else if (input.equalsIgnoreCase(META_LOGICAL_NAME)) {
            return "body";
        } else if (input.equalsIgnoreCase(META_RESOURCE_ID)) {
            return "hwgi.o28.mem.txGrp_1000.tx_210:BodyJSON.msg";
        } else if (input.equalsIgnoreCase(META_RESOURCE_TYPE)) {
            return "MESSAGE";
        } else if (input.equalsIgnoreCase(META_RESOURCE_PATH)) {
            return "hwgi.o28.mem.txGrp_1000.tx_210";
        } else if (input.equalsIgnoreCase(META_RESOURCE_GROUP)) {
            return "";
        } else if (input.equalsIgnoreCase(META_MESSAGE_TYPE)) {
              return "JSON";
        } else if (input.equalsIgnoreCase(META_MESSAGE_STRUCTURE_NAME)) {
            return "Body";
        } else if (input.equalsIgnoreCase(META_MESSAGE_STRUCTURE_PATH)) {
            return "hwgi.o28.mem.txGrp_1000.tx_210";
        } else if (input.equalsIgnoreCase(META_MESSAGE_STRUCTURE_ID)) {
            return "hwgi.o28.mem.txGrp_1000.tx_210:Body.umsg";
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

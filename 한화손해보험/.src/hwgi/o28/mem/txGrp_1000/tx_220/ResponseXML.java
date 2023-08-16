/*
 * 작성된 날짜: Aug 16, 2023
 * Copyright (c) 2023 TmaxSoft co., Ltd. All rights reserved.
 */
package hwgi.o28.mem.txGrp_1000.tx_220;

import com.tmax.promapper.engine.base.ProMapperDataObject;
import proframe.dto.DataObject;
import java.util.logging.Level;
import com.tmax.anylink.logging.Logger;
import com.tmax.promapper.engine.base.MessageFieldProperty;
import com.tmax.promapper.engine.base.MessageFieldType;
import com.tmax.promapper.engine.base.ResourceMeta;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;
import java.util.HashMap;
import javax.xml.stream.XMLStreamReader;
import java.io.ByteArrayOutputStream;
import javax.xml.stream.XMLStreamWriter;
import javax.xml.stream.XMLStreamConstants;
import com.tmax.promapper.engine.exception.UnmarshallException;
import javax.xml.transform.Source;
import javax.xml.transform.dom.DOMSource;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import javax.xml.namespace.QName;
import javax.xml.transform.Result;
import javax.xml.transform.dom.DOMResult;
import com.tmax.promapper.engine.util.Constants;
import com.tmax.promapper.engine.util.XPathProcessor;
import com.tmax.promapper.engine.util.XMLUtil;
import java.math.BigDecimal;

import com.tmax.promapper.engine.base.XMLMessage;

/**
 * @file              hwgi.o28.mem.txGrp_1000.tx_220.ResponseXML.java
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



public class ResponseXML extends com.tmax.promapper.engine.base.XMLMessage implements ResourceMeta {
    private static Logger logger = Logger.getLogger(XMLMessage.class.getName()); 
    
    private Boolean isRPCEncoded = new Boolean(false);
    
    private static final QName messageElementName = new QName("response");

    
    private static final QName complexTypeName = new QName("response");

    
    public QName getMessageElementName() {
        return messageElementName;
    }
    
    public QName getComplexTypeName() {
        return complexTypeName;
    }
    
    private static final HashMap<String,String> nsMap = new HashMap<String,String>();
    
    static {
    }
    
    private String currentPrefix = null;
    
    private String currentNameSpaceURI = null;
    
    public ResponseXML() {
        super();
    }

    public ResponseXML(int conversionType) {
        super(conversionType);
    }

    public ResponseXML(String charsetName) {
        super(charsetName);
    }
    
    public void setIsRPCEncoded(boolean isRPCEncoded){
        this.isRPCEncoded = isRPCEncoded;
    }
    
    /* marshall method */
    public byte[] marshalObject(Object obj, boolean writeXMLProcessingInstruction) throws Exception {
        return marshalObject(obj, writeXMLProcessingInstruction, true);
    }
    
    public byte[] marshalObject(Object obj, boolean writeXMLProcessingInstruction, boolean selfCloseFlag) throws Exception {
        ByteArrayOutputStream bout = new ByteArrayOutputStream();
        XMLStreamWriter writer = XMLUtil.createXMLStreamWriter(this, writeXMLProcessingInstruction, bout, selfCloseFlag);
        
        hwgi.o28.mem.txGrp_1000.tx_220.Response  _responseXML = (hwgi.o28.mem.txGrp_1000.tx_220.Response)obj;
        
        marshalObject(_responseXML, writer, messageElementName);
        
        writer.writeEndDocument();
        writer.flush();
        writer.close();
        
        return bout.toByteArray();
    }
    
    public void marshalObject(Object dataObject, XMLStreamWriter writer) throws Exception {
        marshalObject(dataObject, writer, messageElementName);
    }
    
    public void marshalObject(Object dataObject, XMLStreamWriter writer, QName rootElementName) throws Exception {
        hwgi.o28.mem.txGrp_1000.tx_220.Response _responseXML = (hwgi.o28.mem.txGrp_1000.tx_220.Response)dataObject;
        XMLUtil.writeStartElementAndNamspaceDeclaration(rootElementName, writer, nsMap, null);
        
        if(nsMap != null){
        	for(String nsUri : nsMap.keySet()){
        		String prefix = nsMap.get(nsUri);
        		writer.writeNamespace(prefix, nsUri);
        	}
        }
        
        marshalXmlBody(_responseXML, writer);
        
        writer.writeEndElement();//endElement for rootElement
    }
    
    /**
     * RPC Encoded를 위한 marshal method...element에 type 정보를 첨부해준다.
     *
     */
    public void marshalObject(Object dataObject, XMLStreamWriter writer, QName rootElementName, Boolean isRPCEncoded) throws Exception {
        hwgi.o28.mem.txGrp_1000.tx_220.Response _responseXML = (hwgi.o28.mem.txGrp_1000.tx_220.Response)dataObject;
        XMLUtil.writeStartElementAndNamspaceDeclaration(rootElementName, writer, nsMap, null);
        this.isRPCEncoded = isRPCEncoded;
        
        if(nsMap != null){
        	for(String nsUri : nsMap.keySet()){
        		String prefix = nsMap.get(nsUri);
        		writer.writeNamespace(prefix, nsUri);
        	}
        }
        
        marshalXmlBody(_responseXML, writer);
        
        writer.writeEndElement();//endElement for rootElement
    }
    
    /** 
     * messageField들을 위한 startElement, elementContent, endElement를 찍는다.
     *
     */
    public void marshalXmlBody(hwgi.o28.mem.txGrp_1000.tx_220.Response _responseXML, XMLStreamWriter writer) throws javax.xml.stream.XMLStreamException, com.tmax.promapper.engine.exception.MarshallException {
    
        marshalXmlBody_0(_responseXML, writer);
    }
    
    private void marshalXmlBody_0(hwgi.o28.mem.txGrp_1000.tx_220.Response _responseXML, XMLStreamWriter writer) throws javax.xml.stream.XMLStreamException, com.tmax.promapper.engine.exception.MarshallException {
        char[] c = null;
        
            
            //element field name is ifid. nillable="false", minOccurs="1"
        if(_responseXML.getIfid() == null) {
            writer.writeStartElement("ifid");
            if (isRPCEncoded) {
                writer.writeAttribute(PREFIX_XSI, NS_XSI, "type", "xs:string");
                writer.writeNamespace(PREFIX_SOAP_ENC, URI_NS_SOAP_ENC);
                writer.writeNamespace("xs", "http://www.w3.org/2001/XMLSchema");
            }
            writer.writeEndElement();
        } else {
            writer.writeStartElement("ifid");
            if (isRPCEncoded) {
                writer.writeAttribute(PREFIX_XSI, NS_XSI, "type", "xs:string");
                writer.writeNamespace(PREFIX_SOAP_ENC, URI_NS_SOAP_ENC);
                writer.writeNamespace("xs", "http://www.w3.org/2001/XMLSchema");
            }
            if(!_responseXML.getIfid(this.masked).equals("")) {
					writer.writeCharacters(_responseXML.getIfid(this.masked));
			}
            writer.writeEndElement();
        }
            //element field name is requestDate. nillable="false", minOccurs="1"
        if(_responseXML.getRequestDate() == null) {
            writer.writeStartElement("requestDate");
            if (isRPCEncoded) {
                writer.writeAttribute(PREFIX_XSI, NS_XSI, "type", "xs:string");
                writer.writeNamespace(PREFIX_SOAP_ENC, URI_NS_SOAP_ENC);
                writer.writeNamespace("xs", "http://www.w3.org/2001/XMLSchema");
            }
            writer.writeEndElement();
        } else {
            writer.writeStartElement("requestDate");
            if (isRPCEncoded) {
                writer.writeAttribute(PREFIX_XSI, NS_XSI, "type", "xs:string");
                writer.writeNamespace(PREFIX_SOAP_ENC, URI_NS_SOAP_ENC);
                writer.writeNamespace("xs", "http://www.w3.org/2001/XMLSchema");
            }
            if(!_responseXML.getRequestDate(this.masked).equals("")) {
					writer.writeCharacters(_responseXML.getRequestDate(this.masked));
			}
            writer.writeEndElement();
        }
            //element field name is requestNo. nillable="false", minOccurs="1"
        if(_responseXML.getRequestNo() == null) {
            writer.writeStartElement("requestNo");
            if (isRPCEncoded) {
                writer.writeAttribute(PREFIX_XSI, NS_XSI, "type", "xs:string");
                writer.writeNamespace(PREFIX_SOAP_ENC, URI_NS_SOAP_ENC);
                writer.writeNamespace("xs", "http://www.w3.org/2001/XMLSchema");
            }
            writer.writeEndElement();
        } else {
            writer.writeStartElement("requestNo");
            if (isRPCEncoded) {
                writer.writeAttribute(PREFIX_XSI, NS_XSI, "type", "xs:string");
                writer.writeNamespace(PREFIX_SOAP_ENC, URI_NS_SOAP_ENC);
                writer.writeNamespace("xs", "http://www.w3.org/2001/XMLSchema");
            }
            if(!_responseXML.getRequestNo(this.masked).equals("")) {
					writer.writeCharacters(_responseXML.getRequestNo(this.masked));
			}
            writer.writeEndElement();
        }
            //element field name is systemId. nillable="false", minOccurs="1"
        if(_responseXML.getSystemId() == null) {
            writer.writeStartElement("systemId");
            if (isRPCEncoded) {
                writer.writeAttribute(PREFIX_XSI, NS_XSI, "type", "xs:string");
                writer.writeNamespace(PREFIX_SOAP_ENC, URI_NS_SOAP_ENC);
                writer.writeNamespace("xs", "http://www.w3.org/2001/XMLSchema");
            }
            writer.writeEndElement();
        } else {
            writer.writeStartElement("systemId");
            if (isRPCEncoded) {
                writer.writeAttribute(PREFIX_XSI, NS_XSI, "type", "xs:string");
                writer.writeNamespace(PREFIX_SOAP_ENC, URI_NS_SOAP_ENC);
                writer.writeNamespace("xs", "http://www.w3.org/2001/XMLSchema");
            }
            if(!_responseXML.getSystemId(this.masked).equals("")) {
					writer.writeCharacters(_responseXML.getSystemId(this.masked));
			}
            writer.writeEndElement();
        }
            //element field name is resultCode. nillable="false", minOccurs="1"
        //primitive type
            writer.writeStartElement("resultCode");
            if (isRPCEncoded) {
                writer.writeAttribute(PREFIX_XSI, NS_XSI, "type", "xs:long");
                writer.writeNamespace(PREFIX_SOAP_ENC, URI_NS_SOAP_ENC);
                writer.writeNamespace("xs", "http://www.w3.org/2001/XMLSchema");
            }
        writer.writeCharacters(Long.toString(_responseXML.getResultCode()));
        writer.writeEndElement();
            //element field name is body. nillable="false", minOccurs="0"
        if(!XMLUtil.isDataObjectValueSet(_responseXML.getBody())) {
            //Nothing to do. minOccurs ==0
        } else {
            writer.writeStartElement("body");
            if (isRPCEncoded) {
                writer.writeAttribute(PREFIX_XSI, NS_XSI, "type", "body");
                writer.writeNamespace(PREFIX_SOAP_ENC, URI_NS_SOAP_ENC);
                writer.writeNamespace("body", "");
            }
            hwgi.o28.mem.txGrp_1000.tx_220.BodyXML bodyMessage = new hwgi.o28.mem.txGrp_1000.tx_220.BodyXML();
            bodyMessage.setIsRPCEncoded(isRPCEncoded);
            bodyMessage.setMasked(this.masked);
            if(currentNameSpaceURI != null && currentPrefix != null) {
                bodyMessage.saveCurrentNameSpace(currentNameSpaceURI, currentPrefix);
            }
				bodyMessage.marshalXmlBody(_responseXML.getBody(), writer);
            
            writer.writeEndElement();
        }
    }
    
    
    /*
     * xPathProcessor가 startElement를 모두 다 찍고, messageField부분은 marshalXmlBody가 찍는다.
     */
    public void marshalObject(Object obj, Node node, String xPathExpression) throws Exception {
        marshalObject(obj, node, xPathExpression, true);
    }
    
    public void marshalObject(Object obj, Node node, String xPathExpression, boolean selfCloseFlag) throws Exception {
        Node targetNode = null;
        XMLStreamWriter writer = null;
        if(xPathExpression == null) {
            targetNode = node;
            Result target = new DOMResult(targetNode);
            writer = XMLUtil.createXMLStreamWriter(target, selfCloseFlag);
            writer.writeStartDocument();
            XMLUtil.writeStartElementAndNamspaceDeclaration(messageElementName, writer, nsMap, null);
            
            if(nsMap != null){
        		for(String nsUri : nsMap.keySet()){
        			String prefix = nsMap.get(nsUri);
        			writer.writeNamespace(prefix, nsUri);
        		}
        	}
        } else {
            XPathProcessor xPathProc = new XPathProcessor(xPathExpression);
            targetNode = xPathProc.createNode(node);
            Result target = new DOMResult(targetNode);
            writer = XMLUtil.createXMLStreamWriter(target, selfCloseFlag);
        }
        
        //writer.writeNamespace("xsi", "http://www.w3.org/2001/XMLSchema-instance");
        hwgi.o28.mem.txGrp_1000.tx_220.Response _responseXML = (hwgi.o28.mem.txGrp_1000.tx_220.Response)obj;
        marshalXmlBody(_responseXML, writer);  
        //writer.writeEndDocument();
        writer.flush();
        writer.close();
        
    }
    
    /*
     * xPathProcessor가 startElement를 모두 다 찍고, messageField부분은 marshalXmlBody가 찍는다.
     */
    public byte[] marshalObject(Object obj, String xPathExpression, boolean writeXMLProcessingInstruction) throws Exception{
        return marshalObject(obj, xPathExpression, writeXMLProcessingInstruction, true);
    }
    
    public byte[] marshalObject(Object obj, String xPathExpression, boolean writeXMLProcessingInstruction, boolean selfCloseFlag) throws Exception{
        ByteArrayOutputStream bout = new ByteArrayOutputStream();
        XMLStreamWriter writer = XMLUtil.createXMLStreamWriter(this, writeXMLProcessingInstruction, bout, selfCloseFlag);
        
        hwgi.o28.mem.txGrp_1000.tx_220.Response  _responseXML = (hwgi.o28.mem.txGrp_1000.tx_220.Response)obj;
        
        int startElementCountByXPath = 0;
        if(xPathExpression != null) {
            XPathProcessor xPathProc = new XPathProcessor(xPathExpression);
            startElementCountByXPath = xPathProc.writeElements(writer);
        }
        
        marshalXmlBody(_responseXML, writer);
        
        for(int i = 0; i < startElementCountByXPath; i++) {
            writer.writeEndElement();
        }
        writer.writeEndDocument();
        writer.flush();
        writer.close();
        
        return bout.toByteArray();
    }
    
    public void marshalObjectExceptRootElement(Object obj, XMLStreamWriter writer) throws Exception {
        hwgi.o28.mem.txGrp_1000.tx_220.Response  _responseXML = (hwgi.o28.mem.txGrp_1000.tx_220.Response)obj;
        marshalXmlBody(_responseXML, writer);
    }
        /*all hashmaps declared below have (String dtoFieldName, Integer caseInt) pairs.
           These will be used to determine which setter method in Dto will be invoked.         
           A hashset named nillableFieldSet, contatins fields declared nillable in the XML schema*/
        static Map<QName, Integer> nillableFieldMap = new HashMap<QName, Integer>(6);
        static Map<QName, Integer> attributeFieldMap = new HashMap<QName, Integer>(6);
        static Map<QName, Integer> simpleTypeFieldMap = new HashMap<QName, Integer>(6);
        static Map<QName, Integer> complexTypeFieldMap = new HashMap<QName, Integer>(6);
        static Map<QName, Integer> customHandlerFieldMap = new HashMap<QName, Integer>();
        
        static{
                    //element
            simpleTypeFieldMap.put(new QName("", "ifid"), 0);
                    //element
            simpleTypeFieldMap.put(new QName("", "requestDate"), 1);
                    //element
            simpleTypeFieldMap.put(new QName("", "requestNo"), 2);
                    //element
            simpleTypeFieldMap.put(new QName("", "systemId"), 3);
                    //element
            simpleTypeFieldMap.put(new QName("", "resultCode"), 4);
                    //include
            complexTypeFieldMap.put(new QName("", "body"), 5);
            //simpleTypeFieldMap.put(XMLMessage.nil, 6);
            //simpleTypeFieldMap.put(XMLMessage.schemaLocation, 7);
            //simpleTypeFieldMap.put(XMLMessage.noNamespaceSchemaLocation, 8);
        }
        
        public static Map<QName, Integer> getComplexTypeFieldMap() {
            return complexTypeFieldMap;
        }
        
        public static Map<QName, Integer> getSimpleTypeFieldMap() {
            return simpleTypeFieldMap;
        }
        public void setSimpleTypeField(QName _argElementName, Integer _argFieldIndex, XMLStreamReader _argReader, hwgi.o28.mem.txGrp_1000.tx_220.Response _argStructure) throws  UnmarshallException, javax.xml.stream.XMLStreamException, Exception {
            String value = _argReader.getElementText();
        
            if(logger.isLoggable(Level.FINEST)) {
                logger.finest("START_ELEMENT, [" + _argElementName.toString() + "] elementText= [" + value + "]");
            }
        
            if(_argFieldIndex >= 0 && _argFieldIndex < 250)
                setSimpleTypeField_0(_argElementName, _argFieldIndex, _argReader, _argStructure, value);
                
        }
    
        public void setSimpleTypeField_0(QName _argElementName, Integer _argFieldIndex, XMLStreamReader _argReader, hwgi.o28.mem.txGrp_1000.tx_220.Response _argStructure, String value) throws  UnmarshallException, javax.xml.stream.XMLStreamException, Exception {
                      
            try{
                switch(_argFieldIndex) {
            
                case 0:
                    _argStructure.setIfid(value, this.masked);
                    break;
                case 1:
                    _argStructure.setRequestDate(value, this.masked);
                    break;
                case 2:
                    _argStructure.setRequestNo(value, this.masked);
                    break;
                case 3:
                    _argStructure.setSystemId(value, this.masked);
                    break;
                case 4:
                    _argStructure.setResultCode(value == null || value.length() == 0 ? 0 : Long.parseLong(value));
                    break;
                default:
                    if (this.ignoreUnknownFields) {
                        logger.warning("cannot find structureField corresponding to element named, " + _argElementName.toString());
                    } else {
                        throw new UnmarshallException("cannot find structureField corresponding to element named, " + _argElementName.toString());
                    }
                }
            } catch(Exception e) {
                StringBuilder esb = new StringBuilder(e.getClass().getName()).append(" [FIELD: ").append(_argElementName.toString()).append("] ");
                if(e.getMessage() != null) 
                    esb.append(": ").append(e.getMessage());
                throw new Exception(esb.toString(), e);
            }
        }
    
    /** 
     * 포함하고있는 elementName이 오면 set후 return true; otherwise return false;
     */
    public void setComplexTypeField(QName _argElementName, Integer _argFieldIndex, XMLStreamReader _argReader, hwgi.o28.mem.txGrp_1000.tx_220.Response _argStructure) throws Exception{
        boolean isNil = false;
        if(customHandlerFieldMap.get(_argElementName) != null) {
            setCustomHandlerField(_argElementName, customHandlerFieldMap.get(_argElementName), _argReader, _argStructure);    
        }    else {
            switch(_argFieldIndex) {
            case 5:
                hwgi.o28.mem.txGrp_1000.tx_220.BodyXML _body = new hwgi.o28.mem.txGrp_1000.tx_220.BodyXML();
                hwgi.o28.mem.txGrp_1000.tx_220.Body body_struct = new hwgi.o28.mem.txGrp_1000.tx_220.Body();
                {
							isNil = _body.unmarshalObject(_argReader, body_struct, _argElementName);
                    _argStructure.setBody(body_struct);
                    //_argReader.nextTag();//move out from EndElement to next child element.
                }
                break;
            default:
                if (this.ignoreUnknownFields) {
                    logger.warning("cannot find structureField corresponding to element named, " + _argElementName.toString());
                } else {
                    throw new UnmarshallException("cannot find structureField corresponding to element named, " + _argElementName.toString());
                }
            }
        }
            
    }
    
    /*rootElement의 attribute가 된 field들을 처리*/
    public void setAttributeField(QName attrName, String attrValue, hwgi.o28.mem.txGrp_1000.tx_220.Response _argStructure) throws  UnmarshallException {
        Integer fieldIndex = (Integer)attributeFieldMap.get(attrName);
        
        if(fieldIndex == null) {
            //throw new UnmarshallException("cannot find structure field corresponding to attribute named " + attrName.toString());
            if ("href".equals(attrName.toString())) {
                return;
            }
            logger.severe("cannot find structure field corresponding to attribute named " + attrName.toString());
        }
        
    
        switch(fieldIndex) {
        default:
            if (this.ignoreUnknownFields) {
                logger.warning("cannot find structure field corresponding to attribute named " + attrName.toString());
            } else {
                throw new UnmarshallException("cannot find structure field corresponding to attribute named " + attrName.toString());
            }
        }
    
    }
    
    /* xsi: attribute를 처리하는 method , nil=true를 만나서 null로 set하는 경우 return true;*/
    public boolean setAttribute(QName _argElementName, QName attrName, String value, hwgi.o28.mem.txGrp_1000.tx_220.Response _argStructure) throws  UnmarshallException{
        // xsi:nil처리
        if( attrName.equals(XMLMessage.nil)) {
            Integer fieldIndex = (Integer)nillableFieldMap.get(_argElementName);
            if(fieldIndex == null) {
                //throw new UnmarshallException("cannot find structure field corresponding to element named " + _argElementName.toString());
                logger.severe("cannot find structure field corresponding to attribute named " + attrName.toString());
            }
            
            switch(fieldIndex) {
            default:
                throw new UnmarshallException("elementName = " + _argElementName + " is not nillable");    
            }
        } else if(attrName.equals(XMLMessage.type)) {
        } else {
        }
        return false;
    }
    
    public boolean setCustomHandlerField(QName _argElementName, Integer _argFieldIndex, XMLStreamReader _argReader, hwgi.o28.mem.txGrp_1000.tx_220.Response _argStructure) throws Exception{
        switch(_argFieldIndex) {
        default:
            if (!this.ignoreUnknownFields) {
                throw new UnmarshallException("cannot find structureField corresponding to element named, " + _argElementName.toString());
            }
            logger.warning("cannot find structureField corresponding to element named, " + _argElementName.toString());
            return false;
        }
    }
    //return true 이면, caller가 object를 null로 set해야한다.
    public boolean unmarshalObject(XMLStreamReader reader, Object object) throws Exception {
        return unmarshalObject(reader, object, new QName("","response"));
    }
    
    //return true 이면, caller가 object를 null로 set해야한다. 
    public boolean unmarshalObject(XMLStreamReader reader, Object object, QName rootElement) throws Exception {
        hwgi.o28.mem.txGrp_1000.tx_220.Response  _responseXML = (hwgi.o28.mem.txGrp_1000.tx_220.Response)object;
        
        QName currentElem = null;
        int state = XMLMessage.INIT;
        
        boolean afterRootElement = false; // RootElement.equals 매번 call하지 않게 하려고,,
        
        while(state != XMLMessage.FINAL) {
            switch(state) {
            case XMLMessage.INIT:
                if(logger.isLoggable(Level.FINEST)) {
                    logger.finest("unmarshall Initiated.");
                }
                
                state = XMLUtil.gotoNextState(reader, state, rootElement);
                break;
                
            case XMLMessage.START_ELEMENT:
                currentElem = reader.getName();
                
                if(logger.isLoggable(Level.FINEST)) {
                    logger.finest("START_ELEMENT, [" + currentElem.toString() + "]");
                }
                
                boolean isCurrentElemNil = false;
                
                int attrCount = reader.getAttributeCount();
                if(!afterRootElement && currentElem.equals(rootElement)) {
                    for(int i = 0; i < attrCount; i++) {
                        QName attrName = reader.getAttributeName(i);
                        String attrValue = reader.getAttributeValue(i);
                        
                        if(logger.isLoggable(Level.FINEST)) {
                            logger.finest("START_ELEMENT, [" + currentElem.toString() + "] attribute = [" + attrName.toString() + "], value = " + attrValue);
                        }
                        
                        String attrNSURI = attrName.getNamespaceURI();
                        if(attrNSURI.equals(XMLMessage.XSI)) {
                            if(attrName.equals(XMLMessage.nil)) {
                                //this method return true if there exists a xsi:nil="true" attribute so that caller can set dto as null.
                                return Boolean.parseBoolean(attrValue);
                            } else if(attrName.equals(XMLMessage.type)) {
                                //skip attributes except xsi:nil.
                            }
                        } else if(attrNSURI.startsWith(XMLMessage.URI_NS_XMLSOAP)) {
                            //skip
                        } else {
                            setAttributeField(attrName, attrValue, _responseXML);
                        }
                    }
                    afterRootElement = true;
                     
                } else {
                    //currentElement.equals(root Element) == false;
                    for(int i = 0; i < attrCount; i++) {
                        QName attrName = reader.getAttributeName(i);
                        String attrValue = reader.getAttributeValue(i);
                        
                        if(logger.isLoggable(Level.FINEST)) {
                            logger.finest("START_ELEMENT, [" + currentElem.toString() + "] attribute = [" + attrName.toString() + "], value = " + attrValue);
                        }
                        
                        isCurrentElemNil = setAttribute(currentElem, attrName, attrValue, _responseXML);
                    }
                    
                    if(isCurrentElemNil) {
                        // current element xsi:nil="true" 이면 nextTag.
                        reader.nextTag();
                    } else {
                        Integer fieldIndex = complexTypeFieldMap.get(currentElem);;
                        if(fieldIndex == null) {
                            //find in super class if this class has a parent Message.
                        }
                                                
                        if(fieldIndex != null) {
                            setComplexTypeField(currentElem, fieldIndex, reader, _responseXML);
                        } else {
                            fieldIndex = simpleTypeFieldMap.get(currentElem);
        
                            if(fieldIndex != null) {
                                setSimpleTypeField(currentElem, fieldIndex, reader, _responseXML);
                            } else {
                                if (this.ignoreUnknownFields) {
                                    int next = reader.next();
                                    logger.warning("cannot find structureField corresponding to element named <" + currentElem.toString() + ">");
                                    // System.out.println("cannot find structureField corresponding to element named <" + currentElem.toString() + "> with next event [" + next + "]");
                                } else {
                                    throw new UnmarshallException("cannot find structureField corresponding to element named, " + currentElem.toString());
                                }
                            }
                            
                        }
                    }
                }
                
                /*
                 * rootElement인 경우와 childElement인 경우 각각 처리 후
                 * 다음 event(actually, next Tag)로 move 한 시점. 
                 */
                reader.nextTag();
                state = XMLUtil.gotoNextState(reader, state, rootElement);
                break;
            
            case XMLMessage.END_ELEMENT:
                //종료조건확인
                currentElem = reader.getName();
                
                if(logger.isLoggable(Level.FINEST)) {
                    logger.finest("END_ELEMENT, [" + currentElem.toString() + "]");
                }
                
                if(currentElem.equals(rootElement)) {
                    state = XMLMessage.FINAL;
                } else {
                    reader.nextTag();
                    state = XMLUtil.gotoNextState(reader, state, rootElement);
                }
                break;
            }
        }
        
        return false;
    }
    
    /* 
        Stream+XML type인 경우 사용할 수 있다.
        한 번만 call 되어야한다, find XMLProcessingInstruction을 2번 call하는 경우 문제가 생긴다.
    */
    public Object unmarshalObject(byte[] msg, int offset) throws Exception {
        InputStream bin = new ByteArrayInputStream(msg,offset, msg.length-offset);
        XMLStreamReader reader = XMLUtil.createXMLStreamReader(bin);
        
        hwgi.o28.mem.txGrp_1000.tx_220.Response  struct = new hwgi.o28.mem.txGrp_1000.tx_220.Response();
        boolean isNil = unmarshalObject(reader, struct);
        if(isNil) {
            struct = null;
        }
        
        setOffset(msg.length - bin.available());
        bin.close();

        return struct;
    }
    
    public int unmarshalObject(byte[] msg, int offset, Object obj) throws Exception {
        return unmarshalObject(msg, offset, msg.length-offset, obj);
    }
    
    public int unmarshalObject(byte[] msg, int offset, int length, Object obj) throws Exception {
        InputStream bin = new ByteArrayInputStream(msg, offset, length);
        XMLStreamReader reader = XMLUtil.createXMLStreamReader(bin);
        boolean isNil = unmarshalObject(reader, obj);
        if(isNil) {
            obj = null;
        }
        bin.close();
        int newOffset = offset+length;
        setOffset(newOffset);
        return newOffset;
    }
    
    public Object unmarshalObject(Node message, QName rootElement) throws Exception {
        Source source = new DOMSource(message);
        XMLStreamReader reader = XMLUtil.createXMLStreamReader(source);
        hwgi.o28.mem.txGrp_1000.tx_220.Response  struct = new hwgi.o28.mem.txGrp_1000.tx_220.Response();
        //unmarshalObject(reader, rootElement, struct);
        boolean isNil = unmarshalObject(reader, struct, rootElement);
        if(isNil) {
            struct = null;
        }
        return struct;
    }
    
    static Map<String, Node> referNodeMap = new HashMap<String, Node>();
    /**
     *  unmarshal method for RPC Encoded
     */
    public Object unmarshalObject(NodeList nodeList, QName rootElement, Boolean isRPCEncoded) throws Exception {
        this.isRPCEncoded = isRPCEncoded;
        Node node = null;
        if (this.isRPCEncoded) {
            node = XMLUtil.parseXMLRef(nodeList, referNodeMap);
        } else {
            node = nodeList.item(0);
        }

        return unmarshalObject(node, rootElement);
    }
    
    public Object unmarshalObject(Node message) throws Exception {
        return unmarshalObject(message, messageElementName);
    }
    
    public Object unmarshalObject(byte[] msg, int offset, String xPathExpression, QName rootElement) throws Exception {
        InputStream bin = new ByteArrayInputStream(msg,offset, msg.length-offset);
        XMLStreamReader reader = XMLUtil.createXMLStreamReader(bin);
        //xpath 처리하여 root element 뛰어 넘는 logic을 가진 api call.
        XPathProcessor xPathProc = new XPathProcessor(xPathExpression);
        xPathProc.passElements(reader);
        hwgi.o28.mem.txGrp_1000.tx_220.Response  struct = new hwgi.o28.mem.txGrp_1000.tx_220.Response();
        boolean isNil = unmarshalObject(reader, struct, rootElement);
        if(isNil) {
            struct = null;
        }
        bin.close();
        return struct;
    }
    
    public Object unmarshalObject(byte[] msg, int offset, String xPathExpression) throws Exception {
        return unmarshalObject(msg, offset, xPathExpression, messageElementName);
    }
    
    public Object unmarshalObjectExceptRootElement(XMLStreamReader reader) throws Exception{
        hwgi.o28.mem.txGrp_1000.tx_220.Response  struct = new hwgi.o28.mem.txGrp_1000.tx_220.Response();
        QName currentElementName = new QName(reader.getNamespaceURI(), reader.getLocalName());
        boolean isNil = unmarshalObject(reader, struct, currentElementName);
        
        return isNil?null:struct;
    }
    
    public void saveCurrentNameSpace(String nameSpaceURI, String prefix){
        this.nsMap.put(nameSpaceURI, prefix);
        this.currentNameSpaceURI = nameSpaceURI;
        this.currentPrefix = prefix;
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
            return "ResponseXML";
        } else if (input.equalsIgnoreCase(META_VERSION_NO)) {
            return null;
        } else if (input.equalsIgnoreCase(META_LOGICAL_NAME)) {
            return "response";
        } else if (input.equalsIgnoreCase(META_RESOURCE_ID)) {
            return "hwgi.o28.mem.txGrp_1000.tx_220:ResponseXML.msg";
        } else if (input.equalsIgnoreCase(META_RESOURCE_TYPE)) {
            return "MESSAGE";
        } else if (input.equalsIgnoreCase(META_RESOURCE_PATH)) {
            return "hwgi.o28.mem.txGrp_1000.tx_220";
        } else if (input.equalsIgnoreCase(META_RESOURCE_GROUP)) {
            return null;
        } else if (input.equalsIgnoreCase(META_MESSAGE_TYPE)) {
              return null;
        } else if (input.equalsIgnoreCase(META_MESSAGE_STRUCTURE_NAME)) {
            return null;
        } else if (input.equalsIgnoreCase(META_MESSAGE_STRUCTURE_PATH)) {
            return null;
        } else if (input.equalsIgnoreCase(META_MESSAGE_STRUCTURE_ID)) {
            return null;
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

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0.5-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2007.11.28 at 03:46:45 PM GMT 
//


package org.nees.data;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdditionalDocument complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdditionalDocument">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="visitorInfoId" type="{}IDnumber"/>
 *         &lt;element name="trainingCertificationId" type="{}IDnumber"/>
 *         &lt;element name="documentTitle" type="{}String128"/>
 *         &lt;element name="documentDescription" type="{}String512"/>
 *         &lt;element name="pageCount" type="{}UnsignedInt"/>
 *         &lt;element name="documentFile_id" type="{}IDnumber"/>
 *       &lt;/sequence>
 *       &lt;attribute name="additionalDocumentId" use="required" type="{}IDnumber" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdditionalDocument", propOrder = {
    "visitorInfoId",
    "trainingCertificationId",
    "documentTitle",
    "documentDescription",
    "pageCount",
    "documentFileId"
})
public class AdditionalDocument {

    @XmlElementRef(name = "visitorInfoId", type = JAXBElement.class)
    protected JAXBElement<Integer> visitorInfoId;
    @XmlElementRef(name = "trainingCertificationId", type = JAXBElement.class)
    protected JAXBElement<Integer> trainingCertificationId;
    @XmlElementRef(name = "documentTitle", type = JAXBElement.class)
    protected JAXBElement<String> documentTitle;
    @XmlElementRef(name = "documentDescription", type = JAXBElement.class)
    protected JAXBElement<String> documentDescription;
    @XmlElementRef(name = "pageCount", type = JAXBElement.class)
    protected JAXBElement<Integer> pageCount;
    @XmlElementRef(name = "documentFile_id", type = JAXBElement.class)
    protected JAXBElement<Integer> documentFileId;
    @XmlAttribute(required = true)
    protected int additionalDocumentId;

    /**
     * Gets the value of the visitorInfoId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getVisitorInfoId() {
        return visitorInfoId;
    }

    /**
     * Sets the value of the visitorInfoId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setVisitorInfoId(JAXBElement<Integer> value) {
        this.visitorInfoId = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the trainingCertificationId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getTrainingCertificationId() {
        return trainingCertificationId;
    }

    /**
     * Sets the value of the trainingCertificationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setTrainingCertificationId(JAXBElement<Integer> value) {
        this.trainingCertificationId = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the documentTitle property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDocumentTitle() {
        return documentTitle;
    }

    /**
     * Sets the value of the documentTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDocumentTitle(JAXBElement<String> value) {
        this.documentTitle = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the documentDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDocumentDescription() {
        return documentDescription;
    }

    /**
     * Sets the value of the documentDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDocumentDescription(JAXBElement<String> value) {
        this.documentDescription = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the pageCount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPageCount() {
        return pageCount;
    }

    /**
     * Sets the value of the pageCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPageCount(JAXBElement<Integer> value) {
        this.pageCount = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the documentFileId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getDocumentFileId() {
        return documentFileId;
    }

    /**
     * Sets the value of the documentFileId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setDocumentFileId(JAXBElement<Integer> value) {
        this.documentFileId = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the additionalDocumentId property.
     * 
     */
    public int getAdditionalDocumentId() {
        return additionalDocumentId;
    }

    /**
     * Sets the value of the additionalDocumentId property.
     * 
     */
    public void setAdditionalDocumentId(int value) {
        this.additionalDocumentId = value;
    }

}

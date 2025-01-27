
package indexbg.pdoi.wsclient.edelivery;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDcSignatureValidationResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDcSignatureValidationResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DcSignatureValidationResult" type="{http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts}DcSignatureValidationResult" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDcSignatureValidationResult", namespace = "http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts", propOrder = {
    "dcSignatureValidationResult"
})
public class ArrayOfDcSignatureValidationResult {

    @XmlElement(name = "DcSignatureValidationResult", nillable = true)
    protected List<DcSignatureValidationResult> dcSignatureValidationResult;

    /**
     * Gets the value of the dcSignatureValidationResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dcSignatureValidationResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDcSignatureValidationResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DcSignatureValidationResult }
     * 
     * 
     */
    public List<DcSignatureValidationResult> getDcSignatureValidationResult() {
        if (dcSignatureValidationResult == null) {
            dcSignatureValidationResult = new ArrayList<DcSignatureValidationResult>();
        }
        return this.dcSignatureValidationResult;
    }

}

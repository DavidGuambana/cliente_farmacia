
package ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para setMedicamento complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="setMedicamento"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="medicamento" type="{http://ws/}medicamento" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setMedicamento", propOrder = {
    "medicamento"
})
public class SetMedicamento {

    protected Medicamento medicamento;

    /**
     * Obtiene el valor de la propiedad medicamento.
     * 
     * @return
     *     possible object is
     *     {@link Medicamento }
     *     
     */
    public Medicamento getMedicamento() {
        return medicamento;
    }

    /**
     * Define el valor de la propiedad medicamento.
     * 
     * @param value
     *     allowed object is
     *     {@link Medicamento }
     *     
     */
    public void setMedicamento(Medicamento value) {
        this.medicamento = value;
    }

}

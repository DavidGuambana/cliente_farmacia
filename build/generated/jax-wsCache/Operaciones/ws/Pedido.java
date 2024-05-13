
package ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para pedido complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="pedido"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cantidad" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="medicamento" type="{http://ws/}medicamento" minOccurs="0"/&gt;
 *         &lt;element name="sucursal" type="{http://ws/}sucursal" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pedido", propOrder = {
    "cantidad",
    "id",
    "medicamento",
    "sucursal"
})
public class Pedido {

    protected int cantidad;
    protected int id;
    protected Medicamento medicamento;
    protected Sucursal sucursal;

    /**
     * Obtiene el valor de la propiedad cantidad.
     * 
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * Define el valor de la propiedad cantidad.
     * 
     */
    public void setCantidad(int value) {
        this.cantidad = value;
    }

    /**
     * Obtiene el valor de la propiedad id.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

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

    /**
     * Obtiene el valor de la propiedad sucursal.
     * 
     * @return
     *     possible object is
     *     {@link Sucursal }
     *     
     */
    public Sucursal getSucursal() {
        return sucursal;
    }

    /**
     * Define el valor de la propiedad sucursal.
     * 
     * @param value
     *     allowed object is
     *     {@link Sucursal }
     *     
     */
    public void setSucursal(Sucursal value) {
        this.sucursal = value;
    }

}

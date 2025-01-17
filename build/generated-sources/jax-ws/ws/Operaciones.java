
package ws;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Operaciones", targetNamespace = "http://ws/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Operaciones {


    /**
     * 
     * @param medicamento
     * @return
     *     returns java.lang.Boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "setPedido", targetNamespace = "http://ws/", className = "ws.SetPedido")
    @ResponseWrapper(localName = "setPedidoResponse", targetNamespace = "http://ws/", className = "ws.SetPedidoResponse")
    @Action(input = "http://ws/Operaciones/setPedidoRequest", output = "http://ws/Operaciones/setPedidoResponse")
    public Boolean setPedido(
        @WebParam(name = "medicamento", targetNamespace = "")
        Pedido medicamento);

    /**
     * 
     * @return
     *     returns java.util.List<ws.Medicamento>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getMedicamentos", targetNamespace = "http://ws/", className = "ws.GetMedicamentos")
    @ResponseWrapper(localName = "getMedicamentosResponse", targetNamespace = "http://ws/", className = "ws.GetMedicamentosResponse")
    @Action(input = "http://ws/Operaciones/getMedicamentosRequest", output = "http://ws/Operaciones/getMedicamentosResponse")
    public List<Medicamento> getMedicamentos();

    /**
     * 
     * @param medicamento
     * @return
     *     returns java.lang.Boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "setMedicamento", targetNamespace = "http://ws/", className = "ws.SetMedicamento")
    @ResponseWrapper(localName = "setMedicamentoResponse", targetNamespace = "http://ws/", className = "ws.SetMedicamentoResponse")
    @Action(input = "http://ws/Operaciones/setMedicamentoRequest", output = "http://ws/Operaciones/setMedicamentoResponse")
    public Boolean setMedicamento(
        @WebParam(name = "medicamento", targetNamespace = "")
        Medicamento medicamento);

    /**
     * 
     * @param medicamento
     * @return
     *     returns java.lang.Boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "deleteMedicamento", targetNamespace = "http://ws/", className = "ws.DeleteMedicamento")
    @ResponseWrapper(localName = "deleteMedicamentoResponse", targetNamespace = "http://ws/", className = "ws.DeleteMedicamentoResponse")
    @Action(input = "http://ws/Operaciones/deleteMedicamentoRequest", output = "http://ws/Operaciones/deleteMedicamentoResponse")
    public Boolean deleteMedicamento(
        @WebParam(name = "medicamento", targetNamespace = "")
        Medicamento medicamento);

}


package ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _DeleteMedicamento_QNAME = new QName("http://ws/", "deleteMedicamento");
    private final static QName _DeleteMedicamentoResponse_QNAME = new QName("http://ws/", "deleteMedicamentoResponse");
    private final static QName _GetMedicamentos_QNAME = new QName("http://ws/", "getMedicamentos");
    private final static QName _GetMedicamentosResponse_QNAME = new QName("http://ws/", "getMedicamentosResponse");
    private final static QName _SetMedicamento_QNAME = new QName("http://ws/", "setMedicamento");
    private final static QName _SetMedicamentoResponse_QNAME = new QName("http://ws/", "setMedicamentoResponse");
    private final static QName _SetPedido_QNAME = new QName("http://ws/", "setPedido");
    private final static QName _SetPedidoResponse_QNAME = new QName("http://ws/", "setPedidoResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DeleteMedicamento }
     * 
     */
    public DeleteMedicamento createDeleteMedicamento() {
        return new DeleteMedicamento();
    }

    /**
     * Create an instance of {@link DeleteMedicamentoResponse }
     * 
     */
    public DeleteMedicamentoResponse createDeleteMedicamentoResponse() {
        return new DeleteMedicamentoResponse();
    }

    /**
     * Create an instance of {@link GetMedicamentos }
     * 
     */
    public GetMedicamentos createGetMedicamentos() {
        return new GetMedicamentos();
    }

    /**
     * Create an instance of {@link GetMedicamentosResponse }
     * 
     */
    public GetMedicamentosResponse createGetMedicamentosResponse() {
        return new GetMedicamentosResponse();
    }

    /**
     * Create an instance of {@link SetMedicamento }
     * 
     */
    public SetMedicamento createSetMedicamento() {
        return new SetMedicamento();
    }

    /**
     * Create an instance of {@link SetMedicamentoResponse }
     * 
     */
    public SetMedicamentoResponse createSetMedicamentoResponse() {
        return new SetMedicamentoResponse();
    }

    /**
     * Create an instance of {@link SetPedido }
     * 
     */
    public SetPedido createSetPedido() {
        return new SetPedido();
    }

    /**
     * Create an instance of {@link SetPedidoResponse }
     * 
     */
    public SetPedidoResponse createSetPedidoResponse() {
        return new SetPedidoResponse();
    }

    /**
     * Create an instance of {@link Medicamento }
     * 
     */
    public Medicamento createMedicamento() {
        return new Medicamento();
    }

    /**
     * Create an instance of {@link TipoMed }
     * 
     */
    public TipoMed createTipoMed() {
        return new TipoMed();
    }

    /**
     * Create an instance of {@link Pedido }
     * 
     */
    public Pedido createPedido() {
        return new Pedido();
    }

    /**
     * Create an instance of {@link Sucursal }
     * 
     */
    public Sucursal createSucursal() {
        return new Sucursal();
    }

    /**
     * Create an instance of {@link Distribuidor }
     * 
     */
    public Distribuidor createDistribuidor() {
        return new Distribuidor();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteMedicamento }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "deleteMedicamento")
    public JAXBElement<DeleteMedicamento> createDeleteMedicamento(DeleteMedicamento value) {
        return new JAXBElement<DeleteMedicamento>(_DeleteMedicamento_QNAME, DeleteMedicamento.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteMedicamentoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "deleteMedicamentoResponse")
    public JAXBElement<DeleteMedicamentoResponse> createDeleteMedicamentoResponse(DeleteMedicamentoResponse value) {
        return new JAXBElement<DeleteMedicamentoResponse>(_DeleteMedicamentoResponse_QNAME, DeleteMedicamentoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMedicamentos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getMedicamentos")
    public JAXBElement<GetMedicamentos> createGetMedicamentos(GetMedicamentos value) {
        return new JAXBElement<GetMedicamentos>(_GetMedicamentos_QNAME, GetMedicamentos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMedicamentosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getMedicamentosResponse")
    public JAXBElement<GetMedicamentosResponse> createGetMedicamentosResponse(GetMedicamentosResponse value) {
        return new JAXBElement<GetMedicamentosResponse>(_GetMedicamentosResponse_QNAME, GetMedicamentosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetMedicamento }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "setMedicamento")
    public JAXBElement<SetMedicamento> createSetMedicamento(SetMedicamento value) {
        return new JAXBElement<SetMedicamento>(_SetMedicamento_QNAME, SetMedicamento.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetMedicamentoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "setMedicamentoResponse")
    public JAXBElement<SetMedicamentoResponse> createSetMedicamentoResponse(SetMedicamentoResponse value) {
        return new JAXBElement<SetMedicamentoResponse>(_SetMedicamentoResponse_QNAME, SetMedicamentoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetPedido }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "setPedido")
    public JAXBElement<SetPedido> createSetPedido(SetPedido value) {
        return new JAXBElement<SetPedido>(_SetPedido_QNAME, SetPedido.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetPedidoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "setPedidoResponse")
    public JAXBElement<SetPedidoResponse> createSetPedidoResponse(SetPedidoResponse value) {
        return new JAXBElement<SetPedidoResponse>(_SetPedidoResponse_QNAME, SetPedidoResponse.class, null, value);
    }

}

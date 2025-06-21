
package ec.gob.sri.ws.consultas;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ec.gob.sri.ws.consultas package. 
 * <p>An ObjectFactory allows you to programmatically 
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

    private static final QName _RespuestaConsultaComprobante_QNAME = new QName("http://ec.gob.sri.ws.consultas", "RespuestaConsultaComprobante");
    private static final QName _ConsultarEstadoAutorizacionComprobante_QNAME = new QName("http://ec.gob.sri.ws.consultas", "consultarEstadoAutorizacionComprobante");
    private static final QName _ConsultarEstadoAutorizacionComprobanteResponse_QNAME = new QName("http://ec.gob.sri.ws.consultas", "consultarEstadoAutorizacionComprobanteResponse");
    private static final QName _Mensaje_QNAME = new QName("http://ec.gob.sri.ws.consultas", "mensaje");
    private static final QName _IllegalArgumentException_QNAME = new QName("http://ec.gob.sri.ws.consultas", "IllegalArgumentException");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ec.gob.sri.ws.consultas
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RespuestaConsulta }
     * 
     * @return
     *     the new instance of {@link RespuestaConsulta }
     */
    public RespuestaConsulta createRespuestaConsulta() {
        return new RespuestaConsulta();
    }

    /**
     * Create an instance of {@link RespuestaConsultaComprobante }
     * 
     * @return
     *     the new instance of {@link RespuestaConsultaComprobante }
     */
    public RespuestaConsultaComprobante createRespuestaConsultaComprobante() {
        return new RespuestaConsultaComprobante();
    }

    /**
     * Create an instance of {@link ConsultarEstadoAutorizacionComprobante }
     * 
     * @return
     *     the new instance of {@link ConsultarEstadoAutorizacionComprobante }
     */
    public ConsultarEstadoAutorizacionComprobante createConsultarEstadoAutorizacionComprobante() {
        return new ConsultarEstadoAutorizacionComprobante();
    }

    /**
     * Create an instance of {@link ConsultarEstadoAutorizacionComprobanteResponse }
     * 
     * @return
     *     the new instance of {@link ConsultarEstadoAutorizacionComprobanteResponse }
     */
    public ConsultarEstadoAutorizacionComprobanteResponse createConsultarEstadoAutorizacionComprobanteResponse() {
        return new ConsultarEstadoAutorizacionComprobanteResponse();
    }

    /**
     * Create an instance of {@link Mensaje }
     * 
     * @return
     *     the new instance of {@link Mensaje }
     */
    public Mensaje createMensaje() {
        return new Mensaje();
    }

    /**
     * Create an instance of {@link IllegalArgumentException }
     * 
     * @return
     *     the new instance of {@link IllegalArgumentException }
     */
    public IllegalArgumentException createIllegalArgumentException() {
        return new IllegalArgumentException();
    }

    /**
     * Create an instance of {@link RespuestaConsulta.Mensajes }
     * 
     * @return
     *     the new instance of {@link RespuestaConsulta.Mensajes }
     */
    public RespuestaConsulta.Mensajes createRespuestaConsultaMensajes() {
        return new RespuestaConsulta.Mensajes();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RespuestaConsultaComprobante }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RespuestaConsultaComprobante }{@code >}
     */
    @XmlElementDecl(namespace = "http://ec.gob.sri.ws.consultas", name = "RespuestaConsultaComprobante")
    public JAXBElement<RespuestaConsultaComprobante> createRespuestaConsultaComprobante(RespuestaConsultaComprobante value) {
        return new JAXBElement<>(_RespuestaConsultaComprobante_QNAME, RespuestaConsultaComprobante.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarEstadoAutorizacionComprobante }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConsultarEstadoAutorizacionComprobante }{@code >}
     */
    @XmlElementDecl(namespace = "http://ec.gob.sri.ws.consultas", name = "consultarEstadoAutorizacionComprobante")
    public JAXBElement<ConsultarEstadoAutorizacionComprobante> createConsultarEstadoAutorizacionComprobante(ConsultarEstadoAutorizacionComprobante value) {
        return new JAXBElement<>(_ConsultarEstadoAutorizacionComprobante_QNAME, ConsultarEstadoAutorizacionComprobante.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarEstadoAutorizacionComprobanteResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConsultarEstadoAutorizacionComprobanteResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ec.gob.sri.ws.consultas", name = "consultarEstadoAutorizacionComprobanteResponse")
    public JAXBElement<ConsultarEstadoAutorizacionComprobanteResponse> createConsultarEstadoAutorizacionComprobanteResponse(ConsultarEstadoAutorizacionComprobanteResponse value) {
        return new JAXBElement<>(_ConsultarEstadoAutorizacionComprobanteResponse_QNAME, ConsultarEstadoAutorizacionComprobanteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Mensaje }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Mensaje }{@code >}
     */
    @XmlElementDecl(namespace = "http://ec.gob.sri.ws.consultas", name = "mensaje")
    public JAXBElement<Mensaje> createMensaje(Mensaje value) {
        return new JAXBElement<>(_Mensaje_QNAME, Mensaje.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IllegalArgumentException }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IllegalArgumentException }{@code >}
     */
    @XmlElementDecl(namespace = "http://ec.gob.sri.ws.consultas", name = "IllegalArgumentException")
    public JAXBElement<IllegalArgumentException> createIllegalArgumentException(IllegalArgumentException value) {
        return new JAXBElement<>(_IllegalArgumentException_QNAME, IllegalArgumentException.class, null, value);
    }

}

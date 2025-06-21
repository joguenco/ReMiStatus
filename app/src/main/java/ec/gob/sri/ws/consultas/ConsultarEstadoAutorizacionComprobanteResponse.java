
package ec.gob.sri.ws.consultas;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for consultarEstadoAutorizacionComprobanteResponse complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="consultarEstadoAutorizacionComprobanteResponse">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="EstadoAutorizacionComprobante" type="{http://ec.gob.sri.ws.consultas}respuestaConsultaComprobante" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consultarEstadoAutorizacionComprobanteResponse", propOrder = {
    "estadoAutorizacionComprobante"
})
public class ConsultarEstadoAutorizacionComprobanteResponse {

    @XmlElement(name = "EstadoAutorizacionComprobante")
    protected RespuestaConsultaComprobante estadoAutorizacionComprobante;

    /**
     * Gets the value of the estadoAutorizacionComprobante property.
     * 
     * @return
     *     possible object is
     *     {@link RespuestaConsultaComprobante }
     *     
     */
    public RespuestaConsultaComprobante getEstadoAutorizacionComprobante() {
        return estadoAutorizacionComprobante;
    }

    /**
     * Sets the value of the estadoAutorizacionComprobante property.
     * 
     * @param value
     *     allowed object is
     *     {@link RespuestaConsultaComprobante }
     *     
     */
    public void setEstadoAutorizacionComprobante(RespuestaConsultaComprobante value) {
        this.estadoAutorizacionComprobante = value;
    }

}


package ec.gob.sri.ws.consultas;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.ws.RequestWrapper;
import jakarta.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 4.1.2
 * 2025-06-20T21:44:33.171-05:00
 * Generated source version: 4.1.2
 *
 */
public final class ConsultaComprobante_ConsultaComprobantePort_Client {

    private static final QName SERVICE_NAME = new QName("http://ec.gob.sri.ws.consultas", "ConsultaComprobanteService");

    private ConsultaComprobante_ConsultaComprobantePort_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = ConsultaComprobanteService.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) {
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }

        ConsultaComprobanteService ss = new ConsultaComprobanteService(wsdlURL, SERVICE_NAME);
        ConsultaComprobante port = ss.getConsultaComprobantePort();

        {
        System.out.println("Invoking consultarEstadoAutorizacionComprobante...");
        java.lang.String _consultarEstadoAutorizacionComprobante_claveAcceso = "";
        try {
            ec.gob.sri.ws.consultas.RespuestaConsultaComprobante _consultarEstadoAutorizacionComprobante__return = port.consultarEstadoAutorizacionComprobante(_consultarEstadoAutorizacionComprobante_claveAcceso);
            System.out.println("consultarEstadoAutorizacionComprobante.result=" + _consultarEstadoAutorizacionComprobante__return);

        } catch (IllegalArgumentException_Exception e) {
            System.out.println("Expected exception: IllegalArgumentException has occurred.");
            System.out.println(e.toString());
        }

            }

        System.exit(0);
    }

}

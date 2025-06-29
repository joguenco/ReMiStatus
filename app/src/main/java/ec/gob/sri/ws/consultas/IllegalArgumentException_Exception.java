
package ec.gob.sri.ws.consultas;

import jakarta.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 4.1.2
 * 2025-06-20T21:44:33.187-05:00
 * Generated source version: 4.1.2
 */

@WebFault(name = "IllegalArgumentException", targetNamespace = "http://ec.gob.sri.ws.consultas")
public class IllegalArgumentException_Exception extends Exception {

    private ec.gob.sri.ws.consultas.IllegalArgumentException faultInfo;

    public IllegalArgumentException_Exception() {
        super();
    }

    public IllegalArgumentException_Exception(String message) {
        super(message);
    }

    public IllegalArgumentException_Exception(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public IllegalArgumentException_Exception(String message, ec.gob.sri.ws.consultas.IllegalArgumentException illegalArgumentException) {
        super(message);
        this.faultInfo = illegalArgumentException;
    }

    public IllegalArgumentException_Exception(String message, ec.gob.sri.ws.consultas.IllegalArgumentException illegalArgumentException, java.lang.Throwable cause) {
        super(message, cause);
        this.faultInfo = illegalArgumentException;
    }

    public ec.gob.sri.ws.consultas.IllegalArgumentException getFaultInfo() {
        return this.faultInfo;
    }
}

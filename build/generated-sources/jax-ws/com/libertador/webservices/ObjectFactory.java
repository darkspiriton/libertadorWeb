
package com.libertador.webservices;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.libertador.webservices package. 
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

    private final static QName _BuscarRegistroPagoResponse_QNAME = new QName("http://webservices.libertador.com/", "BuscarRegistroPagoResponse");
    private final static QName _RegistrarAlumnoResponse_QNAME = new QName("http://webservices.libertador.com/", "RegistrarAlumnoResponse");
    private final static QName _RegistrarAlumno_QNAME = new QName("http://webservices.libertador.com/", "RegistrarAlumno");
    private final static QName _BuscarRegistroPago_QNAME = new QName("http://webservices.libertador.com/", "BuscarRegistroPago");
    private final static QName _ImportarRegistroPago_QNAME = new QName("http://webservices.libertador.com/", "ImportarRegistroPago");
    private final static QName _ImportarRegistroPagoResponse_QNAME = new QName("http://webservices.libertador.com/", "ImportarRegistroPagoResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.libertador.webservices
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ImportarRegistroPago }
     * 
     */
    public ImportarRegistroPago createImportarRegistroPago() {
        return new ImportarRegistroPago();
    }

    /**
     * Create an instance of {@link ImportarRegistroPagoResponse }
     * 
     */
    public ImportarRegistroPagoResponse createImportarRegistroPagoResponse() {
        return new ImportarRegistroPagoResponse();
    }

    /**
     * Create an instance of {@link BuscarRegistroPago }
     * 
     */
    public BuscarRegistroPago createBuscarRegistroPago() {
        return new BuscarRegistroPago();
    }

    /**
     * Create an instance of {@link RegistrarAlumno }
     * 
     */
    public RegistrarAlumno createRegistrarAlumno() {
        return new RegistrarAlumno();
    }

    /**
     * Create an instance of {@link RegistrarAlumnoResponse }
     * 
     */
    public RegistrarAlumnoResponse createRegistrarAlumnoResponse() {
        return new RegistrarAlumnoResponse();
    }

    /**
     * Create an instance of {@link BuscarRegistroPagoResponse }
     * 
     */
    public BuscarRegistroPagoResponse createBuscarRegistroPagoResponse() {
        return new BuscarRegistroPagoResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarRegistroPagoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.libertador.com/", name = "BuscarRegistroPagoResponse")
    public JAXBElement<BuscarRegistroPagoResponse> createBuscarRegistroPagoResponse(BuscarRegistroPagoResponse value) {
        return new JAXBElement<BuscarRegistroPagoResponse>(_BuscarRegistroPagoResponse_QNAME, BuscarRegistroPagoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistrarAlumnoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.libertador.com/", name = "RegistrarAlumnoResponse")
    public JAXBElement<RegistrarAlumnoResponse> createRegistrarAlumnoResponse(RegistrarAlumnoResponse value) {
        return new JAXBElement<RegistrarAlumnoResponse>(_RegistrarAlumnoResponse_QNAME, RegistrarAlumnoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistrarAlumno }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.libertador.com/", name = "RegistrarAlumno")
    public JAXBElement<RegistrarAlumno> createRegistrarAlumno(RegistrarAlumno value) {
        return new JAXBElement<RegistrarAlumno>(_RegistrarAlumno_QNAME, RegistrarAlumno.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarRegistroPago }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.libertador.com/", name = "BuscarRegistroPago")
    public JAXBElement<BuscarRegistroPago> createBuscarRegistroPago(BuscarRegistroPago value) {
        return new JAXBElement<BuscarRegistroPago>(_BuscarRegistroPago_QNAME, BuscarRegistroPago.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImportarRegistroPago }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.libertador.com/", name = "ImportarRegistroPago")
    public JAXBElement<ImportarRegistroPago> createImportarRegistroPago(ImportarRegistroPago value) {
        return new JAXBElement<ImportarRegistroPago>(_ImportarRegistroPago_QNAME, ImportarRegistroPago.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImportarRegistroPagoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.libertador.com/", name = "ImportarRegistroPagoResponse")
    public JAXBElement<ImportarRegistroPagoResponse> createImportarRegistroPagoResponse(ImportarRegistroPagoResponse value) {
        return new JAXBElement<ImportarRegistroPagoResponse>(_ImportarRegistroPagoResponse_QNAME, ImportarRegistroPagoResponse.class, null, value);
    }

}

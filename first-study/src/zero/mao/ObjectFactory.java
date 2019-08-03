
package zero.mao;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the zero.zero.mao package.
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

    private final static QName _PrintReciveInfo_QNAME = new QName("http://mao.zero/", "printReciveInfo");
    private final static QName _PrintReciveInfoResponse_QNAME = new QName("http://mao.zero/", "printReciveInfoResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: zero.zero.mao
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PrintReciveInfo }
     * 
     */
    public PrintReciveInfo createPrintReciveInfo() {
        return new PrintReciveInfo();
    }

    /**
     * Create an instance of {@link PrintReciveInfoResponse }
     * 
     */
    public PrintReciveInfoResponse createPrintReciveInfoResponse() {
        return new PrintReciveInfoResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrintReciveInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mao.zero/", name = "printReciveInfo")
    public JAXBElement<PrintReciveInfo> createPrintReciveInfo(PrintReciveInfo value) {
        return new JAXBElement<PrintReciveInfo>(_PrintReciveInfo_QNAME, PrintReciveInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrintReciveInfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mao.zero/", name = "printReciveInfoResponse")
    public JAXBElement<PrintReciveInfoResponse> createPrintReciveInfoResponse(PrintReciveInfoResponse value) {
        return new JAXBElement<PrintReciveInfoResponse>(_PrintReciveInfoResponse_QNAME, PrintReciveInfoResponse.class, null, value);
    }

}

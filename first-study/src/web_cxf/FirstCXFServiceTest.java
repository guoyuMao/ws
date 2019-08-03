package web_cxf;

import zero.mao.FirstCXFService;
import zero.mao.FirstCXFServicePortType;
import org.junit.Test;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;

public class FirstCXFServiceTest {
    @Test
    public void test() throws MalformedURLException {
        String address = "http://localhost:9090/firstService?wsdl";
        URL url = new URL(address);
        QName serviceName = new QName("http://mao.zero/", "FirstCXFService");
        Service service = Service.create(url, serviceName);
        FirstCXFServicePortType firstCXFService = service.getPort(FirstCXFServicePortType.class);
        firstCXFService.printReciveInfo("你好啊");
    }
}

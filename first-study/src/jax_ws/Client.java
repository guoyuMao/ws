package jax_ws;

import jax_ws.domain.User;
import jax_ws.service.HelloService;
import org.junit.Test;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.soap.SOAPBinding;
import java.net.URL;

public final class Client {
    private static final QName SERVICE_NAME
            = new QName("http://ws.bless.com/", "HelloService");
    private static final QName PORT_NAME
            = new QName("http://ws.bless.com/", "HelloServicePort");


    public Client() {
    }

    @Test
    public void client1() throws Exception {
        String endpointAddress = "http://localhost:8111/helloWorld";
        URL url = new URL(endpointAddress);
        QName serviceName = new QName("http://service.jax_ws/", "HelloService");
        Service service = Service.create(url, serviceName);

        HelloService hw = service.getPort(HelloService.class);
        System.out.println(hw.sayHi("World"));

        System.out.println(hw.getUser(new User(1, "kaka")));

        for(User user : hw.getListUser()){
            System.out.println("List User [id:"+user.getId()+"][name:"+user.getName()+"]");
        }
    }
}

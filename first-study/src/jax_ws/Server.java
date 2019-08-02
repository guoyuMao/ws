package jax_ws;

import jax_ws.service.HelloServiceImpl;

import javax.xml.ws.Endpoint;

public class Server {
    protected Server() throws Exception {
        // START SNIPPET: publish
        System.out.println("Starting jax_ws.Server");
        HelloServiceImpl implementor = new HelloServiceImpl();
        String address = "http://localhost:8111/helloWorld";
        Endpoint.publish(address, implementor);
        // END SNIPPET: publish
    }

    public static void main(String[] args) throws Exception {
        new Server();
        System.out.println("jax_ws.Server ready...");
        Thread.sleep(5 * 60 * 1000);
        System.out.println("jax_ws.Server exiting");
        System.exit(0);
    }
}

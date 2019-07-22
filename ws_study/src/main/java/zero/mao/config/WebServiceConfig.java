package com.zero.mao.config;

import com.zero.mao.service.HelloService;
import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.xml.ws.Endpoint;

/**
 * Created by guoyu.mao on 2019/7/18.
 * Email:maoguoyu@ewell.cc
 */
@Configuration
public class WebServiceConfig {

    @Autowired
    private Bus bus;

    @Bean
    public Endpoint endpoint() {
        Endpoint endpoint = new EndpointImpl(bus, new HelloService());
        endpoint.publish("/hello");
        return endpoint;
    }
}

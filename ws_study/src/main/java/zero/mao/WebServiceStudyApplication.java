package com.zero.mao;

import org.apache.cxf.Bus;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.xml.ws.Service;

@EnableAutoConfiguration
@SpringBootApplication
public class WebServiceStudyApplication {
	private Bus bus;

	public static void main(String[] args) {
		SpringApplication.run(WebServiceStudyApplication.class, args);
	}
}

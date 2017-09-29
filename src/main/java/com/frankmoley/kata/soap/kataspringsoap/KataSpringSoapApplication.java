package com.frankmoley.kata.soap.kataspringsoap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@SpringBootApplication
public class KataSpringSoapApplication {

    @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath("net.webservicex.currency");
        return marshaller;
    }

    @Bean
    public CurrencyClient weatherClient(){
        CurrencyClient client = new CurrencyClient();
        client.setDefaultUri("http://www.webservicex.net/CurrencyConvertor.asmx");
        client.setMarshaller(marshaller());
        client.setUnmarshaller(marshaller());
        return client;
    }

	public static void main(String[] args) {
		SpringApplication.run(KataSpringSoapApplication.class, args);
	}
}

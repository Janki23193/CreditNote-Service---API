package com.relay.CS.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class CreditnoteServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CreditnoteServiceApplication.class, args);
	}
    @Bean
	public RestTemplate restTemplate(){
		return  new RestTemplate();
	}
}

package com.example.webServiceMessages;

import org.apache.log4j.PropertyConfigurator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebServiceMessagesApplication {

	public static void main(String[] args) {


		PropertyConfigurator.configure("log4j.properties");
		SpringApplication.run(WebServiceMessagesApplication.class, args);
	}

}

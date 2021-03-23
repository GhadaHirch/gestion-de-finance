package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
//import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.repository.config.RepositoryConfiguration;

@SpringBootApplication
//@EnableEurekaClient
public class DemoMongoDbApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoMongoDbApplication.class, args);
	
	}
}

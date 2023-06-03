package com.madeeasy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringBootEurekaServiceRegistryAndDiscoveryApplication{

	public static void main(String[] args) {
		SpringApplication.run(SpringBootEurekaServiceRegistryAndDiscoveryApplication.class, args);
	}

}
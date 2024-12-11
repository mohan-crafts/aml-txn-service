package com.txn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class TxnServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(TxnServiceApplication.class, args);
	}

}
	
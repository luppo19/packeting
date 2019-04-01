package com.example.packeting.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.packeting"})
public class PacketingApplication {

	public static void main(String[] args) {
		SpringApplication.run(PacketingApplication.class, args);
	}

}

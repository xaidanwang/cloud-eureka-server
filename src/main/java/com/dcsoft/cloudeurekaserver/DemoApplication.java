package com.dcsoft.cloudeurekaserver;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@EnableEurekaServer
@SpringBootApplication
public class DemoApplication {
	@Value("${spring.profiles}")
	private static String ss;

	public static void main(String[] args) {
		
		SpringApplication.run(DemoApplication.class, args);
		System.out.println(ss);
	}
}

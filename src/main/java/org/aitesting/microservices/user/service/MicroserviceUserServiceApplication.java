package org.aitesting.microservices.user.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaAuditing
@EnableJpaRepositories
@EnableEurekaClient
@EnableHystrix
public class MicroserviceUserServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceUserServiceApplication.class, args);
	}
}

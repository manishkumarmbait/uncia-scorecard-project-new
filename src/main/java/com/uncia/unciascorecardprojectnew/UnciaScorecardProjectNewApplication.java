package com.uncia.unciascorecardprojectnew;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

//@SpringBootApplication
@SpringBootApplication(exclude = { org.springframework.boot.autoconfigure.gson.GsonAutoConfiguration.class })
public class UnciaScorecardProjectNewApplication {

	public static void main(String[] args) {
		SpringApplication.run(UnciaScorecardProjectNewApplication.class, args);
		System.out.println("Testing!!!!!");
	}

	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
	
}

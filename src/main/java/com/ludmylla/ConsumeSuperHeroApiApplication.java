package com.ludmylla;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients 
public class ConsumeSuperHeroApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsumeSuperHeroApiApplication.class, args);
	}

}

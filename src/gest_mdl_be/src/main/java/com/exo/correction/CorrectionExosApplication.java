package com.exo.correction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories

public class CorrectionExosApplication {

	public static void main(String[] args) {
		SpringApplication.run(CorrectionExosApplication.class, args);
	}

}

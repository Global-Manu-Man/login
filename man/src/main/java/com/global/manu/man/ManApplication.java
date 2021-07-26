package com.global.manu.man;

import com.global.manu.man.repository.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = UserRepository.class)
public class ManApplication {

	public static void main(String[] args) {
		SpringApplication.run(ManApplication.class, args);
	}

}

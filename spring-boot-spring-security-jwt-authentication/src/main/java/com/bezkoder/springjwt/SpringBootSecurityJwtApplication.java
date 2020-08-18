package com.bezkoder.springjwt;

import com.bezkoder.springjwt.models.ERole;
import com.bezkoder.springjwt.models.Role;
import com.bezkoder.springjwt.repository.RoleRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Random;
import java.util.stream.Stream;

@SpringBootApplication
public class SpringBootSecurityJwtApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSecurityJwtApplication.class, args);
	}

	@Bean
	CommandLineRunner init(RoleRepository userRepository) {
		return args -> {
			Stream.of("ROLE_USER", "ROLE_MODERATOR", "ROLE_ADMIN").forEach(name -> {
				//Role user = new Role(ERole.valueOf(name));
				//userRepository.save(user);
			});
			userRepository.findAll().forEach(System.out::println);
		};
	}

}

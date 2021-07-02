package com.example.microservice.user_ms;

import com.example.microservice.user_ms.model.UserEntity;
import com.example.microservice.user_ms.model.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@EnableDiscoveryClient
@EnableEurekaClient
public class UserMsApplication {

	@Autowired
	UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(UserMsApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner() {
		return (args) -> {
			userRepository.deleteAll();
			List<UserEntity> userEntities = new ArrayList<>();
			userEntities.add(new UserEntity(1, "name1", "mail1@gmail.com", "0661111111"));
			userEntities.add(new UserEntity(2, "name2", "mail2@gmail.com", "0661111111"));
			userEntities.add(new UserEntity(3, "name3", "mail3@gmail.com", "0661111111"));
			userEntities.add(new UserEntity(4, "name4", "mail4@gmail.com", "0661111111"));
			userEntities.add(new UserEntity(5, "name5", "mail5@gmail.com", "0661111111"));
			userEntities.add(new UserEntity(6, "name6", "mail6@gmail.com", "0661111111"));
			userEntities.add(new UserEntity(7, "name7", "mail7@gmail.com", "0661111111"));
			userEntities.add(new UserEntity(8, "name8", "mail8@gmail.com", "0661111111"));
			userEntities.add(new UserEntity(9, "name9", "mail9@gmail.com", "0661111111"));
			userEntities.add(new UserEntity(10, "name10", "mail10@gmail.com", "0661111111"));

			for(UserEntity u : userEntities) {
				userRepository.save(u);
			}
		};
	}
}

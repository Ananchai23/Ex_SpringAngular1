package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.entities.User;
import com.example.repositories.UserRepository;

@SpringBootApplication
public class CrudBackendApplication implements CommandLineRunner{
	@Autowired
	private UserRepository userRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(CrudBackendApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		userRepository.save(new User("one","one"));
		userRepository.save(new User("two","one"));
		userRepository.save(new User("three","one"));
	}
}

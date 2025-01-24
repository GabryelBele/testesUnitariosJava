package br.com.dicasdeumdev.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.dicasdeumdev.api.domain.User;

@SpringBootApplication
public class ApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiApplication.class, args);

		User user = new User(null, "gabryel", "gabryel@email.com", "123");
		System.out.println(user);
	}

}

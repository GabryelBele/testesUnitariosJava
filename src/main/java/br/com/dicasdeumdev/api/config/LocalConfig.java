package br.com.dicasdeumdev.api.config;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import br.com.dicasdeumdev.api.domain.User;
import br.com.dicasdeumdev.api.repositories.UserRepository;
import jakarta.annotation.PostConstruct;

@Configuration
@Profile("local")
public class LocalConfig {

    @Autowired
    private UserRepository repository;

    @PostConstruct
    public void initializeDatabase() {
        User u1 = new User(null, "gabryel", "gabryel@email.com", "123");
        User u2 = new User(null, "joao", "joao@email.com", "123");
        repository.saveAll(List.of(u1, u2)); // Salva os usuários no banco de dados
    }
}

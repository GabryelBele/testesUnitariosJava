package br.com.dicasdeumdev.api.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.dicasdeumdev.api.domain.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
    
}

package br.com.dicasdeumdev.api.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.dicasdeumdev.api.domain.User;
import br.com.dicasdeumdev.api.services.UserService;

@RestController
@RequestMapping("/user")
public class UserResource {

    @Autowired
    private UserService service;

    @GetMapping(value = "/{id}")
    public ResponseEntity<User> findById(@PathVariable Integer id) {
        try {
            User user = service.findById(id);
            if (user == null) {
                return ResponseEntity.notFound().build(); // Retorna 404 se o usuário não for encontrado
            }
            return ResponseEntity.ok(user); // Retorna 200 com o usuário encontrado
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(500).build(); // Retorna 500 no caso de erro inesperado
        }
    }
}

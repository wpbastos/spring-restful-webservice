package com.bastoswp.restfulwebservice.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
public class UserController {
    @GetMapping("/users")
    public ResponseEntity<Object> retrieveAll() {
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("/users/{id}")
    public ResponseEntity<Object> retrieveById(@PathVariable int id) {
        var user = service.findById(id);
        if (user == null) throw new UserNotFoundException(String.format("User not found (id:%s)", id));
        return ResponseEntity.ok(user);
    }

    @PostMapping("/users")
    public ResponseEntity<Object> create(@RequestBody User user) {
        var savedUser = service.save(user);
        var location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(savedUser.getId()).toUri();
        return ResponseEntity.created(location).build();
    }

    @DeleteMapping("/users/{id}")
    public ResponseEntity<Object> deleteById(@PathVariable int id) {
        var deletedUser = service.deleteById(id);
        if (deletedUser == null) throw new UserNotFoundException(String.format("User not found (id:%s)", id));
        return ResponseEntity.ok().build();
    }

    @Autowired
    private UserService service;
}
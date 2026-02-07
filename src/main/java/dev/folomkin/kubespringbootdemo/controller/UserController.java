package dev.folomkin.kubespringbootdemo.controller;

import dev.folomkin.kubespringbootdemo.entity.User;
import dev.folomkin.kubespringbootdemo.entity.UserDto;
import dev.folomkin.kubespringbootdemo.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService service;


    public UserController(UserService service) {
        this.service = service;
    }


    @PostMapping("/create")
    public ResponseEntity<User> createUser(@RequestBody UserDto dto) {
        return ResponseEntity.ok().body(service.create(dto));
    }

    @GetMapping("/get-all")
    public ResponseEntity<List<User>> getAllUsers() {
        return ResponseEntity.ok().body(service.allUsers());
    }
}

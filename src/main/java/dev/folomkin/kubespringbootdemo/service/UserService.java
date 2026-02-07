package dev.folomkin.kubespringbootdemo.service;

import dev.folomkin.kubespringbootdemo.entity.User;
import dev.folomkin.kubespringbootdemo.entity.UserDto;
import dev.folomkin.kubespringbootdemo.entity.UserMapper;
import org.springframework.stereotype.Service;
import dev.folomkin.kubespringbootdemo.repository.UserRepository;

import java.util.List;

@Service
public class UserService {

    private final UserRepository repository;


    public UserService(UserRepository repository) {
        this.repository = repository;
    }


    public User create(UserDto dto){
        return repository.save(UserMapper.dtoToEntity(dto));
    }

    public List<User> allUsers(){
        return repository.findAll();
    }
}

package dev.folomkin.kubespringbootdemo.repository;

import dev.folomkin.kubespringbootdemo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}

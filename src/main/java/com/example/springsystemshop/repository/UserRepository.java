package com.example.springsystemshop.repository;

import com.example.springsystemshop.entities.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

    User findByUsername(String username);
    boolean existByEmail(String email);
}

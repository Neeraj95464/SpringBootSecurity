package com.ynmio.SpringBootSecurity.dao;

import com.ynmio.SpringBootSecurity.model.MyUser;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface MyUserRepository extends CrudRepository<MyUser, Integer> {

    Optional<MyUser> findUserByName(String userName);
}

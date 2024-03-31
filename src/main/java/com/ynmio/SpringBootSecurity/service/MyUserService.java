package com.ynmio.SpringBootSecurity.service;

import com.ynmio.SpringBootSecurity.dao.MyUserRepository;
import com.ynmio.SpringBootSecurity.model.MyUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MyUserService implements UserDetailsService {

    @Autowired
    MyUserRepository myUserRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<MyUser> user=myUserRepository.findUserByName(username);
        MyUser userObj=user.get();
        if(user.isPresent()){
            return User.builder().username(userObj.getName()).
                    password(userObj.getPassword())
                    .roles(getRole(userObj)).build();
        }
        else {
            throw new UsernameNotFoundException(username);
        }
    }
    private String getRole(MyUser user){
        if(user.getRole()==null){
            return null;
        }
        return user.getRole();
    }
}

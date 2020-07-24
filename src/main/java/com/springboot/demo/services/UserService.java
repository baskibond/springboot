package com.springboot.demo.services;

import com.springboot.demo.entities.User;
import com.springboot.demo.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private static Logger logger= LoggerFactory.getLogger(UserService.class);

    @Autowired
    private UserRepository userRepository;

    public boolean saveUser(User user){
        try {
            userRepository.save(user);
        } catch (Exception e) {
            logger.error(String.format("Error while saving to Mongo : %s", e.getMessage()));
            return false;
        }
        return true;
    }
}

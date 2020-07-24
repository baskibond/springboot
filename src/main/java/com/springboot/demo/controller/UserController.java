package com.springboot.demo.controller;

import com.springboot.demo.entities.User;
import com.springboot.demo.models.CustomHttpResponseData;
import com.springboot.demo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping(value="/add-user", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<CustomHttpResponseData> saveUser(@RequestBody  User user){
        if(userService.saveUser(user)){
            return ResponseEntity.ok(new CustomHttpResponseData(true,200,"","User Successfully saved"));
        }
        return ResponseEntity.ok(new CustomHttpResponseData(false,500,"Somthing wrong","User Not saved"));
    }
}

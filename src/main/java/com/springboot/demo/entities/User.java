package com.springboot.demo.entities;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class User {

    @Id
    String id;
    String firstName;

    String password;

    String createdOn;
}

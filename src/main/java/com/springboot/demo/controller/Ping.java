package com.springboot.demo.controller;

import com.springboot.demo.models.CustomHttpResponseData;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Ping {
    @RequestMapping(value="/ping",method= RequestMethod.GET,produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<CustomHttpResponseData> ping() throws InterruptedException {
        return ResponseEntity.ok(new CustomHttpResponseData(true,200,"","Yes I am working all day and night"));
    }
}

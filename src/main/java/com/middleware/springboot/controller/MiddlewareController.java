package com.middleware.springboot.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class MiddlewareController {

    @GetMapping("/testApplication")
    public ResponseEntity<String> getSample(){
        return ResponseEntity.status(HttpStatus.OK).body("success");
    }
}

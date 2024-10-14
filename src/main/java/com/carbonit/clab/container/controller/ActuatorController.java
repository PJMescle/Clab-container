package com.carbonit.clab.container.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ActuatorController {


    @GetMapping("/")
    public ResponseEntity<String> getCoffee() {
        return new ResponseEntity<>("Application is running, here is a coffee", HttpStatus.OK);
    }

}

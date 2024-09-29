package com.carbonit.clab.container.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CafeController {



    @GetMapping("/cafe")
    public ResponseEntity<String> getCafe(){
        return new ResponseEntity<>("Here's a coffe", HttpStatus.OK);
    }

}

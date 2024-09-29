package com.carbonit.clab.container.controller;


import com.carbonit.clab.container.CafeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/db")
public class CafeDbController {

    private final CafeRepository repository;

    public CafeDbController(CafeRepository repository) {
        this.repository = repository;
    }


    @GetMapping("/cafes")
    public ResponseEntity<Long> getTotalCafes(){
        return new ResponseEntity<>(repository.count(), HttpStatus.OK);
    }

    @PostMapping("/cafes")
    public ResponseEntity<String> submitCafeOrder(@RequestBody CafeEntity cafe){
        repository.save(cafe);
        return new ResponseEntity<>("Order submitted", HttpStatus.OK);

    }


}

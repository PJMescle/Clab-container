package com.carbonit.clab.container.controller;


import com.carbonit.clab.container.CoffeeEntity;
import com.carbonit.clab.container.CoffeeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/coffee")
public class CoffeeController {

    private final CoffeeRepository repository;

    public CoffeeController(CoffeeRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/")
    public ResponseEntity<Long> getCoffeesQuantity() {
        return new ResponseEntity<>(repository.count(), HttpStatus.OK);
    }

    @PostMapping("/")
    public ResponseEntity<String> submitCoffeeOrder(@RequestBody CoffeeEntity coffee) {
        repository.save(coffee);
        return new ResponseEntity<>("Order submitted", HttpStatus.OK);

    }
}

package com.carbonit.clab.container;


import jakarta.persistence.*;

@Entity
@Table(name = "coffee")
public class CoffeeEntity {

    @Column
    public String type;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int Id;

    public CoffeeEntity(String type) {
        this.type = type;
    }

    public CoffeeEntity() {
    }
}

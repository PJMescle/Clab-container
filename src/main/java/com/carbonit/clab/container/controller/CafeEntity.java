package com.carbonit.clab.container.controller;


import jakarta.persistence.*;

@Entity
@Table
public class CafeEntity {

    public CafeEntity(String type) {
        this.type = type;
    }

    public CafeEntity() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int Id;

    @Column
    public String type;




}

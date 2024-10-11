package com.carbonit.clab.container;


import jakarta.persistence.*;

@Entity
@Table(name="cafe")
public class CafeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int Id;

    @Column
    public String type;

    public CafeEntity(String type) {
        this.type = type;
    }

    public CafeEntity() {
    }



}

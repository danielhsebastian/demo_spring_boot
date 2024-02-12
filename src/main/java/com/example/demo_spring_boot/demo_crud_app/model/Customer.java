package com.example.demo_spring_boot.demo_crud_app.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "customers")
public class Customer {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String address;
    private String email;
    private String phone;

    //OneToMany relationship with 'order' Entity
    @OneToMany(mappedBy = "customer")
    private List<Order> orders;

}

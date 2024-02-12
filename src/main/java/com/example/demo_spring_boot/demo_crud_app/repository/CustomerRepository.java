package com.example.demo_spring_boot.demo_crud_app.repository;

import com.example.demo_spring_boot.demo_crud_app.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}

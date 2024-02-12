package com.example.demo_spring_boot.demo_crud_app.repository;

import com.example.demo_spring_boot.demo_crud_app.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

}

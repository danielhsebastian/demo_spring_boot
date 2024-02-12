package com.example.demo_spring_boot.demo_crud_app.service;

import com.example.demo_spring_boot.demo_crud_app.model.Order;

import java.util.List;
import java.util.Optional;

public interface OrderService {

    List<Order> readAllOrders();
    Optional<Order> getOrderById(Long id);
    Order saveOrder(Order order);
    Order updateOrder(Order order);
    void deleteOrderById(Long id);

}

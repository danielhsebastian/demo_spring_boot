package com.example.demo_spring_boot.demo_crud_app.service;

import com.example.demo_spring_boot.demo_crud_app.model.Customer;

import java.util.List;
import java.util.Optional;

public interface CustomerService {
    List<Customer> readAllCustomers();

    Optional<Customer> getCustomerById(Long id);

    Customer saveCustomer(Customer customer);

    Customer updateCustomer(Customer customer);

    void deleteCustomer(Customer customer);

}

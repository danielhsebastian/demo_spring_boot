package com.example.demo_spring_boot.demo_crud_app.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "order_name")
    private String name;
    private String description;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate date;
    @Column(name = "order_total")
    private Double total;
    private Integer quantity;
    private String status;

    //ManyToOne relationship with 'customer' Entity
    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = false, referencedColumnName = "id")
    private Customer customer;

    //ManyToMany relationship with 'book' Entity
    @ManyToMany
    @JoinTable(name = "orders_books",
            joinColumns = @JoinColumn(name = "order_id", referencedColumnName = "id"), //refera join cu PK din tabela 'order'
            inverseJoinColumns = @JoinColumn(name = "book_id", referencedColumnName = "id")) //refera join cu FK celeilalte tabele 'book'
    private List<Book> books;

}

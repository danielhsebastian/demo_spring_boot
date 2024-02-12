package com.example.demo_spring_boot.demo_crud_app.model;


import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity //cu ajutorul ORM, mapam clasa Book in tabela SQL
@Table(name="books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) //daca nu punem aceasta adnotatie, valoarea default e AUTO
    private Integer id;
    @Column(name = "book_name", nullable = false)
    private String name;
    @Column(name = "book_author")
    private String author;
    @Column(name = "book_price")
    private Double price;
    @Column(name = "book_isbn")
    private String isbn;
    @Column(name = "book_category")
    private String category;

    //ManyToMany relationship with 'Order' Entity
    @ManyToMany(mappedBy = "books", fetch = FetchType.LAZY) //lazy load (incarca relatiile doar cand e nevoie)
                                                            //eager load (incarca relatiile indiferent daca e nevoie sau nu)
    private List<Order> orders;
}

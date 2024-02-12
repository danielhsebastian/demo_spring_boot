package com.example.demo_spring_boot.demo_crud_app.service;

import com.example.demo_spring_boot.demo_crud_app.model.Book;

import java.util.List;
import java.util.Optional;

public interface BookService {
    //HTTP verbs : GET, POST, PUT, DELETE, PATCH
    // GET - READ // POST - CREATE // PUT/PATCH - UPDATE // DELETE - DELETE //
    //read all books from DB -> GET HTTP endpoint
    List<Book> readAllBooks();
    //read data for a book by id ->GET (by id) HTTP endpoint
    Optional<Book> getBookById(Long id);
    //create new book and save it to DB -> POST HTTP endpoint
    Book createNewBook(Book book);
    //delete book by id -> DELETE HTTP endpoint
    void deleteBookById(Long id);
    //update a book -> PUT HTTP endpoint
    Book updateBook(Book book);

    //Custom CRUD methods defined

    List<Book> getAllBooksByName(String name);

    List<Book> getAllBooksByIsbn(String isbn);


}

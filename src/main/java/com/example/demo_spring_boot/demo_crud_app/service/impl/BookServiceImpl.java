package com.example.demo_spring_boot.demo_crud_app.service.impl;
import com.example.demo_spring_boot.demo_crud_app.model.Book;
import com.example.demo_spring_boot.demo_crud_app.repository.BookRepository;
import com.example.demo_spring_boot.demo_crud_app.service.BookService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookServiceImpl implements BookService {

    //Apply dependency injection through constructor(or using @RequiredArgsConstructor by making all the fields/objects FINAL)/setter method

    //1. DI through constructor
    private BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public List<Book> readAllBooks() {
        return bookRepository.findAll();
    }

    @Override
    public Optional<Book> getBookById(Long id) {
        return bookRepository.findById(id);
    }

    @Override
    public Book createNewBook(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public void deleteBookById(Long id) {
        bookRepository.deleteById(id);
    }

    @Override
    public Book updateBook(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public List<Book> getAllBooksByName(String name) {
        return bookRepository.findBooksByName(name);
    }

    @Override
    public List<Book> getAllBooksByIsbn(String isbn) {
        return bookRepository.findBooksByIsbn(isbn);
    }

}

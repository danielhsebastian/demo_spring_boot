package com.example.demo_spring_boot.demo_crud_app.controller;

import com.example.demo_spring_boot.demo_crud_app.model.Book;
import com.example.demo_spring_boot.demo_crud_app.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RequiredArgsConstructor
@RestController // @RestController VS @Controller -> Spring rest API
                // @RestController = @Controller + @ResponseBody
                // @RestController ofera suport pentru rest API
@RequestMapping("/api/books")
public class BookController {

    //Controller-ul e responsabil pentru gestionarea request-urilor de HTTP care vin de la client(Aplicatia Web) si de a returna
    // un raspuns HTTP inapoi catre client
    //comunicarea intre front-end si back-end e realizata prin protocolul HTTP de tipul request / response

    //DI Injection using @RequiredArgsConstructor
    private final BookService bookService;

    //Implement HTTP rest apis(HTTP verbs): GET(@GetMapping),POST(@PostMapping), PUT(@PutMapping), DELETE(@DeleteMapping)

    //GET endpoint -> http://localhost:8080/api/books
    @GetMapping
    public ResponseEntity<List<Book>> getAllBooks(){
        return new ResponseEntity<>(bookService.readAllBooks(), HttpStatus.OK);
    }


}

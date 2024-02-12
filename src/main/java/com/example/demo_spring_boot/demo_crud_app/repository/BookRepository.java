package com.example.demo_spring_boot.demo_crud_app.repository;

import com.example.demo_spring_boot.demo_crud_app.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository //reprezinta interfata care gestioneaza entitatea 'book' pentru a stoca si manipula date prin CRUD in DB
//o clasa extinde o alta clasa cu 'extends'
//o clasa poate sa implementeze mai multe interfete cu 'implements'
//o interfata poate sa extinda o alta interfata cu 'extends'
//Spring Data la nivel de repo ne permite sa definim modalitati prin care putem sa executam un query de SQL:
// 1. Folosind sintaxa de JPQL (Adnotarea @Query)
// 2. Query Nativ (Adnotarea @Query + parametrul nativeQuery = true)
public interface BookRepository extends JpaRepository<Book, Long> { // <Entity, tip PK>
       //putem sa ne definim operatii CRUD custom

       //find all books by author

    List<Book> findBooksByAuthor(String author);

    List<Book> findBooksByNameAndPrice(String name, Double price);

   // List<Book> findBooksByName(String name);

    List<Book> findBooksByIsbn(String isbn);

    List<Book> findBooksByName(String name);
}

package com.ironhack.bookservice.Repository;

import com.ironhack.bookservice.Classes.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository <Book, Long> {
}

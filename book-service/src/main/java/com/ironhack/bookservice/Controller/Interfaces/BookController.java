package com.ironhack.bookservice.Controller.Interfaces;

import com.ironhack.bookservice.Classes.Book;

public interface BookController {
    Book getBookInformation();
    void createBook();
}

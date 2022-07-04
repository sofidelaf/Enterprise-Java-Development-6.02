package com.ironhack.bookservice.Controller.Interfaces;

import com.ironhack.bookservice.Classes.Book;
import com.ironhack.bookservice.Controller.DTO.BookDTO;

public interface BookController {
    BookDTO getBookInformation(long ISBN);
    Book postBookFormat(Book book);
}
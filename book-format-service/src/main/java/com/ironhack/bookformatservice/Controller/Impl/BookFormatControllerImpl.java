package com.ironhack.bookformatservice.Controller.Impl;

import com.ironhack.bookformatservice.Controller.Interfaces.BookFormatController;
import com.ironhack.bookformatservice.Enum.Format;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookFormatControllerImpl implements BookFormatController {
    @GetMapping("/book-formats")
    @ResponseStatus(HttpStatus.OK)
    public Format getBookFormat() {
        return Format.AUDIO;
    }
}

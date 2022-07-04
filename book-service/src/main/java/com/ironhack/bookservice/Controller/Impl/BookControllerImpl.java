package com.ironhack.bookservice.Controller.Impl;

import com.ironhack.bookservice.Classes.Book;
import com.ironhack.bookservice.Controller.Interfaces.BookController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Optional;

@RestController
public class BookControllerImpl implements BookController {

    @Autowired
    private DiscoveryClient discoveryClient;
    private final Logger logger = LoggerFactory.getLogger(BookControllerImpl.class);

    @GetMapping("/books")
    @ResponseStatus(HttpStatus.OK)
    public Book getBookInformation() {
        RestTemplate restTemplate = new RestTemplate();

        String baseUrl = discoveryClient.getInstances("book-format-service").get(0).getUri().toString();
        logger.debug("Base url = " + baseUrl);

        String apiMethod = "/book-formats";

        String result = restTemplate.getForObject(baseUrl + apiMethod, String.class);

        Book book = new Book(123456789L, "Los Cazaventuras", "Helen Velando", "Literatura Infantil");

        return book;
    }

    @Override
    public void createBook() {

    }
}

package com.bitspilani.groupbg.PublishingCompany.model.books;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/book")
public class BookController {

    private final BookService  bookService;

    @Autowired
    private BookController(BookService bookService){
        this.bookService = bookService;
    }

    @GetMapping
    public List<Books> getBooks(){
        return bookService.getBooks();
    }
}

package com.bitspilani.groupbg.PublishingCompany.model.books;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/printedbook")
public class PrintBooksController {

    private final PrintBooksService printBooksService;

    @Autowired
    public PrintBooksController(PrintBooksService printBooksService){
        this.printBooksService = printBooksService;
    }

    @GetMapping
    public List<PrintBooks> getPrintedBooks(){
        return printBooksService.getPrintedBooks();
    }
}

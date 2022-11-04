package com.bitspilani.groupbg.PublishingCompany.model.books;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PrintBooksService {
    private final PrintBookRepository printBookRepository;

    @Autowired
    public PrintBooksService(PrintBookRepository printBookRepository) {
        this.printBookRepository = printBookRepository;
    }

    public List<PrintBooks> getPrintedBooks() {
        return printBookRepository.findAll();
    }
}

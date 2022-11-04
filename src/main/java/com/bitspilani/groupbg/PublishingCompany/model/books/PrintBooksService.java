package com.bitspilani.groupbg.PublishingCompany.model.books;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PrintBooksService {
    public List<PrintBooks> getPrintedBooks() {
        return List.of(new PrintBooks());
    }
}

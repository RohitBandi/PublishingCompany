package com.bitspilani.groupbg.PublishingCompany.model.books;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    public List<Books> getBooks() {
        return List.of(new Books());
    }
}

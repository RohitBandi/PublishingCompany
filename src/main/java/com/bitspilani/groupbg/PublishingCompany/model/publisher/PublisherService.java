package com.bitspilani.groupbg.PublishingCompany.model.publisher;

import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PublisherService {
    public List<Publisher> getPublishers() {
        return List.of(new Publisher());
    }
}

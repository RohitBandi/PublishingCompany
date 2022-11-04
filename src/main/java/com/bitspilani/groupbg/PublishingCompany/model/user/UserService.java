package com.bitspilani.groupbg.PublishingCompany.model.user;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    public List<User> getUsers() {
        return List.of(new User());
    }
}

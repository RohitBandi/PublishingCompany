package com.bitspilani.groupbg.PublishingCompany.model.orders;

import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OrderService {
    public List<Orders> getOrders() {
        return List.of(new Orders());
    }
}

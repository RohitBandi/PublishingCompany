package com.bitspilani.groupbg.PublishingCompany.model.orders;

import java.time.LocalDate;

public class Orders {
    private Long id;
    private String status;
    private LocalDate orderDate;

    public Orders() {
    }

    public Orders(String status, LocalDate orderDate) {
        this.status = status;
        this.orderDate = orderDate;
    }

    public Orders(Long id, String status, LocalDate orderDate) {
        this.id = id;
        this.status = status;
        this.orderDate = orderDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "id=" + id +
                ", status='" + status + '\'' +
                ", orderDate=" + orderDate +
                '}';
    }
}

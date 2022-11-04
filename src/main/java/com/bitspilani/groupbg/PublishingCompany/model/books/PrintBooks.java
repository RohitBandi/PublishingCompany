package com.bitspilani.groupbg.PublishingCompany.model.books;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class PrintBooks {
    @Id
    private Long id;
    private String email;
    private String address;
    private String phone;
    private double price;

    public PrintBooks() {
    }

    public PrintBooks(String email, String address, String phone, double price) {
        this.email = email;
        this.address = address;
        this.phone = phone;
        this.price = price;
    }

    public PrintBooks(Long id, String email, String address, String phone, double price) {
        this.id = id;
        this.email = email;
        this.address = address;
        this.phone = phone;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "PrintBooks{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", price=" + price +
                '}';
    }
}

package com.bitspilani.groupbg.PublishingCompany.model.user;

import java.time.LocalDate;

public class User {

    private Long id;
    private String name;
    private String email;
    private LocalDate dob;
    private String phone;

    public User() {
    }

    public User(String name, String email, LocalDate dob, String phone) {
        this.name = name;
        this.email = email;
        this.dob = dob;
        this.phone = phone;
    }

    public User(Long id, String name, String email, LocalDate dob, String phone) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.dob = dob;
        this.phone = phone;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", dob=" + dob +
                ", phone='" + phone + '\'' +
                '}';
    }
}

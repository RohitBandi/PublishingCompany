package com.bitspilani.groupbg.PublishingCompany.model.author;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.time.LocalDate;
@Entity
@Table
public class Author {
    @Id
    private Long id;
    private String name;
    private LocalDate dob;
    private String email;
    private String address;

    public Author() {
    }

    public Author(String name, LocalDate dob, String email, String address) {
        this.name = name;
        this.dob = dob;
        this.email = email;
        this.address = address;
    }

    public Author(Long id, String name, LocalDate dob, String email, String address) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.email = email;
        this.address = address;
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

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
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

    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dob=" + dob +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}

package com.bitspilani.groupbg.PublishingCompany.model.books;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Books {
    @Id
    private Long number;
    private String title;
    private String description;
    private String language;

    public Books() {
    }

    public Books(String title, String description, String language) {
        this.title = title;
        this.description = description;
        this.language = language;
    }

    public Books(Long number, String title, String description, String language) {
        this.number = number;
        this.title = title;
        this.description = description;
        this.language = language;
    }

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public String toString() {
        return "Books{" +
                "id=" + number +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", language='" + language + '\'' +
                '}';
    }
}

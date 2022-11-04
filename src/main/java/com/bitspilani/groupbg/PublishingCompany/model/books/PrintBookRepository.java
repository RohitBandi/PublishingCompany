package com.bitspilani.groupbg.PublishingCompany.model.books;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrintBookRepository extends JpaRepository<PrintBooks, Long> {
}

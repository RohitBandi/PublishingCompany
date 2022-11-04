package com.bitspilani.groupbg.PublishingCompany.model.publisher;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;
@Entity
@Table
public class Publisher {
    @Id
    private Long id;
    private LocalDate signDate;
    private String terms;
    private String contract;
    private String royalties;
    private double advancePayments;

    public Publisher() {
    }

    public Publisher(LocalDate signDate, String terms, String contract, String royalties, double advancePayments) {
        this.signDate = signDate;
        this.terms = terms;
        this.contract = contract;
        this.royalties = royalties;
        this.advancePayments = advancePayments;
    }

    public Publisher(Long id, LocalDate signDate, String terms, String contract, String royalties, double advancePayments) {
        this.id = id;
        this.signDate = signDate;
        this.terms = terms;
        this.contract = contract;
        this.royalties = royalties;
        this.advancePayments = advancePayments;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getSignDate() {
        return signDate;
    }

    public void setSignDate(LocalDate signDate) {
        this.signDate = signDate;
    }

    public String getTerms() {
        return terms;
    }

    public void setTerms(String terms) {
        this.terms = terms;
    }

    public String getContract() {
        return contract;
    }

    public void setContract(String contract) {
        this.contract = contract;
    }

    public String getRoyalties() {
        return royalties;
    }

    public void setRoyalties(String royalties) {
        this.royalties = royalties;
    }

    public double getAdvancePayments() {
        return advancePayments;
    }

    public void setAdvancePayments(double advancePayments) {
        this.advancePayments = advancePayments;
    }

    @Override
    public String toString() {
        return "Publisher{" +
                "id=" + id +
                ", signDate=" + signDate +
                ", terms='" + terms + '\'' +
                ", contract='" + contract + '\'' +
                ", royalties='" + royalties + '\'' +
                ", advancePayments=" + advancePayments +
                '}';
    }
}

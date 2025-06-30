package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

@Entity
public class Portfolio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String investmentSummary;

    @OneToOne
    @JoinColumn(name = "client_id")
    private Client client;

    public Portfolio() {}

    public Portfolio(String investmentSummary, Client client) {
        this.investmentSummary = investmentSummary;
        this.client = client;
    }

    public Long getId() {
        return id;
    }

    public String getInvestmentSummary() {
        return investmentSummary;
    }

    public void setInvestmentSummary(String investmentSummary) {
        this.investmentSummary = investmentSummary;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}

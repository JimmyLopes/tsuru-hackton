package com.digio.hackton.tsuru.backend.dto;

import java.time.LocalDate;

public class CofferResponse {

    private Integer id;

    private String name;

    private Double amount;

    private Double finalAmount;

    private Double quantityToInvestPerMouth;

    private String objective;

    private LocalDate initialDate;

    private LocalDate finalDate;

    public Integer getId() {
        return id;
    }

    public CofferResponse setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public CofferResponse setName(String name) {
        this.name = name;
        return this;
    }

    public Double getAmount() {
        return amount;
    }

    public CofferResponse setAmount(Double amount) {
        this.amount = amount;
        return this;
    }

    public Double getFinalAmount() {
        return finalAmount;
    }

    public CofferResponse setFinalAmount(Double finalAmount) {
        this.finalAmount = finalAmount;
        return this;
    }

    public Double getQuantityToInvestPerMouth() {
        return quantityToInvestPerMouth;
    }

    public CofferResponse setQuantityToInvestPerMouth(Double quantityToInvestPerMouth) {
        this.quantityToInvestPerMouth = quantityToInvestPerMouth;
        return this;
    }

    public String getObjective() {
        return objective;
    }

    public CofferResponse setObjective(String objective) {
        this.objective = objective;
        return this;
    }

    public LocalDate getInitialDate() {
        return initialDate;
    }

    public CofferResponse setInitialDate(LocalDate initialDate) {
        this.initialDate = initialDate;
        return this;
    }

    public LocalDate getFinalDate() {
        return finalDate;
    }

    public CofferResponse setFinalDate(LocalDate finalDate) {
        this.finalDate = finalDate;
        return this;
    }
}

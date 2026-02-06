package com.devsuperior.exercicio.entities;

public class Invoice {

    private Integer number;
    private Double amount;
    private PaymentMethod paymentMethod;

    public Invoice(Integer number, Double amount, PaymentMethod paymentMethod) {
        this.number = number;
        this.amount = amount;
        this.paymentMethod = paymentMethod;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
}

package com.devsuperior.exercicio.services;

import com.devsuperior.exercicio.entities.Invoice;
import com.devsuperior.exercicio.entities.PaymentMethod;
import org.springframework.stereotype.Service;

@Service
public class PaymentProcessingService {

    public double calculatePayment(Invoice invoice) {
        final double creditCardPercentage = 0.035;
        final double debitCardPercentage = 0.02;
        final double pixFee = 1.0;

        if (invoice.getPaymentMethod().equals(PaymentMethod.CREDIT_CARD)) {
            return invoice.getAmount() * creditCardPercentage;
        }
        if (invoice.getPaymentMethod().equals(PaymentMethod.DEBIT_CARD)) {
            return invoice.getAmount() * debitCardPercentage;
        }
        if (invoice.getPaymentMethod().equals(PaymentMethod.CASH)) {
            return invoice.getAmount() * 0;
        }
        if (invoice.getPaymentMethod().equals(PaymentMethod.PIX)) {
            return invoice.getAmount() * pixFee;
        }
        return 0;
    }
}

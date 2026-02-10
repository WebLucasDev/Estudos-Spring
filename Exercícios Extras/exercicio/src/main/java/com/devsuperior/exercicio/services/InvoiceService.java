package com.devsuperior.exercicio.services;

import com.devsuperior.exercicio.entities.Invoice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InvoiceService {

    @Autowired
    private PaymentProcessingService paymentProcessingService;
    @Autowired
    private TaxService taxService;

    public double calculateInvoice(Invoice invoice) {
        return invoice.getAmount() + paymentProcessingService.calculatePayment(invoice) + taxService.calculateTax(invoice);
    }
}

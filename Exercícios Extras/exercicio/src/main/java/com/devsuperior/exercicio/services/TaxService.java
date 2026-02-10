package com.devsuperior.exercicio.services;

import com.devsuperior.exercicio.entities.Invoice;
import org.springframework.stereotype.Service;

@Service
public class TaxService {

    public double calculateTax(Invoice invoice) {
        if (invoice.getAmount() <= 200.00) {
            return invoice.getAmount() * 0.15;
        }
        if (invoice.getAmount() > 200.00 && invoice.getAmount() <= 500.00) {
            return invoice.getAmount() * 0.10;
        }
        if (invoice.getAmount() > 500.00) {
            return invoice.getAmount() * 0.05;
        }
        return 0;
    }
}

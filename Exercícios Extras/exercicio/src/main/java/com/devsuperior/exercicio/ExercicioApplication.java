package com.devsuperior.exercicio;

import com.devsuperior.exercicio.entities.Invoice;
import com.devsuperior.exercicio.entities.PaymentMethod;
import com.devsuperior.exercicio.services.InvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Locale;
import java.util.Scanner;

@SpringBootApplication
public class ExercicioApplication implements CommandLineRunner {

	@Autowired
	InvoiceService service;

	public static void main(String[] args) {
		SpringApplication.run(ExercicioApplication.class, args);
	}

	public void run(String... args) throws Exception {
		Locale.setDefault(Locale.US);

		Invoice invoice1 = new Invoice(5001, 180.00, PaymentMethod.CREDIT_CARD);
		System.out.println("Fatura número: " + invoice1.getNumber());
		System.out.printf("Valor total: R$ %.2f%n%n", service.calculateInvoice(invoice1));

		Invoice invoice2 = new Invoice(5002, 350.00, PaymentMethod.PIX);
		System.out.println("Fatura número: " + invoice2.getNumber());
		System.out.printf("Valor total: R$ %.2f%n%n", service.calculateInvoice(invoice2));

		Invoice invoice3 = new Invoice(5003, 600.00, PaymentMethod.CASH);
		System.out.println("Fatura número: " + invoice3.getNumber());
		System.out.printf("Valor total: R$ %.2f%n", service.calculateInvoice(invoice3));
	}
}

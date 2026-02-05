package app;

import entities.Employee;
import services.PensionService;
import services.SalaryService;
import services.TaxService;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Nome: ");
        String name = sc.nextLine();
        System.out.println("Salário bruto: ");
        double grossSalary = sc.nextDouble();

        Employee employee = new Employee(name, grossSalary);
        TaxService taxService = new TaxService();
        PensionService pensionService = new PensionService();
        SalaryService salaryService = new SalaryService(taxService, pensionService);

        System.out.printf("Salário líquido = %.2f%n", salaryService.netSalary(employee));

        sc.close();
    }
}
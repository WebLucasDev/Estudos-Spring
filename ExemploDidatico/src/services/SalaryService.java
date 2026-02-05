package services;

import entities.Employee;

public class SalaryService {

    // Forma errada - sem fazer injeção de dependência!
    TaxService taxService = new TaxService();
    PensionService pensionService = new PensionService();

    public double netSalary(Employee employee) {
        return employee.getGrosSalaray() - taxService.tax(employee.getGrosSalaray()) - pensionService.discount(employee.getGrosSalaray());
    }
}

package services;

import entities.Employee;

public class SalaryService {

    private TaxService taxService;
    private PensionService pensionService;

    /* A injeção de dependência é feita via construtor.

        Inversão de controle = remove o controle de SalaryService sobre TaxService e PensionService, ou seja, não há "new TaxService" ou "new PensionService".

        Injeção de dependência = é feita via construtor, ao qual no programa principal devem ser instanciados os objetos TaxService e PensionService e passados
        no parâmetro do construtor.
    */
    public SalaryService(TaxService taxService, PensionService pensionService) {
        this.taxService = taxService;
        this.pensionService = pensionService;
    }

    public double netSalary(Employee employee) {
        return employee.getGrosSalaray() - taxService.tax(employee.getGrosSalaray()) - pensionService.discount(employee.getGrosSalaray());
    }
}

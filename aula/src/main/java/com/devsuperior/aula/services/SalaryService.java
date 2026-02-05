package com.devsuperior.aula.services;

import com.devsuperior.aula.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SalaryService {

    /* @Autowired
    *
    * Essa anotation realiza a injeção de dependência, não sendo necessário criar o construtor com parâmetros das dependências da classe.
    */
    @Autowired
    private TaxService taxService;
    @Autowired
    private PensionService pensionService;

    public double netSalary(Employee employee) {
        return employee.getGrosSalaray() - taxService.tax(employee.getGrosSalaray()) - pensionService.discount(employee.getGrosSalaray());
    }
}

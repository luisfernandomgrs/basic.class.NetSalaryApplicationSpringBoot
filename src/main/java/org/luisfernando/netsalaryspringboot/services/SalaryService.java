package org.luisfernando.netsalaryspringboot.services;

import org.luisfernando.netsalaryspringboot.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SalaryService {

    /*
    Autowired members only can be defined in valid Spring bean:
    (@Component|@Service|...)
    In this case, we are using: Container of dependency injection (by framework)
    */
    @Autowired
    private TaxService taxService;
    @Autowired
    private PensionService pensionService;

    public double netSalary(Employee employee) {
        return employee.getGrossSalary() - taxService.calculateTax(employee.getGrossSalary())
                - pensionService.calculatePension(employee.getGrossSalary());
    }
}

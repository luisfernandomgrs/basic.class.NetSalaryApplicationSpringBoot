package org.luisfernando.netsalaryspringboot.services;

import org.springframework.stereotype.Service;

@Service
public class TaxService {
    public double calculateTax(double amount) {
        return amount * 0.2;
    }
}

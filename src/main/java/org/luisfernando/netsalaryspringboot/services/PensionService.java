package org.luisfernando.netsalaryspringboot.services;

import org.springframework.stereotype.Service;

@Service
public class PensionService {
    public double calculatePension(double amount) {
        return amount * 0.1;
    }
}

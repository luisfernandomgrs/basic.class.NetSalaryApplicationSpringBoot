package org.luisfernando.netsalaryspringboot.App;

import org.luisfernando.netsalaryspringboot.entities.Employee;
import org.luisfernando.netsalaryspringboot.services.SalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"org.luisfernando.netsalaryspringboot"})
public class NetSalarySpringBootApplication implements CommandLineRunner {
	@Autowired
	private SalaryService salaryService;

	public static void main(String[] args) {
		SpringApplication.run(NetSalarySpringBootApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Employee employee = new Employee("Luis Fernando", 4000);
		System.out.println(salaryService.netSalary(employee));
	}
}

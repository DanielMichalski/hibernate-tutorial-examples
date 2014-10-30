package pl.dmichalski.c07;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pl.dmichalski.c07.entity.Employee;
import pl.dmichalski.c07.repository.EmployeeRepository;

/**
 * Author: Daniel
 */

/*
CREATE TRIGGER calculate_tax
BEFORE INSERT ON employee FOR EACH ROW
SET new.tax = new.salary * 0.20;
*/

public class Runner {

    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("spring/spring-data.xml", "spring/spring-general.xml");

        EmployeeRepository repository =
                context.getBean("employeeRepository", EmployeeRepository.class);

        Employee employee = new Employee();
        employee.setFirstName("Thom");
        employee.setFirstName("Long");
        employee.setSalary(15000);

        repository.save(employee);
        repository.save(employee);

        // entityManager.refresh(employee);    // to refresh data data changed changed by database trigger

        System.out.println(employee);
    }
}

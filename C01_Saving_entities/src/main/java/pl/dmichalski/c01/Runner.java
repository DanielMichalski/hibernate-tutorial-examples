package pl.dmichalski.c01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pl.dmichalski.c01.entity.Employee;
import pl.dmichalski.c01.repository.EmployeeRepository;

import java.math.BigDecimal;

/**
 * Author: Daniel
 */
public class Runner {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("spring/spring-data.xml", "spring/spring-general.xml");

        Employee employee = new Employee();
        employee.setName("John");
        employee.setSurname("How");
        employee.setSalary(5000);
        employee.setOldSalary(new BigDecimal("23943.2"));

        EmployeeRepository repository =
                context.getBean("employeeRepository", EmployeeRepository.class);

        repository.save(employee);

    }

}

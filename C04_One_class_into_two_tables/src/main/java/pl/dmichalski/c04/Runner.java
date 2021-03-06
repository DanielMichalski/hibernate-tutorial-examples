package pl.dmichalski.c04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pl.dmichalski.c04.entity.Employee;
import pl.dmichalski.c04.repository.EmployeeRepository;

/**
 * Author: Daniel
 */
public class Runner {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("spring/spring-data.xml", "spring/spring-general.xml");

        Employee employee = new Employee();
        employee.setFirstName("John");
        employee.setLastName("Newman");
        employee.setSalary(10000);
        employee.setLocality("Warsaw");
        employee.setZipCode("01-153");
        employee.setStreet("Long street");
        employee.setStreetNumber(43);

        EmployeeRepository repository =
                context.getBean("employeeRepository", EmployeeRepository.class);

        repository.save(employee);
    }
}

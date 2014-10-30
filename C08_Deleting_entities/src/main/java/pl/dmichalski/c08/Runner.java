package pl.dmichalski.c08;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pl.dmichalski.c08.entity.Employee;
import pl.dmichalski.c08.repository.EmployeeRepository;

/**
 * Author: Daniel
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
        repository.delete(employee);

    }
}

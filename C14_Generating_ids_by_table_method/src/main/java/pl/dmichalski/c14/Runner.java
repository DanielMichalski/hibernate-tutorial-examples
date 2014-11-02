package pl.dmichalski.c14;

import pl.dmichalski.c14.entity.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pl.dmichalski.c14.repository.EmployeeRepository;

/**
 * Author: Daniel
 */
public class Runner {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("spring/spring-general.xml", "spring/spring-data.xml");

        Employee employee1 = new Employee();
        employee1.setName("John");
        employee1.setSurname("How");
        employee1.setSalary(17000.0);

        Employee employee2 = new Employee();
        employee2.setName("Thom");
        employee2.setSurname("Long");
        employee2.setSalary(15000.0);

        Employee employee3 = new Employee();
        employee3.setName("Mark");
        employee3.setSurname("Spec");
        employee3.setSalary(16000.0);

        EmployeeRepository repository =
                context.getBean("employeeRepository", EmployeeRepository.class);

        repository.save(employee1);
        repository.save(employee2);
        repository.save(employee3);

    }

}

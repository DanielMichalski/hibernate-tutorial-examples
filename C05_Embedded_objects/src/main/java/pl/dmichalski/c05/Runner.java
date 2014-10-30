package pl.dmichalski.c05;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pl.dmichalski.c05.entity.Address;
import pl.dmichalski.c05.entity.Employee;
import pl.dmichalski.c05.repository.EmployeeRepository;

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
        employee.setFirstName("John");
        employee.setLastName("Newman");
        employee.setSalary(10000);

        Address address = new Address();
        address.setLocality("Warsaw");
        address.setZipCode("01-153");
        address.setStreet("Long street");
        address.setStreetNumber(43);
        employee.setAddress(address);

        repository.save(employee);
    }
}

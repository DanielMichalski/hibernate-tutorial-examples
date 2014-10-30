package pl.dmichalski.c06;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pl.dmichalski.c06.entity.Address;
import pl.dmichalski.c06.entity.Employee;
import pl.dmichalski.c06.repository.AddressRepository;
import pl.dmichalski.c06.repository.EmployeeRepository;

/**
 * Author: Daniel
 */
public class Runner {

    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("spring/spring-data.xml", "spring/spring-general.xml");

        EmployeeRepository employeeRepository =
                context.getBean("employeeRepository", EmployeeRepository.class);
        AddressRepository addressReposiotry =
                context.getBean("addressRepository", AddressRepository.class);

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

        addressReposiotry.save(address);
        employeeRepository.save(employee);

        employee = employeeRepository.findOne(employee.getId());
        System.out.println(employee);
    }

}

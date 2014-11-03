package pl.dmichalski.c20;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pl.dmichalski.c20.entity.Employee;
import pl.dmichalski.c20.entity.Phone;
import pl.dmichalski.c20.repository.EmployeeRepository;
import pl.dmichalski.c20.repository.PhoneRepository;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Daniel
 */
public class Runner {

    private static EmployeeRepository employeeRepository;

    private static PhoneRepository phoneRepository;


    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("spring/spring-data.xml", "spring/spring-general.xml");

        employeeRepository = context.getBean("employeeRepository", EmployeeRepository.class);
        phoneRepository = context.getBean("phoneRepository", PhoneRepository.class);

        saveEmployee();

        Employee employee = employeeRepository.findOne(1L);
        List<Phone> phones = employee.getPhones();
        System.out.println(phones);

    }

    private static void saveEmployee() {
        Employee employee = new Employee();
        employee.setFirstName("Thom");
        employee.setLastName("Long");
        employee.setSalary(15000.0);

        List<Phone> phones = new ArrayList<>();
        Phone phone1 = new Phone();
        phone1.setType("Mobile");
        phone1.setNumber("32 372 88 10");
        Phone phone2 = new Phone();
        phone2.setType("Home");
        phone2.setNumber("23 233 43 23");

        phones.add(phone1);
        phones.add(phone2);
        employee.setPhones(phones);

        phoneRepository.save(phone1);
        phoneRepository.save(phone2);
        employeeRepository.save(employee);
    }

}

package pl.dmichalski.c09;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pl.dmichalski.c09.entity.Employee;
import pl.dmichalski.c09.repository.EmployeeRepository;

import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/**
 * Author: Daniel
 */
public class Runner {

    private static EmployeeRepository repository;

    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("spring/spring-data.xml", "spring/spring-general.xml");

        repository = context.getBean("employeeRepository", EmployeeRepository.class);

        addEmployees();

        List<Object> result = repository.getNameSurnameAndHigherSalary();
        Iterator<Object> iterator = result.iterator();
        while (iterator.hasNext()) {
            Object[] item = (Object[])iterator.next();
            String name = (String) item[0];
            double tax = (double)item[1];
            System.out.println(name + " " + tax);
        }

    }

    private static void addEmployees() {
        addEmployee("Karol", "Mateusiak", 2633);
        addEmployee("Marika", "Bednarek", 2345);
        addEmployee("Jan", "Mateusiak", 7346);
        addEmployee("Daria", "Kowalska", 2352);
        addEmployee("Monika", "Ucinska", 4263);
        addEmployee("Ernest", "Pajak", 2643);
        addEmployee("Kamil", "Stepien", 2345);
        addEmployee("Przemek", "Maciejewski", 5433);
        addEmployee("Robert", "Wozniak", 3324);
        addEmployee("Agnieszka", "Nowak", 2000);
        addEmployee("Angelika", "Bednarska", 1000);
    }

    private static void addEmployee(String firstName, String lastName, double salary) {
        Employee employee = new Employee();
        employee.setFirstName(firstName);
        employee.setLastName(lastName);
        employee.setSalary(salary);

        repository.save(employee);
    }


}

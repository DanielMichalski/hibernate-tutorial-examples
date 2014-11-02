package pl.dmichalski.c13;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pl.dmichalski.c13.entity.Employee;
import pl.dmichalski.c13.entity.Project;
import pl.dmichalski.c13.repository.EmployeeRepository;
import pl.dmichalski.c13.repository.ProjectRepository;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Daniel
 */
public class Runner {

    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("spring/spring-data.xml", "spring/spring-general.xml");

        EmployeeRepository employeeRepository =
                context.getBean("employeeRepository", EmployeeRepository.class);

        ProjectRepository projectRepository =
                context.getBean("projectRepository", ProjectRepository.class);

        Project project1 = new Project();
        project1.setName("Project1");
        Project project2 = new Project();
        project2.setName("Project2");

        Employee employee1 = new Employee();
        employee1.setFirstName("Thom");
        employee1.setLastName("Long");
        employee1.setSalary(15000.0);

        Employee employee2 = new Employee();
        employee2.setFirstName("Mark");
        employee2.setLastName("Strong");
        employee2.setSalary(17000.0);

        List<Employee> employees = new ArrayList<>();
        employees.add(employee1);
        employees.add(employee2);

        project1.setEmployees(employees);
        project2.setEmployees(employees);

        employeeRepository.save(employees);
        projectRepository.save(project1);
        projectRepository.save(project2);
    }

}

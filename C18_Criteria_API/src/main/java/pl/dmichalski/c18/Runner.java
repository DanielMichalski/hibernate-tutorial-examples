package pl.dmichalski.c18;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pl.dmichalski.c18.entity.Employee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Path;
import javax.persistence.criteria.Root;
import java.util.List;

/**
 * Author: Daniel
 */
public class Runner {

    private static EntityManager entityManager;

    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("spring/spring-general.xml", "spring/spring-data.xml");

        EntityManagerFactory entityManagerFactory =
                context.getBean("entityManagerFactory", EntityManagerFactory.class);
        entityManager = entityManagerFactory.createEntityManager();

        addEmployees();

        testCriteriaQuery();

        entityManager.close();
        entityManagerFactory.close();
    }

    private static void testCriteriaQuery() {
        // SELECT e from Employee e WHERE e.salary > 3000 AND e.salary < 5000

        CriteriaBuilder builder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Employee> criteriaQuery = builder.createQuery(Employee.class);
        Root<Employee> employee = criteriaQuery.from(Employee.class);

        Path<Double> salary = employee.get("salary");
        criteriaQuery.select(employee).where(builder
                .and(builder.greaterThan(salary, 3000.0), builder.lessThan(salary, 5000.0)));

        TypedQuery<Employee> query = entityManager.createQuery(criteriaQuery);
        List<Employee> employees = query.getResultList();
        employees.forEach(System.out::println);
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

        entityManager.getTransaction().begin();
        entityManager.persist(employee);
        entityManager.getTransaction().commit();
    }

}

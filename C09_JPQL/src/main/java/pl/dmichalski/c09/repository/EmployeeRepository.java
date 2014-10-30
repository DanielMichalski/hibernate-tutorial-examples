package pl.dmichalski.c09.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import pl.dmichalski.c09.entity.Employee;

import java.util.List;
import java.util.Objects;

/**
 * Author: Daniel
 */
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    /**********    Spring Data queries    **********/

    public List<Employee> getByLastName(String lastName);


    /**********    JPQL queries    **********/

    @Query("SELECT e FROM Employee e WHERE e.lastName = :lastName")
    public List<Employee> getByLastNameUsingJPQL(@Param("lastName") String lastName);

    @Query("SELECT e FROM Employee e WHERE e.salary > :salary ORDER BY e.salary")
    public List<Employee> getWorkerWithSalaryGreaterThanUsingJPQL(@Param("salary") double salary);

    @Query ("SELECT concat(e.firstName, ' ', e.lastName), e.salary * 0.2 FROM Employee e")
    public List<Object> getNameSurnameAndHigherSalary();

}

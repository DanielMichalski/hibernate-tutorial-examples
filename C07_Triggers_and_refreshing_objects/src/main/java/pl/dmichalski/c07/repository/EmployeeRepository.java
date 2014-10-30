package pl.dmichalski.c07.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.dmichalski.c07.entity.Employee;

/**
 * Author: Daniel
 */
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}

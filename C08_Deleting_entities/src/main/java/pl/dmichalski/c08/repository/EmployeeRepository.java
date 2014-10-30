package pl.dmichalski.c08.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.dmichalski.c08.entity.Employee;

/**
 * Author: Daniel
 */
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}

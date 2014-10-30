package pl.dmichalski.c04.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.dmichalski.c04.entity.Employee;

/**
 * Author: Daniel
 */
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}

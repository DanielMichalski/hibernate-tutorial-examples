package pl.dmichalski.c14.repository;

import pl.dmichalski.c14.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Author: Daniel
 */
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}

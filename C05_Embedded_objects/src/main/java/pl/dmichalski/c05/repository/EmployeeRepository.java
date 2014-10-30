package pl.dmichalski.c05.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.dmichalski.c05.entity.Employee;

/**
 * Author: Daniel
 */
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}

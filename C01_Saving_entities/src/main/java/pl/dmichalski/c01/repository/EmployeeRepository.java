package pl.dmichalski.c01.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.dmichalski.c01.entity.Employee;

/**
 * Author: Daniel
 */
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}

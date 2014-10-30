package pl.dmichalski.c06.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.dmichalski.c06.entity.Employee;

/**
 * Author: Daniel
 */
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}

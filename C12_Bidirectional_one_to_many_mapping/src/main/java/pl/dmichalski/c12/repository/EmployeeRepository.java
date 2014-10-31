package pl.dmichalski.c12.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.dmichalski.c12.entity.Employee;

/**
 * Author: Daniel
 */
public interface EmployeeRepository extends JpaRepository<Employee, Long>{
}

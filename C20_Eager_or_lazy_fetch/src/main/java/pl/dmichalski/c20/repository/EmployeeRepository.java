package pl.dmichalski.c20.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.dmichalski.c20.entity.Employee;

/**
 * Author: Daniel
 */
public interface EmployeeRepository extends JpaRepository<Employee, Long>{
}

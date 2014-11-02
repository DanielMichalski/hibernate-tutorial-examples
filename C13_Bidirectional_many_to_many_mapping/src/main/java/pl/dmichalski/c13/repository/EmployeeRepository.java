package pl.dmichalski.c13.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.dmichalski.c13.entity.Employee;

/**
 * Author: Daniel
 */
public interface EmployeeRepository extends JpaRepository<Employee, Long>{
}

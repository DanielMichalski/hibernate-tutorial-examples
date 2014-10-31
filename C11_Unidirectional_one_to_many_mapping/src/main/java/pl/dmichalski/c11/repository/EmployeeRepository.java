package pl.dmichalski.c11.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.dmichalski.c11.entity.Employee;

/**
 * Author: Daniel
 */
public interface EmployeeRepository extends JpaRepository<Employee, Long>{
}

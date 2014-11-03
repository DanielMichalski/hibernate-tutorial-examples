package pl.dmichalski.c19.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.dmichalski.c19.entity.Employee;

/**
 * Author: Daniel
 */
public interface EmployeeRepository extends JpaRepository<Employee, Long>{
}

package pl.dmichalski.c16.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.dmichalski.c16.entity.Person;

/**
 * Author: Daniel
 */
public interface PersonRepository extends JpaRepository<Person, Long>{
}

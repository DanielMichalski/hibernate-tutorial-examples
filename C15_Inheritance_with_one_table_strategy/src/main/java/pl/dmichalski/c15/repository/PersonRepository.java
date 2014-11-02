package pl.dmichalski.c15.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.dmichalski.c15.entity.Person;

/**
 * Author: Daniel
 */
public interface PersonRepository extends JpaRepository<Person, Long>{
}

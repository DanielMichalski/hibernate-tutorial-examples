package pl.dmichalski.c17.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.dmichalski.c17.entity.Person;

/**
 * Author: Daniel
 */
public interface PersonRepository extends JpaRepository<Person, Long>{
}

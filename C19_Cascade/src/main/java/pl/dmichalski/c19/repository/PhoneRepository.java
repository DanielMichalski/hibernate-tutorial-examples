package pl.dmichalski.c19.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.dmichalski.c19.entity.Phone;

/**
 * Author: Daniel
 */
public interface PhoneRepository extends JpaRepository<Phone, Long> {
}

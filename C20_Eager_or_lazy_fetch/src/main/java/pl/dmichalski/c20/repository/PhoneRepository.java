package pl.dmichalski.c20.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.dmichalski.c20.entity.Phone;

/**
 * Author: Daniel
 */
public interface PhoneRepository extends JpaRepository<Phone, Long> {
}

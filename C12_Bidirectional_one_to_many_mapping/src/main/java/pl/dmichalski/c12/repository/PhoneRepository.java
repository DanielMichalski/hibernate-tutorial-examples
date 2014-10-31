package pl.dmichalski.c12.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.dmichalski.c12.entity.Phone;

/**
 * Author: Daniel
 */
public interface PhoneRepository extends JpaRepository<Phone, Long> {
}

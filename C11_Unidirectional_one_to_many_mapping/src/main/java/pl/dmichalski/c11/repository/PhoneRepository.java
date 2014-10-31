package pl.dmichalski.c11.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.dmichalski.c11.entity.Phone;

/**
 * Author: Daniel
 */
public interface PhoneRepository extends JpaRepository<Phone, Long> {
}

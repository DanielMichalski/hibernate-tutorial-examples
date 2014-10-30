package pl.dmichalski.c07.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.dmichalski.c07.entity.Address;

/**
 * Author: Daniel
 */
public interface AddressRepository extends JpaRepository<Address, Long> {
}

package pl.dmichalski.c06.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.dmichalski.c06.entity.Address;

/**
 * Author: Daniel
 */
public interface AddressRepository extends JpaRepository<Address, Long> {
}

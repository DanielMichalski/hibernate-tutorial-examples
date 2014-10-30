package pl.dmichalski.c02.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.dmichalski.c02.entity.PossibleTypes;

/**
 * Author: Daniel
 */
public interface PossibleTypesRepository extends JpaRepository<PossibleTypes, Long> {
}

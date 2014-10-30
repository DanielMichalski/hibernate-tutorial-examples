package pl.dmichalski.c04.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.dmichalski.c04.entity.DateTime;

/**
 * Author: Daniel
 */
public interface DateTimeRepository extends JpaRepository<DateTime, Long> {
}

package pl.dmichalski.c03.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.dmichalski.c03.entity.DateTime;

/**
 * Author: Daniel
 */
public interface DateTimeRepository extends JpaRepository<DateTime, Long> {
}

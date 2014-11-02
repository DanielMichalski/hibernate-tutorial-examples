package pl.dmichalski.c13.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.dmichalski.c13.entity.Project;

/**
 * Author: Daniel
 */
public interface ProjectRepository extends JpaRepository<Project, Long>{
}

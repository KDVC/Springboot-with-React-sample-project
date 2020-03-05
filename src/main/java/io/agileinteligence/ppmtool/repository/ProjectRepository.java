package io.agileinteligence.ppmtool.repository;

import io.agileinteligence.ppmtool.domain.Project;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author : Viraj Wickramasinghe
 * @email : viraj.wickramasinghe@axiatadigitallabs.com
 * @date : 3/5/2020
 */
@Repository
public interface ProjectRepository extends CrudRepository<Project,Long> {
}

package io.agileinteligence.ppmtool.service;

import io.agileinteligence.ppmtool.domain.Project;
import io.agileinteligence.ppmtool.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author : Viraj Wickramasinghe
 * @email : viraj.wickramasinghe@axiatadigitallabs.com
 * @date : 3/5/2020
 */
@Service
public class ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    public Project saveOrUpdate(Project project){
        return projectRepository.save(project);
    }
}

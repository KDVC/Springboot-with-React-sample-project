package io.agileinteligence.ppmtool.controller;

import io.agileinteligence.ppmtool.domain.Project;
import io.agileinteligence.ppmtool.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author : Viraj Wickramasinghe
 * @email : viraj.wickramasinghe@axiatadigitallabs.com
 * @date : 3/5/2020
 */
@RestController
@RequestMapping("/api/project")
public class ProjectController {

    @Autowired
    public ProjectService projectService;

    @PostMapping("")
    public ResponseEntity<Project> createProject(@RequestBody Project project){
        Project project1 = projectService.saveOrUpdate(project);
        return new ResponseEntity<Project>(project, HttpStatus.CREATED);
    }
}

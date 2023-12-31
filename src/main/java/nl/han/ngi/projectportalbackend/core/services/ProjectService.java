package nl.han.ngi.projectportalbackend.core.services;

import nl.han.ngi.projectportalbackend.core.models.Project;
import nl.han.ngi.projectportalbackend.core.models.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProjectService {
    @Autowired
    private ProjectRepository projectRepository;

    public List<Project> getAll() {
        return projectRepository.getAll();
    }

    public Project getProject(String title){
        return projectRepository.getProject(title);
    }

    public Project createProject(Project project, String creator) {
        return projectRepository.createProject(project, creator);
    }

    public Project updateProject(String title, Project project) {
        return projectRepository.updateProject(title, project);
    }

    public void deleteProject(String title) {
        projectRepository.deleteProject(title);
    }

}

package nl.han.ngi.projectportalbackend.core.services;

import nl.han.ngi.projectportalbackend.core.models.Person;
import nl.han.ngi.projectportalbackend.core.models.Project;
import nl.han.ngi.projectportalbackend.core.models.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
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

    public void addParticipantToProject(String title, Person person, String function) {
        projectRepository.addParticipantToProject(title, person, function);
    }

    public void removeParticipantFromProject(String title, String email) {
        projectRepository.removeParticipantFromProject(title, email);
    }
}

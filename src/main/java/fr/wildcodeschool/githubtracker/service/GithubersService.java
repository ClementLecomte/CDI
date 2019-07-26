package fr.wildcodeschool.githubtracker.service;
import fr.wildcodeschool.githubtracker.dao.DumpGithuberDAO;
import fr.wildcodeschool.githubtracker.dao.GithuberDao;
import fr.wildcodeschool.githubtracker.model.Githuber;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import java.sql.SQLException;
import java.util.List;

@Dependent
public class GithubersService {

    private final GithuberDao dao;

    @Inject
    public GithubersService(GithuberDao dao) {
        this.dao = dao;
    }

    public List<Githuber> getAllGithubers(){
            return dao.getGithubers();
    }

        public Githuber getGithuber(String login) {
        Githuber githuber = getAllGithubers().stream()
                .filter(item -> item.getLogin().equals(login))
                .findFirst()
                .orElse(null);

                return githuber;


    }

    public void track(String login){

        //TODO
    }
}

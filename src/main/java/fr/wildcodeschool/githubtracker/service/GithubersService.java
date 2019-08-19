package fr.wildcodeschool.githubtracker.service;
import fr.wildcodeschool.githubtracker.dao.*;
import fr.wildcodeschool.githubtracker.model.Githuber;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import java.net.MalformedURLException;
import java.sql.SQLException;
import java.util.List;

@Dependent
public class GithubersService {
    @Inject GithubUtils githubUtils;
    @InMemory
    private GithuberDao dao;
    @Inject JDBCGithuberDAO jdbcGithuberDAO;



    public List<Githuber> getAllGithubers() throws SQLException {
            return jdbcGithuberDAO.getGithubers();
    }

        public Githuber getGithuber(String login) throws SQLException {
        Githuber githuber = getAllGithubers().stream()
                .filter(item -> item.getLogin().equals(login))
                .findFirst()
                .orElse(null);

                return githuber;


    }

    public Githuber track(String login) throws MalformedURLException, SQLException {
        Githuber newGithuber  = githubUtils.parseGithuber(login);
        jdbcGithuberDAO.saveGithuber(newGithuber);
        return newGithuber;
    }

    public void unTrack(String login) throws SQLException {
        Githuber githuber = getGithuber(login);
        jdbcGithuberDAO.rmGithuber(githuber);

        }
}

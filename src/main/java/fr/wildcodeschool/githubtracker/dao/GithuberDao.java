package fr.wildcodeschool.githubtracker.dao;

import fr.wildcodeschool.githubtracker.model.Githuber;

import java.sql.SQLException;
import java.util.List;

public interface GithuberDao {

    List<Githuber> getGithubers() throws SQLException;

    void saveGithuber(Githuber githuber) throws SQLException;

}

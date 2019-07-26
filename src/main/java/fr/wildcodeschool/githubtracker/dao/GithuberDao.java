package fr.wildcodeschool.githubtracker.dao;

import fr.wildcodeschool.githubtracker.model.Githuber;

import java.util.List;

public interface GithuberDao {

    List<Githuber> getGithubers();
}

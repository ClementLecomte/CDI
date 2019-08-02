package fr.wildcodeschool.githubtracker.dao;


import fr.wildcodeschool.githubtracker.model.Githuber;
import fr.wildcodeschool.githubtracker.service.GithubUtils;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import java.io.IOException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;


@InMemory @ApplicationScoped
public class MemoryGithuberDAO  implements GithuberDao {

    @Inject
    GithubUtils githubUtils;

    private Map<String, Githuber> listGithuber = new HashMap<>();

    @Override
    public List<Githuber> getGithubers() {
        return new ArrayList<>(listGithuber.values());
    }

    @Override
    public void saveGithuber(Githuber githuber) {
            listGithuber.put(githuber.getLogin(), githuber);
    }


    @PostConstruct
    private void getAll() {
        try {
            //saveGithuber(parseGithuber("ClementLecomte"));
            saveGithuber(githubUtils.parseGithuber("alexandrahilary"));
            saveGithuber(githubUtils.parseGithuber("athanyl"));
            saveGithuber(githubUtils.parseGithuber("Octopussyzz"));
            saveGithuber(githubUtils.parseGithuber("smelldat"));
        } catch (IOException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }
    }

}

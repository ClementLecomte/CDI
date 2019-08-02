package fr.wildcodeschool.githubtracker.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import fr.wildcodeschool.githubtracker.dao.ObjectMapperProducer;
import fr.wildcodeschool.githubtracker.model.Githuber;

import javax.enterprise.inject.Default;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;



public class GithubUtils {
    @Inject
    ObjectMapper om;

    public Githuber parseGithuber(String login) throws MalformedURLException {
        URL url = new URL("https://api.github.com/users/");
        Githuber githuber = null;
        try {
            githuber = om.readValue(new URL(url  + login), Githuber.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return githuber;
    }

}

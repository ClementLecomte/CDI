package fr.wildcodeschool.githubtracker.model;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.enterprise.inject.Model;


public class Githuber {
    @JsonProperty("name")
    private
    String name;
    @JsonProperty("login")
    private
    String login;
    @JsonProperty("email")
    String email;
    @JsonProperty ("avatar_url")
    private
    String avatarUrl;
    @JsonProperty("id")
    int id;


    public Githuber(String name, String login, String email, String avatarUrl) {
        this.name = name;
        this.login = login;
        this.email = email;
        this.avatarUrl = avatarUrl;
    }

    public Githuber( ) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

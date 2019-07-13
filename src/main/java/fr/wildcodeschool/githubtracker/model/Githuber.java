package fr.wildcodeschool.githubtracker.model;

public class Githuber {

    public String name;
    public  String login;
    public  String email;
    public  String avatarUrl;
    public  int id;

    public Githuber(String name, String login, String email, String avatarUrl) {
        this.name = name;
        this.login = login;
        this.email = email;
        this.avatarUrl = avatarUrl;
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

package fr.wildcodeschool.githubtracker.dao;

import fr.wildcodeschool.githubtracker.model.Githuber;

import javax.enterprise.context.Dependent;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JDBCGithuberDAO implements GithuberDao{


    private final String url = "jdbc:mysql://localhost:3306/githubtracker";
    private final String user = "wordpress";
    private final String password = "M@xone";


    private Connection connection;

    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public Connection getConnection() throws SQLException {
        if (connection == null || connection.isClosed()) {
            connection = DriverManager.getConnection(url, user, password);
        }
        return connection;
    }

   @Override
    public void saveGithuber(Githuber githuber) throws SQLException {
       Connection connection = getConnection();
       try (PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO `githuber`( `github_id`, `name`, `login`, `url`, `email`, `bio`, `location`, `avatar_url`)"
               + "VALUES (?,?,?,?,?,?,?,?)")) {
           preparedStatement.setInt(1, githuber.getId());
           preparedStatement.setString(2, githuber.getName());
           preparedStatement.setString(3, githuber.getLogin());
           preparedStatement.setString(4,githuber.getUrl());
           preparedStatement.setString(5, githuber.getEmail());
           preparedStatement.setString(6,githuber.getBio());
           preparedStatement.setString(7,githuber.getLocation());
           preparedStatement.setString(8, githuber.getAvatarUrl());

           preparedStatement.executeUpdate();
       }
    }

    @Override
    public List<Githuber> getGithubers() throws SQLException {
        List<Githuber> githubers = new ArrayList<>();
        Connection connection = getConnection();
        try (Statement statement = connection.createStatement()) {
            ResultSet resultat = statement.executeQuery(" SELECT * FROM `githuber`");
            while (resultat.next()) {
                int githuberId = resultat.getInt("github_id");
                String name = resultat.getString("name");
                String login = resultat.getString("login");
                String url = resultat.getString("url");
                String email = resultat.getString("email");
                String bio = resultat.getString("bio");
                String location = resultat.getString("location");
                String avatarUrl = resultat.getString("avatar_url");
                Githuber githuber = new Githuber( name, login, email,avatarUrl , githuberId,  url,  bio, location );
                githubers.add(githuber);
            }
            return githubers;
        }
    }

    public void rmGithuber(Githuber githuber) throws SQLException {
        Connection con = getConnection();
        try (PreparedStatement preparedStmt = con.prepareStatement("DELETE FROM `githuber` WHERE login=? ")) {
            preparedStmt.setString(1, githuber.getLogin());
            preparedStmt.executeUpdate();
        }
    }
}

package fr.wildcodeschool.githubtracker.controller;

import fr.wildcodeschool.githubtracker.dao.GithuberDao;
import fr.wildcodeschool.githubtracker.dao.InMemory;
import fr.wildcodeschool.githubtracker.dao.MemoryGithuberDAO;
import fr.wildcodeschool.githubtracker.model.Githuber;
import fr.wildcodeschool.githubtracker.service.GithubUtils;
import fr.wildcodeschool.githubtracker.service.GithubersService;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "TrackServlet")
public class TrackServlet extends HttpServlet {
    @Inject
    GithubUtils githubUtils;

    @Inject
    @InMemory
    GithuberDao dao;

    @Inject
    GithubersService githubersService;
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String login = request.getParameter("login");
         Githuber githuber = githubersService.track(login);
         dao.saveGithuber(githuber);

        response.sendRedirect("/GithubTracker/githubers");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        RequestDispatcher dispatcher = request.getRequestDispatcher("/logGithuber.jsp");
        dispatcher.forward(request,response);

    }
}

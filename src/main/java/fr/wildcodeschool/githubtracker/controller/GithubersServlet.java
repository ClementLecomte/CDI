package fr.wildcodeschool.githubtracker.controller;



import fr.wildcodeschool.githubtracker.dao.DumpGithuberDAO;
import fr.wildcodeschool.githubtracker.dao.GithuberDao;
import fr.wildcodeschool.githubtracker.model.Githuber;
import fr.wildcodeschool.githubtracker.service.GithubersService;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


@WebServlet(name = "GithubersServlet"  )
public class GithubersServlet extends HttpServlet {

    @Inject GithubersService gts;

    @Override
    public void init() throws ServletException {

    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Githuber> gt = gts.getAllGithubers();
        request.setAttribute("githubers", gt);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/githubers.jsp");
        dispatcher.forward(request,response);



    }
}

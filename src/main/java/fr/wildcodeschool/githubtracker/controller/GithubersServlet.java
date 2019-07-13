package fr.wildcodeschool.githubtracker.controller;

import fr.wildcodeschool.githubtracker.model.Githuber;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


@WebServlet(name = "GithubersServlet")
public class GithubersServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

       /* List<Githuber> githuberList = new ArrayList<Githuber>();

        Githuber githuber = new Githuber("Toto", "Truc"," Nanan", "JHIZh");
        githuberList.add(githuber);
        githuber = new Githuber("Tozedz", "Truc"," Nanan", "JHIZh");
        githuberList.add(githuber);
        githuber = new Githuber("Toazdadto", "Truc"," Nanan", "JHIZh");
        githuberList.add(githuber);
        githuber = new Githuber("Toazdadto", "Truc"," Nanan", "JHIZh");
        githuberList.add(githuber);
        githuber = new Githuber("Tadadadazoto", "Truc"," Nanan", "JHIZh");
        githuberList.add(githuber);

        request.setAttribute("list", githuberList);

*/


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        List<Githuber> githuberList = new ArrayList<Githuber>();

        Githuber githuber = new Githuber("Clément", "Naash "," Bla@bla.com", "hh/jk");
        githuberList.add(githuber);
        githuber = new Githuber("Toto", "TOTO"," Toto@tot.com", "JHIZh/dfdf");
        githuberList.add(githuber);
        githuber = new Githuber("Jean ", "Jean-mich"," Jm@bleble.com", "JHIZh/jhzufgeu");
        githuberList.add(githuber);
        githuber = new Githuber("Aline", "Aline93"," Aline93@ble@fr", "JHIZh/jfheuf");
        githuberList.add(githuber);
        githuber = new Githuber("Cécile", "Cilcen1"," Cilce@bla@fr", "JHIZh/defez");
        githuberList.add(githuber);


        request.setAttribute("list", githuberList);

        RequestDispatcher dispatcher = request.getRequestDispatcher("/githubers.jsp");
        dispatcher.forward(request,response);



    }
}

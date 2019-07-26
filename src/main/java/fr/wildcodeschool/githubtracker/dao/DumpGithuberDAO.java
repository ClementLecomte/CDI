package fr.wildcodeschool.githubtracker.dao;

import fr.wildcodeschool.githubtracker.model.Githuber;

import javax.enterprise.context.Dependent;
import java.util.ArrayList;
import java.util.List;

@Dependent
public class DumpGithuberDAO implements GithuberDao {

    public List<Githuber> getGithubers() {

        List<Githuber> githuberList = new ArrayList<Githuber>();

        githuberList.add(new Githuber("Toto", "Toto"," Toto@toto.com", "JHIZh/dfdf"));
        githuberList.add(new Githuber("Jean ", "Admin"," Jm@blabla.com", "JHIZh/jhzufgeu"));
        githuberList.add(new Githuber("Aline", "JDIS"," Aline93@ble@fr", "JHIZh/jfheuf"));
        githuberList.add(new Githuber("Cécile", "MDOMQ"," Cilce@bla@fr", "JHIZh/defez"));
        githuberList.add(new Githuber("Clément", "Naash "," Bla@bla.com", "hh/jk"));

        return githuberList;
    }




}

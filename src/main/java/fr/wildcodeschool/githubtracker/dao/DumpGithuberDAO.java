package fr.wildcodeschool.githubtracker.dao;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import fr.wildcodeschool.githubtracker.model.Githuber;

import javax.enterprise.context.Dependent;
import java.util.ArrayList;
import java.util.List;

@Dependent


public class DumpGithuberDAO implements GithuberDao {

    public List<Githuber> getGithubers() {

        List<Githuber> githuberList = new ArrayList<Githuber>();


        githuberList.add(new Githuber("Toto", "Toto"," Toto@toto.com", "JHIZh/dfdf", 545454, "jhuhuh", "k,jkj" , "ijhih"));

        return githuberList;
    }

    @Override

    public void saveGithuber(Githuber githuber) throws UnsupportedOperationException  {
        throw new UnsupportedOperationException();
    }
}

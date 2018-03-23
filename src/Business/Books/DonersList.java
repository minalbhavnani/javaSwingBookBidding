/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Books;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rishi
 */
public class DonersList {
    private List<Doners> listOfDoners;

    public DonersList() {
        listOfDoners = new ArrayList<>();
    }

    public List<Doners> getListOfDoners() {
        return listOfDoners;
    }
    
    public Doners addDoners(){
        Doners d= new Doners();
        listOfDoners.add(d);
        return d;
    }
    
    
}

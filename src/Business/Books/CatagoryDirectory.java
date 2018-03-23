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
public class CatagoryDirectory {
    private List<Catagory> listOfCatagory;

    public CatagoryDirectory() {
        listOfCatagory = new ArrayList<>();
    }

    public List<Catagory> getListOfCatagory() {
        return listOfCatagory;
    }
    
    public Catagory createAndAddCatagory(){
        Catagory c = new Catagory();
        listOfCatagory.add(c);
        return c;
    }
    
    
}

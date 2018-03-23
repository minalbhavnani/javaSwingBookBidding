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
public class AuthorDir {
    private List<Author> listOfAuthor;

    public AuthorDir() {
        listOfAuthor = new ArrayList<>();
    }

    public List<Author> getListOfAuthor() {
        return listOfAuthor;
    }
    
    public Author createAndAddAuthor(){
        Author a = new Author();
        listOfAuthor.add(a);
        return a;
    }
}

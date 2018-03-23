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
public class BookDirectory {
    private List<Book> listOfBooks;

    public BookDirectory() {
        listOfBooks = new ArrayList<>();
    }

    public List<Book> getListOfBooks() {
        return listOfBooks;
    }
    
    
    public Book createAndAddBooks(){
        Book b = new Book();
        listOfBooks.add(b);
        return b;
    }
    
    public List<Book> searchByName(String name){
        List<Book> result = new ArrayList<>();
        for(Book b:listOfBooks){
            if(b.getName().contains(name)){
                result.add(b);
            }
        }
        return result;
    }
    
    public List<Book> searchByAuthor(String name){
        List<Book> result = new ArrayList<>();
        for(Book b:listOfBooks){
            if(b.getAuthor().getName().contains(name)){
                result.add(b);
            }
        }
        return result;
    }
    
    
}

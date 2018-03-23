/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Books;

import Business.Employee.Employee;

/**
 *
 * @author rishi
 */
public class Book {
    private String name;    
    private Catagory catagory;    
    private Author author;
    private double rating = 0;
    private double count = 0;
    private String about;

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }   
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }    

    public Catagory getCatagory() {
        return catagory;
    }

    public void setCatagory(Catagory catagory) {
        this.catagory = catagory;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
    
    public void setRating(double r){
        count++;
        rating = (rating + r) / count;
    }

    public double getRating() {
        return rating;
    }   
    
    
    @Override
    public String toString(){
        return name;
    }
    
    
}

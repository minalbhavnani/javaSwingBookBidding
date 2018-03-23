/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Campaign;

import Business.Books.Author;
import Business.Books.Book;
import Business.Books.Catagory;
import Business.Employee.Employee;
import Business.Organization.Organization;

/**
 *
 * @author Minal
 */
public class Campaign {
    private String name;
    private String filepath;
    private Book book;
    private Author author;
    private Catagory catagory;
    private int clicks;
    private double outgoingRevenue;
    private Organization organization;
    
    

    public Campaign() {
        clicks = 0;
        outgoingRevenue= 0;
        
    }
    
    public double getOutgoingRevenue() {
        return outgoingRevenue;
    }

    public Organization getOrganization() {
        return organization;
    }

    public void setOrganization(Organization organization) {
        this.organization = organization;
    }    
    
    
    public void addOutgoingRevenue(double bidPrice){
        outgoingRevenue = outgoingRevenue + bidPrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }    

    public String getFilepath() {
        return filepath;
    }

    public void setFilepath(String filepath) {
        this.filepath = filepath;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Catagory getCatagory() {
        return catagory;
    }

    public void setCatagory(Catagory catagory) {
        this.catagory = catagory;
    }

    public int getClicks() {
        return clicks;
    }

    public void addClicks() {
        clicks ++;
    }
    
    @Override
    public String toString(){
        return book.getName();
    }
    
}

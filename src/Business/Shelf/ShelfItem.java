/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Shelf;

import Business.Books.Book;

/**
 *
 * @author Bengre
 */
public class ShelfItem {
    
    
    private Book title;    
    private double rating;
    private String review;
    private int yearCompleted;    
    private Status status;
    
    
    
    public enum Status{
        ToRead("ToRead"),
        Read("Read"),
        Reading("Reading");
        
        String value;
        private Status(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }
    
    public ShelfItem(){
        review = "";
        rating = 0.0;
        yearCompleted = 1000;        
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
    
    

    public Book getTitle() {
        return title;
    }

    public void setTitle(Book title) {
        this.title = title;
    }    

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public int getYearCompleted() {
        return yearCompleted;
    }

    public void setYearCompleted(int yearCompleted) {
        this.yearCompleted = yearCompleted;
    }   
    
    @Override
    public String toString(){
        return title.getName();
    }
    
    
}

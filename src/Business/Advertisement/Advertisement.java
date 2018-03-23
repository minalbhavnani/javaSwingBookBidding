/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Advertisement;

import Business.Books.Author;
import Business.Books.AuthorDir;
import Business.Books.Book;
import Business.Books.BookDirectory;
import Business.Books.Catagory;
import Business.Books.CatagoryDirectory;
import Business.Campaign.BookOfferCampaign;
import Business.Campaign.Campaign;
import Business.Campaign.NewBookCampaign;
import Business.Organization.AdminOrganization;
import Business.Organization.Organization;
import Business.UserAccount.Readers;

/**
 *
 * @author Bengre
 */
public class Advertisement {
    private double biddingPriceboc;
    private double biddingPricenbc;
    private BookOfferCampaign boc;
    private NewBookCampaign nbc;

    public Advertisement() {
       biddingPricenbc = biddingPriceboc = 0;
       defaut();
    }
    
    public void setBoc(BookOfferCampaign boc){
        this.boc = boc;        
    }
    
    public void increaseBOCBid(){
        biddingPriceboc += 0.25;
    }
    
    public void setnbc(NewBookCampaign nbc){
        this.nbc = nbc;        
    }
    
    public void increaseNBCBid(){
        biddingPricenbc += 0.25;
    }

    public double getBiddingPriceboc() {
        return biddingPriceboc;
    }

    public double getBiddingPricenbc() {
        return biddingPricenbc;
    }

    public BookOfferCampaign getBoc() {
        return boc;
    }

    public NewBookCampaign getNbc() {
        return nbc;
    }    

    private void defaut() {
        BookDirectory bd = new BookDirectory();
        CatagoryDirectory cd = new CatagoryDirectory();
        Catagory c = cd.createAndAddCatagory();
        AuthorDir ad = new AuthorDir();
        Author a = ad.createAndAddAuthor();
        c.setName("Name");
        Organization o = new AdminOrganization();
        o.setName("Dummy");
        Book b = bd.createAndAddBooks();
        b.setAbout("Dummy");
        b.setAuthor(a);
        b.setCatagory(c);
        b.setName("Dummy");        
        NewBookCampaign newBook = new NewBookCampaign();
        newBook.setAuthor(a);
        newBook.setBook(b);
        newBook.setCatagory(c);
        newBook.setName("Dummy");
        newBook.setPubName("Dummy");
        newBook.setReleasedate("Nill");
        BookOfferCampaign bookOff = new BookOfferCampaign();
        bookOff.setAuthor(a);
        bookOff.setBook(b);
        bookOff.setCatagory(c);
        bookOff.setDiscount(0);
        bookOff.setName("Dummy");
        bookOff.setPromoCode("Nill");
        bookOff.setSellerName("Dummy");
        boc = bookOff;
        nbc = newBook;       
        
    }
    
    
}

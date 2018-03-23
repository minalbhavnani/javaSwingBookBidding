/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.Advertisement.Advertisement;
import Business.Employee.Employee;
import Business.Role.Role;
import Business.Shelf.Shelf;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Bengre
 */
public class Readers extends UserAccount{
    private Shelf shelf;
    private List<Readers> followersList;
    private Advertisement ad;
    private int noOfFollowers;

    public Readers(String username, String password,Employee employee, Role role) {
        super(username,password,employee,role);
        followersList = new ArrayList<>();
        shelf = new Shelf();
        ad = new Advertisement();
        noOfFollowers = 0;
    }

    public void setAd(Advertisement ad) {
        this.ad = ad;
    }
    
    

    public int getNoOfFollowers() {
        return noOfFollowers;
    }
    
    public void addFollower(){
        noOfFollowers++;
    }
    
    
    public void removeFollower(){
        noOfFollowers--;
    }   

    public Shelf getShelf() {
        return shelf;
    }

    public Advertisement getAd() {
        return ad;
    }
    
       
    public List<Readers> getFollowersList() {
        return followersList;
    }

    public void addFollower(Readers r) {
        followersList.add(r);
    }
    
    public void removeFollowers(Readers r){
        followersList.remove(r);
    }
    
}

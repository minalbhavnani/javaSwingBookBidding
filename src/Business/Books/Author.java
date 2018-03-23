/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Books;

import Business.UserAccount.UserAccount;

/**
 *
 * @author rishi
 */
public class Author {
    private String name;
    private boolean isAuthorAccountCreated = false;
    private UserAccount ua;

    public UserAccount getUa() {
        return ua;
    }

    public void setUa(UserAccount ua) {
        this.ua = ua;
    }   
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isIsAuthorAccountCreated() {
        return isAuthorAccountCreated;
    }

    public void setIsAuthorAccountCreated(boolean isAuthorAccountCreated) {
        this.isAuthorAccountCreated = isAuthorAccountCreated;
    }
    
    
    
    @Override
    public String toString(){
        return name;
    }
}

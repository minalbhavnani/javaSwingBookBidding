/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Books.DonersList;
import Business.Role.LibraryManagerRole;
import Business.Role.Role;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Minal
 */
public class LibraryOrganization extends Organization {
    private DonersList dl;    
    public LibraryOrganization() {
        super(Organization.Type.Librarymanager.getValue());
        dl = new DonersList();
    }

    public DonersList getDl() {
        return dl;
    }    
    
    
    @Override
    public List<Role> getSupportedRole() {
        List<Role> roles = new ArrayList<>();
        roles.add(new LibraryManagerRole());
        return roles;
    }
}

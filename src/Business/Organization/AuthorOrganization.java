/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.AuthorRole;
import Business.Role.Role;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Minal
 */
public class AuthorOrganization extends Organization {
    public AuthorOrganization() {
        super(Organization.Type.Author.getValue());
    }
    
    @Override
    public List<Role> getSupportedRole() {
        List<Role> roles = new ArrayList<>();
        roles.add(new AuthorRole());
        return roles;
    }

}

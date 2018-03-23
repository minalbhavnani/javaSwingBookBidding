/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.ReaderRole;
import Business.Role.Role;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Minal
 */
public class ReaderOrganization extends Organization{
    public ReaderOrganization() {
        super(Type.Reader.getValue());
    }
    
    @Override
    public List<Role> getSupportedRole() {
        List<Role> roles = new ArrayList<>();
        roles.add(new ReaderRole());
        return roles;
    }
}

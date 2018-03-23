/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.AdminRole;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Minal
 */
public class AdminOrganization extends Organization {
     public AdminOrganization() {
        super(Type.Admin.getValue());
    }
    
    @Override
    public List<Role> getSupportedRole() {
       List<Role> roles = new ArrayList<>();
        roles.add(new AdminRole());
        return roles;
    }
}

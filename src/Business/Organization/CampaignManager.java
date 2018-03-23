/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Campaign.CampaignDirectory;
import Business.Role.Role;
import java.util.ArrayList;
import java.util.List;
import Business.Role.PublisherRole;
import Business.Role.SellerRole;


/**
 *
 * @author Minal
 */
public class CampaignManager extends Organization {
    private CampaignDirectory cd;
    
    public CampaignManager() {
        super(Organization.Type.CampaignManager.getValue());
        cd = new CampaignDirectory();
    }   
    
    
    @Override
    public List<Role> getSupportedRole() {
        List<Role> roles = new ArrayList<>();
        roles.add(new PublisherRole());
        roles.add(new SellerRole());
        return roles;
    }
    
    public CampaignDirectory getCd() {
        return cd;
    }
}

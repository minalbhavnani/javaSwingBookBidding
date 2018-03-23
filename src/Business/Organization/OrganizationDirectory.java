/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Minal
 */
public class OrganizationDirectory {
     private List<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList<>();
    }

    public List<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Organization.Type type){
        Organization organization = null;
        if (type.getValue().equals(Organization.Type.Reader.getValue())){
            organization = new ReaderOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.Admin.getValue())){
            organization = new AdminOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.Librarymanager.getValue())){
            organization = new LibraryOrganization();
            organizationList.add(organization);
        }        
        else if (type.getValue().equals(Organization.Type.CampaignManager.getValue())){
            organization = new CampaignManager();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.Author.getValue())){
            organization = new AuthorOrganization();
            organizationList.add(organization);
        }
        return organization;
    }
    
}

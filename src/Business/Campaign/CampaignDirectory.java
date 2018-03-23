/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Campaign;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rishi
 */
public class CampaignDirectory {
    private List<Campaign> listOfCampaign;
    

    public CampaignDirectory() {
        listOfCampaign = new ArrayList<>();        
    }

    public List<Campaign> getListOfCampaign() {
        return listOfCampaign;
    }
    
    public Campaign addNewBookCampaign(){
        Campaign c = new NewBookCampaign();
        listOfCampaign.add(c);
        return c;
    }
    
    public Campaign addBookOfferCampaign(){
        Campaign c = new BookOfferCampaign();
        listOfCampaign.add(c);
        return c;
    }
    
    public void deletecCampaign(Campaign c){
        listOfCampaign.remove(c);
    }
    
    
    
}

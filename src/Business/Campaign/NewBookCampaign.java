/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Campaign;

import java.util.Date;

/**
 *
 * @author Minal
 */
public class NewBookCampaign extends Campaign{
    private String releasedate;    
    private String pubName;

    public String getReleasedate() {
        return releasedate;
    }

    public void setReleasedate(String releasedate) {
        this.releasedate = releasedate;
    }    

    public String getPubName() {
        return pubName;
    }

    public void setPubName(String pubName) {
        this.pubName = pubName;
    }
    
    
    
}

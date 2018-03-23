/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Books.AuthorDir;
import Business.Books.BookDirectory;
import Business.Books.CatagoryDirectory;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import Business.Treasury.Treasury;
import java.util.ArrayList;

/**
 *
 * @author Bengre
 */
public class EcoSystem extends Organization{
    private static EcoSystem business;
    private ArrayList<Network> networkList;
    private CatagoryDirectory cd;
    private BookDirectory bd;
    private AuthorDir ad;
    private Treasury treasury;

    public static EcoSystem getInstance() {
        if (business == null) {
            business = new EcoSystem();
        }
        return business;
    }

    private EcoSystem() {
        super(null);
        networkList = new ArrayList<>();
        cd = new CatagoryDirectory();
        bd = new BookDirectory();
        ad = new AuthorDir();
        treasury = new Treasury();
    }

    public CatagoryDirectory getCd() {
        return cd;
    }   

    public BookDirectory getBd() {
        return bd;
    }

    public AuthorDir getAd() {
        return ad;
    }

    public Treasury getTreasury() {
        return treasury;
    }    
    
   
    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public Network createAndAddNetwork() {
        Network network = new Network();
        networkList.add(network);
        return network;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList = new ArrayList<>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }

    public boolean checkIfUsernameIsUnique(String username) {

        if (!this.getUserAccountDirectory().checkIfUsernameIsUnique(username)) {
            return false;
        }
        return true;
    }
    
    
}

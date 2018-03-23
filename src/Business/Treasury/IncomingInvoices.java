/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Treasury;

/**
 *
 * @author Minal
 */
public class IncomingInvoices {
    private double incomingRevenue;

    public IncomingInvoices() {
        incomingRevenue = 0;
    }
    
    public void addIncomingRevenue(double amount){
        incomingRevenue += amount;
    }
    
    public double getIncomingRevenue(){
        return incomingRevenue;
    }
    
    
}

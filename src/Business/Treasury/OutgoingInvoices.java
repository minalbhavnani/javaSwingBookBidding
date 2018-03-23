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
public class OutgoingInvoices {
    private double outgoingRevenue;

    public OutgoingInvoices() {
        outgoingRevenue = 0;
    }
    
    public void addOutgoingAmount(double amount){
        outgoingRevenue += amount;
    }
    
    public double getOutgoingAmount(){
        return outgoingRevenue;
    }
}

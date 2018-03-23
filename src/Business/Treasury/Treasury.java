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
public class Treasury {
    private double toalRevenue;
    private IncomingInvoices ii;
    private OutgoingInvoices oi;

    public Treasury() {
        ii = new IncomingInvoices();
        oi = new OutgoingInvoices();
    }
    
    private double getTotalrevenue(){
        toalRevenue = ii.getIncomingRevenue() - oi.getOutgoingAmount();
        return toalRevenue;
    }

    public IncomingInvoices getIi() {
        return ii;
    }

    public OutgoingInvoices getOi() {
        return oi;
    }   
    
}

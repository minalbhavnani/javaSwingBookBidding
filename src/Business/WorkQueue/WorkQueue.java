/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author rishi
 */
public class WorkQueue {
    
     private ArrayList<WorkRequest> workRequestList;

    public WorkQueue() {
        workRequestList = new ArrayList<>();
    }

    public ArrayList<WorkRequest> getWorkRequestList() {
        return workRequestList;
    }
    
    public WorkRequest createWorkRequest(){
        WorkRequest wr = new WorkRequest();
        workRequestList.add(wr);
        return wr;
    }
    
    public WorkRequest createMessage(){
        Message m = new Message();
        workRequestList.add(m);
        return m;
    }
    
    public WorkRequest createLibraryRequest(){
        LibraryRequest lr = new LibraryRequest();
        workRequestList.add(lr);
        return lr;
    }
    
    public WorkRequest createFollowRequest(){
        FollowRequest fr = new FollowRequest();
        workRequestList.add(fr);
        return fr;
    }
    
    public WorkRequest createAddBookRequest(){
        AddBook ab = new AddBook();
        workRequestList.add(ab);
        return ab;
    }
    
    public WorkRequest createBidOverRideNotification(){
        BidOverRideNotification bon = new BidOverRideNotification();
        workRequestList.add(bon);
        return bon;
    }
    
}

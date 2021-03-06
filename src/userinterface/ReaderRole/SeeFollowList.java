/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.ReaderRole;

import Business.EcoSystem;
import Business.Shelf.ShelfItem;
import Business.UserAccount.Readers;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Minal
 */
public class SeeFollowList extends javax.swing.JPanel {

    /**
     * Creates new form SeeFollowList
     */
    private JPanel userProcessContainer;
    private Readers account;
    private EcoSystem business;
    public SeeFollowList(JPanel userProcessContainer, Readers account, EcoSystem business) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.account=account;
        this.business=business;
        populateTable();
        jLabelNoOfFollowers.setText("You are following " + account.getFollowersList().size() + " people. " + account.getNoOfFollowers() + " are following you!!!");
    }
    
    public void populateTable(){
        DefaultTableModel model = (DefaultTableModel) tblFollowList.getModel();
        model.setRowCount(0);
        for(Readers r: account.getFollowersList()){
            Object[] row = new Object[3];
            row[0]= r;
            row[1] = r.getShelf().getShelfList().size();
            row[2]= r.getNoOfFollowers();
            model.addRow(row);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblFollowList = new javax.swing.JTable();
        btnSendMessage = new javax.swing.JButton();
        btnSeeShelf = new javax.swing.JButton();
        btnUnfollow = new javax.swing.JButton();
        jButtonSearchPeople = new javax.swing.JButton();
        jLabelNoOfFollowers = new javax.swing.JLabel();
        btnBack2 = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Your Follow List");

        tblFollowList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Books in Shelf", "Number Of Followers"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblFollowList);
        if (tblFollowList.getColumnModel().getColumnCount() > 0) {
            tblFollowList.getColumnModel().getColumn(0).setResizable(false);
            tblFollowList.getColumnModel().getColumn(1).setResizable(false);
        }

        btnSendMessage.setText("Send Message");
        btnSendMessage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendMessageActionPerformed(evt);
            }
        });

        btnSeeShelf.setText("See Shelf");
        btnSeeShelf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeeShelfActionPerformed(evt);
            }
        });

        btnUnfollow.setText("Unfollow");
        btnUnfollow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUnfollowActionPerformed(evt);
            }
        });

        jButtonSearchPeople.setText("Search People");
        jButtonSearchPeople.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSearchPeopleActionPerformed(evt);
            }
        });

        jLabelNoOfFollowers.setText("Number Of Followers");

        btnBack2.setText("<<Back");
        btnBack2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(345, 345, 345))
            .addGroup(layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSendMessage)
                        .addGap(106, 106, 106)
                        .addComponent(btnSeeShelf)
                        .addGap(95, 95, 95)
                        .addComponent(btnUnfollow)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 117, Short.MAX_VALUE)
                        .addComponent(jButtonSearchPeople))
                    .addComponent(jScrollPane1)
                    .addComponent(jLabelNoOfFollowers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btnBack2))
                .addGap(27, 27, 27)
                .addComponent(jLabelNoOfFollowers)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUnfollow)
                    .addComponent(btnSeeShelf)
                    .addComponent(btnSendMessage)
                    .addComponent(jButtonSearchPeople))
                .addContainerGap(235, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnUnfollowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUnfollowActionPerformed
        // TODO add your handling code here:
        int selectedRowValue = tblFollowList.getSelectedRow();
        if(selectedRowValue >= 0){
            Readers r = (Readers)tblFollowList.getValueAt(selectedRowValue, 0);
            account.removeFollowers(r);
            r.removeFollower();
            populateTable();
            JOptionPane.showMessageDialog(null,"User unfollowed");
        }else{
            JOptionPane.showMessageDialog(null,"Please select a User to unfollow");
        }
    }//GEN-LAST:event_btnUnfollowActionPerformed

    private void btnSendMessageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendMessageActionPerformed
        // TODO add your handling code here:
        int selectedRowValue = tblFollowList.getSelectedRow();
        if(selectedRowValue >= 0){
            UserAccount r = (UserAccount)tblFollowList.getValueAt(selectedRowValue, 0);
            SendMessageJPanel sendMessageJPanel = new SendMessageJPanel(userProcessContainer, account,r);
            userProcessContainer.add("SendMessageJPanel", sendMessageJPanel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }else{
            JOptionPane.showMessageDialog(null,"Select a person to send message");
        }
         
    }//GEN-LAST:event_btnSendMessageActionPerformed

    private void btnSeeShelfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeeShelfActionPerformed
        // TODO add your handling code here:
            int selectedRowValue = tblFollowList.getSelectedRow();
        if(selectedRowValue >= 0){
            Readers r = (Readers)tblFollowList.getValueAt(selectedRowValue, 0);
            FollwerShelfJPanel follwerShelfJPanel = new FollwerShelfJPanel(userProcessContainer, r);
            userProcessContainer.add("FollwerShelfJPanel", follwerShelfJPanel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }else{
            JOptionPane.showMessageDialog(null,"Select a person to send message");
        }
    }//GEN-LAST:event_btnSeeShelfActionPerformed

    private void jButtonSearchPeopleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSearchPeopleActionPerformed
        // TODO add your handling code here:
            SearchPeopleJPanel searchPeopleJPanel = new SearchPeopleJPanel(userProcessContainer, account,business);
            userProcessContainer.add("SearchPeopleJPanel", searchPeopleJPanel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
    }//GEN-LAST:event_jButtonSearchPeopleActionPerformed

    private void btnBack2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack2ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBack2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack2;
    private javax.swing.JButton btnSeeShelf;
    private javax.swing.JButton btnSendMessage;
    private javax.swing.JButton btnUnfollow;
    private javax.swing.JButton jButtonSearchPeople;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelNoOfFollowers;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblFollowList;
    // End of variables declaration//GEN-END:variables
}

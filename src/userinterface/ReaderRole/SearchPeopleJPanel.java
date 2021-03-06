/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.ReaderRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.Readers;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.FollowRequest;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Bengre
 */
public class SearchPeopleJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SearchPeopleJPanel
     */
    
    private JPanel userProcessContainer;
    private Readers account;
    private EcoSystem business;    
    SearchPeopleJPanel(JPanel userProcessContainer, Readers account, EcoSystem business) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.account=account;
        this.business=business;        
    }
    
    public void populateTables(List<Readers> result){
        DefaultTableModel model = (DefaultTableModel) jTableResult.getModel();
        model.setRowCount(0); 
        for(Readers r: result){
            Object[] row = new Object[4];
            row[0] = r;            
            row[2] = r.getShelf().getShelfList().size();
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
        jLabel2 = new javax.swing.JLabel();
        jTextFieldFirstName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldLastName = new javax.swing.JTextField();
        jButtonSearchByName = new javax.swing.JButton();
        jButtonSearchByName1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableResult = new javax.swing.JTable();
        jButtonSendRequest = new javax.swing.JButton();
        btnBack2 = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Search People");

        jLabel2.setText("First Name:");

        jLabel3.setText("Last Name:");

        jButtonSearchByName.setText("Search");
        jButtonSearchByName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSearchByNameActionPerformed(evt);
            }
        });

        jButtonSearchByName1.setText("Search");
        jButtonSearchByName1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSearchByName1ActionPerformed(evt);
            }
        });

        jTableResult.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Number Of books in shelf"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableResult);
        if (jTableResult.getColumnModel().getColumnCount() > 0) {
            jTableResult.getColumnModel().getColumn(0).setResizable(false);
            jTableResult.getColumnModel().getColumn(1).setResizable(false);
        }

        jButtonSendRequest.setText("Send Request");
        jButtonSendRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSendRequestActionPerformed(evt);
            }
        });

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
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonSendRequest)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(btnBack2)
                            .addGap(236, 236, 236)
                            .addComponent(jLabel1))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(183, 183, 183)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(40, 40, 40)
                                    .addComponent(jTextFieldLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(46, 46, 46)
                                    .addComponent(jButtonSearchByName1))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGap(26, 26, 26)
                                    .addComponent(jTextFieldFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(46, 46, 46)
                                    .addComponent(jButtonSearchByName))))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(53, 53, 53)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 792, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btnBack2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSearchByName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSearchByName1))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jButtonSendRequest)
                .addContainerGap(197, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSearchByNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSearchByNameActionPerformed
        // TODO add your handling code here:
        String name = jTextFieldFirstName.getText();
        if(name != null){
            List<Readers> result = new ArrayList();
            for(Network n: business.getNetworkList()){
                for(Enterprise e: n.getEnterpriseDirectory().getEnterpriseList()){
                    for(Organization o: e.getOrganizationDirectory().getOrganizationList()){
                        if("Reader".equals(o.getName())){
                            for(UserAccount ua: o.getUserAccountDirectory().getUserAccountList()){
                                if(ua.getEmployee().getFirstName().contains(name)){
                                    if(ua != account)
                                    result.add((Readers) ua);                                    
                                }
                            }
                        }
                    }
                }
            }
            populateTables(result);
        }else{
            JOptionPane.showMessageDialog(null,"Enter a Name to search");
        }
    }//GEN-LAST:event_jButtonSearchByNameActionPerformed

    private void jButtonSearchByName1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSearchByName1ActionPerformed
        // TODO add your handling code here:
       String name = jTextFieldLastName.getText();
       if(name != null){
            List<Readers> result = new ArrayList();
            for(Network n: business.getNetworkList()){
                for(Enterprise e: n.getEnterpriseDirectory().getEnterpriseList()){
                    for(Organization o: e.getOrganizationDirectory().getOrganizationList()){
                        if("Reader".equals(o.getName())){
                            for(UserAccount ua: o.getUserAccountDirectory().getUserAccountList()){
                                if(ua.getEmployee().getLastName().contains(name)){
                                    if(ua != account)
                                    result.add((Readers) ua);                                    
                                }
                            }
                        }
                    }
                }
            }
            populateTables(result);
        }else{
            JOptionPane.showMessageDialog(null,"Enter a Name to search");
        }
    }//GEN-LAST:event_jButtonSearchByName1ActionPerformed

    private void jButtonSendRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSendRequestActionPerformed
        // TODO add your handling code here:
        int selectedRowValue = jTableResult.getSelectedRow();
        if(selectedRowValue >= 0){
            Readers r = (Readers)jTableResult.getValueAt(selectedRowValue, 0);            
            FollowRequest fr = (FollowRequest) r.getWorkQueue().createFollowRequest();
            fr.setSender(account);
            fr.setReceiver(r);
            fr.setStatus("New");
            fr.setResponse("Pending");
            JOptionPane.showMessageDialog(null,"Follow Request sent");
        }else{
            JOptionPane.showMessageDialog(null,"Enter a person to send request");
        }
    }//GEN-LAST:event_jButtonSendRequestActionPerformed

    private void btnBack2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack2ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBack2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack2;
    private javax.swing.JButton jButtonSearchByName;
    private javax.swing.JButton jButtonSearchByName1;
    private javax.swing.JButton jButtonSendRequest;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableResult;
    private javax.swing.JTextField jTextFieldFirstName;
    private javax.swing.JTextField jTextFieldLastName;
    // End of variables declaration//GEN-END:variables
}

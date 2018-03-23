/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.AuthorRole;

import Business.EcoSystem;
import Business.UserAccount.Readers;
import Business.WorkQueue.Message;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Bengre
 */
public class AuthorAllMessageJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AuthorAllMessageJPanel
     */
    private JPanel userProcessContainer;
    private Readers account;
    AuthorAllMessageJPanel(JPanel userProcessContainer, Readers account) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.account=account;
        populateTables();
    }    
    
    public void populateTables(){
        DefaultTableModel modelmes = (DefaultTableModel) tblMessages.getModel();        
        modelmes.setRowCount(0);
        for (WorkRequest wr: account.getWorkQueue().getWorkRequestList()) {
            if(wr instanceof Message) {
                if(wr.getStatus() == "New"){
                    Object[] row = new Object[3];
                    row[0] = wr;
                    row[1] = wr.getStatus();
                    row[2] = ((Message) wr).getMessageBody();
                    modelmes.addRow(row);                     
                }
            }
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

        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblMessages = new javax.swing.JTable();
        jButtonReadRespond = new javax.swing.JButton();
        jButtonMarkRead = new javax.swing.JButton();

        jButton1.setText("<< Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("Messages");

        tblMessages.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "From", "Status", "Message"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblMessages);

        jButtonReadRespond.setText("Read and Respond");
        jButtonReadRespond.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReadRespondActionPerformed(evt);
            }
        });

        jButtonMarkRead.setText("Mark as Read");
        jButtonMarkRead.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMarkReadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(394, 394, 394))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 173, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonMarkRead, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonReadRespond))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(185, 185, 185))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jButton1))
                .addGap(25, 25, 25)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonReadRespond)
                    .addComponent(jButtonMarkRead))
                .addContainerGap(122, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonReadRespondActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonReadRespondActionPerformed
        // TODO add your handling code here:
        int selectedRowValue = tblMessages.getSelectedRow();
        if(selectedRowValue >= 0){
            Message request = (Message)tblMessages.getValueAt(selectedRowValue, 0);
            AuthorRespondJPanel authorRespondJPanel = new AuthorRespondJPanel(userProcessContainer, account,request);
            userProcessContainer.add("AuthorRespondJPanel", authorRespondJPanel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }else{
            JOptionPane.showMessageDialog(null,"Please select a Message");
        }
    }//GEN-LAST:event_jButtonReadRespondActionPerformed

    private void jButtonMarkReadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMarkReadActionPerformed
        // TODO add your handling code here:
        int selectedRowValue = tblMessages.getSelectedRow();
        if(selectedRowValue >= 0){
            Message request = (Message)tblMessages.getValueAt(selectedRowValue, 0);
            request.setStatus("Read");
            populateTables();
        }else{
            JOptionPane.showMessageDialog(null,"Please select a Message");
        }
    }//GEN-LAST:event_jButtonMarkReadActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonMarkRead;
    private javax.swing.JButton jButtonReadRespond;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblMessages;
    // End of variables declaration//GEN-END:variables
}

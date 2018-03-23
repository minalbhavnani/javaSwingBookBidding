/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.LibraryManagerRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Minal
 */
public class LibraryManagerWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form LibraryManagerJPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem business;
    private Enterprise enterprise;
    private UserAccount account;
    private Organization organization;
    public LibraryManagerWorkAreaJPanel(JPanel userProcessContainer, EcoSystem business, Enterprise enterprise, UserAccount account, Organization organization) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.business=business;
        this.enterprise=enterprise;
        this.organization=organization;
        this.account=account;
        jLabelName.setText(account.getEmployee().getFirstName() + " " + account.getEmployee().getLastName());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnRequestBook = new javax.swing.JButton();
        btnNotifications = new javax.swing.JButton();
        btnSeeDonors = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabelName = new javax.swing.JLabel();

        btnRequestBook.setText("Request Book");
        btnRequestBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequestBookActionPerformed(evt);
            }
        });

        btnNotifications.setText("Notifications");
        btnNotifications.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNotificationsActionPerformed(evt);
            }
        });

        btnSeeDonors.setText("See Donors");
        btnSeeDonors.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeeDonorsActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Library Manager Work Area");

        jLabelName.setText("Name");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(286, 286, 286)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRequestBook, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNotifications, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSeeDonors, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(319, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelName, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(14, 14, 14)
                .addComponent(jLabelName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(btnRequestBook)
                .addGap(86, 86, 86)
                .addComponent(btnNotifications)
                .addGap(97, 97, 97)
                .addComponent(btnSeeDonors)
                .addGap(215, 215, 215))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRequestBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequestBookActionPerformed
        // TODO add your handling code here:
        RequestBook panel = new RequestBook(userProcessContainer,business,account,enterprise);
        userProcessContainer.add("Request Book", panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnRequestBookActionPerformed

    private void btnNotificationsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNotificationsActionPerformed
        // TODO add your handling code here:
        Notifications panel = new Notifications(userProcessContainer,business,organization);
        userProcessContainer.add("Notifications", panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnNotificationsActionPerformed

    private void btnSeeDonorsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeeDonorsActionPerformed
        // TODO add your handling code here:
        SeeDonors panel = new SeeDonors(userProcessContainer,organization);
        userProcessContainer.add("See Donors", panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnSeeDonorsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNotifications;
    private javax.swing.JButton btnRequestBook;
    private javax.swing.JButton btnSeeDonors;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelName;
    // End of variables declaration//GEN-END:variables
}
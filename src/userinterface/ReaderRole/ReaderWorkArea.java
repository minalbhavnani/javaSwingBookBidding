/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.ReaderRole;

import Business.Advertisement.Advertisement;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.Readers;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import userinterface.ReaderRole.SeeNotification;
import userinterface.ReaderRole.SeeShelf;
import userinterface.ReaderRole.EditPersonelInfoJPanel;
import userinterface.ReaderRole.SeeFollowList;
import userinterface.ReaderRole.AdvertisementNBCJPanel;
import userinterface.ReaderRole.AdvertisementBOCJPanel;

/**
 *
 * @author rishi
 */
public class ReaderWorkArea extends javax.swing.JPanel {

    /**
     * Creates new form ReaderWorkArea
     */
    private JPanel userProcessContainer;
    private EcoSystem business;
    private Enterprise enterprise;
    private Organization organization;
    private Readers account;
    
    public ReaderWorkArea(JPanel userProcessContainer, EcoSystem business, Enterprise enterprise, Organization organization, UserAccount account) {
        initComponents();
        this.account=(Readers) account;
        this.userProcessContainer = userProcessContainer;
        this.business=business;
        this.enterprise=enterprise;
        this.organization=organization;        
        jLabelUserName.setText(account.getEmployee().getFirstName() + " " + account.getEmployee().getLastName());
        populateAdvert();        
    }
    
    public void populateAdvert(){
        Advertisement ad = account.getAd();
        if(ad.getBiddingPricenbc() <= 0 && ad.getBiddingPriceboc()<= 0){
            btnSeeMoreBOC.setEnabled(false);
            btnSeeMoreNBC.setEnabled(false);
            ImageIcon imgIcon = new ImageIcon("HappyReading.png");
            Image imgResized = imgIcon.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
            ImageIcon imgIconResized = new ImageIcon(imgResized);
            jLabelNBC.setIcon(imgIconResized);
            jLabelBOC.setIcon(imgIconResized);
        }else if(ad.getBiddingPricenbc() > 0 && ad.getBiddingPriceboc()<= 0 ){
            btnSeeMoreBOC.setEnabled(false);
            btnSeeMoreNBC.setEnabled(true);
            ad.getNbc().addOutgoingRevenue(ad.getBiddingPricenbc());
            business.getTreasury().getIi().addIncomingRevenue(ad.getBiddingPricenbc());
            ImageIcon imgIcon = new ImageIcon("HappyReading.png");
            Image imgResized = imgIcon.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
            ImageIcon imgIconResized = new ImageIcon(imgResized);
            jLabelBOC.setIcon(imgIconResized);
            ImageIcon imgIconNBC = new ImageIcon(ad.getNbc().getFilepath());
            Image imgResizedNBC = imgIconNBC.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
            ImageIcon imgIconResizedNBC = new ImageIcon(imgResizedNBC);
            jLabelNBC.setIcon(imgIconResizedNBC);
        }else if(ad.getBiddingPricenbc() <= 0 && ad.getBiddingPriceboc() > 0 ){
            btnSeeMoreBOC.setEnabled(true);
            btnSeeMoreNBC.setEnabled(false);
            ad.getBoc().addOutgoingRevenue(ad.getBiddingPriceboc());
            business.getTreasury().getIi().addIncomingRevenue(ad.getBiddingPriceboc());
            ImageIcon imgIcon = new ImageIcon("HappyReading.png");
            Image imgResized = imgIcon.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
            ImageIcon imgIconResized = new ImageIcon(imgResized);
            jLabelNBC.setIcon(imgIconResized);
            ImageIcon imgIconBOC = new ImageIcon(ad.getBoc().getFilepath());
            Image imgResizedBOC = imgIconBOC.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
            ImageIcon imgIconResizedBOC = new ImageIcon(imgResizedBOC);
            jLabelBOC.setIcon(imgIconResizedBOC);
        }
        else{
            btnSeeMoreBOC.setEnabled(true);
            btnSeeMoreNBC.setEnabled(true);
            ad.getNbc().addOutgoingRevenue(ad.getBiddingPricenbc());
            ad.getBoc().addOutgoingRevenue(ad.getBiddingPriceboc());
            business.getTreasury().getIi().addIncomingRevenue(ad.getBiddingPricenbc() + ad.getBiddingPriceboc());
            ImageIcon imgIconNBC = new ImageIcon(ad.getNbc().getFilepath());
            Image imgResizedNBC = imgIconNBC.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
            ImageIcon imgIconResizedNBC = new ImageIcon(imgResizedNBC);
            jLabelNBC.setIcon(imgIconResizedNBC);
            ImageIcon imgIconBOC = new ImageIcon(ad.getBoc().getFilepath());
            Image imgResizedBOC = imgIconBOC.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
            ImageIcon imgIconResizedBOC = new ImageIcon(imgResizedBOC);
            jLabelBOC.setIcon(imgIconResizedBOC);
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

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        btnSeeNotif = new javax.swing.JButton();
        btnSeeShelf = new javax.swing.JButton();
        btnEditInfo = new javax.swing.JButton();
        btnSeeFollowerList = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabelUserName = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabelBOC = new javax.swing.JLabel();
        btnSeeMoreNBC = new javax.swing.JButton();
        jLabelNBC = new javax.swing.JLabel();
        btnSeeMoreBOC = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setLayout(new java.awt.BorderLayout());

        jSplitPane1.setDividerLocation(250);

        btnSeeNotif.setText("See Notifications");
        btnSeeNotif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeeNotifActionPerformed(evt);
            }
        });

        btnSeeShelf.setText("See Shelf");
        btnSeeShelf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeeShelfActionPerformed(evt);
            }
        });

        btnEditInfo.setText("Edit Personal Information");
        btnEditInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditInfoActionPerformed(evt);
            }
        });

        btnSeeFollowerList.setText("See Follower List");
        btnSeeFollowerList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeeFollowerListActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("My Activity");

        jLabelUserName.setText("Name");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnEditInfo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSeeNotif, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSeeShelf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSeeFollowerList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelUserName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jLabelUserName)
                .addGap(17, 17, 17)
                .addComponent(btnSeeNotif)
                .addGap(49, 49, 49)
                .addComponent(btnSeeShelf)
                .addGap(50, 50, 50)
                .addComponent(btnSeeFollowerList)
                .addGap(57, 57, 57)
                .addComponent(btnEditInfo)
                .addContainerGap(222, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(jPanel1);

        btnSeeMoreNBC.setText("See More");
        btnSeeMoreNBC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeeMoreNBCActionPerformed(evt);
            }
        });

        btnSeeMoreBOC.setText("See More");
        btnSeeMoreBOC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeeMoreBOCActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Advertisements");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelNBC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelBOC, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE))
                        .addGap(52, 52, 52)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSeeMoreBOC)
                            .addComponent(btnSeeMoreNBC)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(198, 198, 198)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(187, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel2)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(btnSeeMoreNBC))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jLabelNBC, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSeeMoreBOC)
                        .addGap(171, 171, 171))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabelBOC, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(78, Short.MAX_VALUE))))
        );

        jSplitPane1.setRightComponent(jPanel2);

        add(jSplitPane1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSeeNotifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeeNotifActionPerformed
        // TODO add your handling code here:
        SeeNotification seeNotification = new SeeNotification(userProcessContainer, account,business);
        userProcessContainer.add("SeeNotification", seeNotification);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnSeeNotifActionPerformed

    private void btnSeeShelfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeeShelfActionPerformed
        // TODO add your handling code here:
        SeeShelf seeShelf = new SeeShelf(userProcessContainer, account, business);
        userProcessContainer.add("SeeShelf", seeShelf);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnSeeShelfActionPerformed

    private void btnEditInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditInfoActionPerformed
        // TODO add your handling code here:
        EditPersonelInfoJPanel editPersonelInfoJPanel = new EditPersonelInfoJPanel(userProcessContainer, account);
        userProcessContainer.add("EditPersonelInfoJPanel", editPersonelInfoJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnEditInfoActionPerformed

    private void btnSeeFollowerListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeeFollowerListActionPerformed
        // TODO add your handling code here:
        SeeFollowList  seeFollowList = new SeeFollowList(userProcessContainer, account,business);
        userProcessContainer.add("SeeFollowList", seeFollowList);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnSeeFollowerListActionPerformed

    private void btnSeeMoreNBCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeeMoreNBCActionPerformed
        // TODO add your handling code here:
        account.getAd().getNbc().addClicks();
        AdvertisementNBCJPanel  advertisementNBCJPanel = new AdvertisementNBCJPanel(userProcessContainer,account.getAd().getNbc());
        userProcessContainer.add("AdvertisementNBCJPanel", advertisementNBCJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnSeeMoreNBCActionPerformed

    private void btnSeeMoreBOCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeeMoreBOCActionPerformed
        // TODO add your handling code here:
        account.getAd().getBoc().addClicks();
        AdvertisementBOCJPanel  advertisementBOCJPanel = new AdvertisementBOCJPanel(userProcessContainer,account.getAd().getBoc());
        userProcessContainer.add("AdvertisementBOCJPanel", advertisementBOCJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnSeeMoreBOCActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditInfo;
    private javax.swing.JButton btnSeeFollowerList;
    private javax.swing.JButton btnSeeMoreBOC;
    private javax.swing.JButton btnSeeMoreNBC;
    private javax.swing.JButton btnSeeNotif;
    private javax.swing.JButton btnSeeShelf;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelBOC;
    private javax.swing.JLabel jLabelNBC;
    private javax.swing.JLabel jLabelUserName;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSplitPane jSplitPane1;
    // End of variables declaration//GEN-END:variables

    
}

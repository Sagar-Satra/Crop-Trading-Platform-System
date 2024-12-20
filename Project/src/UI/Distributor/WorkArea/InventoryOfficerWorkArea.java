/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.Distributor.WorkArea;

import Business.EcoSystem;
import Distributor.InventoryOfficer;
import UI.MainJFrame.LoginJPanel;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Aditya
 * @author Prarthana
 * 
 */
public class InventoryOfficerWorkArea extends javax.swing.JPanel {

    /**
     * Creates new form SysAdminWorkArea
     */
    JPanel mainWorkArea;
    InventoryOfficer inventoryOfficer;
    EcoSystem ecoSystem;

    InventoryOfficerWorkArea(JPanel mainWorkArea, InventoryOfficer inventoryOfficer, EcoSystem ecoSystem) {
        initComponents();
        this.mainWorkArea = mainWorkArea;
        this.inventoryOfficer = inventoryOfficer;
        this.ecoSystem = ecoSystem;
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
        fmcgAdminControlPanel = new javax.swing.JPanel();
        btnLogOut = new javax.swing.JButton();
        btnManageCrops = new javax.swing.JButton();
        btnStatistics = new javax.swing.JButton();
        lblWelcomeSysAdmin = new javax.swing.JLabel();
        processControlStack = new javax.swing.JPanel();

        setBackground(new java.awt.Color(224, 245, 166));
        setPreferredSize(new java.awt.Dimension(960, 640));

        jSplitPane1.setDividerLocation(80);
        jSplitPane1.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        fmcgAdminControlPanel.setBackground(new java.awt.Color(224, 245, 166));

        btnLogOut.setText("Log Out");
        btnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutActionPerformed(evt);
            }
        });

        btnManageCrops.setText("add Storage");
        btnManageCrops.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageCropsActionPerformed(evt);
            }
        });

        btnStatistics.setText("Manage Inventory");
        btnStatistics.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStatisticsActionPerformed(evt);
            }
        });

        lblWelcomeSysAdmin.setText("Welcome Admin !");

        javax.swing.GroupLayout fmcgAdminControlPanelLayout = new javax.swing.GroupLayout(fmcgAdminControlPanel);
        fmcgAdminControlPanel.setLayout(fmcgAdminControlPanelLayout);
        fmcgAdminControlPanelLayout.setHorizontalGroup(
            fmcgAdminControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fmcgAdminControlPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblWelcomeSysAdmin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 516, Short.MAX_VALUE)
                .addComponent(btnManageCrops)
                .addGap(18, 18, 18)
                .addComponent(btnStatistics)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLogOut)
                .addContainerGap())
        );
        fmcgAdminControlPanelLayout.setVerticalGroup(
            fmcgAdminControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fmcgAdminControlPanelLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(fmcgAdminControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLogOut)
                    .addComponent(btnManageCrops)
                    .addComponent(btnStatistics)
                    .addComponent(lblWelcomeSysAdmin))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jSplitPane1.setTopComponent(fmcgAdminControlPanel);

        processControlStack.setBackground(new java.awt.Color(224, 245, 166));
        processControlStack.setLayout(new java.awt.CardLayout());
        jSplitPane1.setRightComponent(processControlStack);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed
        // TODO add your handling code here:
//        mainWorkArea.removeAll();
//        LoginJPanel ls = new LoginJPanel(mainWorkArea);
//        mainWorkArea.add("LoginScreen",ls);
//        CardLayout layout = (CardLayout) mainWorkArea.getLayout();
//        layout.next(mainWorkArea);
        
            int dialogButton =JOptionPane.YES_NO_OPTION;
            int dialogResult =JOptionPane.showConfirmDialog(null, "Would you like to Logout?","Warning", dialogButton);
            if(dialogResult==JOptionPane.YES_OPTION){
            mainWorkArea.remove(this);
            Component [] componentArray = mainWorkArea.getComponents();
            //System.out.println(componentArray[1]);
            Component component = componentArray[0];
            //System.out.println(component);
            LoginJPanel loginPanel = (LoginJPanel) component;
            CardLayout layout = (CardLayout) mainWorkArea.getLayout();
            layout.previous(mainWorkArea);
            for (int i = componentArray.length - 1; i > 0; i--) {     mainWorkArea.remove(i); }
                //System.out.println(mainWorkArea.getComponentCount());
            }        
    }//GEN-LAST:event_btnLogOutActionPerformed

    private void btnManageCropsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageCropsActionPerformed
        // TODO add your handling code here:
        InventoryJPanel addInventoryJPanel = new InventoryJPanel(processControlStack, inventoryOfficer, ecoSystem.getMarketDirectory(), ecoSystem.getCropDirectory() );
        processControlStack.add("InventoryJPanel",addInventoryJPanel);
        CardLayout layout = (CardLayout) processControlStack.getLayout();
        layout.next(processControlStack);
    }//GEN-LAST:event_btnManageCropsActionPerformed

    private void btnStatisticsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStatisticsActionPerformed
        // TODO add your handling code here:
        InventoryMngJPanel addInventoryJPanel = new InventoryMngJPanel(processControlStack, inventoryOfficer, ecoSystem.getTransactionDirectory(), ecoSystem.getFmcgTransactionDirectory(),ecoSystem.getMarketDirectory() );
        processControlStack.add("InventoryJPanel",addInventoryJPanel);
        CardLayout layout = (CardLayout) processControlStack.getLayout();
        layout.next(processControlStack);
    }//GEN-LAST:event_btnStatisticsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogOut;
    private javax.swing.JButton btnManageCrops;
    private javax.swing.JButton btnStatistics;
    private javax.swing.JPanel fmcgAdminControlPanel;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JLabel lblWelcomeSysAdmin;
    private javax.swing.JPanel processControlStack;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.Distributor.WorkArea;



import Distributor.FmcgTransaction;
import Distributor.FmcgTransactionDirectory;
import Distributor.InventoryOfficer;
import Distributor.Storage;
import Distributor.TransportOfficer;
import Farmer.Transaction;
import Farmer.TransactionDirectory;
import UI.FMCG.WorkArea.Admin.*;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import Market.MarketDirectory;
/**
 *
 * @author Aditya
 */
public class InventoryMngJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageSuppliersJPanel
     */
    JPanel processControlStack;
    InventoryOfficer inventoryOfficer;
    TransactionDirectory transactionDirectory;
    FmcgTransactionDirectory fmcgTransactionDirectory;
    MarketDirectory marketDirectory;

    public InventoryMngJPanel(JPanel processControlStack, InventoryOfficer inventoryOfficer, TransactionDirectory transactionDirectory, FmcgTransactionDirectory fmcgTransactionDirectory, Market.MarketDirectory marketDirectory) {
        initComponents();
        this.processControlStack = processControlStack;
        this.inventoryOfficer= inventoryOfficer;
        this.transactionDirectory = transactionDirectory;
        this.fmcgTransactionDirectory = fmcgTransactionDirectory;
        this.marketDirectory=marketDirectory;
        populateMarkets();
        populateaboveTable();
        populateBelowTable();
        
    }

        
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblListofUsers = new javax.swing.JLabel();
        lblManageUser = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblFMCG = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblFarmer = new javax.swing.JTable();
        btnView1 = new javax.swing.JButton();
        btnView2 = new javax.swing.JButton();
        lblListofUsers1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(224, 245, 166));
        setLayout(null);

        lblListofUsers.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblListofUsers.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblListofUsers.setText("To FMCG's");
        add(lblListofUsers);
        lblListofUsers.setBounds(20, 310, 840, 17);

        lblManageUser.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lblManageUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblManageUser.setText("Inventory Department");
        add(lblManageUser);
        lblManageUser.setBounds(30, 10, 840, 28);

        tblFMCG.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Crop name", "FMCG", "Quality", "Quantity"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblFMCG);

        add(jScrollPane2);
        jScrollPane2.setBounds(60, 330, 840, 170);

        tblFarmer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Crop name", "Farmer Name", "Quality", "Quantity"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tblFarmer);

        add(jScrollPane3);
        jScrollPane3.setBounds(60, 80, 840, 180);

        btnView1.setText("remove from Inventory");
        btnView1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnView1ActionPerformed(evt);
            }
        });
        add(btnView1);
        btnView1.setBounds(740, 510, 160, 22);

        btnView2.setText("add to Inventory");
        btnView2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnView2ActionPerformed(evt);
            }
        });
        add(btnView2);
        btnView2.setBounds(770, 280, 130, 23);

        lblListofUsers1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblListofUsers1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblListofUsers1.setText("From Farmers");
        add(lblListofUsers1);
        lblListofUsers1.setBounds(30, 50, 840, 17);
    }// </editor-fold>//GEN-END:initComponents

    private void btnView1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnView1ActionPerformed
        // TODO add your handling code here:
        try {
            int selectedRowIndex = tblFMCG.getSelectedRow();
            if(selectedRowIndex < 0){
                JOptionPane.showMessageDialog(null, "Please select a row from table first.","Warning", JOptionPane.WARNING_MESSAGE);
            }
            DefaultTableModel model =(DefaultTableModel)tblFMCG.getModel();
            FmcgTransaction selectedTransaction =(FmcgTransaction) model.getValueAt(selectedRowIndex,0);
            selectedTransaction.setTransit();
            selectedTransaction.setInventoryApproved();
            Storage storage = inventoryOfficer.getInventoryOffice().searchInventory(selectedTransaction.getProcurementOffer().getRequirement().getMarket().getMarketName()).searchStorage(selectedTransaction.getItem().getCrop());
            if(storage!=null){
                storage.subFilledCapacity(selectedTransaction.getItem().getQuantity());
            }
            populateaboveTable();
        } catch (Exception e) {
            System.out.println("Exception in view button: " + e.getMessage());
        }
    }//GEN-LAST:event_btnView1ActionPerformed

    private void btnView2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnView2ActionPerformed
        // TODO add your handling code here:
          // TODO add your handling code here:
        try {
            int selectedCourseRowIndex = tblFarmer.getSelectedRow();
            if(selectedCourseRowIndex < 0){
                JOptionPane.showMessageDialog(null, "Please select a row from table first.","Warning", JOptionPane.WARNING_MESSAGE);
            }
            DefaultTableModel model =(DefaultTableModel)tblFarmer.getModel();
            Transaction selectedTransaction =(Transaction) model.getValueAt(selectedCourseRowIndex,0);
            selectedTransaction.setInventoryApproved();
            Storage storage = inventoryOfficer.getInventoryOffice().searchInventory(selectedTransaction.getContract().getMarket().getMarketName()).searchStorage(selectedTransaction.getItem().getCrop());
            if(storage!=null){
                storage.addFilledCapacity(selectedTransaction.getItem().getQuantity());
            }
            populateBelowTable();
        } catch (Exception e) {
            System.out.println("Exception in view button: " + e.getMessage());
        }
    }//GEN-LAST:event_btnView2ActionPerformed
    

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnView1;
    private javax.swing.JButton btnView2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblListofUsers;
    private javax.swing.JLabel lblListofUsers1;
    private javax.swing.JLabel lblManageUser;
    private javax.swing.JTable tblFMCG;
    private javax.swing.JTable tblFarmer;
    // End of variables declaration//GEN-END:variables

      private void populateaboveTable() {
//        String marketName = String.valueOf(cmbMarketName.getSelectedItem());
        DefaultTableModel model =(DefaultTableModel)tblFMCG.getModel();
        model.setRowCount(0);
        for(FmcgTransaction fmcgTransaction: inventoryOfficer.getInventoryOffice().getDistributor().getFmcgTransactions()){
//            if(fmcgTransaction.getProcurementOffer().getRequirement().getMarket().getMarketName().equals(marketName)){
                if(fmcgTransaction.isTransit()&& !fmcgTransaction.isInventoryApproved()){
                    Object[] row =new Object[4];
                    row[0]=fmcgTransaction;
                    row[1]=fmcgTransaction.getFmcg().getFmcgName();
                    row[2]=fmcgTransaction.getProcurementOffer().getRequirement().getItem().getCrop().getGrade();
                    row[3]=fmcgTransaction.getProcurementOffer().getRequirement().getItem().getQuantity();
                    model.addRow(row);
                }
//            }
        }
    }

 
    private void populateBelowTable() {
//        String marketName = String.valueOf(cmbMarketName.getSelectedItem());
        DefaultTableModel model =(DefaultTableModel)tblFarmer.getModel();
        model.setRowCount(0);
        for(Transaction transaction: inventoryOfficer.getInventoryOffice().getDistributor().getDistributorTransaction()){
//            if(transaction.getContract().getMarket().getMarketName().equals(marketName)){
                if(transaction.isTransit()&&!transaction.isInventoryApproved()){
                    Object[] row =new Object[4];
                    row[0]=transaction;
                    row[1]=transaction.getFarmerProfile().getPerson().getFullName();
                    row[2]=transaction.getItem().getCrop().getGrade();
                    row[3]=transaction.getItem().getQuantity();
                    model.addRow(row);
                }
//            }
        }
    }

    private void populateMarkets() {
//        cmbMarketName.removeAllItems();
//        for(Market.Market market:marketDirectory.getMarkets()){
//            cmbMarketName.addItem(market.getMarketName());     
//        }
    }

    
    
}
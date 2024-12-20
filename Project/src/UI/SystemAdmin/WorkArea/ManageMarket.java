/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.SystemAdmin.WorkArea;

import Business.EcoSystem;
import Business.SystemAdmin;
import FMCG.SeasonNew;
import Market.Market;
import Market.MarketDirectory;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
//import com.toedter.calendar.JDateChooser;
import java.time.ZoneId;
import java.util.Date;

/**
 *
 * @author Sagar
 */
public class ManageMarket extends javax.swing.JPanel {

    /**
     * Creates new form ManageMarket
     */
    JPanel sysadminProcessStack;
    EcoSystem ecosystem;
    SystemAdmin sysAdmin;
    MarketDirectory marketdirectory;
    SeasonNew previousPhase;
    Market market;
    
    public ManageMarket(EcoSystem eco, JPanel jp, SystemAdmin sa) {
        initComponents();
        sysadminProcessStack = jp;
        ecosystem = eco;
        sysAdmin = sa;
        marketdirectory = ecosystem.getMarketDirectory();
        populateMarketList();  
        populateNewMarketPhases();
        populateExistingMarketPhases();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblMarket = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMarket = new javax.swing.JTable();
        createMarketJPanel = new javax.swing.JPanel();
        lblSelectNewPhase = new javax.swing.JLabel();
        txtNewMarketName = new javax.swing.JTextField();
        lblNewMarketName1 = new javax.swing.JLabel();
        cmbNewPhase = new javax.swing.JComboBox<>();
        btnCreateMarket = new javax.swing.JButton();
        changeMarketJPanel = new javax.swing.JPanel();
        btnChangePhase = new javax.swing.JButton();
        txtExistingMarketName = new javax.swing.JTextField();
        lblExistingMarketName = new javax.swing.JLabel();
        cmbChangePhase = new javax.swing.JComboBox<>();
        lblChangePhase = new javax.swing.JLabel();
        btnEditPhase = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 204));

        lblMarket.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblMarket.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMarket.setText("Manage Market");

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        tblMarket.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Market Name", "Market Phase"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblMarket);

        createMarketJPanel.setBackground(new java.awt.Color(255, 255, 255));
        createMarketJPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Create New Market", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        lblSelectNewPhase.setText("Select Market Phase:");

        lblNewMarketName1.setText("Market Name:");

        cmbNewPhase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbNewPhaseActionPerformed(evt);
            }
        });

        btnCreateMarket.setText("Create Market");
        btnCreateMarket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateMarketActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout createMarketJPanelLayout = new javax.swing.GroupLayout(createMarketJPanel);
        createMarketJPanel.setLayout(createMarketJPanelLayout);
        createMarketJPanelLayout.setHorizontalGroup(
            createMarketJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createMarketJPanelLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(createMarketJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblNewMarketName1)
                    .addComponent(lblSelectNewPhase))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(createMarketJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCreateMarket)
                    .addGroup(createMarketJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtNewMarketName)
                        .addComponent(cmbNewPhase, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31))
        );
        createMarketJPanelLayout.setVerticalGroup(
            createMarketJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, createMarketJPanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(createMarketJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNewMarketName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNewMarketName1))
                .addGap(18, 18, 18)
                .addGroup(createMarketJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSelectNewPhase)
                    .addComponent(cmbNewPhase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(btnCreateMarket)
                .addGap(29, 29, 29))
        );

        createMarketJPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnCreateMarket, lblSelectNewPhase, txtNewMarketName});

        changeMarketJPanel.setBackground(new java.awt.Color(255, 255, 255));
        changeMarketJPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Edit Market Phase", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        btnChangePhase.setText("Change Phase");
        btnChangePhase.setEnabled(false);
        btnChangePhase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangePhaseActionPerformed(evt);
            }
        });

        txtExistingMarketName.setEnabled(false);

        lblExistingMarketName.setText("Market Name:");

        cmbChangePhase.setEnabled(false);
        cmbChangePhase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbChangePhaseActionPerformed(evt);
            }
        });

        lblChangePhase.setText("Select New Phase:");

        javax.swing.GroupLayout changeMarketJPanelLayout = new javax.swing.GroupLayout(changeMarketJPanel);
        changeMarketJPanel.setLayout(changeMarketJPanelLayout);
        changeMarketJPanelLayout.setHorizontalGroup(
            changeMarketJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(changeMarketJPanelLayout.createSequentialGroup()
                .addGap(169, 169, 169)
                .addComponent(btnChangePhase)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, changeMarketJPanelLayout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addGroup(changeMarketJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblExistingMarketName)
                    .addComponent(lblChangePhase))
                .addGap(18, 18, 18)
                .addGroup(changeMarketJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtExistingMarketName)
                    .addComponent(cmbChangePhase, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41))
        );
        changeMarketJPanelLayout.setVerticalGroup(
            changeMarketJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, changeMarketJPanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(changeMarketJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtExistingMarketName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblExistingMarketName))
                .addGap(18, 18, 18)
                .addGroup(changeMarketJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblChangePhase)
                    .addComponent(cmbChangePhase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnChangePhase)
                .addGap(29, 29, 29))
        );

        btnEditPhase.setText("Edit Phase");
        btnEditPhase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditPhaseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(createMarketJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(changeMarketJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnBack)
                            .addGap(303, 303, 303)
                            .addComponent(lblMarket))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 881, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnEditPhase, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(37, 37, 37))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMarket)
                    .addComponent(btnBack))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEditPhase)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(createMarketJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(changeMarketJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(35, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        sysadminProcessStack.remove(this);
        ((java.awt.CardLayout) sysadminProcessStack.getLayout()).previous(sysadminProcessStack);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnCreateMarketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateMarketActionPerformed
        // TODO add your handling code here:
        try {
            if ((!txtNewMarketName.getText().isBlank()) && (cmbNewPhase.getSelectedItem()!=null)){
                SeasonNew phaseEnum = SeasonNew.valueOf(cmbNewPhase.getSelectedItem().toString());
                sysAdmin.newMarket(String.valueOf(txtNewMarketName.getText()),phaseEnum);
                populateMarketList();
                clearFields();
            }
            else {
                JOptionPane.showMessageDialog(null, "Please fill all details.","Warning", JOptionPane.WARNING_MESSAGE);
            }
        } catch (Exception e) {
            System.out.println("Exception in Create Market: " + e.getMessage());
        } 
    }//GEN-LAST:event_btnCreateMarketActionPerformed

    private void btnChangePhaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangePhaseActionPerformed
        // TODO add your handling code here:
         try {                
            if (!txtExistingMarketName.getText().isBlank() && cmbChangePhase.getSelectedItem()!=null){
                //System.out.println("Cmb 1:" + cmbNewPhase.getSelectedItem());
                SeasonNew phaseEnum = SeasonNew.valueOf(cmbChangePhase.getSelectedItem().toString());
                //System.out.println("value of enum in change button 1:" + phaseEnum);
                
                boolean previousPhaseValue = checkPreviousPhase(phaseEnum);
                //System.out.println("current ordinal:" + phaseEnum.ordinal());
                //System.out.println("previous ordinal:" + previousPhase.ordinal());
                if(previousPhaseValue==true){
                    //System.out.println("value of enum in change button 2:" + phaseEnum);
                    market.setSeason(phaseEnum);
                    populateMarketList();
                    clearFields();
                    cmbChangePhase.setEnabled(false);
                    btnChangePhase.setEnabled(false);
                }else {
                    JOptionPane.showMessageDialog(null,"Cannot Select Previous or Same Phase!","Warning",JOptionPane.WARNING_MESSAGE);
                }                
            }
            else {
                JOptionPane.showMessageDialog(null, "Please fill all details.","Warning", JOptionPane.WARNING_MESSAGE);
            }
        } catch (Exception e) {
            System.out.println("Exception in Change Phase: " + e.getMessage());
        } 
    }//GEN-LAST:event_btnChangePhaseActionPerformed

    private void btnEditPhaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditPhaseActionPerformed
        // TODO add your handling code here:
        try {
            int selectedRow = tblMarket.getSelectedRow();
            if(selectedRow >= 0){
                
                cmbChangePhase.setEnabled(true);
                btnChangePhase.setEnabled(true);

                DefaultTableModel model = (DefaultTableModel) tblMarket.getModel();
                market = (Market) model.getValueAt(selectedRow, 0);
                txtExistingMarketName.setText(market.getMarketName());
                cmbChangePhase.setSelectedItem(market.getSeason()); 
                previousPhase = market.getSeason();
                //System.out.println("Previous season in edit button:" + previousPhase);
            }else{
                JOptionPane.showMessageDialog(null,"Please select a market from table first!","Warning",JOptionPane.WARNING_MESSAGE);
            }
        } catch (Exception e) {
            System.out.println("Exception in Edit Phase button: " + e.getMessage());
        }
    }//GEN-LAST:event_btnEditPhaseActionPerformed

    private void cmbNewPhaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbNewPhaseActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_cmbNewPhaseActionPerformed

    private void cmbChangePhaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbChangePhaseActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_cmbChangePhaseActionPerformed

    public void populateMarketList() {
        try {
            DefaultTableModel model = (DefaultTableModel) tblMarket.getModel();
            model.setRowCount(0);
            for (Market m  : marketdirectory.getMarkets()) {

                Object[] row = new Object[5];
                row[0] = m;
                row[1] = m.getSeason();
                ((DefaultTableModel) tblMarket.getModel()).addRow(row);
            }
        } catch (Exception e) {
            System.out.println("Exception in Populating Market details: " + e.getMessage());
        }     
    }
    
    private void populateNewMarketPhases() {
        try {
            cmbNewPhase.removeAllItems();
            cmbNewPhase.addItem(SeasonNew.COMMITMENT_PHASE.toString());
            cmbNewPhase.addItem(SeasonNew.SELLING_PHASE.toString());
            cmbNewPhase.setSelectedItem(SeasonNew.COMMITMENT_PHASE);
        } catch (Exception e) {
            System.out.println("Exception in Populating New Market Phases combo: " + e.getMessage());
        }
    }
    
    private void populateExistingMarketPhases() {
        try {
            cmbChangePhase.removeAllItems();
            //cmbChangePhase.addItem(String.valueOf(SeasonNew.COMMITMENT_PHASE));
            cmbChangePhase.addItem(String.valueOf(SeasonNew.SELLING_PHASE));
            cmbChangePhase.addItem(String.valueOf(SeasonNew.END));
            cmbChangePhase.setSelectedItem(SeasonNew.SELLING_PHASE);
        } catch (Exception e) {
            System.out.println("Exception in Populating Existing Market Phases combo: " + e.getMessage());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnChangePhase;
    private javax.swing.JButton btnCreateMarket;
    private javax.swing.JButton btnEditPhase;
    private javax.swing.JPanel changeMarketJPanel;
    private javax.swing.JComboBox<String> cmbChangePhase;
    private javax.swing.JComboBox<String> cmbNewPhase;
    private javax.swing.JPanel createMarketJPanel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblChangePhase;
    private javax.swing.JLabel lblExistingMarketName;
    private javax.swing.JLabel lblMarket;
    private javax.swing.JLabel lblNewMarketName1;
    private javax.swing.JLabel lblSelectNewPhase;
    private javax.swing.JTable tblMarket;
    private javax.swing.JTextField txtExistingMarketName;
    private javax.swing.JTextField txtNewMarketName;
    // End of variables declaration//GEN-END:variables

    private void clearFields() {
        txtNewMarketName.setText("");
        cmbNewPhase.setSelectedItem(null);
        
        txtExistingMarketName.setText("");
        cmbChangePhase.setSelectedItem(null);
    }
    
    public boolean checkPreviousPhase(SeasonNew selectedPhase) {
        if (selectedPhase.ordinal() > previousPhase.ordinal()) {
            //System.out.println("current ordinal:" + selectedPhase.ordinal());
            //System.out.println("previous ordinal:" + previousPhase.ordinal());
            //System.out.println("checkprvious:" + selectedPhase);
            previousPhase = selectedPhase;
            return true;
        } else {
            return false;
        }
    }
}

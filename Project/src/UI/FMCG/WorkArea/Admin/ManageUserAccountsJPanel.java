/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.FMCG.WorkArea.Admin;
import Business.SystemAdmin;
import FMCG.FmcgAdmin;
import FMCG.FmcgUserAccount;
import FMCG.ProcurementOfficer;
import FMCG.RequirementOfficer;
import PersonUserProfile.Person;
import PersonUserProfile.Profile;
import PersonUserProfile.UserAccount;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kal bugrara
 */
public class ManageUserAccountsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageSuppliersJPanel
     */
    JPanel processStackjPanel;
    FmcgAdmin fmcgAdmin;

    public ManageUserAccountsJPanel(JPanel psjp, FmcgAdmin fmcgAdmin) {
        initComponents();
        processStackjPanel = psjp;
        this.fmcgAdmin = fmcgAdmin;
        populateTable();
        populatecombo();
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
        btnDeleteUser = new javax.swing.JButton();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        lblChooseRole = new javax.swing.JLabel();
        cmbRole = new javax.swing.JComboBox<>();
        lblPersonID = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        btnCreatePerson = new javax.swing.JButton();
        lblPassword = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        txtPersonID1 = new javax.swing.JTextField();
        txtUserName = new javax.swing.JTextField();
        lblUsername1 = new javax.swing.JLabel();
        txtUserName1 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblUsers = new javax.swing.JTable();
        lblCreatePerson = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 255, 255));
        setLayout(null);

        lblListofUsers.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblListofUsers.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblListofUsers.setText("List of User Accounts");
        add(lblListofUsers);
        lblListofUsers.setBounds(60, 50, 840, 17);

        lblManageUser.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lblManageUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblManageUser.setText("Manage User Accounts");
        add(lblManageUser);
        lblManageUser.setBounds(60, 10, 840, 28);

        btnDeleteUser.setText("Delete User");
        btnDeleteUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteUserActionPerformed(evt);
            }
        });
        add(btnDeleteUser);
        btnDeleteUser.setBounds(840, 310, 100, 23);

        jLayeredPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblChooseRole.setText("Choose Person Role:");
        jLayeredPane1.add(lblChooseRole);
        lblChooseRole.setBounds(10, 40, 130, 20);

        cmbRole.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbRoleActionPerformed(evt);
            }
        });
        jLayeredPane1.add(cmbRole);
        cmbRole.setBounds(150, 30, 140, 30);

        lblPersonID.setText("Email:");
        jLayeredPane1.add(lblPersonID);
        lblPersonID.setBounds(670, 30, 40, 20);
        jLayeredPane1.add(txtPassword);
        txtPassword.setBounds(730, 80, 150, 30);

        btnCreatePerson.setText("Create Person");
        btnCreatePerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreatePersonActionPerformed(evt);
            }
        });
        jLayeredPane1.add(btnCreatePerson);
        btnCreatePerson.setBounds(390, 130, 120, 23);

        lblPassword.setText("Password:");
        jLayeredPane1.add(lblPassword);
        lblPassword.setBounds(650, 90, 80, 17);

        lblUsername.setText("User Name:");
        jLayeredPane1.add(lblUsername);
        lblUsername.setBounds(60, 80, 70, 20);
        jLayeredPane1.add(txtPersonID1);
        txtPersonID1.setBounds(730, 30, 150, 30);
        jLayeredPane1.add(txtUserName);
        txtUserName.setBounds(150, 80, 140, 30);

        lblUsername1.setText("Full name:");
        jLayeredPane1.add(lblUsername1);
        lblUsername1.setBounds(340, 30, 70, 20);
        jLayeredPane1.add(txtUserName1);
        txtUserName1.setBounds(410, 30, 140, 30);

        add(jLayeredPane1);
        jLayeredPane1.setBounds(30, 360, 910, 170);

        tblUsers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Name", "ID", "Email", "Department", "Username"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblUsers);

        add(jScrollPane2);
        jScrollPane2.setBounds(30, 80, 910, 220);

        lblCreatePerson.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblCreatePerson.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCreatePerson.setText("Create Person Profile and User Account");
        add(lblCreatePerson);
        lblCreatePerson.setBounds(60, 330, 840, 30);
    }// </editor-fold>//GEN-END:initComponents

    private void cmbRoleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbRoleActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_cmbRoleActionPerformed

    private void btnDeleteUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteUserActionPerformed

        try {
            int selectedRow = tblUsers.getSelectedRow();
            if (selectedRow >= 0) {
                DefaultTableModel model = (DefaultTableModel) tblUsers.getModel();
                FmcgUserAccount fmcgUserAccount = (FmcgUserAccount) model.getValueAt(selectedRow, 0);
                int dialogButton = JOptionPane.YES_NO_OPTION;
                int dialogResult = JOptionPane.showConfirmDialog(null, "Would you like to delete the Person details?", "Warning", dialogButton);
                if (dialogResult == JOptionPane.YES_OPTION) {
                    fmcgAdmin.getFmcgUserAccountDirectory().deletePerson(fmcgUserAccount);
                    deleteProfile(fmcgUserAccount);
                    populateTable();
                }
            } else {
                JOptionPane.showMessageDialog(null, "Please select a user from table first!", "Warning", JOptionPane.WARNING_MESSAGE);
            }
        } catch (Exception e) {
            System.out.println("Exception in Delete user: " + e.getMessage());
        }

    }//GEN-LAST:event_btnDeleteUserActionPerformed

    private void btnCreatePersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreatePersonActionPerformed
        // TODO add your handling code here:
        try {
            Person personNew = new Person(txtUserName1.getText(),txtPersonID1.getText());
            switch (String.valueOf(cmbRole.getSelectedItem())) {
                case "Requirement Officer":
                    if (cmbRole.getSelectedItem() != null && !txtPassword.getText().isBlank() && !txtUserName1.getText().isBlank() && !txtPersonID1.getText().isBlank()) {
                    Profile Requirement = fmcgAdmin.addRequirementOfficer(personNew, txtUserName1.getText(), txtPassword.getText());
                    populateTable();
                    clearFields();
                    break;
                } else {
                    JOptionPane.showMessageDialog(null, "Please fill all the details.", "Warning", JOptionPane.WARNING_MESSAGE);
                    break;
                    } 
                case "Procurement Officer":
                    if (cmbRole.getSelectedItem() != null && !txtPassword.getText().isBlank() && !txtUserName1.getText().isBlank() && !txtPersonID1.getText().isBlank()) {
                    Profile Procurement = fmcgAdmin.addProcurementOfficer(personNew, txtUserName1.getText(), txtPassword.getText());
                    populateTable();
                    clearFields();
                    break;
                } else {
                    JOptionPane.showMessageDialog(null, "Please fill all the details.", "Warning", JOptionPane.WARNING_MESSAGE);
                    break;
                    }       
            }
        } catch (Exception e) {
            System.out.println("Exception in Create user: " + e.getMessage());
        }

    }//GEN-LAST:event_btnCreatePersonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreatePerson;
    private javax.swing.JButton btnDeleteUser;
    private javax.swing.JComboBox<String> cmbRole;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblChooseRole;
    private javax.swing.JLabel lblCreatePerson;
    private javax.swing.JLabel lblListofUsers;
    private javax.swing.JLabel lblManageUser;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblPersonID;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JLabel lblUsername1;
    private javax.swing.JTable tblUsers;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtPersonID1;
    private javax.swing.JTextField txtUserName;
    private javax.swing.JTextField txtUserName1;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        try {
            int rc = tblUsers.getRowCount();
            int i;
            for (i = rc - 1; i >= 0; i--) {
                ((DefaultTableModel) tblUsers.getModel()).removeRow(i);
            }
            for (FmcgUserAccount fmcgUserAccount : fmcgAdmin.getFmcgUserAccountDirectory().getUserAccountList()) {
                Object[] row = new Object[5];
                row[0] = fmcgUserAccount;
                row[1] = fmcgUserAccount.getPersonId();
                row[2] = fmcgUserAccount.getPersonEmail();
                row[3] = fmcgUserAccount.getAssociatedPersonProfile().toString();
                row[4] = fmcgUserAccount.getUsername();
                ((DefaultTableModel) tblUsers.getModel()).addRow(row);
            }
        } catch (Exception e) {
            System.out.println("Exception in Populateing FMCG Admin user account table: " + e.getMessage());
        }
    }

    private void deleteProfile(FmcgUserAccount fmcgUserAccount) {
        if (fmcgUserAccount.getAssociatedPersonProfile() instanceof RequirementOfficer requirementOfficer) {
            fmcgAdmin.removeRequirementOfficeEmployee(requirementOfficer);
        }
        if (fmcgUserAccount.getAssociatedPersonProfile() instanceof ProcurementOfficer procurementOfficer) {
            fmcgAdmin.removeProcurementOfficeEmployee(procurementOfficer);
        }
    }
        private void clearFields() {
        txtUserName1.setText("");
        txtPersonID1.setText("");
        txtUserName.setText("");
        txtPassword.setText("");
    }
        
    private void populatecombo() {
        cmbRole.removeAllItems();
        cmbRole.addItem("Requirement Officer" );
        cmbRole.addItem("Procurement Officer" );
    }

}

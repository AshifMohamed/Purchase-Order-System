/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package purchase.order.system.ProcurementStaff;

import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
import purchase.order.system.Public.DBConn;
import net.sf.jasperreports.view.*;
import net.sf.jasperreports.engine.*;

/**
 *
 * @author Umani Welisara
 */
public class SupplierUI extends javax.swing.JFrame {

    /**
     * Creates new form ItemUI
     */
    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public SupplierUI() {
        initComponents();
        lblsupplierid.setText("");
        txtsuppliername.setText("");
        txtaddress.setText("");
        txtcity.setText("");
        cmbprovince.setSelectedIndex(0);
        txtpostalcode.setText("");
        txtphone.setText("");
        txtemail.setText("");
        cmbsupplierapproval.setSelectedIndex(0);

        txtsearchbyid.setText("");
        txtsearchbyname.setText("");
        txtsearchbyemail.setText("");

        conn = DBConn.myConn();
        tableload();
    }

    public boolean tableload() {

        try {

            String sql = "select concat('SUP',supplierId) as 'Supplier ID',supplierName as 'Supplier Name',supplierAddress as 'Address',"
                    + "supplierCity as 'City',supplierProvince as 'Province',supplierPostalCode as 'PostalCode',"
                    + "supplierPhone as 'Phone',supplierEmail as 'Email',supplierApproval as 'Approval' from supplier";
            PreparedStatement pst = DBConn.myConn().prepareStatement(sql);
            rs = pst.executeQuery();
            tblsupplier.setModel(DbUtils.resultSetToTableModel(rs));
            return true;

        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
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

        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblsupplierid = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtpostalcode = new javax.swing.JTextField();
        cmbprovince = new javax.swing.JComboBox<>();
        txtcity = new javax.swing.JTextField();
        txtaddress = new javax.swing.JTextField();
        txtsuppliername = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        cmbsupplierapproval = new javax.swing.JComboBox<>();
        txtemail = new javax.swing.JTextField();
        txtphone = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();
        btninsert = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtsearchbyemail = new javax.swing.JTextField();
        txtsearchbyname = new javax.swing.JTextField();
        txtsearchbyid = new javax.swing.JTextField();
        btnsearchbyid1 = new javax.swing.JButton();
        btnsearchbyname = new javax.swing.JButton();
        btnsearchbyemail = new javax.swing.JButton();
        btnclear = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblsupplier = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        btnreport = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(95, 53, 174));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel9.setBackground(new java.awt.Color(23, 2, 74));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(23, 2, 74));
        jLabel9.setText("X");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel9MousePressed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("SUPPLIER");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 628, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel9)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addContainerGap())
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel1.setText("Supplier ID");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 78, -1, -1));

        lblsupplierid.setText("jLabel2");
        getContentPane().add(lblsupplierid, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 78, -1, -1));

        jLabel2.setText("Supplier Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 108, -1, -1));

        jLabel3.setText("Address");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 138, -1, -1));

        jLabel4.setText("City");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 168, -1, -1));

        jLabel5.setText("Province");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 208, -1, -1));

        jLabel6.setText("Postal Code");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 248, -1, -1));

        txtpostalcode.setText("jTextField1");
        getContentPane().add(txtpostalcode, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 248, 210, -1));

        cmbprovince.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- select --", "Northern", "NorthWestern", "Western", "NorthCentral", "Central", "Sabaragamuwa", "Eastern", "Uva", "Southern" }));
        getContentPane().add(cmbprovince, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 208, 210, -1));

        txtcity.setText("jTextField1");
        getContentPane().add(txtcity, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 168, 210, -1));

        txtaddress.setText("jTextField1");
        getContentPane().add(txtaddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 138, 210, -1));

        txtsuppliername.setText("jTextField1");
        getContentPane().add(txtsuppliername, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 108, 210, -1));

        jLabel10.setText("Phone");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(411, 117, -1, -1));

        jLabel11.setText("Email");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(409, 152, -1, -1));

        jLabel12.setText("Supplier Approval");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(409, 182, -1, -1));

        cmbsupplierapproval.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "True", "False" }));
        getContentPane().add(cmbsupplierapproval, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 180, 210, -1));

        txtemail.setText("jTextField1");
        getContentPane().add(txtemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(509, 142, 250, -1));

        txtphone.setText("jTextField1");
        txtphone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtphoneKeyTyped(evt);
            }
        });
        getContentPane().add(txtphone, new org.netbeans.lib.awtextra.AbsoluteConstraints(509, 112, 250, -1));

        jButton1.setText("< Back to Home");
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(645, 78, 171, -1));

        btnupdate.setText("Update Suppliers");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 220, 163, 30));

        btninsert.setText("+ Add Suppliers");
        btninsert.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btninsertMouseClicked(evt);
            }
        });
        btninsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btninsertActionPerformed(evt);
            }
        });
        getContentPane().add(btninsert, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 220, 140, 30));

        jLabel13.setText("Search By ID");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 325, 100, -1));

        jLabel8.setText("Search By Supplier Name");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 352, 170, -1));

        jLabel14.setText("Search By Email");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 393, 110, -1));

        txtsearchbyemail.setText("jTextField1");
        getContentPane().add(txtsearchbyemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 380, 150, -1));

        txtsearchbyname.setText("jTextField2");
        getContentPane().add(txtsearchbyname, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 350, 150, -1));

        txtsearchbyid.setText("jTextField1");
        getContentPane().add(txtsearchbyid, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 320, 150, -1));

        btnsearchbyid1.setText("Filter");
        btnsearchbyid1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsearchbyid1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnsearchbyid1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 320, 106, -1));

        btnsearchbyname.setText("Filter");
        btnsearchbyname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsearchbynameActionPerformed(evt);
            }
        });
        getContentPane().add(btnsearchbyname, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 350, 106, -1));

        btnsearchbyemail.setText("Filter");
        btnsearchbyemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsearchbyemailActionPerformed(evt);
            }
        });
        getContentPane().add(btnsearchbyemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 380, 106, -1));

        btnclear.setText("Clear All");
        btnclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclearActionPerformed(evt);
            }
        });
        getContentPane().add(btnclear, new org.netbeans.lib.awtextra.AbsoluteConstraints(628, 382, 124, -1));

        tblsupplier.setForeground(new java.awt.Color(153, 153, 153));
        tblsupplier.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblsupplier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblsupplierMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblsupplier);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 429, 720, 188));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 309, 709, -1));

        btnreport.setText("Generate Report");
        btnreport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnreportActionPerformed(evt);
            }
        });
        getContentPane().add(btnreport, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 280, 160, -1));

        setSize(new java.awt.Dimension(869, 667));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MousePressed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jLabel9MousePressed

    private void txtphoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtphoneKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || c == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtphoneKeyTyped

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        // TODO add your handling code here:
        int x = JOptionPane.showConfirmDialog(null, "Do you really want to update?");

        if (x == 0) {
            String supplierId = lblsupplierid.getText();
            String supplierName = txtsuppliername.getText();
            String supplierAddress = txtaddress.getText();
            String supplierCity = txtcity.getText();
            String supplierProvince = cmbprovince.getSelectedItem().toString();
            String supplierPostalCode = txtpostalcode.getText();
            String supplierPhone = txtphone.getText();
            String supplierEmail = txtemail.getText();
            String supplierApproval = cmbsupplierapproval.getSelectedItem().toString();

            //Required Field validation
            if (txtsuppliername.getText().equalsIgnoreCase("") || txtaddress.getText().equalsIgnoreCase("") || txtcity.getText().equalsIgnoreCase("")
                    || cmbprovince.getSelectedItem() == "-- select --" || txtpostalcode.getText().equalsIgnoreCase("") || txtphone.getText().equalsIgnoreCase("") || txtemail.getText().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(null, "Please fill the required fields", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            //Validtations
            if (ValidateSupplier.checkPhone(txtphone.getText())) {
                //   JOptionPane.showMessageDialog(null, "Please enter valid phone number", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (ValidateSupplier.validateMail(txtemail.getText())) {
                //  JOptionPane.showMessageDialog(null, "wrong format of email", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            if (ValidateSupplier.validatePostalcode(txtpostalcode.getText())) {
                //  JOptionPane.showMessageDialog(null, "wrong format of postalcode/state", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            SupplierModel sm = new SupplierModel(supplierId, supplierName, supplierAddress, supplierCity, supplierProvince, supplierPostalCode, supplierPhone, supplierEmail, supplierApproval);
            boolean successStatus = sm.updateSupplier();
            if (successStatus) {
                JOptionPane.showMessageDialog(this, "Successfully inserted to db");
                tableload();
                lblsupplierid.setText("");
                txtsuppliername.setText("");
                txtaddress.setText("");
                txtcity.setText("");
                cmbprovince.setSelectedIndex(0);
                txtpostalcode.setText("");
                txtphone.setText("");
                txtemail.setText("");
                cmbsupplierapproval.setSelectedIndex(0);

            } else {
                JOptionPane.showMessageDialog(this, "Error in inserting to db");
            }

        }

    }//GEN-LAST:event_btnupdateActionPerformed

    private void btninsertMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btninsertMouseClicked
        // TODO add your handling code here
    }//GEN-LAST:event_btninsertMouseClicked

    private void btninsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninsertActionPerformed
        // TODO add your handling code here:

        String supplierName = txtsuppliername.getText();
        String supplierAddress = txtaddress.getText();
        String supplierCity = txtcity.getText();
        String supplierProvince = cmbprovince.getSelectedItem().toString();
        String supplierPostalCode = txtpostalcode.getText();
        String supplierPhone = txtphone.getText();
        String supplierEmail = txtemail.getText();
        String supplierApproval = cmbsupplierapproval.getSelectedItem().toString();

        //Required Field validation
        if (txtsuppliername.getText().equalsIgnoreCase("") || txtaddress.getText().equalsIgnoreCase("") || txtcity.getText().equalsIgnoreCase("")
                || cmbprovince.getSelectedItem() == "-- select --" || txtpostalcode.getText().equalsIgnoreCase("") || txtphone.getText().equalsIgnoreCase("") || txtemail.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "Please fill the required fields", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        //Validtations
        if (ValidateSupplier.checkPhone(txtphone.getText())) {
            //JOptionPane.showMessageDialog(null, "Please enter valid phone number", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (ValidateSupplier.validateMail(txtemail.getText())) {
            //JOptionPane.showMessageDialog(null, "wrong format of email", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (ValidateSupplier.validatePostalcode(txtpostalcode.getText())) {
            // JOptionPane.showMessageDialog(null, "wrong format of postalcode/state", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        SupplierModel sm = new SupplierModel(supplierName, supplierAddress, supplierCity, supplierProvince, supplierPostalCode, supplierPhone, supplierEmail, supplierApproval);
        boolean successStatus = sm.insertSupplier();
        if (successStatus) {
            JOptionPane.showMessageDialog(this, "Successfully inserted to database");
            tableload();
            lblsupplierid.setText("");
            txtsuppliername.setText("");
            txtaddress.setText("");
            txtcity.setText("");
            cmbprovince.setSelectedIndex(0);
            txtpostalcode.setText("");
            txtphone.setText("");
            txtemail.setText("");
            cmbsupplierapproval.setSelectedIndex(0);

        } else {
            JOptionPane.showMessageDialog(this, "Error in inserting to db");
        }

    }//GEN-LAST:event_btninsertActionPerformed

    private void btnsearchbyid1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearchbyid1ActionPerformed
        // TODO add your handling code here:

        String searchByID = txtsearchbyid.getText();

        //Button validation
        if (txtsearchbyid.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "Field is Empty ! ", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String n = "Select concat('SUP',supplierId) as 'Supplier ID' ,supplierName,supplierAddress,supplierCity,supplierProvince,supplierPostalCode,supplierPhone,supplierEmail,supplierApproval from supplier where supplierId like '%" + searchByID + "%'";

        try {
            pst = conn.prepareStatement(n);
            rs = pst.executeQuery();
            tblsupplier.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnsearchbyid1ActionPerformed

    private void btnsearchbynameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearchbynameActionPerformed
        // TODO add your handling code here:
        String searchByName = txtsearchbyname.getText();

        //Button validation
        if (txtsearchbyname.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "Field is Empty ! ", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String n = "Select concat('SUP',supplierId) as 'Supplier ID' ,supplierName,supplierAddress,supplierCity,supplierProvince,supplierPostalCode,supplierPhone,supplierEmail,supplierApproval from supplier where supplierName like '%" + searchByName + "%'";

        try {
            pst = conn.prepareStatement(n);
            rs = pst.executeQuery();
            tblsupplier.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnsearchbynameActionPerformed

    private void btnsearchbyemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearchbyemailActionPerformed
        // TODO add your handling code here:
        String searchbyemail = this.txtsearchbyemail.getText();
        //Button validation
        if (txtsearchbyemail.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "Field is Empty ! ", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String n = "Select concat('SUP',supplierId) as 'Supplier ID' ,supplierName,supplierAddress,supplierCity,supplierProvince,supplierPostalCode,supplierPhone,supplierEmail,supplierApproval from supplier where supplierEmail like '%" + searchbyemail + "%'";

        try {
            pst = conn.prepareStatement(n);
            rs = pst.executeQuery();
            tblsupplier.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (Exception e) {
        }

    }//GEN-LAST:event_btnsearchbyemailActionPerformed

    private void btnclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclearActionPerformed
        // TODO add your handling code here:
        txtsearchbyid.setText("");
        txtsearchbyemail.setText("");
        txtsearchbyname.setText("");
        tableload();

    }//GEN-LAST:event_btnclearActionPerformed

    private void tblsupplierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblsupplierMouseClicked
        // TODO add your handling code here:
        int supplier = tblsupplier.getSelectedRow();

        String supplierId = tblsupplier.getValueAt(supplier, 0).toString();
        String supplierName = tblsupplier.getValueAt(supplier, 1).toString();
        String supplierAddress = tblsupplier.getValueAt(supplier, 2).toString();
        String supplierCity = tblsupplier.getValueAt(supplier, 3).toString();
        String supplierProvince = tblsupplier.getValueAt(supplier, 4).toString();
        String supplierPostalCode = tblsupplier.getValueAt(supplier, 5).toString();
        String supplierPhone = tblsupplier.getValueAt(supplier, 6).toString();
        String supplierEmail = tblsupplier.getValueAt(supplier, 7).toString();
        String supplierApproval = tblsupplier.getValueAt(supplier, 8).toString();

        lblsupplierid.setText(supplierId);
        txtsuppliername.setText(supplierName);
        txtaddress.setText(supplierAddress);
        txtcity.setText(supplierCity);
        cmbprovince.setSelectedItem(supplierProvince);
        txtpostalcode.setText(supplierPostalCode);
        txtphone.setText(supplierPhone);
        txtemail.setText(supplierEmail);
        cmbsupplierapproval.setSelectedItem(supplierApproval);

    }//GEN-LAST:event_tblsupplierMouseClicked

    private void btnreportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnreportActionPerformed
        // TODO add your handling code here:
        B_REPORT_ACTION();
    }//GEN-LAST:event_btnreportActionPerformed

    //generate report
    public void B_REPORT_ACTION() {

        try {
            String REPORT = "C:\\Users\\Umani Welisara\\Documents\\Projects\\Purchase-Order-System\\src\\purchase\\order\\system\\ProcurementStaff\\SupplierReport.jrxml";
            JasperReport JASP_REP = JasperCompileManager.compileReport(REPORT);
            JasperPrint JASP_PRINT = JasperFillManager.fillReport(JASP_REP, null, conn);
            JasperViewer.viewReport(JASP_PRINT);
        } catch (Exception x) {
            System.out.print(x);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SupplierUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SupplierUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SupplierUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SupplierUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SupplierUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnclear;
    private javax.swing.JButton btninsert;
    private javax.swing.JButton btnreport;
    private javax.swing.JButton btnsearchbyemail;
    private javax.swing.JButton btnsearchbyid1;
    private javax.swing.JButton btnsearchbyname;
    private javax.swing.JButton btnupdate;
    private javax.swing.JComboBox<String> cmbprovince;
    private javax.swing.JComboBox<String> cmbsupplierapproval;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblsupplierid;
    private javax.swing.JTable tblsupplier;
    private javax.swing.JTextField txtaddress;
    private javax.swing.JTextField txtcity;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtphone;
    private javax.swing.JTextField txtpostalcode;
    private javax.swing.JTextField txtsearchbyemail;
    private javax.swing.JTextField txtsearchbyid;
    private javax.swing.JTextField txtsearchbyname;
    private javax.swing.JTextField txtsuppliername;
    // End of variables declaration//GEN-END:variables
}

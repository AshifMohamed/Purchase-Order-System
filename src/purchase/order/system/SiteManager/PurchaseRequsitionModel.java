/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package purchase.order.system.SiteManager;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.swing.JOptionPane;
import purchase.order.system.Public.DBConn;

/**
 *
 * @author User
 */
public class PurchaseRequsitionModel {

    private String requisitionNo;
    private Date appliedDate;
    private Date requiredDate;
    private String comments;
    private String RequisitionStatus;
    private String Requisitioner;
    private String RequsitionAccount;
    private double totalAmount;
    private HashMap<String, Double> itemWithQuantity = new HashMap<>();

    public String getRequisitionStatus() {
        return RequisitionStatus;
    }

    public void setRequisitionStatus(String RequisitionStatus) {
        this.RequisitionStatus = RequisitionStatus;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getRequisitioner() {
        return Requisitioner;
    }

    public void setRequisitioner(String Requisitioner) {
        this.Requisitioner = Requisitioner;
    }

    public String getRequsitionAccount() {
        return RequsitionAccount;
    }

    public void setRequsitionAccount(String RequsitionAccount) {
        this.RequsitionAccount = RequsitionAccount;
    }

    public String getRequisitionNo() {
        return requisitionNo;
    }

    public void setRequisitionNo(String requisitionNo) {
        this.requisitionNo = requisitionNo;
    }

    public Date getAppliedDate() {
        return appliedDate;
    }

    public void setAppliedDate(Date appliedDate) {
        this.appliedDate = appliedDate;
    }

    public Date getRequiredDate() {
        return requiredDate;
    }

    public void setRequiredDate(Date requiredDate) {
        this.requiredDate = requiredDate;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public HashMap<String, Double> getItemWithQuantity() {
        return itemWithQuantity;
    }

    public void setItemWithQuantity(HashMap<String, Double> itemWithQuantity) {
        this.itemWithQuantity = itemWithQuantity;
    }

    public void addItem(String itemid, double quantity) {

        itemWithQuantity.put(itemid, quantity);
    }

    public ResultSet getItem(String itemId) {

        ResultSet rs = null;
        try {
            String sql = "select itemId as 'ITEM ID',description as 'DESCRIPTION',agreedPrice as 'UNIT PRICE' from item where itemId=?";
            PreparedStatement pst = DBConn.myConn().prepareStatement(sql);
            pst.setString(1, itemId);
            rs = pst.executeQuery();

            return rs;

        } catch (SQLException e) {
            System.out.println(e);
            return rs;
        } catch (Exception e) {
            System.out.println(e);
            return rs;
        }

    }

    public ResultSet getItemDetails() {

        System.out.println("afdsafdsa");

        ResultSet rs = null;
        try {
            String sql = "select itemId as 'ITEM ID',category as 'CATEGORY',description as 'DESCRIPTION',agreedPrice as 'UNIT PRICE' from item where restrictedStatus=?";
            PreparedStatement pst = DBConn.myConn().prepareStatement(sql);
            pst.setBoolean(1, false);
            rs = pst.executeQuery();

            return rs;

        } catch (SQLException e) {
            System.out.println("No Data");
            System.out.println(e);
            return rs;
        } catch (Exception e) {
            System.out.println("No 2 Data");
            System.out.println(e);
            return rs;
        }

    }
    
    public ResultSet getRequisitionDetails() {

        System.out.println("afdsafdsa");

        ResultSet rs = null;
        try {
            String sql = "select RequisitionNo as 'REQ.NO',AppliedDate as 'APPLIED DATE',RequiredDate as 'REQ.DATE',RequisitionStatus as 'STATUS' from purchaserequisition";
            PreparedStatement pst = DBConn.myConn().prepareStatement(sql);
            
            rs = pst.executeQuery();

            return rs;

        } catch (SQLException e) {
            System.out.println("No Data");
            System.out.println(e);
            return rs;
        } catch (Exception e) {
            System.out.println("No 2 Data");
            System.out.println(e);
            return rs;
        }

    }
    
    public ResultSet getSingleRequisitionDetail(String reqNo) {

        System.out.println("afdsafdsa");

        ResultSet rs = null;
        try {
            String sql = "select RequisitionNo as 'REQ.NO',AppliedDate as 'APPLIED DATE',RequiredDate as 'REQ.DATE',Comment as 'COMMENT',RequisitionStatus as 'STATUS',TotalAmnt as 'TOTAL' from purchaserequisition where RequisitionNo=?";
            PreparedStatement pst = DBConn.myConn().prepareStatement(sql);
            pst.setString(1, reqNo);
            
            rs = pst.executeQuery();

            return rs;

        } catch (SQLException e) {
            System.out.println("No Data");
            System.out.println(e);
            return rs;
        } catch (Exception e) {
            System.out.println("No 2 Data");
            System.out.println(e);
            return rs;
        }

    }
    
    public ResultSet getRequisitionItems(String itemId) {

        System.out.println("afdsafdsa");

        ResultSet rs = null;
        try {
            String sql = "select * from requisitionitems where RequisitionNo=?";
            PreparedStatement pst = DBConn.myConn().prepareStatement(sql);
            pst.setString(1, itemId);
            
            rs = pst.executeQuery();

            return rs;

        } catch (SQLException e) {
            System.out.println("No Data");
            System.out.println(e);
            return rs;
        } catch (Exception e) {
            System.out.println("No 2 Data");
            System.out.println(e);
            return rs;
        }

    }

    public boolean addPurchaseRequisition() {

//      String sql = "insert into purchaserequisition(AppliedDate,RequiredDate,Comment,RequisitionStatus,Requisitioner,RequsitionAccount) values (?,?,?,?,?,?,?)";
        String sql = "insert into purchaserequisition values (?,?,?,?,?,?,?,?)";
        try {

            PreparedStatement pst = DBConn.myConn().prepareStatement(sql);

            java.sql.Date apply = new java.sql.Date(this.appliedDate.getTime());
            java.sql.Date reqDate = new java.sql.Date(this.requiredDate.getTime());
            System.out.println(apply+"    "+reqDate);

            pst.setString(1, this.requisitionNo);
            pst.setDate(2, (java.sql.Date) apply);
            pst.setDate(3, (java.sql.Date) reqDate); 
            pst.setString(4, this.comments);
            pst.setString(5, this.RequisitionStatus);           
            pst.setString(6, this.Requisitioner);
            pst.setString(7, this.RequsitionAccount);
            pst.setDouble(8, this.totalAmount);
           

            pst.executeUpdate();

            JOptionPane.showMessageDialog(null, "Successfully Added");
            return true;

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error in Adding Purchase Requisition");
            System.out.println(ex);

            return false;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error in Adding Purchase Requisition");
            System.out.println(ex);

            return false;
        }
    }

    public void addRequisitionItems() {

        int executeUpdate = 0;
        String key;
        Set<String> keySet = itemWithQuantity.keySet();
        Iterator<String> keySetIterator = keySet.iterator();

        String sql = "insert into requisitionitems(RequisitionNo,ItemId,Quantity) values (?,?,?)";
        try {

            PreparedStatement pst = DBConn.myConn().prepareStatement(sql);

            while (keySetIterator.hasNext()) {

                key = keySetIterator.next();

                pst.setString(1, this.requisitionNo);
                pst.setString(2, key);
                pst.setDouble(3, itemWithQuantity.get(key));
                executeUpdate = pst.executeUpdate();
            }

            System.out.println(executeUpdate);
          //  JOptionPane.showMessageDialog(null, "Successfully Added");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error in Adding Purchase Requisition");
            System.out.println(ex);

            // return false;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error in Adding Purchase Requisition");
            System.out.println(ex);

            // return false;
        }
    }

}

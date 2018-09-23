/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package purchase.order.system.ProcurementStaff;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import purchase.order.system.Public.DBConn;

/**
 *
 * @author Umani Welisara
 */
public class SupplierModel {

    private String supplierId;
    private String supplierName;
    private String supplierAddress;
    private String supplierCity;
    private String supplierProvince;
    private String supplierPostalCode;
    private String supplierPhone;
    private String supplierEmail;
    private String supplierApproval;

    public SupplierModel(String supplierId, String supplierName, String supplierAddress, String supplierCity, String supplierProvince, String supplierPostalCode, String supplierPhone, String supplierEmail, String supplierApproval) {

        this.supplierId = supplierId;
        this.supplierName = supplierName;
        this.supplierAddress = supplierAddress;
        this.supplierCity = supplierCity;
        this.supplierProvince = supplierProvince;
        this.supplierPostalCode = supplierPostalCode;
        this.supplierPhone = supplierPhone;
        this.supplierEmail = supplierEmail;
        this.supplierApproval = supplierApproval;

    }

    public SupplierModel(String supplierName, String supplierAddress, String supplierCity, String supplierProvince, String supplierPostalCode, String supplierPhone, String supplierEmail, String supplierApproval) {

        this.supplierName = supplierName;
        this.supplierAddress = supplierAddress;
        this.supplierCity = supplierCity;
        this.supplierProvince = supplierProvince;
        this.supplierPostalCode = supplierPostalCode;
        this.supplierPhone = supplierPhone;
        this.supplierEmail = supplierEmail;
        this.supplierApproval = supplierApproval;

    }

    public boolean insertSupplier() {
        try {
            String s = "insert into supplier (supplierName,supplierAddress,supplierCity,supplierProvince,supplierPostalCode,supplierPhone,supplierEmail,supplierApproval) values (?,?,?,?,?,?,?,?)";
            PreparedStatement pst = DBConn.myConn().prepareStatement(s);

            pst.setString(1, this.supplierName);
            pst.setString(2, this.supplierAddress);
            pst.setString(3, this.supplierCity);
            pst.setString(4, this.supplierProvince);
            pst.setInt(5, Integer.parseInt(this.supplierPostalCode));
            pst.setInt(6, Integer.parseInt(this.supplierPhone));
            pst.setString(7, this.supplierEmail);
            pst.setInt(8, Boolean.parseBoolean(this.supplierApproval) ? 1 : 0);
            pst.execute();
            return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }

    public boolean updateSupplier() {

        try {

            String q = "update supplier set supplierName=?,supplierAddress=?,supplierCity=?,supplierProvince=?,supplierPostalCode=?,supplierPhone=?,supplierEmail=?,supplierApproval=? where supplierId=?";

            PreparedStatement pst = DBConn.myConn().prepareStatement(q);

            pst.setString(1, this.supplierName);
            pst.setString(2, this.supplierAddress);
            pst.setString(3, this.supplierCity);
            pst.setString(4, this.supplierProvince);
            pst.setInt(5, Integer.parseInt(this.supplierPostalCode));
            pst.setInt(6, Integer.parseInt(this.supplierPhone));
            pst.setString(7, this.supplierEmail);
            pst.setInt(8, Boolean.parseBoolean(this.supplierApproval) ? 1 : 0);
            pst.setInt(9, Integer.parseInt(this.supplierId.replaceAll("SUP", "")));

            pst.executeUpdate();

            return true;

        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }

    }

    public String getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(String supplierId) {
        this.supplierId = supplierId;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public String getSupplierAddress() {
        return supplierAddress;
    }

    public void setSupplierAddress(String supplierAddress) {
        this.supplierAddress = supplierAddress;
    }

    public String getSupplierCity() {
        return supplierCity;
    }

    public void setSupplierCity(String supplierCity) {
        this.supplierCity = supplierCity;
    }

    public String getSupplierProvince() {
        return supplierProvince;
    }

    public void setSupplierProvince(String supplierProvince) {
        this.supplierProvince = supplierProvince;
    }

    public String getSupplierPostalCode() {
        return supplierPostalCode;
    }

    public void setSupplierPostalCode(String supplierPostalCode) {
        this.supplierPostalCode = supplierPostalCode;
    }

    public String getSupplierPhone() {
        return supplierPhone;
    }

    public void setSupplierPhone(String supplierPhone) {
        this.supplierPhone = supplierPhone;
    }

    public String getSupplierEmail() {
        return supplierEmail;
    }

    public void setSupplierEmail(String supplierEmail) {
        this.supplierEmail = supplierEmail;
    }

    public String getSupplierApproval() {
        return supplierApproval;
    }

    public void setSupplierApproval(String supplierApproval) {
        this.supplierApproval = supplierApproval;
    }

}

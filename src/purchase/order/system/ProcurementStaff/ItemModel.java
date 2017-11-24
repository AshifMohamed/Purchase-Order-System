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
public class ItemModel {
    
    private String itemId;
    private String category;
    private String description;
    private String agreedPrice;
    private String restrictedStatus;
    
    public ItemModel (String itemId,String category,String description,String agreedPrice,String restrictedStatus){
    this.itemId = itemId;
    this.category = category;
    this.description = description;
    this.agreedPrice = agreedPrice;
    this.restrictedStatus = restrictedStatus;
    
    
    }
    public ItemModel (String category,String description,String agreedPrice,String restrictedStatus){
    
    this.category = category;
    this.description = description;
    this.agreedPrice = agreedPrice;
    this.restrictedStatus = restrictedStatus;
    
    }
    
    public boolean insertItem(){
    try {
            String s = "insert into item (category,description,agreedPrice,restrictedStatus) values (?,?,?,?)";
            PreparedStatement pst = DBConn.myConn().prepareStatement(s);

            pst.setString(1, this.category);
            pst.setString(2, this.description);
            pst.setDouble(3, Double.parseDouble(this.agreedPrice));
             pst.setInt(4, Boolean.parseBoolean(this.restrictedStatus)?1:0);
            
            pst.execute();
            return true;
        } catch (SQLException ex) {
             ex.printStackTrace();
            return false;
        }
    
    
    }
    public boolean updateItem(){
    
    try {
            
            String q = "update item set category=?,description=?,agreedPrice=?,restrictedStatus=? where itemId=?";

            PreparedStatement pst = DBConn.myConn().prepareStatement(q);

            pst.setString(1, this.category);
            pst.setString(2, this.description);
            pst.setDouble(3, Double.parseDouble(this.agreedPrice));
            
            pst.setInt(4, Boolean.parseBoolean(this.restrictedStatus)?1:0);
            pst.setInt(5, Integer.parseInt(this.itemId.replaceAll("ITM", "")));
            System.out.println(pst.toString());
            pst.executeUpdate();

            return true;

        } catch (Exception ex) {
             ex.printStackTrace();
            return false;
        }
     
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAgreedPrice() {
        return agreedPrice;
    }

    public void setAgreedPrice(String agreedPrice) {
        this.agreedPrice = agreedPrice;
    }

    public String getRestrictedStatus() {
        return restrictedStatus;
    }

    public void setRestrictedStatus(String restrictedStatus) {
        this.restrictedStatus = restrictedStatus;
    }
    
}

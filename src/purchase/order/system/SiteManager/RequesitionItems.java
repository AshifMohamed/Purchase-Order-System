/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package purchase.order.system.SiteManager;

/**
 *
 * @author Neruppuda
 */
public class RequesitionItems {
   
    private int rewuesitionNo;
    private int itemNo;
    private double finalPrice;
    private double orderedQuantity;
    private double deliveredQuantity;
    private double damagedQuantity;
    private String status;

    public RequesitionItems(int rewuesitionNo, int itemNo,double damagedQuantity) {
        this.rewuesitionNo = rewuesitionNo;
        this.itemNo = itemNo;
        this.damagedQuantity=damagedQuantity;
    }

    public RequesitionItems() {
       
    }
    public double getDamagedQuantity() {
        return damagedQuantity;
    }

    public void setDamagedQuantity(double damagedQuantity) {
        this.damagedQuantity = damagedQuantity;
    }

    
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    

    public int getRewuesitionNo() {
        return rewuesitionNo;
    }

    public void setRewuesitionNo(int rewuesitionNo) {
        this.rewuesitionNo = rewuesitionNo;
    }

    public int getItemNo() {
        return itemNo;
    }

    public void setItemNo(int itemNo) {
        this.itemNo = itemNo;
    }

    public double getFinalPrice() {
        return finalPrice;
    }

    public void setFinalPrice(double finalPrice) {
        this.finalPrice = finalPrice;
    }

  
    public double getOrderedQuantity() {
        return orderedQuantity;
    }

    public void setOrderedQuantity(double orderedQuantity) {
        this.orderedQuantity = orderedQuantity;
    }

    public double getDeliveredQuantity() {
        return deliveredQuantity;
    }

    public void setDeliveredQuantity(double deliveredQuantity) {
        this.deliveredQuantity = deliveredQuantity;
    }
    
    
}

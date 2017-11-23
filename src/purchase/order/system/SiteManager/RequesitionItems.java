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
   
    private String rewuesitionNo;
    private String itemNo;
    private String finalPrice;
    private double orderedQuantity;
    private double deliveredQuantity;

    public String getRewuesitionNo() {
        return rewuesitionNo;
    }

    public void setRewuesitionNo(String rewuesitionNo) {
        this.rewuesitionNo = rewuesitionNo;
    }

    public String getItemNo() {
        return itemNo;
    }

    public void setItemNo(String itemNo) {
        this.itemNo = itemNo;
    }

    public String getFinalPrice() {
        return finalPrice;
    }

    public void setFinalPrice(String finalPrice) {
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

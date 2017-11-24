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
public class GoodsDamaged {
    private int rewuesitionNo;
    private int itemNo;
    private double orderedQuantity;
    private double deliveredQuantity;
    private double damagedQantity;

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

    public double getDamagedQantity() {
        return damagedQantity;
    }

    public void setDamagedQantity(double damagedQantity) {
        this.damagedQantity = damagedQantity;
    }
    
    
}

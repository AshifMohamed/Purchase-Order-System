/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package purchase.order.system.SiteManager;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import purchase.order.system.Public.DBConn;

/**
 *
 * @author Neruppuda
 */
public class GoodsReceivedDBUtils {

    SendMailTLS sendMailTLS = new SendMailTLS();
    
    public boolean checkNull(String value) {
        if (value != null || value == "") {
            return true;
        }
        return false;
    }

    public boolean checkPostive(double value) {
        if (value >= 0) {
            return true;
        }
        return false;
    }

    public void notifySupplier(RequesitionItems requesitionItems){
       
        sendMailTLS.sendMailToSupplier("surendransudheesan@gmail.com", requesitionItems);
        
    }
    
    public boolean updateGoodReceiveDetail(RequesitionItems requesitionItems) {
        
        boolean saved = false;
        try (Connection dbConnection = DBConn.myConn()) {
            dbConnection.createStatement().execute("update requisitionitems set DeliveredQuantity ='" + requesitionItems.getDeliveredQuantity() + "',Status ='" + requesitionItems.getStatus() + "' ,DamagedQuantity='" + requesitionItems.getDamagedQuantity() + "' where RequisitionNo='" + requesitionItems.getRewuesitionNo() + "' and ItemId='" + requesitionItems.getItemNo() + "'");
            upDateGoodStatus(requesitionItems.getRewuesitionNo());
            saved = true;
        } catch (SQLException e) {
            saved = false;
        }
        return saved;
    }

    public int getorderedCount(int reqId) {
        int count = 0;
        try (Connection dbConnection = DBConn.myConn()) {
            ResultSet resultSet = dbConnection.createStatement().executeQuery("select sum(OrderQuantity) as count from requisitionitemswhere RequisitionNo='" + reqId + "'");
            while (resultSet.next()) {
                count = Integer.parseInt(resultSet.getString("count"));
            }

        } catch (SQLException e) {

        }
        return count;
    }

    public int getDeliveredCount(int reqId) {
        int count = 0;
        try (Connection dbConnection = DBConn.myConn()) {
            ResultSet resultSet = dbConnection.createStatement().executeQuery("select sum(DeliveredQuantity) as count from requisitionitemswhere RequisitionNo='" + reqId + "'");
            while (resultSet.next()) {
                count = Integer.parseInt(resultSet.getString("count"));
            }

        } catch (SQLException e) {

        }
        return count;
    }

    public String getGoodStatus(int reqId) {
        if (getorderedCount(reqId) == getDeliveredCount(reqId)) {
            return "Received";
        } else {
            return "Pending";
        }
    }

    public void upDateGoodStatus(int reqId) {
        try (Connection dbConnection = DBConn.myConn()) {
            dbConnection.createStatement().execute("update purchaserequisition set RequisitionStatus ='" + getGoodStatus(reqId) + "' where RequisitionNo='" + reqId + "'");
            dbConnection.createStatement().execute("update purchaseorder set OrderStatus ='" + getGoodStatus(reqId) + "' where RequisitionNo='" + reqId + "'");
        } catch (SQLException e) {

        }
    }

}

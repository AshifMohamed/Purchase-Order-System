/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package purchase.order.system.ProcurementStaff;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author Umani Welisara
 */
public class ValidateSupplier {

    public static boolean checkPhone(String phone) {

        if(!(Pattern.matches("^(1\\-)?[0-9]{3}\\-?[0-9]{3}\\-?[0-9]{4}$", phone))){
        
        JOptionPane.showMessageDialog(null, "Please enter a valied phone number","Error",JOptionPane.ERROR_MESSAGE);
        return true;
        }else {
            
            return false;
        }
    }

    public static boolean validateMail(String email) {

        if(!(Pattern.matches("^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$", email))){
        
        JOptionPane.showMessageDialog(null, "Please enter a valied email","Error",JOptionPane.ERROR_MESSAGE);
        return true;
        } else {
            
            return false;
        }

    }

    public static boolean validateName(String name) {
//
//        Pattern pattern = Pattern.compile(new String("^[a-zA-Z\\s]*$"));
//        Matcher matcher = pattern.matcher(name);
//        if (matcher.matches()) {
//            return true;
//            //if pattern matches
//        } else {
//            JOptionPane.showMessageDialog(null, "Invalid Name");
//            return false;
//            //if pattern does not matches
//        }
if(!(Pattern.matches("^[a-zA-Z\\s]*$", name))){
        
        JOptionPane.showMessageDialog(null, "Please enter a valied name","Error",JOptionPane.ERROR_MESSAGE);
        return true;
        } 
else {
//            JOptionPane.showMessageDialog(null, "Invalid Name");
          return false;
//            //if pattern does not matches
//        }
    }
    }
//    public static boolean validateCity(String city) {
//        Pattern pattern = Pattern.compile("[a-zA-Z]+(?:[ '-][a-zA-Z]+)*");
//        Matcher matcher = pattern.matcher(city);
//        if (matcher.matches()) {
//            return true;
//            //if pattern matches
//        } else {
//            JOptionPane.showMessageDialog(null, "Invalid City");
//            return false;
//            //if pattern does not matches
//        }
//
//    }

    public static boolean validatePostalcode(String code) {
//        Pattern pattern = Pattern.compile("^[0-9]{5}(?:-[0-9]{4})?$");
//        Matcher matcher = pattern.matcher(code);
//        if (matcher.matches()) {
//            return true;
//            //if pattern matches
//        } else {
//            JOptionPane.showMessageDialog(null, "Invalid Postal Code");
//            return false;
//            //if pattern does not matches
//        }
 if(!(Pattern.matches("^[0-9]{5}(?:-[0-9]{4})?$", code))){
        
        JOptionPane.showMessageDialog(null, "Please enter a valied postalcode","Error",JOptionPane.ERROR_MESSAGE);
        return true;
        } else {
            
            return false;
        }

    }

}

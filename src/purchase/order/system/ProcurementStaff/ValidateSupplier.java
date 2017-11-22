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
    public static boolean checkPhoneLength(String phone){
        
        if(phone.length()==10){
            return true;
        }else{
            JOptionPane.showMessageDialog(null, "Incorrect Phone Number please Check and Retry");
            return false;
        }
    }
    
    public boolean validateMail(String mail){
    
    Pattern VALID_EMAIL_ADDRESS_REGEX = 
    Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX .matcher(mail);
        if(matcher.find()){
            
            return true;
        }else{
            JOptionPane.showMessageDialog(null, "Invalid Email");
            return false;
        }
                
    }
    
    public boolean validateName(String name){
    
    Pattern pattern = Pattern.compile(new String ("^[a-zA-Z\\s]*$"));
    Matcher matcher = pattern.matcher(name);
    if(matcher.matches())
    {
        return true;
         //if pattern matches
    }
    else
    {
        JOptionPane.showMessageDialog(null, "Invalid Name");
        return false;
         //if pattern does not matches
    }
    }
    
    public boolean validateCity(String city){
        Pattern pattern = Pattern.compile("[a-zA-Z]+(?:[ '-][a-zA-Z]+)*");
    Matcher matcher = pattern.matcher(city);
    if(matcher.matches())
    {
        return true;
         //if pattern matches
    }
    else
    {
        JOptionPane.showMessageDialog(null, "Invalid City");
        return false;
         //if pattern does not matches
    }
        
    }
    
     public boolean validatePostalcode(String code){
        Pattern pattern = Pattern.compile("^[0-9]{5}(?:-[0-9]{4})?$");
    Matcher matcher = pattern.matcher(code);
    if(matcher.matches())
    {
        return true;
         //if pattern matches
    }
    else
    {
        JOptionPane.showMessageDialog(null, "Invalid Postal Code");
        return false;
         //if pattern does not matches
    }
        
    }
    
     
}



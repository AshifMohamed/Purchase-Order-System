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

        if (!(Pattern.matches("^(1\\-)?[0-9]{3}\\-?[0-9]{3}\\-?[0-9]{4}$", phone))) {

            JOptionPane.showMessageDialog(null, "Please enter a valied phone number", "Error", JOptionPane.ERROR_MESSAGE);
            return true;
        } else {

            return false;
        }
    }

    public static boolean validateMail(String email) {

        if (!(Pattern.matches("^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$", email))) {

            JOptionPane.showMessageDialog(null, "Please enter a valied email", "Error", JOptionPane.ERROR_MESSAGE);
            return true;
        } else {

            return false;
        }

    }

    public static boolean validateName(String name) {

        if (!(Pattern.matches("^[a-zA-Z\\s]*$", name))) {

            JOptionPane.showMessageDialog(null, "Please enter a valied name", "Error", JOptionPane.ERROR_MESSAGE);
            return true;
        } else {
//            JOptionPane.showMessageDialog(null, "Invalid Name");
            return false;
//            //if pattern does not matches
//        }
        }
    }

    public static boolean validatePostalcode(String code) {

        if (!(Pattern.matches("^[0-9]{5}(?:-[0-9]{4})?$", code))) {

            JOptionPane.showMessageDialog(null, "Please enter a valied postalcode", "Error", JOptionPane.ERROR_MESSAGE);
            return true;
        } else {

            return false;
        }

    }

}

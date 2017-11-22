/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package purchase.order.system.Public;

import purchase.order.system.SiteManager.*;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author User
 */
public class ButtonRenderer extends JButton implements TableCellRenderer {
    
        private String btnText=null;

        public ButtonRenderer() {
            setOpaque(true);

        }
        public ButtonRenderer(String text) {
            setOpaque(true);
            this.btnText=text;

        }

        public Component getTableCellRendererComponent(JTable table, Object value,
                boolean isSelected, boolean hasFocus, int row, int column) {
            if (isSelected) {
                // setForeground(table.getSelectionForeground());
                //  setBackground(table.getSelectionBackground());
            } else {
                setForeground(table.getForeground());
                setBackground(UIManager.getColor("Button.background"));
                setBackground(Color.GREEN);
            }
            setText(btnText);
            //  setText((value == null) ? "" : value.toString());
            return this;
        }
    }

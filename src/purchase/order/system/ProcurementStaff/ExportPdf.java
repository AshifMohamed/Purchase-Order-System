/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package purchase.order.system.ProcurementStaff;


//import com.itextpdf.kernel.geom.PageSize;
//import com.itextpdf.kernel.pdf.PdfWriter;
import java.awt.Component;
import java.awt.Graphics2D;
import java.io.File;
import java.io.FileOutputStream;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
//import javax.swing.text.Document;
import com.itextpdf.text.Document;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfTemplate;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileOutputStream;
import java.util.Date;


/**
 *
 * @author User
 */
public class ExportPdf {
    
    public void PrintFrameToPDF(File file,JFrame frame) {
    try {
        Document d = new Document() {};
        PdfWriter writer = PdfWriter.getInstance(d, new FileOutputStream(file));
        d.open();

        PdfContentByte cb = writer.getDirectContent();
        PdfTemplate template = cb.createTemplate(PageSize.A4.getWidth(),PageSize.A4.getHeight());
        cb.addTemplate(template, 0, 0);

        Graphics2D g2d = template.createGraphics(PageSize.A4.getWidth(),PageSize.A4.getHeight());
        g2d.scale(0.4, 0.4);

        for(int i=0; i< frame.getContentPane().getComponents().length; i++){
            Component c = frame.getContentPane().getComponent(i);
            if(c instanceof JLabel || c instanceof JScrollPane){
                g2d.translate(c.getBounds().x,c.getBounds().y);
                if(c instanceof JScrollPane){c.setBounds(0,0,(int)PageSize.A4.getWidth()*2,(int)PageSize.A4.getHeight()*2);}
                c.paintAll(g2d);
                c.addNotify();
            }
        }


        g2d.dispose();

        d.close();
        System.out.println("Completed");
    } catch (Exception e) {
        System.out.println("ERROR: " + e.toString());
    }
}
    
}

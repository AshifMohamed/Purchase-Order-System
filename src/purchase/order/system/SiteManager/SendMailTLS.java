/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package purchase.order.system.SiteManager;

import java.util.Date;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author Neruppuda
 */
public class SendMailTLS {

    public static void main(String[] args) {
        SendMailTLS sendMailTLS= new SendMailTLS();
        RequesitionItems requesitionItems= new RequesitionItems();
        sendMailTLS.sendMailToSupplier("surendransudheesan@gmail.com",  requesitionItems);
    }
    final String username = "kavushiraj@gmail.com";
    final String password = "Orange@123";

    public void sendMailToSupplier(String supplierEmail,RequesitionItems requesitionItems) {

        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

        Session session = Session.getInstance(props,
                new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });

        try {

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(username));
            message.setRecipients(Message.RecipientType.TO,
                    InternetAddress.parse(supplierEmail));
            message.setSubject("Damage Alert");
            message.setText(requesitionItems.getDamagedQuantity()+" damaged "+requesitionItems.getItemNo()+" have been returned for Requesition "+requesitionItems.getRewuesitionNo()+" on "+ new Date());

            Transport.send(message);

            System.out.println("Done");

        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }

   
}

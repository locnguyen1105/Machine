/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package action;

import java.util.Date;
import java.util.Map;
import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import org.apache.struts2.interceptor.SessionAware;

/**
 *
 * @author PLH
 */
public class SendMailAction {

    private Map sess;

    private String mail, subject, message;

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMail() {
        return mail;
    }

    public String getSubject() {
        return subject;
    }

    public String getMessage() {
        return message;
    }

    public SendMailAction() {
    }

    public String execute() throws Exception {
        message = mail + " send a mail with the content : " + message;
//        sess.remove("machineList");
//        String to = mail;//change accordingly  
//        String from = "llnforever101@gmail.com";
//        String host = "localhost:1010";
//
//        //Get the session object  
//        Properties properties = System.getProperties();
//        properties.setProperty("smtp.gmail.com",host);
//        Session session = Session.getInstance(properties);
//
//        //compose the message  
//        try {
//            MimeMessage message2 = new MimeMessage(session);
//            message2.setFrom(new InternetAddress(from));
//            message2.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
//            message2.setSubject(name);
//            message2.setText(message);
//            Transport.send(message2);
//            System.out.println("message sent successfully....");
//        } catch (MessagingException mex) {
//            mex.printStackTrace();
//        }
        final String SSL_FACTORY = "javax.net.ssl.SSLSocketFactory";
        // Get a Properties object
        Properties props = System.getProperties();
        props.setProperty("mail.smtp.host", "smtp.gmail.com");
        props.setProperty("mail.smtp.socketFactory.class", SSL_FACTORY);
        props.setProperty("mail.smtp.socketFactory.fallback", "false");
        props.setProperty("mail.smtp.port", "465");
        props.setProperty("mail.smtp.socketFactory.port", "465");
        props.put("mail.smtp.auth", "true");
        props.put("mail.debug", "true");
        props.put("mail.store.protocol", "pop3");
        props.put("mail.transport.protocol", "smtp");
        final String username = "machine199923@gmail.com";//
        final String password = "Okela19999";
        try {
            Session session = Session.getDefaultInstance(props,
                    new Authenticator() {
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(username, password);
                }
            });

            // -- Create a new message --
            Message msg = new MimeMessage(session);

            // -- Set the FROM and TO fields --
            msg.setFrom(new InternetAddress("machine199923@gmail.com"));
            msg.setRecipients(Message.RecipientType.TO,
                    InternetAddress.parse("locnxde130108@fpt.edu.vn", false));
            msg.setSubject(subject);
            msg.setText(message);
            msg.setSentDate(new Date());
            Transport.send(msg);
            System.out.println("Message sent.");
        } catch (MessagingException e) {
            System.out.println("Erreur d'envoi, cause: " + e);
        }

        return "success";
    }

}

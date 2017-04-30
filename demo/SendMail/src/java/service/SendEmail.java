package service;

/**
 *
 * @author Thomas Hartmann - tha@cphbusiness.dk created on Nov 8, 2016
 */
import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;

public class SendEmail {

    public void send(String to, String title, String body) {

        try {

            Properties props = new Properties();
            props.put("mail.smtp.host", "smtp.gmail.com"); // use for gmail: smtp.gmail.com - yahoo: smtp.mail.yahoo.com
            props.put("mail.smtp.auth", "true");
            props.put("mail.debug", "true");
            props.put("mail.smtp.starttls.enable", "true");
            props.put("mail.smtp.port", "465");
            props.put("mail.smtp.socketFactory.port", "465");
            props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
            props.put("mail.smtp.socketFactory.fallback", "false");

            Session mailSession = Session.getInstance(props, new javax.mail.Authenticator() {

                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication("datamatikermail@gmail.com", "datamatikermail123");
                }
            });

            mailSession.setDebug(true); // Enable the debug mode

            Message msg = new MimeMessage(mailSession);

            //--[ Set the FROM, TO, DATE and SUBJECT fields
            msg.setFrom(new InternetAddress("datamatikermail@gmail.com"));
//        msg.setFrom( new InternetAddress( "fromusername@yahoo.com" ) );
            msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
            msg.setSentDate(new Date());
            msg.setSubject(title);

            //--[ Create the body of the mail
            msg.setText(body);

            //--[ Ask the Transport class to send our mail message
            Transport.send(msg);

        } catch (Exception E) {
            System.out.println("Oops something has gone pearshaped!");
            System.out.println(E);
        }
    }
    public static void main(String[] args) {
        SendEmail se = new SendEmail();
        se.send("tha@cphbusiness.dk", "Test fra mit sendmail java program", "Dette er selve mail beskeden");
    }
}

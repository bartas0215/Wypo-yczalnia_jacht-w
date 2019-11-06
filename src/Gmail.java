import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class Gmail {
	public static void sendMail(String recepient) throws Exception {
		System.out.println("Preparing to send email");
		Properties properties = new Properties();

		properties.put("mail.smtp.auth", "true");
		properties.put("mail.smtp.starttls.enable", "true");
		properties.put("mail.smtp.host", "smtp.gmail.com");
		properties.put("mail.smtp.ssl.trust", "smtp.gmail.com");
		properties.put("mail.smtp.port", "587");

		String myAccountEmail = "yachtrentaltest@gmail.com";
		String password = "kukle1995!";

		Session session = Session.getInstance(properties, new Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(myAccountEmail, password);

			}

		});

		Message message = prepareMessage(session, myAccountEmail, recepient);
		Transport.send(message);
		System.out.println("Message sent successfully");

	}

	private static Message prepareMessage(Session session, String myAccountEmail, String recepient) {

		try {
			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress(myAccountEmail));
			message.setRecipient(Message.RecipientType.TO, new InternetAddress());
			message.setSubject("First mail from java");
			message.setText("Thank you for your reservation in MEWA Yacht Renting Program.\r\n" + 
					"Here is few details about us:\r\n" + 
					"+ We are located in Gi¿ycko in EkoMarina, just a few meters from railway station\r\n" + 
					"+ Your reservation starts at 12 p.m.\r\n" + 
					"+ You are obliged to return the boat before 11 a.m\r\n" + 
					"+ You have to make the deposit up to 1500 z³. It will be returned after you finish your renting\r\n" + 
					"+ If any doubts please contact us: mewarenting@gmaix.pl, mobile:333 333 333 ");
			return message;
		} catch (AddressException e) {

			System.out.println("Can't obtain adress");
		} catch (MessagingException e) {

			System.out.println("Can't send the message");
		}

		return null;
	}

public void read1() throws Exception {
	Connection myConn = DriverManager.getConnection("jdbc:mysql://192.168.1.2/Konta", "bartas", "bartas");
	
	  
	   
	   //create statement 
		Statement myStmt=myConn.createStatement();
	   
	   
		ResultSet myRs = myStmt.executeQuery ("select mail from Accounts");
		//Gmail.sendMail(myRs); 


}

}


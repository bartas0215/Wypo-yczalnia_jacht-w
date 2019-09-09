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
		String password = "123malina321";

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
			message.setRecipient(Message.RecipientType.TO, new InternetAddress(recepient));
			message.setSubject("First mail from java");
			message.setText("This is Mewa company");
			return message;
		} catch (AddressException e) {

			System.out.println("Can't obtain adress");
		} catch (MessagingException e) {

			System.out.println("Can't send the message");
		}

		return null;

	}
}


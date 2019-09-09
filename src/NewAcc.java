import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Properties;
import java.util.Scanner;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;



public class NewAcc extends Program {

	private String mail;

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getLog() {
		return log;
	}

	public void setLog(String log) {
		this.log = log;
	}

	public String getPass3() {
		return pass3;
	}

	public void setPass3(String pass3) {
		this.pass3 = pass3;
	}

	public String getPass4() {
		return pass4;
	}

	public void setPass4(String pass4) {
		this.pass4 = pass4;
	}

	private String log;
	private String pass3;
	private String pass4;

	public void la()  {

		HashMap<String, Integer> pass = new HashMap<String, Integer>();
		ArrayList<String> email = new ArrayList<String>();

		Scanner ac = new Scanner(System.in);

		System.out.println("E-mail");
		String mail = ac.nextLine();
		email.add(mail);

		System.out.println("Login");
		String log = ac.nextLine();
		email.add(log);

		System.out.println("Password");
		String pass3 = ac.nextLine();
		System.out.println("Repeat the password");
		String pass4 = ac.nextLine();

		while (pass3.equals(pass4)) {

			System.out.println("Check if your data is correct\n [Email, login ]\n " + email);
			break;
		}
		while (!pass3.equals(pass4)) {
			System.out.println("Password incorrect/nPlease write it again");
			String pass5 = ac.nextLine();
			System.out.println("Repeat the password");
			String pass6 = ac.nextLine();
			if (pass5.equals(pass6)) {
				System.out.println("Check if your data is correct\n [Email, login ]\n " + email);
				break;
			}

		}
		pass.put(pass3, 1);
		pass.put(pass4, 1);

		 //connection to database
		   try {
			Connection myConn = DriverManager.getConnection("jdbc:mysql://192.168.1.2/Konta", "bartas", "bartas");
		
		  
		   
		   //create statement 
			Statement myStmt=myConn.createStatement();
		   
		   String sql = "insert into Accounts" + " (mail, login, password)  values ('"+mail+"','"+ log+"', '"+pass3+"') ";
		  
		   myStmt.executeUpdate(sql);

	}
		   catch (Exception exc) {
			   exc.printStackTrace();
			  }
	
		  
		   
}
	
	

}
	
	


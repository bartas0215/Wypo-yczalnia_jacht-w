import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class SignIn extends Program{
	
	public void read() {
		
		
		Scanner ac = new Scanner(System.in);

		System.out.println("Login");
		String log = ac.nextLine();
		System.out.println("Password");
		String pass3 = ac.nextLine();
		
		
		try {
			Connection myConn = DriverManager.getConnection("jdbc:mysql://192.168.1.2/Konta", "bartas", "bartas");
		
		  
		   
		   //create statement 
			Statement myStmt=myConn.createStatement();
		   
		   
			ResultSet myRs = myStmt.executeQuery ("select login and password from Accounts where login='"+log+"' and password = '"+pass3+"' ");
			
			if(myRs.next()) {
				
				System.out.println("You have singed up to your account");
				
			}
			
			else if (!myRs.next()) {
				System.out.println("Wrong data. Try again");
				System.exit(0);
				
				
			}
		
		
	}
		catch (Exception exc) {
			  System.out.println("Unexpected problem.Please try later");
			  
			  }

}
}

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class NewAcc extends Program {

	void la() {

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

		
	}

}

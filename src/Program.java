import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Program {

	public void file() throws FileNotFoundException {

		String fileName = "New.txt";
		File textfile = new File(fileName);
		Scanner in = new Scanner(textfile);

		while (in.hasNextLine()) {

			String line = in.nextLine();
			System.out.println(line);

		}

	}

	public void set() throws FileNotFoundException {
		Scanner wlas1 = new Scanner(System.in);

		System.out.println("Select the boat class: Szampan, Kokos, Medyk, Lipiec");

		String jacht1 = wlas1.nextLine();
		switch (jacht1) {

		case "Szampan":
		case "szampan":
			Klient ole = new Klient();
			ole.yacht();
			Array ole1 = new Array();
			ole1.mi();
			Program ole2 = new Program();
			ole2.file();
			break;
		case "Kokos":
		case "kokos":

			Kokos flo = new Kokos();
			flo.yacht();
			Array flo1 = new Array();
			flo1.mi();
			Program flo2 = new Program();
			flo2.file();
			break;

		case "Medyk":
		case "medyk":
			Medyk bla = new Medyk();
			bla.yacht();
			Array bla1 = new Array();
			bla1.mi();
			Program bla2 = new Program();
			bla2.file();
			break;

		case "Lipiec":
		case "lipiec":
			Lipiec lipiec = new Lipiec();
			lipiec.yacht();
			Array lipiec1 = new Array();
			lipiec1.mi();
			Program lipiec2 = new Program();
			lipiec2.file();
			break;

		default:
			System.out.println("Start again");
		}

	}

	public static void main(String[] args) throws FileNotFoundException {

		System.out.println("Welcome in MEWA yachting rental reservation system");

		Scanner wlas = new Scanner(System.in);

		System.out.println("Choose option: User lub Client");
		String login1, has³o1;

		String nazwa = wlas.nextLine();
		if (nazwa.equals("User") || nazwa.equals("user")) {
			System.out.println("Login");
			login1 = wlas.nextLine();
			System.out.println("Password");
			has³o1 = wlas.nextLine();
			if (login1.equals("bartas0215") && has³o1.equals("jacht95")) {

				System.out.println(
						"Welcome Bartosz Nowak\nChoose: Boat balance, Account balance, Change account settings");
				String ter = wlas.nextLine();
				switch (ter) {
				case "Boat balance":
				case "boat balance":
					Terminarz kra1 = new Terminarz();
					kra1.mi();
					break;

				case "Account balance":
				case "account balance":
					Stan_konta konto = new Stan_konta();
					System.out.println("Aktualny stan konta" + " " + konto.getBalance());

				case "Change account settings":
				case "change account settings":

				}
			}
		}

		else if (nazwa.equals("Client") || nazwa.equals("client")) {
			System.out.println("Choose option: Sign in or Sign up");
			String jacht2 = wlas.nextLine();
			switch (jacht2) {

			case "Sign in":
			case "sign in":
				SignIn sign =new SignIn();
				sign.read();
				Program ro1 = new Program();
				ro1.set();

				break;

			case "Sign up":
			case "sign up":

				NewAcc acc = new NewAcc();
				acc.la();
				Program ro = new Program();
				ro.set();

				break;
			}

		}

		System.out.println("Thank you for using MEWA yacht rental system");

	}
}

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		System.out.println("Witamy w systemie rezerwacyjnym Wypo¿yczlni Jachtów MEWA");
		
		Scanner wlas = new Scanner(System.in);  
			
			System.out.println("Wybierz sesjê: U¿ytkownik lub Klient");
			String login1, has³o1;
			
		    String nazwa = wlas.nextLine();
			if (nazwa.equals("U¿ytkownik") || nazwa.equals("u¿ytkownik")  ) {
			System.out.println("Podaj login");
			login1=wlas.nextLine();
			System.out.println("Podaj has³o");
			has³o1=wlas.nextLine();
			if(login1.equals("bartas0215") && has³o1.equals("jacht95")) {
				
				System.out.println(
						"Witamy Bartosz Nowak\nOpcje do wyboru: Stan ³odzi, Stan konta, Zmiana ustawieñ konta");
				String ter = wlas.nextLine();
				switch (ter) {
				case "Stan ³odzi":
				case "stan ³odzi":
					Terminarz kra1 = new Terminarz();
					kra1.mi();
					break;

				case "Stan konta":
				case "stan konta":
					Stan_konta konto = new Stan_konta();
					System.out.println("Aktualny stan konta" + " " + konto.getBalance());
					// weekend//
				case "Zmiana ustawien konta" :
				case "zmiana ustawieñ konta" :
				
				}
			}
			}		
					
				else if (nazwa.equals("Klient") || nazwa.equals("klient") ) {
					
				System.out.println("Proszê wybraæ klasê ³odzi: Szampan, Kokos, Medyk, Lipiec");
				String jacht1 = wlas.nextLine();

				switch (jacht1) {

				case "Szampan":
				case "szampan":
					Klient ole = new Klient();
					ole.yacht();
					Array ole1 = new Array();
					ole1.mi();
					break;
				case "Kokos":
				case "kokos":

					Kokos flo = new Kokos();
					flo.yacht();
					Array flo1 = new Array();
					flo1.mi();
					break;

				case "Medyk":
				case "medyk":
					Medyk bla = new Medyk();
					bla.yacht();
					Array bla1 = new Array();
					bla1.mi();
					break;

				case "Lipiec":
				case "lipiec":
					Lipiec lipiec = new Lipiec();
					lipiec.yacht();
					Array lipiec1 = new Array();
					lipiec1.mi();
					break;

				}

				

			
				System.out.println("Urochom program ponownie");
				
			}

		
		System.out.println("Dziêkujemy za skorzytanie z systemu rezerwacyjnego\nWypo¿yczalni jachtów Mewa");

	

}
}

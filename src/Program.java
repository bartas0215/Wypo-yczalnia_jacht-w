import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		System.out.println("Witamy w systemie rezerwacyjnym Wypo¿yczlni Jachtów MEWA");
		
		Scanner wlas = new Scanner(System.in); {
		System.out.println("Wybierz sesjê: U¿ytkownik lub Klient");
		String nazwa = wlas.nextLine(); 
			switch (nazwa) {
			
			case "U¿ytkownik" :  			
				System.out.println("Podaj login");
				String login = wlas.nextLine();
                   			
				switch(login) {

				case "bartas0215" :				
					System.out.println("Podaj has³o");
					String has³o = wlas.nextLine();
				switch(has³o) {
				
				
				     case "jacht95" :	
				          System.out.println("Witamy Bartosz Nowak\nOpcje do wyboru: Stan ³odzi, Stan konta");	
				          String ter = wlas.nextLine();
				          	switch(ter) {
				          		case "Stan ³odzi" :
				          			Terminarz kra1= new Terminarz();
				          			kra1.mi();
				          			break;		     
				    
				          		case  "Stan konta" :
				          			   Stan_konta konto = new Stan_konta();
				          			   System.out.println("Aktualny stan konta"+" " + konto.getBalance() );
				          	         
				          	           
	                                    			          	
				          	}
				     break;
				default :
		            System.out.println("Urochom program ponownie");
					break;
				
				}
				
				break;
				
				default :
		            System.out.println("Urochom program ponownie");
					break;
				
					
				}
			break;
			case "Klient" :
				System.out.println("Proszê wybraæ klasê ³odzi: Szampan, Kokos, Medyk");
				String jacht1 = wlas.nextLine();
				switch(jacht1) {
				//do pracy
				case "Szampan" :
					Klient ole = new Klient();
					ole.szmapan();
					Array ole1 = new Array();
					ole1.mi();
					break;
				case "Kokos" :
					
					Kokos flo = new Kokos();
					flo.kokos();
					Array flo1= new Array();
					flo1.mi();
					break;
					
				case "Medyk" :
					Medyk bla = new Medyk();
					bla.medyk();
					Array bla1= new Array();
					bla1.mi();
		            break;		
				
		            
				}
				
			break;
			
			default :
            System.out.println("Urochom program ponownie");
			break;	
			}
			
			
		
		
		
		
	

}
     System.out.println("Dziêkujemy za skorzytanie z systemu rezerwacyjnego\nWypo¿yczalni jachtów Mewa");
	
	}
}
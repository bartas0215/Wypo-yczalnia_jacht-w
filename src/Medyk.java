import java.util.Scanner;

public class Medyk extends Program  {
     // Cena za jeden dzie�//
     	
	public static final int PI3=1000;
	public static final int MI3=1200;
	
	void yacht() {
	System.out.println("Preferowana d�ugo�� kad�uba: 8 metr�w lub 10 metr�w (Prosz� poda� wy��czenie licz�)" );
	 Scanner szampan1 = new Scanner(System.in); {
		 int dlKad=szampan1.nextInt();
			if(dlKad==8) {
	               System.out.println("Wybierz ilo�� dni");
	               int ilDni =szampan1.nextInt();
	               int cena = ilDni*PI3;
	               System.out.println("Wybierz liczbe os�b - Maksymalnie na �odzi mo�e znajdowa� si� 6 os�b" );
	               int ilOs = szampan1.nextInt();
	               int cena1 = cena/ilOs;
	               System.out.println("Cena na osob� wyniesie " + cena1 );
	
}
			
			       else if(dlKad==10) {
			    	   
			    	   System.out.println("Wybierz ilo�� dni");
		               int ilDni =szampan1.nextInt();
		               int cena = ilDni*MI3;
		               System.out.println("Wybierz liczbe os�b - Maksymalnie na �odzi mo�e znajdowa� si� 6 os�b" );
		               int ilOs = szampan1.nextInt();
		               int cena1 = cena/ilOs;
		               System.out.println("Cena na osob� wyniesie " + cena1 );
			    	   
			    	   
			    	   
			       }
	  		
			
}
	}
}
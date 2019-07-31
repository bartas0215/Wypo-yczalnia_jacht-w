import java.util.Scanner;

public class Kokos extends Program  {
     // Cena za jeden dzieñ//
     	
	public static final int PI2=800;
	public static final int MI2=1000;
	
	void yacht() {
	System.out.println("Preferowana d³ugoœæ kad³uba: 8 metrów lub 10 metrów (Proszê podaæ wy³¹czenie liczê)" );
	 Scanner szampan1 = new Scanner(System.in); {
		 int dlKad=szampan1.nextInt();
			if(dlKad==8) {
	               System.out.println("Wybierz iloœæ dni");
	               int ilDni =szampan1.nextInt();
	               int cena = ilDni*PI2;
	               System.out.println("Wybierz liczbe osób - Maksymalnie na ³odzi mo¿e znajdowaæ siê 6 osób" );
	               int ilOs = szampan1.nextInt();
	               int cena1 = cena/ilOs;
	               System.out.println("Cena na osobê wyniesie " + cena1 );
	
}
			
			       else if(dlKad==10) {
			    	   
			    	   System.out.println("Wybierz iloœæ dni");
		               int ilDni =szampan1.nextInt();
		               int cena = ilDni*MI2;
		               System.out.println("Wybierz liczbe osób - Maksymalnie na ³odzi mo¿e znajdowaæ siê 6 osób" );
		               int ilOs = szampan1.nextInt();
		               int cena1 = cena/ilOs;
		               System.out.println("Cena na osobê wyniesie " + cena1 );
			    	   
			    	   
			    	   
			       }
	  		
			
}
	}
}
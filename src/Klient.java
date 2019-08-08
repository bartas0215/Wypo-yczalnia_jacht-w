import java.util.Scanner;

public class Klient extends Program  {
     // Cena za jeden dzieñ//
     	
	public static final int PI1=600;
	public static final int MI1=800;
	
	void yacht() {
	System.out.println("What's your prefence in hull lenght ?: 8 meters or 10 meters (Write number only)" );
	 Scanner szampan1 = new Scanner(System.in); {
		 int dlKad=szampan1.nextInt();
			if(dlKad==8) {
	               System.out.println("Choose number of days");
	               int ilDni =szampan1.nextInt();
	               int cena = ilDni*PI1;
	               System.out.println("Choose number of people - Remember that our yachts could accomodate up to 6 people" );
	               int ilOs = szampan1.nextInt();
	               int cena1 = cena/ilOs;
	               System.out.println("Price for a single pearson " + cena1 );
	
}
			
			       else if(dlKad==10) {
			    	   
			    	   System.out.println("Choose number of days");
		               int ilDni =szampan1.nextInt();
		               int cena = ilDni*MI1;
		               System.out.println("Choose number of people - Remember that our yachts could accomodate up to 6 people" );
		               int ilOs = szampan1.nextInt();
		               int cena1 = cena/ilOs;
		               System.out.println("Price for a single pearson " + cena1 );
			    	   
			    	   
			    	   
			       }
	  		
			
}
	}
}
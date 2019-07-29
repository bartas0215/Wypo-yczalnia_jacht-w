import java.util.Scanner;

class Klient extends Program {

	private int cena1 = 2000; 
	private int cena2 = cena1+400;
	private int cena3 = cena1*2;
	
	 void szmapan() {
		 
		 System.out.println("Preferowana d³ugoœæ kad³uba: 8 metrów lub 10 metrów (Proszê podaæ wy³¹czenie liczê)" );
		 Scanner szampan1 = new Scanner(System.in); {
			 int dlKad=szampan1.nextInt();
				if(dlKad==8) {
					Ceny szp1 = new Ceny();
					System.out.println("Podaj liczbê dni\nMo¿liwe wybory: 7,9,14 ");
					int liczD = szampan1.nextInt();
					if(liczD==7) {
						System.out.println("Podaj liczbê osób\nMo¿liwe wybory: 2,3,4,5,6 ");
						  int liczZ=szampan1.nextInt();
						  if(liczZ==2) {
							  
							  System.out.println("Cena wyniesie " + cena1  +  "za osobê" );
						  }
						  
						  else if(liczZ==3) {
							  System.out.println("Cena wyniesie " + cena1/3   + "za osobê");
						 
						 		  
					}
					
						else if(liczZ==4) {
							  System.out.println("Cena wyniesie " + cena1/4 + "za osobê");
						  }
						else if(liczZ==5) {
								  System.out.println("Cena wyniesie " + cena1/5 + "za osobê");
						  
						  
					}
						else if(liczZ==6) {
							  System.out.println("Cena wyniesie " + cena1/6 +  "za osobê");
					
					}
					}
					else if(liczD==9) {
						System.out.println("Podaj liczbê osób\nMo¿liwe wybory: 2,3,4,5,6 ");
						  int liczZ=szampan1.nextInt();
						  if(liczZ==2) {
							  System.out.println("Cena wyniesie " + cena2  +  "za osobê" );
						  }
						  
						  else if(liczZ==3) {
							  System.out.println("Cena wyniesie " + cena2/3  +  "za osobê" );
						
						 		  
					}
					
						else if(liczZ==4) {
							  System.out.println("Cena wyniesie " + cena2/4  +  "za osobê" );
						  }
						else if(liczZ==5) {
								  System.out.println("Cena wyniesie " + cena2/5  +  "za osobê" );
						  
						  
					}
						else if(liczZ==6) {
							  System.out.println("Cena wyniesie " + cena2/6  +  "za osobê" );
					
					}
					}
					
					else if(liczD==14) {
						System.out.println("Podaj liczbê osób\nMo¿liwe wybory: 2,3,4,5,6 ");
						  int liczZ=szampan1.nextInt();
						  if(liczZ==2) {
							  System.out.println("Cena wyniesie " + cena3  +  "za osobê" );
						  }
						  
						  else if(liczZ==3) {
							  System.out.println("Cena wyniesie " + cena3/3  +  "za osobê" );
						
						 		  
					}
					
						else if(liczZ==4) {
							  System.out.println("Cena wyniesie " + cena3/4  +  "za osobê" );
						  }
						else if(liczZ==5) {
								  System.out.println("Cena wyniesie " + cena3/5  +  "za osobê" );
						  
						  
					}
						else if(liczZ==6) {
							  System.out.println("Cena wyniesie " + cena3/6  +  "za osobê" );
					
					}
				
		 }
			 
			 
		 }
		 
				else if(dlKad==10) {
					System.out.println("Podaj liczbê dni\nMo¿liwe wybory: 7,9,14 ");
					int liczD = szampan1.nextInt();
					if(liczD==7) {
						System.out.println("Podaj liczbê osób\nMo¿liwe wybory: 2,3,4,5,6 ");
						  int liczZ=szampan1.nextInt();
						  if(liczZ==2) {
							  System.out.println("Cena wyniesie 1500 z³ za osobê");
						  }
						  
						  else if(liczZ==3) {
							  System.out.println("Cena wyniesie 1300 z³ za osobê");
						
						 		  
					}
					
						else if(liczZ==4) {
							  System.out.println("Cena wyniesie 1100 z³ za osobê");
						  }
						else if(liczZ==5) {
								  System.out.println("Cena wyniesie 900 z³ za osobê");
						  
						  
					}
						else if(liczZ==6) {
							  System.out.println("Cena wyniesie 700 z³ za osobê");
					
					}
					}
					else if(liczD==9) {
						System.out.println("Podaj liczbê osób\nMo¿liwe wybory: 2,3,4,5,6 ");
						  int liczZ=szampan1.nextInt();
						  if(liczZ==2) {
							  System.out.println("Cena wyniesie 1500 z³ za osobê");
						  }
						  
						  else if(liczZ==3) {
							  System.out.println("Cena wyniesie 1300 z³ za osobê");
						
						 		  
					}
					
						else if(liczZ==4) {
							  System.out.println("Cena wyniesie 1100 z³ za osobê");
						  }
						else if(liczZ==5) {
								  System.out.println("Cena wyniesie 900 z³ za osobê");
						  
						  
					}
						else if(liczZ==6) {
							  System.out.println("Cena wyniesie 700 z³ za osobê");
					
					}
					}
					
					else if(liczD==14) {
						System.out.println("Podaj liczbê osób\nMo¿liwe wybory: 2,3,4,5,6 ");
						  int liczZ=szampan1.nextInt();
						  if(liczZ==2) {
							  System.out.println("Cena wyniesie 1500 z³ za osobê");
						  }
						  
						  else if(liczZ==3) {
							  System.out.println("Cena wyniesie 1300 z³ za osobê");
						
						 		  
					}
					
						else if(liczZ==4) {
							  System.out.println("Cena wyniesie 1100 z³ za osobê");
						  }
						else if(liczZ==5) {
								  System.out.println("Cena wyniesie 900 z³ za osobê");
						  
						  
					}
						else if(liczZ==6) {
							  System.out.println("Cena wyniesie 700 z³ za osobê");
					
					}
				
		 }
			 
			 
		 }
				
				
	     
		 
		 }
		 
		 }
	 }




import java.util.ArrayList;
import java.util.Scanner;

public class Terminarz extends Program {

	
	
	
	
	private static String name;

    public void setName(String pName)
    {
        name = pName;
    }

    public String getName()
    {

        return name;
    }





void mi() {

Scanner input=new Scanner(System.in); {

ArrayList<Array> players = new ArrayList<Array>();
int il_wyj;

System.out.println("Podaj liczb� wynaj�tych �odzi");
il_wyj = input.nextInt();


for(int i = 0; i < il_wyj; i++)
{
    System.out.print("Klasa wynaj�tej �odzi " + (i + 1) + "?");
    String name = input.next();
    Array plr = new Array();
    plr.setName(name);
    players.add(plr);
      switch (name) {
      
      case "Szampan" :
    	   System.out.println("Pozosta�y dwie �odzie");
    	   
      
      
      }
}
}
}
}


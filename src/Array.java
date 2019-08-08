import java.util.ArrayList;
import java.util.Scanner;

public class Array extends Program {


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
	int il_za³;

	System.out.println("In order to end reservation confirm the number of people (Write number only)");
	il_za³ = input.nextInt();


	for(int i = 0; i < il_za³; i++)
	{
	    System.out.print("Name of participant " + (i + 1) + "?");
	    String name = input.next();
	    Array plr = new Array();
	    plr.setName(name);
	    players.add(plr);
}}
}
}



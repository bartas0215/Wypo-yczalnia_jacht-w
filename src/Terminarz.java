
import java.util.ArrayList;
import java.util.Scanner;

public class Terminarz extends Program {

	private static String name;

	public void setName(String pName) {
		name = pName;
	}

	public String getName() {

		return name;
	}

	void mi() {

		Scanner input = new Scanner(System.in);
		{
			ArrayList<Array> ilwyj2 = new ArrayList<Array>();
			ArrayList<String> cars = new ArrayList<String>();
			cars.add("Szampan");
			cars.add("Kokos");
			cars.add("Medyk");
			cars.add("Lipiec");

			int ilwyj1;

			System.out.println("Write the number of rented boats");

			ilwyj1 = input.nextInt();

			for (int i = 0; i < ilwyj1; i++)

			{
				System.out.print("Rented boat class" + (i + 1) + "?");

				String name = input.next();
				Array plr = new Array();
				plr.setName(name);
				ilwyj2.add(plr);
			}
             //more work//
			if (ilwyj2.equals(cars)) {
				
				cars.remove("Szampan");
			
			}
				System.out.println("Pozosta³e klasy" + cars);
			

		}

	}
}

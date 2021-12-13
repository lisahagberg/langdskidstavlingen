package edu.grupp4b.huvudklass;

import java.util.Scanner;

import edu.grupp4b.anmalan.Anmalan;
import edu.grupp4b.skidakare.SkapaSkidakare;
import edu.grupp4b.tidtagare.Tidtagare;

public class Main {

	public static void main(String[] args) {

		Tidtagare tidtagare = new Tidtagare();
		Anmalan.registrering();
		SkapaSkidakare.Skapa();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("\nAnge startnummer för åkare du vill kontrollera:");
		System.out.print("Val: ");
		scanner.next();
		System.out.println("\n[0] Kolla mellantid\n[1] Registrera målgång");
		System.out.print("Val: ");
		
	    scanner.next();
		
		tidtagare.getTime();
		
		scanner.close();
	}	
}
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
		System.out.print("Stop program? y/n ");
		scanner.next();
		
		tidtagare.getTime();
	}	
}
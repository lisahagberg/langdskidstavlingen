package edu.grupp4b.huvudklass;

import java.util.Scanner;

import edu.grupp4b.skidakare.SkapaSkidakare;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Hello, vänligen välj en tävling");
		System.out.println("[0] Inviduell start\n[1] Masstart\n[2] Jaktstart");
		System.out.print("Val: ");	
		int val = scanner.nextInt();
		if(val == 1) {
			System.out.println("\n[0] 15 sekunder\n[1] 30 sekunder");
			System.out.print("Val: ");
			int mellanrum = scanner.nextInt();
		}
		SkapaSkidakare.Skapa();
		
		
		
		scanner.close();
	}	
}
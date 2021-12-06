package edu.grupp4b.anmalan;

import java.util.Scanner;

public class Anmalan {

	public static void registrering() {
	
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Hello, vänligen välj en tävling");
	System.out.println("[0] Inviduell start\n[1] Masstart\n[2] Jaktstart");
	System.out.print("Val: ");	
	int val = scanner.nextInt();
	if(val == 0) {
		System.out.println("\n[0] 15 sekunder\n[1] 30 sekunder");
		System.out.print("Val: ");
		int mellanrum = scanner.nextInt();
	}
	}
}
	


package edu.grupp4b.anmalan;

import java.util.Scanner;
import edu.grupp4b.tavlingsform.*;
public class Anmalan {

	private IndividuellStart invStart;
	private Jaktstart jStart;
	private Jaktstart mstart;
	
	public void registrering() {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Hello, vänligen välj en tävling");
		System.out.println("[1] Inviduell start");
		System.err.println("\n[2] Masstart\n[3] Jaktstart");
		
		System.out.print("Val: ");
		String val = scanner.next();
		boolean isRunning = true;
		
		while(isRunning) {
			switch(val) {
			case "1" -> {
				System.out.println("[1] 15 sekunder\n[2] 30 sekunder");
				System.out.print("Val: ");
				invStart = new IndividuellStart(scanner.nextInt());
				System.out.println("Tävling med Individuell start med " 
				+ invStart.getAntalSekunder() + " sekunders mellanrum.");
				isRunning = false;
			}
			case "2" -> {
				System.out.println("Tävling med Jaktstart."); 
				//jStart = new Jaktstart();
				isRunning = false;
			}
			case "3" -> {
				System.out.println("Tävling med Masstart.");
				//mStart = new Masstart();
				isRunning = false;
			}
			default -> {
				System.out.print("felaktig inmatning, försök igen: ");
				val = scanner.next();
			}
			}	
		}
	}

	public IndividuellStart getInvStart() {
		return invStart;
	}

	public void setInvStart(IndividuellStart invStart) {
		this.invStart = invStart;
	}

}

package edu.grupp4b.anmalan;
import edu.grupp4b.skidakare.*;
import java.util.Scanner;
import edu.grupp4b.tavlingsform.*;
public class Anmalan {

	public static void registrering() {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Hello, vänligen välj en tävling");
		System.out.println("[1] Inviduell start\n[2] Masstart\n[3] Jaktstart");
		System.out.print("Val: ");
		String val = scanner.next();
		boolean isRunning = true;
		
		while(isRunning) {
			switch(val) {
			case "1" -> {
				System.out.println("[1] 15 sekunder\n[2] 30 sekunder");
				System.out.print("Val: ");
				IndividuellStart is = new IndividuellStart(scanner.nextInt());
				System.out.println("Tävling med Individuell start med " 
				+ is.getAntalSekunder() + " sekunders mellanrum.");
				isRunning = false;
			}
			case "2" -> {
				System.out.println("Tävling med Jaktstart."); 
				//Jaktstart js = new Jaktstart();
				isRunning = false;
			}
			case "3" -> {
				System.out.println("Tävling med Masstart.");
				//Masstart ms = new Masstart();
				isRunning = false;
			}
			default -> {
				System.out.print("felaktig inmatning, försök igen: ");
				val = scanner.next();
			}
			}	
		}
	}
	public IndividuellStart getIs(IndividuellStart is) {
		return is;
		
	}
}

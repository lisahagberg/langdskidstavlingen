package edu.grupp4b.anmalan;

import java.util.Scanner;
import edu.grupp4b.tavlingsform.*;

public class Anmalan {

	private IndividuellStart invStart;

	public void registrering() throws InterruptedException {

		Scanner scanner = new Scanner(System.in);
		//Använder sleep för att sortering med System.out och System.err hamnar i korrekt ordning
		System.out.println("Hello, vänligen välj en tävling");
		System.out.print("[1] Individuell Start");
		Thread.sleep(100);
		System.err.println("\n[2] Masstart\n[3] Jaktstart");
		Thread.sleep(100);
		System.out.print("Val: ");
		String val = scanner.next();
		boolean isRunning = true;

		while (isRunning) {
			switch (val) {
			case "1" -> {
				System.out.println("[1] 15 sekunder\n[2] 30 sekunder");
				System.out.print("Val: ");
				String sek = scanner.next();
				while (!"1".equals(sek) && !"2".equals(sek)) {
					System.err.println("Felaktig inmatning, försök igen: ");
					sek = scanner.next();
				}

				int intSek = Integer.parseInt(sek);

				invStart = new IndividuellStart(intSek);
				System.out.println(
						"Tävling med Individuell start med " + invStart.getAntalSekunder() + " sekunders mellanrum.");
				isRunning = false;
			}
			case "2" -> {
				System.out.println("Tävling med Jaktstart är tyvärr under uppbyggnad");
				System.out.print("Försök igen med ett annat alternativ: ");
				val = scanner.next();
			}
			case "3" -> {
				System.out.println("Tävling med Masstart är tyvärr under uppbyggnad");
				System.out.print("Försök igen med ett annat alternativ: ");
				val = scanner.next();
			}
			default -> {
				System.out.print("Felaktig inmatning, försök igen: ");
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

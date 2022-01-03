package edu.grupp4b.tavling;

import java.util.Scanner;

import edu.grupp4b.anmalan.Anmalan;
import edu.grupp4b.anmalan.Registrering;
import edu.grupp4b.tidtagare.Tidtagare;

public class StartaTavling {

	public static void main(String[] args) throws InterruptedException {
		Tidtagare tidtagare = new Tidtagare();
		Anmalan anmalan = new Anmalan();
		anmalan.registrering();
		Registrering reg = new Registrering();
		reg.startTid(anmalan.getInvStart());

		// Skapar object av målgång
		Malgang mal = new Malgang();

		Scanner scanner = new Scanner(System.in);
		boolean runMenu = true;
		while (runMenu) {
			System.out.println("\n[1] Se skidåkarnas tider\n[2] Registrera målgång\n"
					+ "[3] Se lista över målgång\n[4] System exit");
			System.out.print("Val: ");

			switch (scanner.next()) {
			case "1" -> {
				System.out.println("Tid sedan programmet startade: " + tidtagare);

				reg.printSkidakare();
			}
			case "2" -> {
				System.out.println("\nAnge startnummer för åkare du vill kontrollera:");
				System.out.print("Val: ");
				boolean finnsSkidakare = false;
				try {
					int startnr = scanner.nextInt();
					//Lägger till skidåkare i målgångslista med matchat startnummer och
					//tar bort skidåkare i nuvarande lista över åkande just nu 
					for (int i = 0; i < reg.getSkidakareLista().size(); i++) {
						if (reg.getSkidakareLista().get(i).getStartnummer() == startnr) {
							mal.registreraMal(reg.getSkidakareLista().get(i));
							System.out.println("Målgång registrerad för Skidåkare med " + "startnummer " + startnr);
							reg.getSkidakareLista().remove(reg.getSkidakareLista().get(i));
							finnsSkidakare = true;
							break;
						}
					}

				} catch (Exception ex) {
					scanner.nextLine();
					System.out.println("Felaktig inmatning");
				}
				if (!finnsSkidakare) {
					System.out.println("Skidåkare finns tyvärr inte eller" + "\när redan i mål");
				}
			}
			case "3" -> {
				mal.seMal(); //Printar skidåkare som gått i mål
			}
			case "4" -> {
				System.out.println("Avslutar program");
				System.exit(0);
			}
			default -> {

				System.out.println("Felaktig inmatning");
			}
			}
		}
		scanner.close();

	}

}

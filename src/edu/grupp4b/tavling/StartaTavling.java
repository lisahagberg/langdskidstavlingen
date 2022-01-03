package edu.grupp4b.tavling;

import java.util.Scanner;
import edu.grupp4b.anmalan.Anmalan;
import edu.grupp4b.anmalan.Registrering;
import edu.grupp4b.tidtagare.Tidtagare;

public class StartaTavling {

	public static void main(String[] args) throws InterruptedException {
		Tidtagare tidtagare = new Tidtagare(); //Skapar objekt för tidtagare
		Anmalan anmalan = new Anmalan(); //Skapar objekt för Anmälan
		anmalan.registrering(); 
		Registrering reg = new Registrering(); //Skapar objekt för Registrering
		reg.startTid(anmalan.getInvStart());
		Malgang mal = new Malgang(); // Skapar object av målgång

		Scanner scanner = new Scanner(System.in);
		boolean runMenu = true;
		while (runMenu) {
			System.out.println("\n[1] Se mellantid\n[2] Registrera målgång\n"
					+ "[3] Se lista över målgång\n[4] Avsluta program");
			System.out.print("Val: ");

			switch (scanner.next()) {
			case "1" -> {
				System.out.println("Mellantid: " + tidtagare);
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
							System.out.println("Målgång registrerad för Skidåkare med startnummer " + startnr);
							reg.getSkidakareLista().remove(reg.getSkidakareLista().get(i));
							finnsSkidakare = true;
							break;
						}
					}

				} catch (Exception ex) {
					scanner.nextLine();
					System.err.println("Felaktig inmatning");
				}
				if (!finnsSkidakare) {
					System.err.println("Skidåkare finns tyvärr inte eller har redan gått i mål");
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
				System.err.println("Felaktig inmatning");
			}
			}
		}
		scanner.close();

	}

}

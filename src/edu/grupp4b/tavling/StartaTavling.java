package edu.grupp4b.tavling;

import java.util.Scanner;

import edu.grupp4b.anmalan.Anmalan;
import edu.grupp4b.anmalan.Registrering;
import edu.grupp4b.skidakare.SkapaSkidakare;
import edu.grupp4b.tidtagare.Tidtagare;

public class StartaTavling {

	public static void main(String[] args) throws InterruptedException {
		Tidtagare tidtagare = new Tidtagare();
		//System.out.println("Tid sedan programmet startade: " + tidtagare);
		Anmalan anmalan = new Anmalan();
		anmalan.registrering();
		Registrering reg = new Registrering();
		reg.startTid(anmalan.getInvStart());
//		System.out.println("\n5 skidåkare automatiskt skapade");
//		SkapaSkidakare.printSkidakare();
		// SkapaSkidakare.Skapa();
		
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

//				SkapaSkidakare.printSkidakare();
				reg.printSkidakare();
			}
			case "2" -> {
				System.out.println("\nAnge startnummer för åkare du vill kontrollera:");
				System.out.print("Val: ");
				boolean isFound = false;
				try {
				int startnr = scanner.nextInt();
					
//						for (int i = 0; i < SkapaSkidakare.skidakare.size(); i++) {
//							if (SkapaSkidakare.skidakare.get(i).getStartnummer() == startnr) {
//								mal.registreraMal(SkapaSkidakare.skidakare.get(i));
//								System.out.println("Målgång regisrerad för Skidåkare med "
//										+ "startnummer " + startnr);
//								isFound = true;
//								break;
//							}
//						}
				
				for (int i = 0; i < reg.getSkidakareLista().size(); i++) {
				if (reg.getSkidakareLista().get(i).getStartnummer() == startnr) {
					mal.registreraMal(reg.getSkidakareLista().get(i));
					System.out.println("Målgång regisrerad för Skidåkare med "
							+ "startnummer " + startnr);
					reg.getSkidakareLista().remove(reg.getSkidakareLista().get(i));
					isFound = true;
					break;
				}
			}

				
				
				}catch (Exception ex){
					scanner.nextLine();
					System.out.println("Felaktig inmatning");
				}
				if(!isFound) {
					System.out.println("Skidåkare finns tyvärr inte eller"
							+ "\när redan i mål");						
				}
				}
			case "3" -> {
				mal.seMal();
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

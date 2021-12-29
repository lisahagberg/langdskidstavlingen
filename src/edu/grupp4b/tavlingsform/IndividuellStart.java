package edu.grupp4b.tavlingsform;

public class IndividuellStart {

	private int antalSekunder;

	/**
	 * 
	 * @param antalSekunder - Sekunder på inviduella tävlingen (15 eller 30 sek)
	 */
	
	public IndividuellStart(int antalSekunder) {
		super();
		setAntalSekunder(antalSekunder);
	}

	public int getAntalSekunder() {
		return antalSekunder;
	}

	public void setAntalSekunder(int antalSekunder) {
		if (antalSekunder == 1) {
			this.antalSekunder = 15;
		} else if (antalSekunder == 2) {
			this.antalSekunder = 30;
		} else {
			while (antalSekunder != 1 && antalSekunder != 2) {
				System.out.println("felaktig inmatning, välj [1] eller [2]: ");
			}
		}
	}
}

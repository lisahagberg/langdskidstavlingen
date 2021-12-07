package edu.grupp4b.tavlingsform;

public class IndividuellStart {

	private int antalSekunder;
	

	public IndividuellStart(int antalSekunder) {
		super();
		setAntalSekunder(antalSekunder);
	}

	public int getAntalSekunder() {
		return antalSekunder;
	}

	public void setAntalSekunder(int antalSekunder) {
		//TODO säkerställ att användaren bara kan mata in 1 eller två.
		if(antalSekunder == 1) {
			this.antalSekunder = 15;	
		} else if(antalSekunder == 2) {
			this.antalSekunder = 30;
		} else {
			System.out.println("felaktig inmatning, välj [1] eller [2]: ");
		}
	}
	

	
	
	
	
}

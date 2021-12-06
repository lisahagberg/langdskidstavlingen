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
		if(antalSekunder == 1) {
			this.antalSekunder = 15;	
		} else if(antalSekunder == 2) {
			this.antalSekunder = 30;
		} else {
			System.out.println("felaktig inmatning");
		}
	}
	

	
	
	
	
}

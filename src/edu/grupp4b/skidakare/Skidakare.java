package edu.grupp4b.skidakare;

public class Skidakare {
	
	private String fornamn;
	private String efternamn;
	private String land;
	private String klubb;
	private int akarnummer;
	
	public String getFornamn() {
		return fornamn;
	}
	public void setFornamn(String fornamn) {
		this.fornamn = fornamn;
	}
	public String getEfternamn() {
		return efternamn;
	}
	public void setEfternamn(String efternamn) {
		this.efternamn = efternamn;
	}
	public String getLand() {
		return land;
	}
	public void setLand(String land) {
		this.land = land;
	}
	public String getKlubb() {
		return klubb;
	}
	public void setKlubb(String klubb) {
		this.klubb = klubb;
	}
	public int getAkarnummer() {
		return akarnummer;
	}
	public void setAkarnummer(int akarnummer) {
		this.akarnummer = akarnummer;
	}
	@Override
	public String toString() {
		return "Namn: " + fornamn + efternamn + ", Land: " + land + ", Klubb: " + klubb + ", Åkarnummer: " + akarnummer;
	}
	
}

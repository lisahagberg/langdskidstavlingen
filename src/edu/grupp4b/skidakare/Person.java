package edu.grupp4b.skidakare;

public abstract class Person {

	private String fornamn;
	private String efternamn;

	public Person(String fornamn, String efternamn) {
		super();
		setFornamn(fornamn);
		setEfternamn(efternamn);
	}
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
}

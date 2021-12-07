package edu.grupp4b.tidtagare;

public class Tidtagare {

	private long start = System.nanoTime();    
	private long tim;
	private long min;

	public void getTime() {
		long passeradTid = System.nanoTime() - start;
		double centiseconds = (passeradTid / 1000000);
		centiseconds = centiseconds / 1000;
		if(centiseconds > 59.999) {
			centiseconds = centiseconds % 60;
		}
		min = passeradTid / 60000000000L;
		tim = passeradTid / 3600000000000L;
		
		String micro = String.format("%05.2f", centiseconds);
		micro = micro.replace('.', ':');
		
		System.out.println();
		
		System.out.format("Det tog %02d:%02d:", tim, min);
		System.out.println(micro);
	}

}
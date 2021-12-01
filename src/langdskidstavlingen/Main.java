package langdskidstavlingen;

import edu.grupp4b.random.LottaStartnummer;
import edu.grupp4b.random.RandomTid;

public class Main {

	public static void main(String[] args) {
		//------TEST FÖR RANDOM TID ---------
		RandomTid rt = new RandomTid();
		rt.setRandomTid();
		System.out.println(rt);
		//------TEST FÖR RANDOM TID ---------
		
		
		//------TEST FÖR LOTTA STARTNUMMER ---------
		LottaStartnummer ls = new LottaStartnummer();
		ls.setStartnummer();
		System.out.println(ls);
		//------TEST FÖR LOTTA STARTNUMMER ---------
	}
}
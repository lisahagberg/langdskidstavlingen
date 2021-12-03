package edu.grupp4b.random;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomStartnummer {
	
	private int startnummer;
	
	public void createRandomArrayList() {
		int mySize = 5;		
		List<Integer> myList = new ArrayList<Integer>(mySize);
        for(int i = 1; i <= mySize; i++) {
        	myList.add(i);
        }
        Random rand = new Random();
        //while(myList.size() > 0) {
            int index = rand.nextInt(myList.size());
            //System.out.println("Testar Random: "+myList.remove(index));
            startnummer = myList.remove(index);
        //}
	}
	public int getStartnummer() {
		return startnummer;
	}
}

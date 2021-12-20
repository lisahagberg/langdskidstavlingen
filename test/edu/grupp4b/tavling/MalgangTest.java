package edu.grupp4b.tavling;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class MalgangTest {

	static Malgang mal1;
	static Malgang mal2;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		mal1 = new Malgang();
		mal2 = new Malgang();
	}

	@Test
	void testPlacering() {
		//Om skidåkaren hamnar på plats 1 eller 2 ska metoden retunera ":a" annars ":e"
		assertEquals(":a", mal1.stringPlacering(1));
		assertEquals(":e", mal2.stringPlacering(5));
	}
}

package productTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import vending.product.Chocolate;

class ChocolateTest {

	@Test
	void chocolateGetName() {
		Chocolate c = new Chocolate("Choc", 18.20);
		assertEquals(true, c.getName().equals("Choc"));
	}

	@Test
	void chocolateGetPrice() {
		Chocolate c = new Chocolate("Choc", 18.20);
		assertEquals(18.20, c.getPrice());
	}
	
	@Test
	void chocolateDescription() {
		Chocolate c = new Chocolate("Choc", 18.20);
		assertEquals(true, c.description().equals("name: Choc price: R18,20"));
	}

}

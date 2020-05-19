package productTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import vending.product.SoftDrink;

class SoftDrinkTest {

	@Test
	void softGetName() {
		SoftDrink sd = new SoftDrink("Coke", 15.00);
		assertEquals(true, sd.getName().equals("Coke"));
	}
	
	@Test
	void softGetPrice() {
		SoftDrink sd = new SoftDrink("Coke", 15.00);
		assertEquals(15.00, sd.getPrice());
	}
	
	@Test
	void softGetDescription() {
		SoftDrink sd = new SoftDrink("Coke", 15.00);
		assertEquals(true, sd.description().equals("name: Cokes price: R15.00"));
	}

}
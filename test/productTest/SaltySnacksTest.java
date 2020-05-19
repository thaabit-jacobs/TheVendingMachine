package productTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import vending.product.SaltySnacks;

class SaltySnacksTest {

	@Test
	void saltySnackGetName() {
		SaltySnacks ss = new SaltySnacks("Saltysnack", 25.50);
		assertEquals(true, ss.getName().equals("Saltysnack"));
	}
	
	@Test
	void saltySnackGetPrice() {
		SaltySnacks ss = new SaltySnacks("Saltysnack", 25.50);
		assertEquals(25.50, ss.getPrice());
	}

	@Test
	void saltySnackDescription() {
		SaltySnacks ss = new SaltySnacks("Saltysnack", 25.50);
		assertEquals(true, ss.description().equals("name: Salty price: R20,50"));
	}
}

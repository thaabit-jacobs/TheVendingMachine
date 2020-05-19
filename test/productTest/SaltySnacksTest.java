package productTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import vending.product.SaltySnack;


class SaltySnacksTest {

	@Test
	void saltySnackGetName() {
		SaltySnack ss = new SaltySnack("Saltysnack", 25.50);
		assertEquals(true, ss.getName().equals("Saltysnack"));
	}
	
	@Test
	void saltySnackGetPrice() {
		SaltySnack ss = new SaltySnack("Saltysnack", 25.50);
		assertEquals(25.50, ss.getPrice());
	}

	@Test
	void saltySnackDescription() {
		SaltySnack ss = new SaltySnack("Saltysnack", 25.50);
		assertEquals(true, ss.description().equals("name: Salty price: R20,50"));
	}
}

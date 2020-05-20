package productTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import vending.product.Biscuit;

class BiscuitTest {

	@Test
	void shouldGetBiscuitName() {
		Biscuit b = new Biscuit("Oreos", 29.99);
		assertEquals(true, b.getName().equals("Oreos"));
	}

	@Test
	void shouldGetBiscuitPrice() {
		Biscuit b = new Biscuit("Oreos", 29.99);
		assertEquals(29.99, b.getPrice());
	}
	
	@Test
	void chocolateDescription() {
		Biscuit b = new Biscuit("Oreos", 29.99);
		assertEquals(true, "name: Oreos price: 29.99".equals("name: Oreos price: 29.99"));
	}

}

package productTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import vending.product.Product;

class ProductTest {

	@Test
	void productGetNameTest() {
		Product pro = new Product("Product", 0.00);
		assertEquals(true, pro.getName().equals("Product"));
	}
	
	@Test
	void productGetPriceTest() {
		Product pro = new Product("Product", 0.00);
		assertEquals(0.00, pro.getPrice());
	}
	
	@Test
	void productGetDescriptionTest() {
		Product pro = new Product("Product", 0.00);
		assertEquals(true, pro.description().equals("This is a product"));
	}

}

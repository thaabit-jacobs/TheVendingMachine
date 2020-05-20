package vendingMachineTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import vending.OverloadedVendingMachine;
import vending.product.*;

class OverloadedVendingMachineTest {

	@Test
	void shouldGetSoftDrinkStock() {
		OverloadedVendingMachine olvm = new OverloadedVendingMachine(5, 7, 2);
		assertEquals(5, olvm.getStock(new SoftDrink("", 0.00)));
	}

	@Test
	void shouldGetSaltySnacksStock() {
		OverloadedVendingMachine olvm = new OverloadedVendingMachine(5, 7, 2);
		assertEquals(7, olvm.getStock(new SaltySnack("", 0.00)));
	}

	@Test
	void shouldGetChocolatesStock() {
		OverloadedVendingMachine olvm = new OverloadedVendingMachine(5, 7, 2);
		assertEquals(2, olvm.getStock(new Chocolate("", 0.00)));
	}
	
	@Test
	void shouldGetAllStock() {
		OverloadedVendingMachine olvm = new OverloadedVendingMachine(5, 7, 2);
		assertEquals(14, olvm.getStock());
	}
	
	
	@Test
	void BuySoftDrink() {
		OverloadedVendingMachine olvm = new OverloadedVendingMachine(5, 7, 2);
		SoftDrink sd = new SoftDrink("Soft drink", 15.50);
		olvm.buy(sd);
		assertEquals(4, olvm.getStock(sd));
	}

	@Test
	void BuySaltySnack() {
		OverloadedVendingMachine olvm = new OverloadedVendingMachine(5, 7, 2);
		SaltySnack ss = new SaltySnack("Salty snack", 6.00);
		olvm.buy(ss);
		assertEquals(6, olvm.getStock(ss));
	}

	@Test
	void BuyChocolate() {
		OverloadedVendingMachine olvm = new OverloadedVendingMachine(5, 7, 2);
		Chocolate choc = new Chocolate("Chocolate", 24.99);
		olvm.buy(choc);
		assertEquals(1, olvm.getStock(choc));
	}
	
	@Test
	void BuySoftDrinkWithPorduct() {
		OverloadedVendingMachine olvm = new OverloadedVendingMachine(5, 7, 2);
		Product product = new Product("Product", 0.00);
		olvm.buy(product);
		assertEquals(4, olvm.getStock(new SoftDrink("", 0.00)));
	}
	
	@Test
	void BuySaltySnackWithPorduct() {
		OverloadedVendingMachine olvm = new OverloadedVendingMachine(5, 7, 2);
		Product product = new Product("Product", 0.00);
		olvm.buy(product);
		assertEquals(6, olvm.getStock(new SaltySnack("", 0.00)));
	}
	
	@Test
	void BuyChocolateWithPorduct() {
		OverloadedVendingMachine olvm = new OverloadedVendingMachine(5, 7, 2);
		Product product = new Product("Product", 0.00);
		olvm.buy(product);
		assertEquals(1, olvm.getStock(new Chocolate("", 0.00)));
	}
	
	
	@Test
	void AddStockSoftDrink() {
		OverloadedVendingMachine olvm = new OverloadedVendingMachine(5, 7, 2);
		SoftDrink sd = new SoftDrink("", 0.00); 
		olvm.addStock(sd);
		assertEquals(6, olvm.getStock(sd));
	}
	
	@Test
	void AddStockSaltySnack() {
		OverloadedVendingMachine olvm = new OverloadedVendingMachine(5, 7, 2);
		SaltySnack ss = new SaltySnack("", 0.00); 
		olvm.addStock(ss);
		assertEquals(8, olvm.getStock(ss));
	}
	
	@Test
	void AddStockChocolate() {
		OverloadedVendingMachine olvm = new OverloadedVendingMachine(5, 7, 2);
		Chocolate choc = new Chocolate("", 0.00); 
		olvm.addStock(choc);
		assertEquals(3, olvm.getStock(choc));
	}
	
	@Test
	void AddStockAllProducts() {
		OverloadedVendingMachine olvm = new OverloadedVendingMachine(5, 7, 2);
		Product product = new Product("", 0.00); 
		olvm.addStock(product);
		assertEquals(23, olvm.getStock());
	}

}

package vendingMachineTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import vending.OverloadedVendingMachine;
import vending.product.*;

class OverloadedVendingMachineTest {

	@Test
	void OverloadedVendingMachineGetSoftDrinkQty() {
		OverloadedVendingMachine olvm = new OverloadedVendingMachine(5, 7, 2);
		assertEquals(5, olvm.getSoftDrinkQty());
	}

	@Test
	void OverloadedVendingMachineGetSaltySnacksQty() {
		OverloadedVendingMachine olvm = new OverloadedVendingMachine(5, 7, 2);
		assertEquals(7, olvm.getSaltySnacksQty());
	}

	@Test
	void OverloadedVendingMachineGetChocolatesQty() {
		OverloadedVendingMachine olvm = new OverloadedVendingMachine(5, 7, 2);
		assertEquals(2, olvm.getChocolatesQty());
	}

	@Test
	void OverloadedVendingMachineBuySoftDrink() {
		OverloadedVendingMachine olvm = new OverloadedVendingMachine(5, 7, 2);
		SoftDrink sd = new SoftDrink("Soft drink", 15.50);
		olvm.buy(sd);
		assertEquals(4, olvm.getSoftDrinkQty());
	}

	@Test
	void OverloadedVendingMachineBuySaltySnack() {
		OverloadedVendingMachine olvm = new OverloadedVendingMachine(5, 7, 2);
		SaltySnack ss = new SaltySnack("Salty snack", 6.00);
		olvm.buy(ss);
		assertEquals(6, olvm.getSaltySnacksQty());
	}

	@Test
	void OverloadedVendingMachineBuyChocolate() {
		OverloadedVendingMachine olvm = new OverloadedVendingMachine(5, 7, 2);
		Chocolate choc = new Chocolate("Chocolate", 24.99);
		olvm.buy(choc);
		assertEquals(1, olvm.getChocolatesQty());
	}

	@Test
	void OverloadedVendingMachineBuyProductSoftDrink() {
		OverloadedVendingMachine olvm = new OverloadedVendingMachine(5, 7, 2);
		Product product = new Product("Product", 0.00);
		olvm.buy(product);
		assertEquals(4, olvm.getSoftDrinkQty());
	}
	
	@Test
	void OverloadedVendingMachineBuyProductSaltySnack() {
		OverloadedVendingMachine olvm = new OverloadedVendingMachine(5, 7, 2);
		Product product = new Product("Product", 0.00);
		olvm.buy(product);
		assertEquals(6, olvm.getSaltySnacksQty());
	}
	
	@Test
	void OverloadedVendingMachineBuyProductChocolate() {
		OverloadedVendingMachine olvm = new OverloadedVendingMachine(5, 7, 2);
		Product product = new Product("Product", 0.00);
		olvm.buy(product);
		assertEquals(1, olvm.getChocolatesQty());
	}

}

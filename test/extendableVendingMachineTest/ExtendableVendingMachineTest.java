package extendableVendingMachineTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import vending.ExtendableVendingMachine;
import vending.product.*;

class ExtendableVendingMachineTest {

	@Test
	void shouldGetSoftDrinkStock() {
		ExtendableVendingMachine etvm = new ExtendableVendingMachine(5, 7, 2);
		assertEquals(5, etvm.getStock(new SoftDrink("", 0.00)));
	}
	
	@Test
	void shouldGetSaltySnacksStock() {
		ExtendableVendingMachine etvm = new ExtendableVendingMachine(5, 7, 2);
		assertEquals(7, etvm.getStock(new SaltySnack("", 0.00)));
	}
	
	@Test
	void shouldGetChocolateStock() {
		ExtendableVendingMachine etvm = new ExtendableVendingMachine(5, 7, 2);
		assertEquals(2, etvm.getStock(new Chocolate("", 0.00)));
	}
	
	@Test
	void shouldGetAllStock() {
		ExtendableVendingMachine etvm = new ExtendableVendingMachine(5, 7, 2);
		assertEquals(14, etvm.getStock(new Product("", 0.00)));
	}

}

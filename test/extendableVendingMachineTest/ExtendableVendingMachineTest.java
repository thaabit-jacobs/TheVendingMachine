package extendableVendingMachineTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import vending.extendablevendingmachine.ExtendableVendingMachine;

import vending.product.*;

class ExtendableVendingMachineTest {

	@Test
	void shouldGetSoftDrinkStock() {
		ExtendableVendingMachine etvm = new ExtendableVendingMachine(5, 7, 2, 10);
		assertEquals(5, etvm.getStock(new SoftDrink("", 0.00)));
	}
	
	@Test
	void shouldGetSaltySnacksStock() {
		ExtendableVendingMachine etvm = new ExtendableVendingMachine(5, 7, 2, 10);
		assertEquals(7, etvm.getStock(new SaltySnack("", 0.00)));
	}
	
	@Test
	void shouldGetChocolateStock() {
		ExtendableVendingMachine etvm = new ExtendableVendingMachine(5, 7, 2, 10);
		assertEquals(2, etvm.getStock(new Chocolate("", 0.00)));
	}
	
	@Test
	void shouldGetBiscuitStock() {
		ExtendableVendingMachine etvm = new ExtendableVendingMachine(5, 7, 2, 10);
		assertEquals(10, etvm.getStock(new Biscuit("", 0.00)));
	}
	
	@Test
	void shouldGetAllStock() {
		ExtendableVendingMachine etvm = new ExtendableVendingMachine(5, 7, 2, 10);
		assertEquals(24, etvm.getStock(new Product("", 0.00)));
	}
	
	@Test
	void buySoftDrink() {
		ExtendableVendingMachine etvm = new ExtendableVendingMachine(5, 7, 2, 10);
		Product sd = new SoftDrink("", 0.00);
		etvm.buy(sd);
		assertEquals(4, etvm.getStock(sd));
	}
	
	@Test
	void buySaltySnack() {
		ExtendableVendingMachine etvm = new ExtendableVendingMachine(5, 7, 2, 10);
		Product ss = new SaltySnack("", 0.00); 
		etvm.buy(ss);
		assertEquals(6, etvm.getStock(ss));
	}
	
	@Test
	void buyChocolate() {
		ExtendableVendingMachine etvm = new ExtendableVendingMachine(5, 7, 2, 10);
		Product choc = new Chocolate("", 0.00);
		etvm.buy(choc);
		assertEquals(1, etvm.getStock(choc));
	}
	
	@Test
	void buyBiscuit() {
		ExtendableVendingMachine etvm = new ExtendableVendingMachine(5, 7, 2, 10);
		Product bis = new Biscuit("", 0.00);
		etvm.buy(bis);
		assertEquals(9, etvm.getStock(bis));
	}
	
	@Test
	void buySoftDrinkAnyAmount() {
		ExtendableVendingMachine etvm = new ExtendableVendingMachine(5, 7, 2, 10);
		Product sd = new SoftDrink("", 0.00);
		etvm.buy(sd, 5);
		assertEquals(0, etvm.getStock(sd));
	}
	
	@Test
	void buySaltySnackAnyAmount() {
		ExtendableVendingMachine etvm = new ExtendableVendingMachine(5, 7, 2, 10);
		Product ss = new SaltySnack("", 0.00);
		etvm.buy(ss, 2);
		assertEquals(5, etvm.getStock(ss));
	}
	
	@Test
	void buyChocolateAnyAmount() {
		ExtendableVendingMachine etvm = new ExtendableVendingMachine(5, 7, 2, 10);
		Product choc = new Chocolate("", 0.00);
		etvm.buy(choc, 1);
		assertEquals(1, etvm.getStock(choc));
	}
	
	@Test
	void buyBiscuitAnyAmount() {
		ExtendableVendingMachine etvm = new ExtendableVendingMachine(5, 7, 2, 10);
		Product bis = new Biscuit("", 0.00);
		etvm.buy(bis, 5);
		assertEquals(5, etvm.getStock(bis));
	}

	@Test
	void addStockSoftDrink() {
		ExtendableVendingMachine etvm = new ExtendableVendingMachine(5, 7, 2, 10);
		Product sd = new SoftDrink("", 0.00);
		etvm.addStock(sd);
		assertEquals(8, etvm.getStock(sd));
	}
	
	@Test
	void addStockSaltySnack() {
		ExtendableVendingMachine etvm = new ExtendableVendingMachine(5, 7, 2, 10);
		Product ss = new SaltySnack("", 0.00);
		etvm.addStock(ss);
		assertEquals(10, etvm.getStock(ss));
	}
	
	@Test
	void addStockChoclate() {
		ExtendableVendingMachine etvm = new ExtendableVendingMachine(5, 7, 2, 10);
		Product choc = new Chocolate("", 0.00);
		etvm.addStock(choc);
		assertEquals(5, etvm.getStock(choc));
	}
	
	@Test
	void addStockBiscuit() {
		ExtendableVendingMachine etvm = new ExtendableVendingMachine(5, 7, 2, 10);
		Product bis = new Biscuit("", 0.00);
		etvm.addStock(bis);
		assertEquals(13, etvm.getStock(bis));
	}
	
	@Test
	void addStockSoftdrinkAnyAmount() {
		ExtendableVendingMachine etvm = new ExtendableVendingMachine(5, 7, 2, 10);
		Product sd = new SoftDrink("", 0.00);
		etvm.addStock(sd, 10);
		assertEquals(15, etvm.getStock(sd));
	}
	
	@Test
	void addStockSaltySnacksAnyAmount() {
		ExtendableVendingMachine etvm = new ExtendableVendingMachine(5, 7, 2, 10);
		Product ss = new SaltySnack("", 0.00);
		etvm.addStock(ss, 5);
		assertEquals(12, etvm.getStock(ss));
	}
	
	@Test
	void addStockChocolateAnyAmount() {
		ExtendableVendingMachine etvm = new ExtendableVendingMachine(5, 7, 2, 10);
		Product choc = new Chocolate("", 0.00);
		etvm.addStock(choc, 18);
		assertEquals(20, etvm.getStock(choc));
	}
	
	@Test
	void addStockBiscuitAnyAmount() {
		ExtendableVendingMachine etvm = new ExtendableVendingMachine(5, 7, 2, 10);
		Product bis = new Biscuit("", 0.00);
		etvm.addStock(bis, 5);
		assertEquals(15, etvm.getStock(bis));
	}
}

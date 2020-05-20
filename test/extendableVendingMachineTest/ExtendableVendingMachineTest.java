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
	
	@Test
	void buySoftDrink() {
		ExtendableVendingMachine etvm = new ExtendableVendingMachine(5, 7, 2);
		Product sd = new SoftDrink("", 0.00);
		etvm.buy(sd);
		assertEquals(4, etvm.getStock(sd));
	}
	
	@Test
	void buySaltySnack() {
		ExtendableVendingMachine etvm = new ExtendableVendingMachine(5, 7, 2);
		Product ss = new SaltySnack("", 0.00); 
		etvm.buy(ss);
		assertEquals(6, etvm.getStock(ss));
	}
	
	@Test
	void buyChocolate() {
		ExtendableVendingMachine etvm = new ExtendableVendingMachine(5, 7, 2);
		Product choc = new Chocolate("", 0.00);
		etvm.buy(choc);
		assertEquals(1, etvm.getStock(choc));
	}
	
	@Test
	void buySoftDrinkAnyAmount() {
		ExtendableVendingMachine etvm = new ExtendableVendingMachine(5, 7, 2);
		Product sd = new SoftDrink("", 0.00);
		etvm.buy(sd, 5);
		assertEquals(0, etvm.getStock(sd));
	}
	
	@Test
	void buySaltySnackAnyAmount() {
		ExtendableVendingMachine etvm = new ExtendableVendingMachine(5, 7, 2);
		Product ss = new SaltySnack("", 0.00);
		etvm.buy(ss, 2);
		assertEquals(5, etvm.getStock(ss));
	}
	
	@Test
	void buyChocolateAnyAmount() {
		ExtendableVendingMachine etvm = new ExtendableVendingMachine(5, 7, 2);
		Product choc = new Chocolate("", 0.00);
		etvm.buy(choc, 1);
		assertEquals(1, etvm.getStock(choc));
	}

	@Test
	void addStockSoftDrink() {
		ExtendableVendingMachine etvm = new ExtendableVendingMachine(5, 7, 2);
		Product sd = new SoftDrink("", 0.00);
		etvm.addStock(sd);
		assertEquals(8, etvm.getStock((SoftDrink)sd));
	}
	
	@Test
	void addStockSaltySnack() {
		ExtendableVendingMachine etvm = new ExtendableVendingMachine(5, 7, 2);
		Product ss = new SaltySnack("", 0.00);
		etvm.addStock(ss);
		assertEquals(10, etvm.getStock((SaltySnack)ss));
	}
	
	@Test
	void addStockChoclate() {
		ExtendableVendingMachine etvm = new ExtendableVendingMachine(5, 7, 2);
		Product choc = new Chocolate("", 0.00);
		etvm.addStock(choc);
		assertEquals(5, etvm.getStock((Chocolate)choc));
	}
	
	@Test
	void addStockSoftdrinkAnyAmount() {
		ExtendableVendingMachine etvm = new ExtendableVendingMachine(5, 7, 2);
		Product sd = new SoftDrink("", 0.00);
		etvm.addStock(sd, 10);
		assertEquals(15, etvm.getStock((SoftDrink)sd));
	}
	
	@Test
	void addStockSaltySnacksAnyAmount() {
		ExtendableVendingMachine etvm = new ExtendableVendingMachine(5, 7, 2);
		Product ss = new SaltySnack("", 0.00);
		etvm.addStock(ss, 5);
		assertEquals(12, etvm.getStock((SaltySnack)ss));
	}
	
	@Test
	void addStockChocolateAnyAmount() {
		ExtendableVendingMachine etvm = new ExtendableVendingMachine(5, 7, 2);
		Product choc = new Chocolate("", 0.00);
		etvm.addStock(choc, 18);
		assertEquals(20, etvm.getStock((Chocolate)choc));
	}
}

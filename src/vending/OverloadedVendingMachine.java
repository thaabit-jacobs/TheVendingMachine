package vending;

import vending.product.*;

public class OverloadedVendingMachine {
	
	private int softDrinkQty;
	
	private int saltySnacksQty;
	
	private int chocolatesQty;
	
	public OverloadedVendingMachine(int softDrinkQty, int saltySnacksQty, int chocolatesQty) {
		
		this.softDrinkQty = softDrinkQty;
		
		this.saltySnacksQty = saltySnacksQty;
		
		this.chocolatesQty = chocolatesQty;
		
	}
	
	public int getStock(SoftDrink softDrink) {
		return softDrinkQty;
	}
	
	public int getStock(SaltySnack saltySnack) {
		return saltySnacksQty;
	}
	
	public int getStock(Chocolate chocolate) {
		return chocolatesQty;
	}
	
	public int getStock() {
		return softDrinkQty + saltySnacksQty+ chocolatesQty;
	}
	
	public void buy(SoftDrink softDrink) {
		if(softDrinkQty <= 0) {
			System.out.println("SoftDrink Out of stock");
		} else
			softDrinkQty--;
	}
	
	public void buy(SaltySnack saltySnack) {
		if(saltySnacksQty <= 0) {
			System.out.println("Salty snack Out of stock");
		} else
			saltySnacksQty--;
	}
	
	public void buy(Chocolate chocolate) {
		if(chocolatesQty <= 0) {
			System.out.println("Chocolate Out of stock");
		} else
			chocolatesQty--;
	}
	
	public void buy(Product product) {
		buy(new SoftDrink("", 0.00));
		buy(new SaltySnack("", 0.00));
		buy(new Chocolate("", 0.00));
	}
	
	public void addStock(SoftDrink softDrink) {
		softDrinkQty++;
	}
	
	public void addStock(SaltySnack saltySnack) {
		saltySnacksQty++;
	}

	public void addStock(Chocolate chocolate) {
		chocolatesQty++;
	}

	public void addStock(Product product) {	
		softDrinkQty += 3;
		saltySnacksQty += 3;
		chocolatesQty += 3;
	}
}

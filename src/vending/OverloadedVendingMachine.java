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
	
	public int getSoftDrinkQty() {
		return softDrinkQty;
	}
	
	public int getSaltySnacksQty() {
		return saltySnacksQty;
	}
	
	public int getChocolatesQty() {
		return chocolatesQty;
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
	
}

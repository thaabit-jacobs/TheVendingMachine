package vending;

import vending.product.*;

public class ExtendableVendingMachine {

	private int softDrinkQty;

	private int saltySnacksQty;
	
	private int chocolatesQty;
	
	public ExtendableVendingMachine(int softDrinkQty, int saltySnacksQty, int chocolatesQty){
		
		this.softDrinkQty = softDrinkQty;
		
		this.saltySnacksQty = saltySnacksQty;
		
		this.chocolatesQty = chocolatesQty;
		
	}
	
	public int getStock(Product product) {
		if(product instanceof SoftDrink)
			return softDrinkQty;
		
		else if(product instanceof SaltySnack)
			return saltySnacksQty;
		
		else if(product instanceof Chocolate)
			return chocolatesQty;
		
		else if((Product)product instanceof Product)
			return softDrinkQty + saltySnacksQty + chocolatesQty;
		
		else
			return 0;
	}
	
	public void buy(Product product) {
		if(product instanceof SoftDrink)
			if(softDrinkQty > 0)
				softDrinkQty--;
			else
				System.out.println("SoftDrink out of stock");
		
		if(product instanceof SaltySnack)
			if(saltySnacksQty > 0)
				saltySnacksQty--;
			else
				System.out.println("SaltySnack out of stock");
		
		if(product instanceof Chocolate)
			if(chocolatesQty > 0)
				chocolatesQty--;
			else
				System.out.println("Chocolate out of stock");
	}
	
	public void buy(Product product, int amount) {
		if(product instanceof SoftDrink) {
			if(softDrinkQty == 0)
				System.out.println("SoftDrink out of stock");
			else if(softDrinkQty < amount)
				System.out.println("Only " + softDrinkQty + " in stock");
			else
				softDrinkQty -= amount;	
		}
		
		if(product instanceof SaltySnack) {
			if(saltySnacksQty == 0)
				System.out.println("SaltySnack out of stock");
			else if(saltySnacksQty < amount)
				System.out.println("Only " + saltySnacksQty + " in stock");
			else
				saltySnacksQty -= amount;	
		}
		
		if(product instanceof Chocolate) {
			if(chocolatesQty == 0)
				System.out.println("Chocolates out of stock");
			else if(chocolatesQty < amount)
				System.out.println("Only " + chocolatesQty + " in stock");
			else
				chocolatesQty -= amount;	
		}
	}
	
	public void addStock(Product product) {
		if(product instanceof SoftDrink)
			softDrinkQty += 3;
		
		if(product instanceof SaltySnack)
			saltySnacksQty += 3;
		
		if(product instanceof Chocolate)
			chocolatesQty += 3;
	}
	
	public void addStock(Product product, int amount) {
		if(product instanceof SoftDrink)
			softDrinkQty += amount;
		
		if(product instanceof SaltySnack)
			saltySnacksQty += amount;
		
		if(product instanceof Chocolate)
			chocolatesQty += amount;
	}
	
	public static void main(String[] args) {
		
	}

}

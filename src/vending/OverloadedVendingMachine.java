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
		if(softDrinkQty == 0) {
			System.out.println("SoftDrink Out of stock");
		} else
			softDrinkQty--;
	}
	
	public void buy(SaltySnack saltySnack) {
		if(saltySnacksQty == 0) {
			System.out.println("Salty snack Out of stock");
		} else
			saltySnacksQty--;
	}
	
	public void buy(Chocolate chocolate) {
		if(chocolatesQty == 0) {
			System.out.println("Chocolate Out of stock");
		} else
			chocolatesQty--;
	}
	
	
	
	public void buy(Product product) {
		buy(new SoftDrink("", 0.00));
		buy(new SaltySnack("", 0.00));
		buy(new Chocolate("", 0.00));
	}
	
	public void buy(Product product, int amount) {
		if(product instanceof SoftDrink) {
			if(softDrinkQty == 0) 
				System.out.println("softDrink Out of stock");
			else if(softDrinkQty < amount)
				System.out.println("only " + softDrinkQty + " in stock");
			else
				softDrinkQty -= amount;
			
		} else if(product instanceof SaltySnack) {
			if(saltySnacksQty == 0) 
				System.out.println("saltySnacks Out of stock");
			else if(saltySnacksQty < amount)
				System.out.println("only " + saltySnacksQty + " in stock");
			else
				saltySnacksQty -= amount;
			
		} else if(product instanceof Chocolate) {
			if(chocolatesQty == 0) 
				System.out.println("chocolates Out of stock");
			else if(chocolatesQty < amount)
				System.out.println("only " + chocolatesQty + " in stock");
			else
				chocolatesQty -= amount;
		} 
		
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
	
	public void addStock(Product product, int amount) {
		if(product instanceof SoftDrink)
			softDrinkQty += amount;
		
		else if (product instanceof SaltySnack)
			saltySnacksQty += amount;
		
		else if(product instanceof Chocolate)
			chocolatesQty += amount;
		
	}
	
	public static void main(String[] args) {
		OverloadedVendingMachine olvm = new OverloadedVendingMachine(15, 15, 10);
		Product softdrink = new SoftDrink("softdrink", 12.00);
		Product saltysnack = new SaltySnack("saltysnack", 18.99);
		Product chocolate = new Chocolate("chocolate", 24.50);
		
		System.out.println(softdrink.description());
		System.out.println(saltysnack.description());
		System.out.println(chocolate.description());
		
		olvm.buy((Chocolate)chocolate);
		olvm.buy((SaltySnack)saltysnack);
		olvm.buy(softdrink, 4);
		
		System.out.println(olvm.getStock());
		
		olvm.buy(chocolate, 2);
		olvm.buy((SaltySnack)saltysnack);
		olvm.buy(softdrink, 4);
		
		System.out.println(olvm.getStock((SaltySnack)saltysnack));
		System.out.println(olvm.getStock((SoftDrink)softdrink));
		
		olvm.addStock(softdrink, 5);
		
		olvm.buy((SaltySnack)saltysnack);
		olvm.buy(chocolate, 2);
		olvm.buy(softdrink, 4);
		olvm.buy(saltysnack, 4);
		
		olvm.addStock(softdrink, 3);
		olvm.addStock(saltysnack, 3);
	}
}

package vending.extendablevendingmachine;

import vending.product.*;

public class ExtendableVendingMachine {

	private int softDrinkQty;

	private int saltySnacksQty;
	
	private int chocolatesQty;
	
	private int biscuitQty;
	
	public ExtendableVendingMachine(int softDrinkQty, int saltySnacksQty, int chocolatesQty, int biscuitQty){
		
		this.softDrinkQty = softDrinkQty;
		
		this.saltySnacksQty = saltySnacksQty;
		
		this.chocolatesQty = chocolatesQty;
		
		this.biscuitQty = biscuitQty;
		
	}
	
	public int getStock(Product product) {
		if(product instanceof SoftDrink)
			return softDrinkQty;
		
		else if(product instanceof SaltySnack)
			return saltySnacksQty;
		
		else if(product instanceof Chocolate)
			return chocolatesQty;
		
		else if(product instanceof Biscuit)
			return biscuitQty;
		
		else
			return softDrinkQty + saltySnacksQty + chocolatesQty + biscuitQty;
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
		
		if(product instanceof Biscuit)
			if(biscuitQty > 0)
				biscuitQty--;
			else
				System.out.println("Biscuits out of stock");
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
		
		if(product instanceof Biscuit) {
			if(biscuitQty == 0)
				System.out.println("Bisuits out of stock");
			else if(biscuitQty < amount)
				System.out.println("Only " + biscuitQty + " in stock");
			else
				biscuitQty -= amount;	
		}
	}
	
	public void addStock(Product product) {
		if(product instanceof SoftDrink)
			softDrinkQty += 3;
		
		if(product instanceof SaltySnack)
			saltySnacksQty += 3;
		
		if(product instanceof Chocolate)
			chocolatesQty += 3;
		
		if(product instanceof Biscuit)
			biscuitQty += 3;
	}
	
	public void addStock(Product product, int amount) {
		if(product instanceof SoftDrink)
			softDrinkQty += amount;
		
		if(product instanceof SaltySnack)
			saltySnacksQty += amount;
		
		if(product instanceof Chocolate)
			chocolatesQty += amount;
		
		if(product instanceof Biscuit)
			biscuitQty += amount;
	}
	
	public static void main(String[] args) {
		ExtendableVendingMachine evm = new ExtendableVendingMachine(15, 5, 5, 7);
		Product softdrink = new SoftDrink("Coke", 12.00);
		Product saltysnack = new SaltySnack("Salted peanuts", 18.99);
		Product chocolate = new Chocolate("Catbery", 24.50);
		Product biscuit = new Biscuit("Oreos", 29.99);
		
		System.out.println(softdrink.description());
		System.out.println(saltysnack.description());
		System.out.println(chocolate.description());
		System.out.println(biscuit.description());
		
		evm.buy(saltysnack, 2);
		evm.buy(chocolate);
		evm.buy(softdrink, 4);
		
		evm.buy(biscuit, 5);
		evm.buy(softdrink, 2);
		
		System.out.println(evm.getStock(softdrink));
		System.out.println(evm.getStock(biscuit));
		
		evm.addStock(biscuit);
		evm.addStock(saltysnack, 5);
		evm.addStock(chocolate, 3);
		
		evm.buy(saltysnack, 4);
		
		evm.buy(chocolate, 2);
		evm.buy(softdrink, 4);
		
		evm.buy(softdrink);
		
		evm.addStock(saltysnack);
		evm.addStock(chocolate);
		
		evm.buy(chocolate);
		evm.buy(softdrink);
		
		
	}

}

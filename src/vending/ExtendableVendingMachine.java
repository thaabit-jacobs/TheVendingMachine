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
	
	public static void main(String[] args) {
	}

}

package vending.product;

import java.util.*;

public class SoftDrink extends Product{

	public SoftDrink(String name, double price) {
		
		super(name, price);
		
	}
	
	public String description() {
		Formatter f = new Formatter();
		return f.format("name: %s price: R%.2f", getName(), getPrice()).toString();
	}
}

package vending.product;

import java.util.Formatter;

public class Chocolate extends Product{

	public Chocolate(String name, double price) {
		
		super(name, price);
	}
	
	public String description() {
		Formatter f = new Formatter();
		return f.format("name: %s price: R%.2f", getName(), getPrice()).toString();
	}
}

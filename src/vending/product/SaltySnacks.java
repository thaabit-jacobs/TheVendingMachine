package vending.product;

import java.util.Formatter;

public class SaltySnacks extends Product{

	public SaltySnacks(String name, double price) {
		
		super(name, price);
		
	}
	
	public String description() {
		Formatter f = new Formatter();
		return f.format("name: %s price: R%.2f", getName(), getPrice()).toString();
	}
	
}

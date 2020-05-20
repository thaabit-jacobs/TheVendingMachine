package vending.product;

import java.util.*;

public class Biscuit extends Product{

	public Biscuit(String name, double price) {
		
		super(name, price);
	}
	
	public String description() {
		Formatter f = new Formatter();
		return f.format("name: %s price: R%.2f", getName(), getPrice()).toString();
	}
}

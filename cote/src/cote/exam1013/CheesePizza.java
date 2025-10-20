package cote.exam1013;

public class CheesePizza extends Pizza {
	public CheesePizza() {this("M"); }
	public CheesePizza(String size) {
		this.name = "치즈피자";
		this.size =size;
		this.prices = new int[] {11000, 21000, 40000};
	}
	
	
	
}

package cote.exam1013;

public class PepperoniPizza extends Pizza{ 
	
	public PepperoniPizza() {this("M"); }
	public PepperoniPizza(String size) {
		this.name = "페페로니피자";
		this.size =size;
		this.prices = new int[] {15000, 25000, 50000};
		this.toppings = "peperoni";
	}	
	
	@Override
	public void cook() {
		System.out.println(toppings+"를 추가합니다.");
		super.cook();
	}

}

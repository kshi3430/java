package cote.exam1013;

public class KshPizza extends Pizza {
	
	public KshPizza() {this("M"); }
	public KshPizza(String size) {
		this.name = "ksh피자";
		this.size =size;
		this.prices = new int[] {25000, 35000, 60000};
		this.toppings = "baecon";
	}
	
	@Override
	public void cook() {
		System.out.println(toppings+"를 추가합니다.");
		super.cook();
	}

}

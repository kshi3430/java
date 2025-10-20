package cote.exam1013;

import java.util.Scanner;

public class PizzaExample {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		String size = sc.next();
		sc.close();
		
		Pizza pizza;
		
		if(name.equals("C")) { //Cheesepizza
			pizza = new CheesePizza(size);
		}else if (name.equals("K")) { // Kshpizza
			pizza = new KshPizza(size);
		}else { // Pepperonipizza
			pizza = new PepperoniPizza(size);
		}
		pizza.cook();
		pizza.serve();
	}

}

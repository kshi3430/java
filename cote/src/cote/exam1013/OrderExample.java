package cote.exam1013;

import java.util.Scanner;

public class OrderExample {

	public static void main(String[] args) {
		Menu[] menus = new Menu[3];
		menus[0] = new Menu("과자",1000);
		menus[1] = new Menu("콜라",1500);
		menus[2] = new Menu("라면",3000);
		
		Scanner scanner = new Scanner(System.in);
		
		int orderIndex = scanner.nextInt();
		int quantity = scanner.nextInt();
		scanner.close();
		
		//OrderItem 객체 생성
		if(orderIndex >= 0 && orderIndex < menus.length && quantity > 0) {
			OrderItem item = new OrderItem(menus[2],3);
			System.out.println(item.getPrice());
		}
	}

}

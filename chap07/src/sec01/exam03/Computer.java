package sec01.exam03;

public class Computer extends Calculator {
	
	//메소드 재정의
	@override
	double areaCircle(double r) {
		System.out.println("computer 객체의 areaCirecle() 실행");
		return Math.PI * r * r;
	}
	

}

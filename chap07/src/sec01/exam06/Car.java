package sec01.exam06;

public class Car {
	public class SportsCar extends Car {
		//필
	public int speed;
		// 메소드 - 재정의 가능
	public void speedUp() {
		speed += 1;
		}
		//final 메소드 - 재정의 불가능
	public final void stop() {
		System.out.println("차를 멈춤");
		speed = 0;
		}

}

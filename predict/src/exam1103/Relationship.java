package exam1103;

public class Relationship {
	class Engine {
		void start() {
			System.out.println("엔진이 커졌습니다.");
		}
	}
	class Car{
		Engine engine = new Engine();
		
		void run() {
			engine.start();
			System.out.println("자동차가 달립니다.");
		}
	}
	public class Main{
		public static void main(String[] arg) {
			Car myCar = new Car();
			myCar.run();
		}
	}
}

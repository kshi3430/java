package sec01.exam07.pacakge1.B;

public class B {
	public void method() {
		// 같은 패키지라 protected 멤버에 접근 가능
		A a = new A();
		a.field = "value";
		a.method();
	}
}

package exam1103;

public class Person {
	String name;
	int age;
	
	void introduce() {
		System.out.println("안녕! 나는" + name + "," + age + "살이야");
		
	}
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
}


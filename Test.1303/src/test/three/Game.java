package test.three;

public class Game {
	public static void main(String[] args) {
		Attacker m1 = new Attacker();
		Defender m2 = new Defender();
		
		m1.defense(m2.attack())
		m2.defense(m1.attack())
		
		System.out.pritnln(name);
		System.out.println(hp);
	}

}

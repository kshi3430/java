package test.three;

public class Defender extends AbstractMonster{
	
	
	public Defender(String name, int hp, int attack, int defense) {
		super(name = "Defender", hp = 20, attack = 13, defense =25);
	}
	
	@Override
	public void attack() {
		System.out.println("Defender - Attack");
		return attack;
	}

}
package test.three;

public class Attacker extends AbstractMonster{
	
	public Attacker(String name, int hp, int attack, int defense) {
		super(name = "Attacker", hp = 30, attack = 20, defense =10);
	}
	
	@Override
	public void attack() {
		System.out.println("Attacker - Very Strong Attack");
		return attack;
	}

}

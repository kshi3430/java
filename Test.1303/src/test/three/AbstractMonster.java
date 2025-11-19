package test.three;

public abstract class AbstractMonster {
	protected String name;
	protected int hp;
	protected int attack;
	protected int defense;
	protected String getName() {
		return name;
	}

	
	protected int getHp() {
		return hp;
	}
	protected int getAttack() {
		return attack;
	}
	protected void setAttack(int attack) {
		this.attack = attack;
	}
	protected int getDefence() {
		return defense;
	}
	
	protected AbstractMonster(String name,int hp,int attack,int defense) {
		this.name = name;
		this.hp = hp;
		this.attack = attack;
		this.defense = defense;
	}
	
	public int defense() {
		int finalhp;
		if(defense > attack) {
			finalhp = hp;
		}
		if(defense < attack) {
			return hp - attack;
		}
				
	}
	public abstract void skill() {
		System.out.println('펀치');
		return attack;
	}
}


public class Character {

	String name;
	int health;
	int power;
	String attack1;
	String attack2;
	String attack3;
	int attack1Damage;
	int attack2Damage;
	int attack3Damage;
	boolean isAlive;
	String attack1Message;
	String attack2Message;
	String attack3Message;


	public Character(String name, int health, int power, String attack1, String attack2, String attack3, int attack1Damage,
			int attack2Damage, int attack3Damage, boolean isAlive, String attack1Message, String attack2Message,
			String attack3Message) {
		super();
		this.name = name;
		this.health = health;
		this.power = power;
		this.attack1 = attack1;
		this.attack2 = attack2;
		this.attack3 = attack3;
		this.attack1Damage = attack1Damage;
		this.attack2Damage = attack2Damage;
		this.attack3Damage = attack3Damage;
		this.isAlive = isAlive;
		this.attack1Message = attack1Message;
		this.attack2Message = attack2Message;
		this.attack3Message = attack3Message;
	}


	int attack(int targetHealth, String targetName) {

		int attackDamage = power; // Hard-coded for now.
		String attackMessage = attack1Message; // Hard-coded for now.
		int healthLeft = targetHealth - attackDamage;

		System.out.println(name + " " + attackMessage + " for " + attackDamage + " damage!");
		System.out.println(targetName + " has " + healthLeft + " health left!");
		System.out.println("");

		return healthLeft;
	}

}


public class RogueCraft {

	public static void main(String[] args) {

		Character player = new Character("Player", 100, 10, "Punch", "Wooden Axe", "Diamond Sword", 10, 20, 30, true,
				"punches", "attacks with a wooden axe, chop chop", "gracefully attacks with a Diamond Sword");

		Character enemy1 = new Character("Slime", 30, 5, "Spit", "Bounce", "Explode", 5, 8, 25, true,
				"spits on you", "bounces on top of your head", "explodes");

		// TODO instantiate all enemies and replace them in a common variable reference? Maybe?


		enemy1.health = player.attack(enemy1.health, enemy1.name);
		player.health = enemy1.attack(player.health, player.name);

		MyUtils.displayCharacterStats(player.name, player.health, player.isAlive);

	}

}
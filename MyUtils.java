import java.text.MessageFormat;

public class MyUtils {
	
	public static void displayCharacterStats(String characterName, int characterHealth, boolean isCharacterAlive) {
		
		System.out.println(MessageFormat.format("""
				
				Player stats:
				Name: {0}
				Health: {1}
				Alive: {2}
				""", characterName, characterHealth, isCharacterAlive));
	}

}

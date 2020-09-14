/**
 * This class is a Player decorator representing an armor upgrade to a character.
 * It extends from PlayerDecorator.
 * It implements a constructor as well as the forced methods getPower and toString.
 * @author Jonathan Terry
 *
 */
public class ArmorUpgrade extends PlayerDecorator { 
	private Player player;
	
	/**
	 * A parameterized constructor for the ArmorUpgrade class.
	 * @param player: This parameter is a Player object representing the player
	 * recieving the Armor upgrade
	 */
	public ArmorUpgrade(Player player) {
		this.player = player;
	}
	
	/**
	 * This method returns the toString() method of the attached Player object
	 * concatenated with a notification that the player has upgraded armor
	 * @return String
	 */
	public String toString() {
		return player.toString() + "\nUpgraded armor";
	}
	
	/**
	 * This method returns the attached player's power plus 3
	 * to represent the added power gained from upgrading armor.
	 * @return Double
	 */
	public double getPower() {
		return player.getPower() + 3;
	}

}

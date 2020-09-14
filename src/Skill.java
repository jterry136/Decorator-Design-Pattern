/**
 * This class is a Player decorator representing a skill upgrade to a character.
 * It extends from PlayerDecorator.
 * It implements a constructor as well as the forced methods getPower and toString.
 * @author Jonathan Terry
 *
 */
public class Skill extends PlayerDecorator{
	private Player player;
	
	/**
	 * A parameterized constructor for the Skill class.
	 * @param player: A Player object representing the player
	 * recieving the Skill upgrade
	 */
	public Skill(Player player) {
		this.player = player;
	}
	
	/**
	 * This method returns the attached Player's
	 * toString() method concatenated with a notification that 
	 * the player has gained a skill.
	 * @return String
	 */
	public String toString() {
		return player.toString() + "\nGained a skill";
	}
	
	/**
	 * This method returns the attached Player's power double plus 2
	 * to represent the added power from gaining a skill
	 * @return double
	 */
	public double getPower() {
		return player.getPower() + 2;
	}
}

/**
 * This class is a Player decorator representing a weapon upgrade to a character.
 * It extends from PlayerDecorator.
 * It implements a constructor as well as the forced methods getPower and toString.
 * @author Jonathan Terry
 *
 */
public class WeaponUpgrade extends PlayerDecorator{
	private Player player;
	
	/**
	 * A parameterized constructor for the WeaponUpgrade class.
	 * This creates a new instance of WeaponUpgrade with the following parameters:
	 * @param player: A Player object representing the player receiving the WeaponUpgrade
	 */
	public WeaponUpgrade(Player player) {
		this.player = player;
	}
	
	/**
	 * This method returns the attached Player's toString() method
	 * concatenated with a notification that the player has an Upgraded Weapon
	 * @return String
	 */
	public String toString() {
		return player.toString() + "\nUpgraded weapon";
	}
	
	/**
	 * This method returns the attached Player's power double
	 * plus 5, to represent the added power from an upgraded weapon.
	 * @return double
	 */
	public double getPower() {
		return player.getPower() + 5;
	}

}

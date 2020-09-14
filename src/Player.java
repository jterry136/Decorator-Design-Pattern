/**
 * The Player class is an abstract base class. It holds basic values used by all of its children.
 * It also implements toString() and getPower() methods used by all children.
 * @author Jonathan Terry
 *
 */
public abstract class Player {
	protected String name;
	protected int intellect;
	protected int defense;
	protected int attack;
	protected String weapon;
	protected String armor;
	
	/**
	 * Returns a String value that describes the Weapon and Armor held by the current character
	 * @return String
	 */
	public String toString() {
		return "Carries a " + this.weapon + ", and wears a " + this.armor;
	}
	
	/**
	 * Returns a double value that represents the character's power level, which is calculated
	 * using a simple equation
	 * @return double
	 */
	public double getPower() {
		return (this.attack * 3) + this.defense + (this.intellect / 2); 
	}

}

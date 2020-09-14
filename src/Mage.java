/**
 * The Mage class is a child class of Player. It automatically has the values and methods from the Player class.
 * The Mage class additionally implements a constructor to set its "stats" to a set of predefined values.
 * @author Jonathan Terry
 *
 */
public class Mage extends Player {
	
	/**
	 * A parameterized constructor that creates a new instance of the Mage class. All variables except name
	 * are set to some predefined value
	 * @param name A String used to identify an individual instance of the Mage class
	 */
	public Mage(String name) {
		this.name = name;
		this.intellect = 7;
		this.attack = 3;
		this.defense = 4;
		this.weapon = "Staff";
		this.armor = "Robe";
	}
	
	/**
	 * This toString() method calls the parent's toString(), while also returning a second String
	 * that provides the name of this instance of the Mage class.
	 */
	public String toString() {
		
		return  "Mage: " + this.name + "\n" + super.toString();
	}

}

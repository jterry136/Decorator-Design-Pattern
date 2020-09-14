/**
 * The Warrior class is a child class of Player. It automatically has the values and methods from the Player class.
 * The warrior class additionally implements a constructor to set its "stats" to a set of predefined values.
 * @author Jonathan Terry
 *
 */
public class Warrior extends Player {
	
	/**
	 * A parameterized constructor that creates a new instance of the Warrior class. All variables except name
	 * are set to some predefined value
	 * @param name A String used to identify an individual instance of the Warrior class
	 */
	public Warrior(String name) {
		this.name = name;
		this.intellect = 2;
		this.attack = 8;
		this.defense = 5;
		this.weapon = "Sword";
		this.armor = "Breast Plate";
	}
	
	/**
	 * This toString() method calls the parent's toString() method in addition to returning
	 * a new String that displays the name of this instance of Warrior.
	 * @return String
	 */
	public String toString() {
		
		return  "Warrior: " + this.name + "\n" + super.toString();
	}

}

/**
 * The Healer class is a child class of Player. It automatically has the values and methods 
 * held by Player. In addition, it implements its own constructor as well as a secondary toString() method
 * to identify the name variable.
 * @author Jonathan Terry
 *
 */
public class Healer extends Player {
	
	/**
	 * A parameterized constructor that creates an instance of the Healer class. All values
	 * except for name are set to some predefined value.
	 * @param name A String that uniquely identifies this instance of the Healer class 
	 * with a colloquial name; 
	 */
	public Healer(String name) {
		this.name = name;
		this.intellect = 8;
		this.attack = 2;
		this.defense = 3;
		this.weapon = "Staff";
		this.armor = "Robe";
	}
	
	/**
	 * Calls the toString method of this class's parent. Then returns a String that provides
	 * the name variable value of this instance of the Healer class
	 * @return String
	 */
	public String toString() {
		
		return  "Healer: " + this.name + "\n" + super.toString();
	}

}

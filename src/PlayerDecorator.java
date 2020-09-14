/**
 * The Player decorator class is an abstract base class. It extends from player
 * and is used to force player decorations to implement a toString and getPower method.
 * @author Jonathan Terry
 *
 */
public abstract class PlayerDecorator extends Player{
	public abstract String toString();
	public abstract double getPower();

}

/**
 * This is an interface for talker, or instructor classes that instructs game
 * rules.
 * 
 * @author ChangSu Nam
 * @UNI cn2521
 */
public interface Instructor {
	/**
	 * declares the rule of the game
	 */
	public void declareRule();

	/**
	 *declares the result of the game 
	 */
	public void declareResult(); // declares the result
}

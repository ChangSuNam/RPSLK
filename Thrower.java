/**
 * This is an interface fir the thrower Class, containing core methods.
 * 
 * @author ChangSu Nam
 * @UNI cn2521
 */

public interface Thrower {
	/**
	 * Comptues random move for the computer.
	 * @param max the number of possible moves. 3 if there are r, s, and p to be played.
	 * @return random move for the computer
	 */
	public int getRandomComputerMove(int max); // gets a random move for computer
/**
 * Checks if the input is valid.
 * @param userInput the input of the human player
 * @return
 */
	public boolean isValid(String userInput); // checks if move is valid
/**
 * Returns the human player's move.
 * @return move the player wants to do
 */
	public int getPlayerMove(); // gets a move for human player according to their input.

}

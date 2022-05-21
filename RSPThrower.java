import java.util.Random;
import java.util.Scanner;

/**
 * This is a Thrower Class that contains methods that handle human player's
 * input, it's validity and content, and the computer player's input. It will
 * also compare the two and determine the winner. It implements Thrower
 * interface.
 * 
 * @author ChangSu Nam
 * @UNI cn2521
 */

public class RSPThrower implements Thrower {

	/**
	 * This method gets a random move, either rock, paper, scissors, lizard or
	 * spock, for the computer player.
	 * 
	 * @param max the number of possible moves. In this case, it is 3, since there
	 *            are r, s, and p
	 * @return int value assigned for r, s, and p.
	 * @since Assignment 1- 2.1
	 */
	public int getRandomComputerMove(int max) {
		Random randomizer = new Random();
		int arbitraryNumber = randomizer.nextInt(max) + 1;
		if (arbitraryNumber == 1) {
			System.out.println("Your opponent, computer has chose to play with rock");
			return 1;
		} else if (arbitraryNumber == 2) {
			System.out.println("Your opponent, computer has chose to play with paper");
			return 2;
		} else if (arbitraryNumber == 3) {
			System.out.println("Your opponent, computer has chose to play with scissors");
			return 3;
		}
		System.out.println("wrong random number returned");
		return -1; // wrong random number returned
	}

	/**
	 * This method gets an input of r, s, or p from the user via Scanner, and
	 * assigns rock, scissors, or paper respectively for the human
	 * player. It handles exception that could arise from invalid input.
	 * 
	 * @return int value assigned for r, s, or p.
	 * @since Assignment 1- 2.1
	 */
	public int getPlayerMove() {
		Scanner sc = new Scanner(System.in);
		System.out.println(
				"Please enter r, p, or s to play with rock, paper, or scissors.");
		try {
			String userInput = sc.next();
			if (isValid(userInput)) {
				if (userInput.equals("r")) {
					System.out.println("You chose to play with rock");
					return 1;
				} else if (userInput.equals("p")) {
					System.out.println("You chose to play with paper");
					return 2;
				} else if (userInput.equals("s")) {
					System.out.println("You chose to play with scissors");
					return 3;
				}
				sc.close();
			}
		} catch (

		Exception e) {
			e.printStackTrace();
			System.out.println("Input not inserted correctly, read the instruction again!");
		}
		return -1;
	}

	/**
	 * This method checks if user's input is valid. It checks if it follows the
	 * instruction given to the user, in other words, it checks if the user inserted
	 * r, s, or p correctly.
	 * 
	 * @param userInput the user's input inserted via Scanner.
	 * @return true false value indicating if the input is valid or not.
	 * @since Assignment 1- 2.1
	 */
	public boolean isValid(String userInput) {
		if (userInput.equals("r") || userInput.equals("s") || userInput.equals("p")) {
			System.out.println("Your input is valid, you typed: " + userInput);
			return true;
		}
		System.out.println("Invalid Input, you typed: " + userInput);
		return false;
	}

	/**
	 * This method determines which party, either the computer or human player, has
	 * won the game. It also checks if the game tied. This is achieved by comparing
	 * the inputs of human player and computer with the rubric from scoreRubric
	 * class. After figuring out who won, this method reflects the information to
	 * the ScoreBoard class, which has a static variable "scoreMatrix". This method
	 * handles exception that could arise from invalid input.
	 * 
	 * @param computerInput the move computer is willing to do
	 * @param userInput     the move human player is willing to do
	 * @param rubric        the score rubric that contains references for which move
	 *                      is superior
	 * @since Assignment 1- 2.1
	 */
	public static void determineWinner(int computerInput, int userInput, String[][] rubric) {
		isTie = false; // resets tie flag
		isBadInput = false; // resets invalid input flag
		try {
			if (rubric[computerInput][userInput].equals("0")) {
				System.out.println("It's a tie, play again!");
				isTie = true;// set tie flag as true.

			} else if (rubric[computerInput][userInput].equals("-1")) {
				System.out.println("You, human player, has won!");// announce the winner and update the score to the
																	// score board.
				int currentValue = Integer.parseInt(RSPScoreBoard.scoreMatrix[computerInput][userInput]);
				int updatedValue = currentValue - 1;
				String updatedString = String.valueOf(updatedValue);
				RSPScoreBoard.scoreMatrix[computerInput][userInput] = updatedString;
			} else if (rubric[computerInput][userInput].equals("+1")) {
				System.out.println("Computer has won!");// announce the winner and update the score to the score board.
				int currentValue = Integer.parseInt(RSPScoreBoard.scoreMatrix[computerInput][userInput]);
				int updatedValue = currentValue + 1;
				String updatedString = String.valueOf(updatedValue);
				RSPScoreBoard.scoreMatrix[computerInput][userInput] = updatedString;
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Input not inserted correctly, read the instruction again!");
			isBadInput = true;
		}
	}

	/**
	 * Boolean flags to check if the game tied, or human player's input was invalid.
	 */
	public static boolean isTie = false;
	public static boolean isBadInput = false;

}

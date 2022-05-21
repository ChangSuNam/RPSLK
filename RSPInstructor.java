
/**
 * This is a talker Class that welcomes the user and states the basic rule of the game. It
 * implements instructor interface
 * 
 * @author ChangSu Nam
 * @UNI cn2521
 */
public class RSPInstructor implements Instructor {
	/**
	 * This method declares rule of the game.
	 * @since Assignment 1- 2.1
	 */
	public void declareRule() {
		System.out.println(
				"Welcome to game of RPS. You will play Rock, Paper, Scissors against a java program.");
		System.out.println(
				"Scissors cuts paper, paper covers rock, and rock crushes scissors.");
		System.out.println(
				"You will play 100 rounds, when you are done, you will see the summary of the wins and loses. Good luck!");
	}

	/**
	 * This method declares result of the game.
	 * @since Assignment 1- 2.1
	 */
	public void declareResult() {
		System.out.println(
				"On the table below, the top row reflects the human player, you, and the far left column reflects the computer player.");
		System.out.println("Following is the summary of the game: ");
	}

}

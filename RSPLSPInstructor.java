
/**
 * This is a talker Class that welcomes the user and states the basic rule of the game. It
 * implements instructor interface. This is modified verion for assignment 1 -2.3
 * 
 * @author ChangSu Nam
 * @UNI cn2521
 */
public class RSPLSPInstructor implements Instructor {
	/**
	 * This method declares rule of the game.
	 * @since assignment 1- 2.3
	 */
	public void declareRule() {
		System.out.println(
				"Welcome to game of RPSLSP. You will play Rock, Paper, Scissors, Lizard, Spock against a java program.");
		System.out.println(
				"Scissors cuts paper, paper covers rock, rock crushes lizard, lizard poisons Spock, Spock smashes scissors, scissors decapitates lizard,");

		System.out.println(
				"lizard eats paper, paper disproves Spock, Spock vaporizes rock, and as it always has, rock crushes scissors.");
		System.out.println(
				"You will play 100 rounds, when you are done, you will see the summary of the wins and loses. Good luck!");
	}

	/**
	 * This method declares result of the game.
	 * @since assignment 1- 2.3
	 */
	public void declareResult() {
		System.out.println(
				"On the table below, the top row reflects the human player, you, and the far left column reflects the computer player.");
		System.out.println("Following is the summary of the game: ");
	}

}

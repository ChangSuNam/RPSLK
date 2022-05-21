/**
 * This is a talker Class that welcomes the user and states the basic rule. It
 * implements instructor interface. This is a modified version for assignment 1
 * part 2.2
 * 
 * @author ChangSu Nam
 * @UNI cn2521
 */
public class AIRSPLSPInstructor implements Instructor {
	/**
	 * This method declares rule of the game.
	 */
	public void declareRule() {
		System.out.println(
				"Welcome to game of RPSLSP. You will play Rock, Paper, Scissors, Lizard, Spock against a java program. This is a smarter program so it will hopefully"
				+ " beat you!");
		System.out.println(
				"Scissors cuts paper, paper covers rock, rock crushes lizard, lizard poisons Spock, Spock smashes scissors, scissors decapitates lizard,");

		System.out.println(
				"lizard eats paper, paper disproves Spock, Spock vaporizes rock, and as it always has, rock crushes scissors.");
		System.out.println(
				"You will play 100 rounds, when you are done, you will see the summary of the wins and loses. Good luck!");
		System.out.println("Type r, p, s, l, or sp to play.");
	}


	/**
	 * This method declares result of the game.
	 */
	public void declareResult() {
		System.out.println(
				"On the table below, the top row reflects the human player, you, and the far left column reflects the computer player.");
		System.out.println("Following is the summary of the game: ");
	}

}

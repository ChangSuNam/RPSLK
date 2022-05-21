/**
 * This is a talker Class that welcomes the user and states the basic rule for the game. It
 * implements instructor interface. This is a modified version for assignment 1
 * part 2.2
 * 
 * @author ChangSu Nam
 * @UNI cn2521
 */
public class AIInstructor implements Instructor {
	/**
	 * This method declares rule of the game.
	 */
	public void declareRule() {
		System.out.println(
				"Welcome to game of RSP. You will play Rock Paper, Scissors against a java program. This is a smarter program, so hopefully"
						+ "it will have higher chance beating you!");
		System.out.println(
				"Scissors cuts paper, paper covers rock, rock crushes scissors.");
		System.out.println(
				"You will play 100 rounds, when you are done, you will see the summary of the wins and loses. Good luck!");
		
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

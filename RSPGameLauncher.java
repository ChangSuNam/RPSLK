/**
 * This is the runner class that contains main method for assignment 1 part
 * 2.1. When this main method runs, the instructor object declares rule
 * for the player. For total of 100 rounds, human player will enter an input via
 * console. This is processed by getPlayerMove method in RSPThrower class.
 * Another method named getRandomComputerMove creates a randomized move for the
 * computer. Then determineWinner method in RSPThrower class will compare moves
 * of the human player and computer with rubric from ScoreRubric class. If the
 * human player's input is invalid, or computer and the player both made the
 * same move(i.e a tie), this process will repeat. When a winner is set, the
 * determineWinner method updates this information with currentScoreBoard
 * object. When 100 rounds are over, the instructor object declares the final
 * result of the game, and the player can see the summary of the games created
 * with ScoreBoard Class.
 * 
 * 
 * Question 2.1: 1. Were the initial instructions clear? How could they
 * be improved? The instructions were clear. They could be improved by giving an
 * estimate of how long the total game will be. 2. Did the required interaction
 * at each round proceed smoothly? How could it be improved? Yes, when the input
 * was invalid or there was a tie, the game did not stop with an error. 3. Did
 * the user make any comments of surprise or anger? About what and why? User
 * commented that it is cool that the result is summarized in a table 4. Did the
 * user ask for additional functionality in the user interface or in the system
 * performance? Was this a reasonable request? The user stated that it would be
 * nice to have a GUI. It is reasonable since it will make the game more
 * intuitive for the player, but certainly a hard improvement. 5. What grade (A
 * through F) did the user give the system overall? A
 * 
 * @author ChangSu Nam
 * @UNI cn2521
 */

public class RSPGameLauncher {

	public static void main(String[] args) {
		/**
		 * Objects for instructor, thrower,a rubric and a score board created. score
		 * board is initialized with 3, since 3 moves, r, s, and p are possible
		 * in this version of the game.
		 */
		RSPInstructor currentInstructor = new RSPInstructor();
		RSPThrower currentThrower = new RSPThrower();
		ScoreRubric currentRubric = new ScoreRubric();
		RSPScoreBoard currentScoreBoard = new RSPScoreBoard(3);
		currentInstructor.declareRule(); // rule for the game is declared for the player.

		for (int i = 1; i < 101; i++) {
			System.out.println("Round " + i);
			int tempUserMove = currentThrower.getPlayerMove();// gets human player's move
			int tempComputerMove = currentThrower.getRandomComputerMove(3);// gets computer's move
			RSPThrower.determineWinner(tempComputerMove, tempUserMove, currentRubric.rubric);// determine winner
			while (currentThrower.isTie == true || currentThrower.isBadInput == true) {
				// if ties or input is invalid, repeat until it is not.
				int rematchUserMove = currentThrower.getPlayerMove();
				int rematchComputerMove = currentThrower.getRandomComputerMove(3);
				RSPThrower.determineWinner(rematchComputerMove, rematchUserMove, currentRubric.rubric);
			}

		}
		currentInstructor.declareResult();// result of the game is declared.
		currentScoreBoard.updateTotalScore();
		currentScoreBoard.getScoreMatrix();// the score board is printed out for the player.

	}
}

/**
 * This is the runner class that contains main method for assignment 1 part
 * 2.3. When this main method runs, the RSPLSPinstructor object declares rule
 * for the player. For total of 100 rounds, human player will enter an input via
 * console. This is processed by getPlayerMove method in RSPLSPThrower class.
 * Another method named getRandomComputerMove creates a randomized move for the
 * computer. Then determineWinner method in RSPLSPThrower class will compare moves
 * of the human player and computer with rubric from ScoreRubric class. If the
 * human player's input is invalid, or computer and the player both made the
 * same move(i.e a tie), this process will repeat. When a winner is set, the
 * determineWinner method updates this information with currentScoreBoard
 * object. When 100 rounds are over, the instructor object declares the final
 * result of the game, and the player can see the summary of the games created
 * with ScoreBoard Class.
 * 
 * 
 * Question 2.3: * 1. Were the initial instructions clear? How could they
 * be improved? They were clear. 2. Did the required interaction
 * at each round proceed smoothly? How could it be improved? Yes, no error occurred. 3. Did
 * the user make any comments of surprise or anger? About what and why? The tester did not really comment on it 4. Did the
 * user ask for additional functionality in the user interface or in the system
 * performance? Was this a reasonable request? Maybe make the final result table align more correctly- this is a reasonable request I could work on.
 * 5. What grade (A through F) did the user give the system overall? A.
 * 6.Which strategy did the user find more effective? What reason did they give for saying so? -Strategy 1 because they felt that it was easier to win.
 * 
 * @author ChangSu Nam
 * @UNI cn2521
 */

public class RSPLSPGameLauncher {

	public static void main(String[] args) {
		/**
		 * Objects for instructor, thrower,a rubric and a score board created. score
		 * board is initialized with 5, since 5 moves, r, s, p, l, and sp are possible
		 * in this version of the game.
		 */
		RSPLSPInstructor currentInstructor = new RSPLSPInstructor();
		RSPLSPThrower currentThrower = new RSPLSPThrower();
		ScoreRubric currentRubric = new ScoreRubric();
		RSPLSPScoreBoard currentScoreBoard = new RSPLSPScoreBoard(5);
		currentInstructor.declareRule(); // rule for the game is declared for the player.

		for (int i = 1; i < 101; i++) {
			System.out.println("Round " + i);
			int tempUserMove = currentThrower.getPlayerMove();// gets human player's move
			int tempComputerMove = currentThrower.getRandomComputerMove(5);// gets computer's move
			RSPLSPThrower.determineWinner(tempComputerMove, tempUserMove, currentRubric.rubric);// determine winner
			while (currentThrower.isTie == true || currentThrower.isBadInput == true) {
				// if ties or input is invalid, repeat until it is not.
				int rematchUserMove = currentThrower.getPlayerMove();
				int rematchComputerMove = currentThrower.getRandomComputerMove(5);
				RSPLSPThrower.determineWinner(rematchComputerMove, rematchUserMove, currentRubric.rubric);
			}

		}
		currentInstructor.declareResult();// result of the game is declared.
		currentScoreBoard.updateTotalScore();
		currentScoreBoard.getScoreMatrix();// the score board is printed out for the player.

	}
}

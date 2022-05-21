/**
 * This is the runner class that contains main method for assignment 1 part 2.2.
 * When this main method runs, the AIinstructor object declares rule for the
 * player. For total of 100 rounds, human player will enter an input via
 * console. This is processed by getPlayerMove method in AIThrower class.
 * Another method named getRandomComputerMove creates a randomized move for the
 * computer. According to
 * {@link https://arstechnica.com/science/2014/05/win-at-rock-paper-scissors-by-knowing-thy-opponent/},
 * If a player wins, they are likely to do the same move again, instead of
 * shifting action. So when the computer loses, it will do a move that beats
 * opponent's previous move, as it is likely to be repeated.  Then
 * determineWinner method in AIThrower class will compare moves of the human
 * player and computer with rubric from scoreRubric class. If the human player's
 * input is invalid, or computer and the player both made the same move(i.e a
 * tie), this process will repeat. When a winner is set, the determineWinner
 * method updates this information with currentScoreBoard object. When 100
 * rounds are over, the instructor object declares the final result of the game,
 * and the player can see the summary of the games created with ScoreBoard
 * Class.
 * 
 * 
 * Question 2.2 * 1. Were the initial instructions clear? How could they be
 * improved? It was clear. 2. Did the required interaction at each round proceed
 * smoothly? How could it be improved? Yes, whenever I typed the instructed
 * words, the computer responded. 3. Did the user make any comments of surprise
 * or anger? About what and why? 100 rounds of rock scissors paper is actually
 * longer than I thought 4. Did the user ask for additional functionality in the
 * user interface or in the system performance? Was this a reasonable request?
 * It will be nice if the 2d array displayed at the end was bigger. It is
 * reasonable since it makes it easier to see the result. 5. What grade (A
 * through F) did the user give the system overall? A
 * 
 * 
 * @author ChangSu Nam
 * @UNI cn2521
 */

public class AIGameLauncher {

	public static void main(String[] args) {
		/**
		 * Objects created for instructor, thrower,a rubric and a score board. score
		 * board is initialized with 3 since 3 moves, r, s, and p are possible
		 * in this version of the game.
		 */
		AIInstructor currentInstructor = new AIInstructor();
		AIThrower currentThrower = new AIThrower();
		ScoreRubric currentRubric = new ScoreRubric();
		ScoreBoard currentScoreBoard;
		currentScoreBoard = new RSPScoreBoard(3);

		currentInstructor.declareRule(); // rule for the game is declared for the player.

		for (int i = 1; i < 101; i++) {
			System.out.println("Round " + i);
			int tempUserMove = currentThrower.getPlayerMove();// get human player's move
			int tempComputerMove = currentThrower.getRandomComputerMove(3);// get computer's move
			AIThrower.determineWinner(tempComputerMove, tempUserMove, currentRubric.rubric);// determine winner.
			while (currentThrower.isTie == true || currentThrower.isBadInput == true) {
				// if ties or player's input is invalid, repeat until it is not.
				int rematchUserMove = currentThrower.getPlayerMove();
				int rematchComputerMove = currentThrower.getRandomComputerMove(3);
				AIThrower.determineWinner(rematchComputerMove, rematchUserMove, currentRubric.rubric);
			}
		}

		currentInstructor.declareResult();// result of the game is declared.
		currentScoreBoard.updateTotalScore();
		currentScoreBoard.getScoreMatrix();// the score board is printed out for the player.

	}

}

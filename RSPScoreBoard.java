import java.util.Arrays;

/**
 * This is a class for ScoreBoard that records the score of the game in a 2-D
 * array. Positive numbers indicates wins, and negative numbers indicate loses.
 * Methods in this class create the score board and keep the data up to date.
 * 
 * @author ChangSu Nam
 * @UNI cn2521
 */
public class RSPScoreBoard implements ScoreBoard {

	/**
	 * This constructor creates a score board of 2d arrays, where information of
	 * wins and loses are updated.
	 * 
	 * @param possibleMoves the number of possible moves that each player can do in
	 *                      a game.
	 * @since Assignment 1- 2.1
	 */
	public RSPScoreBoard(int possibleMoves) {
		this.possibleMoves = possibleMoves;
		this.scoreMatrix = new String[possibleMoves + 2][possibleMoves + 2];

		scoreMatrix[0][0] = "none";
		scoreMatrix[0][1] = "Rock";
		scoreMatrix[0][2] = "Paper";
		scoreMatrix[0][3] = "Scissors";
		scoreMatrix[0][scoreMatrix[0].length - 1] = "Total";
		scoreMatrix[1][0] = "   Rock";
		scoreMatrix[2][0] = "  Paper";
		scoreMatrix[3][0] = "Scissors";
		scoreMatrix[scoreMatrix.length - 1][0] = "  Total";

		for (int i = 0; i < scoreMatrix.length; i++) {
			for (int j = 0; j < scoreMatrix[0].length; j++) {
				if (scoreMatrix[i][j] == null) {
					scoreMatrix[i][j] = "0";
				}
			}
		}
	}

	/**
	 * This method prints the scoreBoard.
	 *
	 * @since Assignment 1- 2.1
	 */
	public void getScoreMatrix() {
		System.out.println(Arrays.deepToString(scoreMatrix).replace("], ", "]\n"));
	}

	/**
	 * This method updates the wins and loses to the score board, and summarizes the
	 * game by updating the "total" row and column summarizing the game.
	 * 
	 * @since Assignment 1- 2.1
	 */
	public void updateTotalScore() {

		for (int i = 1; i < RSPScoreBoard.scoreMatrix.length; i++) {
			int currentSum = 0;
			for (int j = 1; j < RSPScoreBoard.scoreMatrix[0].length; j++) {
				int currentValue = Integer.parseInt(RSPScoreBoard.scoreMatrix[i][j]);
				currentSum += currentValue;

				if (j == RSPScoreBoard.scoreMatrix[0].length - 1) {
					String updatedString = String.valueOf(currentSum);
					RSPScoreBoard.scoreMatrix[i][j] = updatedString;
				}
			}
		}

		for (int i = 1; i < RSPScoreBoard.scoreMatrix.length; i++) {
			int currentSum = 0;
			for (int j = 1; j < RSPScoreBoard.scoreMatrix[0].length; j++) {
				int currentValue = Integer.parseInt(RSPScoreBoard.scoreMatrix[j][i]);
				currentSum += currentValue;

				if (j == RSPScoreBoard.scoreMatrix[0].length - 1) {
					String updatedString = String.valueOf(currentSum);
					RSPScoreBoard.scoreMatrix[j][i] = updatedString;
				}
			}
		}

		RSPScoreBoard.scoreMatrix[scoreMatrix.length - 1][scoreMatrix.length - 1] += "/100";

	}

	/**
	 * scoreMatrix is the variable for the score board that contains information of
	 * wins and loses possibleMoves is the number of potential moves a player could
	 * do in a game.
	 */
	public static String[][] scoreMatrix;
	public int possibleMoves; // i.e rock, paper, scissor, lizard or spock
}

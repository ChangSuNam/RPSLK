import java.util.Arrays;

/**
 * This class contains the rubric for the game. It maps out which move beats, or
 * loses to which move. For instance, it shows that "rock" will beat "scissors",
 * but lose to "paper"
 * 
 * @author ChangSu Nam
 * @UNI cn2521
 */
public class ScoreRubric {
	/**
	 * This is a constructor that creates score rubric for the game.
	 * 
	 * @since Assignment 1- 2.3
	 */
	public ScoreRubric() {

		ScoreRubric.rubric[0][0] = "none";
		ScoreRubric.rubric[0][1] = "Rock";
		ScoreRubric.rubric[0][2] = "Paper";
		ScoreRubric.rubric[0][3] = "Scissors";
		ScoreRubric.rubric[0][4] = "Lizard";
		ScoreRubric.rubric[0][5] = "Spock";
		ScoreRubric.rubric[1][0] = "    Rock";
		ScoreRubric.rubric[1][2] = "-1";
		ScoreRubric.rubric[1][3] = "+1";
		ScoreRubric.rubric[1][4] = "+1";
		ScoreRubric.rubric[1][5] = "-1";
		ScoreRubric.rubric[2][0] = "   Paper";
		ScoreRubric.rubric[2][1] = "+1";
		ScoreRubric.rubric[2][3] = "-1";
		ScoreRubric.rubric[2][4] = "-1";
		ScoreRubric.rubric[2][5] = "+1";
		ScoreRubric.rubric[3][0] = "Scissors";
		ScoreRubric.rubric[3][1] = "-1";
		ScoreRubric.rubric[3][2] = "+1";
		ScoreRubric.rubric[3][4] = "+1";
		ScoreRubric.rubric[3][5] = "-1";
		ScoreRubric.rubric[4][0] = " Lizard";
		ScoreRubric.rubric[4][1] = "-1";
		ScoreRubric.rubric[4][2] = "+1";
		ScoreRubric.rubric[4][3] = "-1";
		ScoreRubric.rubric[4][5] = "+1";
		ScoreRubric.rubric[5][0] = "  Spock";
		ScoreRubric.rubric[5][1] = "+1";
		ScoreRubric.rubric[5][2] = "-1";
		ScoreRubric.rubric[5][3] = "+1";
		ScoreRubric.rubric[5][4] = "-1";

		for (int i = 1; i < rubric.length; i++) {
			ScoreRubric.rubric[i][i] = "0";
		}
	}

	/**
	 * This method prints out the score rubric.
	 * 
	 * @since Assignment 1- 2.1
	 */
	public void getScoreRubric() {
		System.out.println(Arrays.deepToString(rubric).replace("], ", "]\n"));
	}

	/**
	 * rubric is the variable to refer to when determining which move beats another.
	 * +1 Indicates win, -1 indicates lose, and 0 indicates tie.
	 */
	public static String[][] rubric = new String[6][6];

}

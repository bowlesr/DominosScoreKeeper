/*
 * ---------------------------------------------------------------------------
 * File name: PlayerOne.java
 * Project name: DominosScoreKeeper
 * ---------------------------------------------------------------------------
 * Creator's name and email: Matt Harrison, harrisonms1@etsu.edu
 * Course:  CSCI 1260
 * Creation Date: 5/9/2019
 * ---------------------------------------------------------------------------
 */
// DONT NEED ANY OF THESE
import java.util.Scanner;

public class PlayerOne
{
	private Scanner kb = new Scanner(System.in);
	private String playerOneName;
	private int score = 0;

	public PlayerOne()
	{

	}

	public PlayerOne(String playerOneName)
	{
		this.playerOneName = playerOneName;
	}

	public String getPlayerOneName ( )
	{

		return playerOneName;
	}

	public void setPlayerOneName ()
	{
		this.playerOneName = kb.nextLine();
	}

	public int getScore ( )
	{
		return score;
	}

	public int addScore()
	{
		score += kb.nextInt();
		return score;
	}

	@Override
	public String toString ( )
	{
		String msg ="";

			msg+= "\nPlayer Name: " + playerOneName;
			msg+= "\nScore:       " + getScore() + "\n";

		return msg;
	}
}

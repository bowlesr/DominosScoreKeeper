/*
 * ---------------------------------------------------------------------------
 * File name: PlayerThree.java
 * Project name: DominosScoreKeeper
 * ---------------------------------------------------------------------------
 * Creator's name and email: Matt Harrison, harrisonms1@etsu.edu
 * Course:  CSCI 1260
 * Creation Date: 5/10/2019
 * ---------------------------------------------------------------------------
 */
// DONT NEED ANY OF THESE
import java.util.Scanner;

public class PlayerThree
{
	private Scanner kb = new Scanner(System.in);
	private String playerThreeName;
	private int score = 0;

	public PlayerThree()
	{

	}

	public PlayerThree(String playThreeName)
	{
		this.playerThreeName = playThreeName;
	}

	public String getPlayerThreeName ( )
	{

		return playerThreeName;
	}

	public void setPlayerThreeName ()
	{
		this.playerThreeName = kb.nextLine();
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

		msg+= "\nPlayer Name: " + playerThreeName;
		msg+= "\nScore:       " + getScore() + "\n";

		return msg;
	}

}

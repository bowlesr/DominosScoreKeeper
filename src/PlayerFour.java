/*
 * ---------------------------------------------------------------------------
 * File name: PlayerFour.java
 * Project name: DominosScoreKeeper
 * ---------------------------------------------------------------------------
 * Creator's name and email: Matt Harrison, harrisonms1@etsu.edu
 * Course:  CSCI 1260
 * Creation Date: 5/10/2019
 * ---------------------------------------------------------------------------
 */
// DONT NEED ANY OF THESE
import java.util.Scanner;

public class PlayerFour
{
	private Scanner kb = new Scanner(System.in);
	private String playerFourName;
	private int score = 0;

	public PlayerFour()
	{

	}

	public PlayerFour(String playerFourName)
	{
		this.playerFourName = playerFourName;
	}

	public String getPlayerFourName ( )
	{

		return playerFourName;
	}

	public void setPlayerFourName ()
	{
		this.playerFourName = kb.nextLine();
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

		msg+= "\nPlayer Name: " + playerFourName;
		msg+= "\nScore:       " + getScore() + "\n";

		return msg;
	}

}

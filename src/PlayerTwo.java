/*
 * ---------------------------------------------------------------------------
 * File name: PlayerTwo.java
 * Project name: DominosScoreKeeper
 * ---------------------------------------------------------------------------
 * Creator's name and email: Matt Harrison, harrisonms1@etsu.edu
 * Course:  CSCI 1260
 * Creation Date: 5/9/2019
 * ---------------------------------------------------------------------------
 */
// DONT NEED ANY OF THESE
import java.util.Scanner;

public class PlayerTwo
{
	private Scanner kb = new Scanner(System.in);
	private String playerTwoName;
	private int score = 0;

	public PlayerTwo()
	{

	}

	public PlayerTwo(String playerTwoName)
	{
		this.playerTwoName = playerTwoName;
	}

	public String getPlayerTwoName ( )
	{

		return playerTwoName;
	}

	public void setPlayerTwoName ()
	{
		this.playerTwoName = kb.nextLine();
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

		msg+= "\nPlayer Name: " + playerTwoName;
		msg+= "\nScore:       " + getScore() + "\n";

		return msg;
	}

}

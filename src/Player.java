/*
 * ---------------------------------------------------------------------------
 * File name: Player.java
 * Project name: DominosScoreKeeper
 * ---------------------------------------------------------------------------
 * Creator's name and email: Matt Harrison, harrisonms1@etsu.edu
 * Course:  CSCI 1260
 * Creation Date: 5/10/2019
 * ---------------------------------------------------------------------------
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Player
{
	// TODO: implement the Player class AND use an array to make multiple playerNames!!!!



	private ArrayList<Player> player = new ArrayList<>();

	private static Scanner kb = new Scanner(System.in);
	private String playerName;
	private int score = 0;
	private String response;

	public void addPlayer(String playerName) //working on the array thing  counter .length of the array/arraylist
	{
		player.add(new Player());
	}

	public Player()
	{

	}

	public String getPlayerName ( )
	{

		return playerName;
	}

	public void setPlayerName ()
	{
		this.playerName = kb.nextLine();
	}

	public int getScore ( )
	{
		return score;
	}

	public void setScore (int score)
	{
		this.score = score;
	}

	public int addScore()
	{
		score += kb.nextInt();
		return score;
	}

			// add in domino method
	public static String domino()
	{
		String domino = kb.nextLine();
		return domino;
	}


	public static String  WantToPlayAgain()
	{
		String response = kb.nextLine();
		return response;
	}

	@Override
	public String toString ( )
	{
		String msg ="";

		msg+= "\nPlayer Name: " + playerName;
		msg+= "\nScore:       " + getScore() + "\n";

		return msg;
	}
}



public class Main
{

    public static void main(String[] args)
    {

        // randomize player order by who has the double six or highest domino,
        // winner that domino's goes first next round,
        // add in the points for domino and complete the round past the 250 until the domino,
        // rules (display them), double six or nine

            Player playerOne = new Player( );
            Player playerTwo = new Player( );
            //Player playerThree = new Player();

            System.out.print("\nPlayer One... Please enter your name: ");
            playerOne.setPlayerName( );
            System.out.print("\nPlayer Two... Please enter your name: ");
            playerTwo.setPlayerName( );

        do
        {
            // do-while loop for domino do while statement afterwords for continuing game
            /*String domino = Player.domino();
            while (domino.toUpperCase().charAt(0) == 'D')
            {

            }*/

                while ((playerOne.getScore( ) <= 250) && (playerTwo.getScore( ) <= 250))
                {
                    System.out.print("\nHow many points did you score this round " + playerOne
                            .getPlayerName( ) + "?" + "\n");
                    playerOne.addScore( );

                    System.out.print("How many points did you score this round " + playerTwo
                            .getPlayerName( ) + "?" + "\n");
                    playerTwo.addScore( );

                    System.out.println("Did either player Domino? ");

                    Player.domino( );
                    if (Player.domino( ).toUpperCase( ).charAt(0) == 'Y')
                    {
                        System.out.println(playerOne.getPlayerName( ) + " or " + playerTwo.getPlayerName( ));
                        String name = Player.domino( );
                        if (name.equals(playerOne.getPlayerName( )))
                        {
                            System.out.println("How many points do you get? ");
                            playerOne.addScore( );

                        }
                        else if (name.equals(playerTwo.getPlayerName( )))
                        {
                            System.out.println("How many points do you get? ");
                            playerTwo.addScore( );

                        }
                        else if (false)
                        {
                            break;
                        }
                    }

                    System.out.println("\nThe Current score is: \n" + playerOne.toString( ) + playerTwo.toString( ));
                }

            System.out.println("game over\n");

            if (playerOne.getScore( ) > playerTwo.getScore( ))
            {
                System.out.println("Congratulations " + playerOne.getPlayerName( ) + " Wins");
            }
            else if (playerTwo.getScore( ) > playerOne.getScore( ))
            {
                System.out.println("Congratulations " + playerTwo.getPlayerName( ) + " Wins");
            }
            else
            {
                System.out.println("Its a Tie.......\n" );
            }
            System.out.println("Would You like to play Again?");
            String playAgain = Player.WantToPlayAgain( );

            /*switch (playAgain.charAt(0))
            {
                case 'Y':
                    System.out.println("Sweet, lets play again\n");
                    playerOne.setScore(0);
                    playerTwo.setScore(0);
                    break;
                case 'N':
                    System.out.println("OK, have a good day");
                    System.exit(0);
                    break;
                default:
                    System.out.println("invalid entry, Please try again!!!");
                    Player.WantToPlayAgain( );
                    break;
            }*/


            if (playAgain.toUpperCase( ).charAt(0) == 'Y')
            {
                System.out.println("Sweet, lets play again\n");
                playerOne.setScore(0);
                playerTwo.setScore(0);
            }
            else if (playAgain.toUpperCase( ).charAt(0) == 'N')
            {
                System.out.println("OK, have a good day");
                System.exit(0);
            }
            else
            {
                System.out.println("invalid entry, Please try again!!!");
                Player.WantToPlayAgain( );
            }
        }while (true);

    }
}

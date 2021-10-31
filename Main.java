
import java.util.Scanner;
import static java.lang.System.*;

public class Main
{
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		char response;
		do{
      String player = "";
      System.out.println("Rock-Paper-Scissors - pick your weapon[R,P,S] :: ");
      player = keyboard.nextLine();
      RockPaperScissors game = new RockPaperScissors();
      game.setPlayers(player);
      System.out.println(game);
      System.out.print("Do you want to play again?");
      response = keyboard.nextLine().charAt(0);
      System.out.println();

    }while (response =='y');
		
		
	}
}



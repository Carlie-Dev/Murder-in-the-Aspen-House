import java.util.Scanner;
public class Playagain{
  public static void playAgain() {  
    System.out.println("Thank you for playing. \nDo you want to play again? Y/N");
    Scanner playAgainScanner = new Scanner(System.in);
    String playAgainInput = playAgainScanner.nextLine().toUpperCase();
    
    switch(playAgainInput) {
        case "Y":
          System.out.println("Time for a new case!");
          validOption = true;
          break;
        case "N":
          System.out.println("Thanks for playing!");
          continueGame = false;
          System.exit(0);
        default:
          System.out.println("Please enter Y or N.");
          playAgainInput = playAgainScanner.nextLine().toUpperCase();
      }
    
    playAgainScanner.close();
  }
}
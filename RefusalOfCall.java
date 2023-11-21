import java.util.*;
public class RefusalOfCall{
  public static void refusalOfCall() {  
    ClearScreen.clearScreen();
    System.out.println("You refused orders from the state.");
    System.out.println("You decided to go home.");
    
    try{
      Thread.sleep(30);
    }catch(InterruptedException e){
      e.printStackTrace();
    }
    ClearScreen.clearScreen();
    
    System.out.println("The prince does not like being told no.");
    try{
      Thread.sleep(20);
    }catch(InterruptedException e){
      e.printStackTrace();
    }
    ClearScreen.clearScreen();

    System.out.println("You wake up in a dark room. \n You hear a voice.");
    System.out.println("Prince Van Halbert: The empire does not have use for those who defy orders.");
    try{
      Thread.sleep(40);
    }catch(InterruptedException e){
      e.printStackTrace();
    }
    ClearScreen.clearScreen();
    
    System.out.println("Ending 1/4: Failed Rebel");
    System.out.println("------------------------");
    Playagain.playAgain(); //Calls play again
    
   }
}
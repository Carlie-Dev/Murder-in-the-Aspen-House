import java.util.Scanner;
import java.util.*;
class Chapter1 {
     public static void chapter1(){
       System.out.println("Chapter 1: The Body.");
       System.out.println("--------------------");

       //City Entrance
       System.out.println("   In three days you leave the Imperial Capital Dolphus and arrive in Guilton the capital of Lord Aspen's provence. \n   The city of gold fits it's name sake, at least from what you can see from your buggy. Your coachman takes you through all the nicest streats. The buildings are washed with white. There curved green roofs look like leaves, and their thresholds looked like rays of sun.");

       //Manor entrance
       System.out.println("   The driver brings you up to the mannor. It's a gothic majesty, etched in it's stone walls are murals of battles long ago. It's gates becon you closer. There are three pathways up to the door.");
       System.out.println("1. A cobblestone path winding through rose bushes. \n2. The ornate main staircase. \n3. The wine cellar door.");

       ClearScreen.clearScreen();
       

       

       //Investigation in this level, inspect the body and interview each of the suspects.
       
       ///Introductory of the notepad mecanic.
     }

    //Introduces Tina when character decides to take the rose path.
    public static void rosePath(){
      System.out.println("   You walk down the cobbled path. Blue birds flutter in the trees. You pause to smell the roses when you notice a servant tending to them. She is startled by you and accidently cuts herself on her shears. ");
      System.out.println("???: Ouch! Eh- Oh, you're the new detective right?");
      
      //respect point gained or lost.
      while(true){
        Scanner rosePath = new Scanner();
        System.out.println("1. Laugh at her /n2. Help Her");
        int rosePathChoice = rosePath.nextInt();
        switch(rosePathChoice){
          case 1:
            //Bad choice lowers respect with tina and explains respect mecanic.
            System.out.println("You decided to laugh at her.");
            System.out.println("-1 respect point with Tina.");
            System.out.println("Respect points measure how much a suspect respects you. The higher their respect for you, the more open they will be in interviews.");
            tina.respect = tina.respect - 1;

            System.out.println("---");
            System.ou.println("Tina frowned before taking off her headscarf and wrapping her wound herself.");
            break;
          case 2:
            //Good choice- ups tina's respect and explains respect mecanic
            System.out.println("You decided to help her. You took her headscarf and wrapped it tightly around the wound on her finger.");
            System.out.println("+1 respect point with Tina.");
            System.out.println("Respect points measure how much a suspect respects you. The higher their respect for you, the more open they will be in interviews.");
            tina.respect = tina.respect + 1;
            break;
          default:
            System.out.println("Please chose option 1 or 2.");
            continue;
        }
      }
    }
    //Introduces General Aspen when player takes the main staircase.
  public static void staircasePath(){
    
  }
    //Introduces Nyxie's character when player decideds too take the wine celar route.
    public static void nyxieMeeting(){
      System.out.println("");
    }
    
    
}
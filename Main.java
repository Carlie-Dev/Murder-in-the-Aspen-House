import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    while(true){
      //Player menu variables
      int gender = 0;
      String name;
      String pronoun = " ";
      String pronoun2= " ";

      //scanners
      Scanner genderScanner = new Scanner(System.in);
      
      //chosing gender
      System.out.println("Time to introduce yourself.");
      System.out.println("Type 1 for Male or 2 for Female.");
      gender = genderScanner.nextInt();

      boolean validGender = false; // control variable for while loop
      while(!validGender){
        switch(gender) {
            case 1:
              System.out.println("You chose a Male.");
              pronoun = "he";
              pronoun2 = "him";
              validGender = true;
              break;
            case 2:
              System.out.println("You chose a Female.");
              pronoun = "she";
              pronoun2 = "her";
              validGender = true;
              break;
            default:
              System.out.println("You can only chose 1 or 2.");
              gender = genderScanner.nextInt();
        }
      }


      //Chosing name
      Scanner nameScanner = new Scanner(System.in);
      System.out.println("What is your name?");
      name = nameScanner.nextLine();


      Character player = new Character(name, pronoun, pronoun2);

      System.out.println(" ");
      System.out.println("--You--");
      System.out.println("Name: " + player.name);
      System.out.println("Pronouns: " + player.pronoun1 + "/" + player.pronoun2);
      System.out.println("--~~~--");
      System.out.println(" ");

      //Intro
      System.out.println("Hello, Detective " + player.name + "!\nYou have been sent a new case by Prince Van Halbert.");

      Scanner continueScanner = new Scanner(System.in);
      String continueInput = " ";
      //Ask if they want to continue
      System.out.println("Continue with case? Y/N");

      continueInput = continueScanner.nextLine().toUpperCase();

      boolean validOption = false; // control variable for while loop
      while(!validOption){
        switch(continueInput) {
          case "Y":
            //Calls chapter 1 if the player wants to continue with the case
            System.out.println("Onto the next chapter.");
            validOption = true;
            //adds delay so player can read before chapter one is called
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            ClearScreen.clearScreen();
            break;
          case "N":
            //calls refusal of the call ending if player does not wish to solve the case
            System.out.println("You chose to end the case.");
            validOption = true;
            //adds delay so player can read befor calling the first of the four endings
            try{
              Thread.sleep(20);
            }catch(InterruptedException e){
              e.printStackTrace();
            }
            ClearScreen.clearScreen();
            RefusalOfCall.refusalOfCall();
            break;
          default:
            System.out.println("You must chose Y/N");
            continueInput = continueScanner.nextLine().toUpperCase();
        }
        //close scanner

        continueScanner.close();
        nameScanner.close();
        genderScanner.close();
      }
    }
  }
}
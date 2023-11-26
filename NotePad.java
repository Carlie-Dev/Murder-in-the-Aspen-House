import java.util.ArrayList;

public class NotePad{
  ArrayList<String> notes = new ArrayList<String>();
  
  public void viewnotepad(){
    System.out.println("Type 1 to see all of your notes, type 2 to prompt for a specific note.");
    
  }

  public void addnote(String note){
    System.out.println("Write bellow what you would like to add?");
    
  }
}
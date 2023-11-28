public class Character{
  String name;
  String pronoun1;
  String pronoun2;
  int respect;

  public Character(String name, String pronoun1, String pronoun2, int respect){
    this.name = name;
    this.pronoun1 = pronoun1;
    this.pronoun2 = pronoun2;
    this.respect = respect;
  }

  //Getters and setters for earning respect.
  public int getRespect(){
    return this.respect;
  }
  public void addRespect(){
    this.respect = this.respect+1;
  }
  public void subRespect(){
    this.respect = this.respect-1;
  }
}
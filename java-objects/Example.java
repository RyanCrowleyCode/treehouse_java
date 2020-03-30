public class Example {
 
    public static void main(String[] args) {
      // Your amazing code goes here...
      
      System.out.println("We are making a new PEZ Dispenser");
      PezDispenser dispenser = new PezDispenser();
      dispenser.characterName = "Darth Vader";
      System.out.printf("The dispenser is %s %n",
                        dispenser.characterName);
    }
  
  }
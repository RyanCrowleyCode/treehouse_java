import java.io.Console;

// Start by creating a new Cow class in the 'Cow.java' file.

public class Main {

  public static void main(String[] args) {
    Console console = System.console();
    
    // TODO:  5. Create a new Cow named 'Larry'.
    Cow cow = new Cow("Larry");
    
    
    // TODO: 6. Finally, print out the name of your Cow object to make sure everything's working.
    System.out.printf("My cow is named %s.%n", cow.getName());
    
  }
}
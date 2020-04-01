import java.util.Scanner;

public class Prompter {
  Scanner scanner = new Scanner(System.in);
  private Game game;
  private final String name;
  
  public Prompter(Game game) {
    this.game = game;
    this.name = askName(); 
  }
  
  private String askName() {
    System.out.printf("%nWelcome to Hangman! What is your name?  ");
    return scanner.nextLine();
  }
  
  public String getName() {
    return name;
  }
  
  public void welcomePlayer() {
    System.out.printf("%nLet's start the game, %s!%n%n", getName());  
  }
  
  public boolean promptForGuess() {
    boolean isHit = false;
    boolean isAcceptable = false;
    
    
    do {
      System.out.print("Enter a letter:  ");
      String guessInput = scanner.nextLine();

      // we need to see if the guess matches or not. This is the game's job.
      // return the boolean from game.applyGuess
      
      try {
        isHit =  game.applyGuess(guessInput);
        isAcceptable = true;
      } catch(IllegalArgumentException iae) {
        System.out.printf("%s. Please try again. %n",
                          iae.getMessage());
      }
    } while(! isAcceptable);
    
    return isHit;
  }
  
  public void displayProgress() {
    System.out.printf("You have %d tries left to solve: %s%n",
                      game.getRemainingTries(),
                      game.getCurrentProgress());
  }
  
  public void displayOutcome(){
    String message = "You have lost. The word was " + game.getAnswer() + ". Better luck next time, " + getName() +"!";
    if (game.isWon()) {
      message = "Congratulations, " + getName() + "! You won with " + game.getRemainingTries() + " tries remaining!";
    }
    System.out.println(message);
  }
  
}
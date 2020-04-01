import java.util.Scanner;

public class Prompter {
  private Game game;
  
  public Prompter(Game game) {
    this.game = game;
  }
  
  public boolean promptForGuess() {
    Scanner scanner = new Scanner(System.in);
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
    String message = "You have lost. The word was " + game.getAnswer() + ".";
    if (game.isWon()) {
      message = "Congratulations! You won with " + game.getRemainingTries() + " tries remaining!";
    }
    System.out.println(message);
  }
  
}
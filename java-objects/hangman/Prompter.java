import java.util.Scanner;

class Prompter {
  private Game game;
  
  public Prompter(Game game) {
    this.game = game;
  }
  
  public boolean promptForGuess() {
    Scanner scanner = new Scanner(System.in);
    boolean isHit = false;
    boolean isAcceptable = false;
    
    
    do {
      // printing a line to get input
      System.out.print("Enter a letter:  ");
      // using scanner object to read line for input and saving to variable
      String guessInput = scanner.nextLine();
      // saving the letter 'char' to a variable called guess
      char guess = guessInput.charAt(0);
      // we need to see if the guess matches or not. This is the game's job.
      // return the boolean from game.applyGuess
      
      try {
        isHit =  game.applyGuess(guess);
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
  
}
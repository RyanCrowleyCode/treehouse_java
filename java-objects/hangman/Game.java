class Game {
  public static final int MAX_MISSES = 7;
  private String answer;
  private String hits;
  private String misses;

  public Game(String answer) {
    this.answer = answer.toLowerCase();
    hits = "";
    misses = "";
  }
  
  public String getAnswer() {
    return answer;  
  }
  
  private char normalizedGuess(char letter) {
    if (! Character.isLetter(letter)) {
      throw new IllegalArgumentException("A letter is required"); 
    }
    letter = Character.toLowerCase(letter);
    if (hits.indexOf(letter) != -1 || misses.indexOf(letter) != -1) {
        throw new IllegalArgumentException(letter + " has already been guessed.");
    }  
    return letter;
  }
  
  public boolean applyGuess(char letter) {
    letter = normalizedGuess(letter);
    boolean isHit = answer.indexOf(letter) != -1;
    if (isHit) {
      hits += letter;
    } else {
      misses += letter;
    }
    return isHit;    
  }
  
  public boolean applyGuess(String letters) {
    if (letters.length() == 0) {
      throw new IllegalArgumentException("No letter found");
    }
    return applyGuess(letters.charAt(0));
  }
  
  public int getRemainingTries() {
    return MAX_MISSES - misses.length();  
  }
  
  public String getCurrentProgress() {
    // temporary progress variable
    String progress = "";
    
    /*
      loop through every letter in the answer String by converting
      answer String to an array of char characters 
    */
    for (char letter : answer.toCharArray()) {
      char display = '-';
      // if the letter in answer is one of the correctly guessed letters
      if (hits.indexOf(letter) != -1) {
        // update display to the letter
        display = letter;
      }
      // update progress String
      progress += display;
    }
    
    return progress;
  }
  
  public boolean isWon() {
    return getCurrentProgress().indexOf('-') == -1;
  }

}
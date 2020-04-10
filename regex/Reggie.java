import java.io.Console;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

class Reggie {
  public static void main(String[] args) {
    Console console = System.console();
    // Your amazing code below
    String zipCode = "90210";
    /* 
      * ^ start of line
      * $ end of line
      * \\d escape character, then \d for digit
      * {5} indicates 5 of those in a row
      * {4} indicates 4 of those in a row
      * wrapping something in ()? means it is optional
    */
   
    if (zipCode.matches("^\\d{5}(-\\d{4})?$")) {
      System.out.printf("%s is a valid zip code%n", zipCode); 
    } else {
       System.out.printf("%s is NOT a valid zip code%n", zipCode); 
    }
    
    String skills = "JavaScript, HTML, CSS, and Java";
    // splitting on anything that ISN'T a word so we can get an array of words
    for (String skill : skills.split("\\W+(and\\W+)?")) {
      System.out.printf("Skill:  %s %n",
                        skill);
    }
    
    String script = "Surely capturing shushes shall show how beneficial Regular Expressions actually are. Turtle.";
    
    Pattern pattern = Pattern.compile("(\\w*(sh|ti|su|ci|tu|si)\\w*)",
                                     Pattern.CASE_INSENSITIVE);
    
    Matcher matcher = pattern.matcher(script);
    
    while (matcher.find()) {
      System.out.printf("\"%s\" might be a \"shushy\" word because it contains \"%s\".  %n",
                        matcher.group(1),
                        matcher.group(2));
    }
  }
}
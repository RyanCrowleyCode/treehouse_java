import java.io.Console;
 
public class Introductions {
  
    public static void main(String[] args) {
        Console console = System.console();
        // Welcome to the Introductions program!  Your code goes below here
        
        String firstName= console.readLine("What is your name?  ");
        
        console.printf("Hello, my name is %s\n", firstName);
        
        // console.printf doesn't end the line when it prints, so the next
        // print statement will begin smashed up against the last character
        // of the console.printf line.
        
        // console.printf("Hello, my name is %s", firstName);
        
        // System.out.println ends the line, so the next print statement will
        // start on a new line.
        // System.out.println("using the other print method");
        // console.printf("Hello, my name is %s", firstName);  
        
        // console.printf("This time, I'm using an escape character for new line\n");
        // console.printf("This time, I'm using an escape character for new line\n");
        // console.printf("Hello, my name is %s\n", firstName);
  }
}
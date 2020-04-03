public class Explore {
 
    public static void main(String[] args) {
      // Create a new friends array using the array literal shortcut.
      // Include Ben, Alena, Pasan
      String[] friends = {"Ben", "Alena", "Pasan"};
      // Enanced for loop
      for (String friend : friends) {
        System.out.printf("Hey %s! The movie starts at 7, C U there!%n", friend);
      }
      
      // Regular for loop
      for (int i = 0; i < friends.length; i++) {
        System.out.printf("Hey %s! The movie starts at 7, C U there!%n", friends[i]);
      }
      
      int[] bensScoreCard = {1, 2, 1, 5, 2, 4, 4, 4, 3, 6, 1, 2, 5, 4, 3, 2, 6, 3};
      for (int i = 0; i < bensScoreCard.length; i++) {
        System.out.printf("Hole #%d: %d %n", i+1, bensScoreCard[i]);
      }
      
    }
    
  }
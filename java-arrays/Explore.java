public class Explore {
 
    public static void main(String[] args) {
      // Create a new friends array using the array literal shortcut.
      // Include Ben, Alena, Pasan
      String[] friends = {"Ben", "Alena", "Pasan"};
      
      int[][] scoreCards = {
        // Ben
        {1, 2, 4, 2, 6, 5, 4, 3, 3, 2, 5, 7, 2, 7, 8, 4, 3, 2},
        // Alena
        {2, 3, 5, 1, 1, 2, 3, 1, 1, 2, 4, 1, 3, 3, 2, 6, 3, 2},
        // Pasan
        {4, 4, 2, 1, 2, 2, 1, 4, 2, 2, 2, 3, 2, 5, 8, 1, 2, 2}
      };
  //    
  //    // Enanced for loop
  //    for (String friend : friends) {
  //      System.out.printf("Hey %s! The movie starts at 7, C U there!%n", friend);
  //    }
  //    
  //    // Regular for loop
  //    for (int i = 0; i < friends.length; i++) {
  //      System.out.printf("Hey %s! The movie starts at 7, C U there!%n", friends[i]);
  //    }
  //    
  //    int[] bensScoreCard = {1, 2, 1, 5, 2, 4, 4, 4, 3, 6, 1, 2, 5, 4, 3, 2, 6, 3};
  //    for (int i = 0; i < bensScoreCard.length; i++) {
  //      System.out.printf("Hole #%d: %d %n", i+1, bensScoreCard[i]);
  //    }
      
      // for each friend
      for (int i = 0; i < friends.length; i ++) {
      //    print their name
        System.out.printf("%s %n----------------%n",
                          friends[i]);
      //    for each hole
        for (int j = 0; j < scoreCards[i].length; j++) {
      //      print their score
          System.out.printf("Hole #%d: %d %n",
                           j +1,
                           scoreCards[i][j]);
        }
      }
      
    }
    
  }
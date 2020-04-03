import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

String[] friends = {
  "Treasure",
  "Ben", 
  "Alena", 
  "Pasan"
};

public String pickLunchSpot(String... spots){
  System.out.printf("Randomly picking %d lunch spots. %n",
                    spots.length);
  Random random = new Random();
  return spots[random.nextInt(spots.length)];
}

public void checkRandom(){
  int queCount = 0;
  int primasCount = 0;
  int pieCount = 0;
  
  for (int i = 0; i < 1000; i++) {
  // need to call pickLunchSpots and pass in some arguments
    String selection = pickLunchSpot("Que Sabrosa", "Las Primas", "Life of Pie");
    // every time it is called, add to counter for specific restaurant
    if (selection.equals("Que Sabrosa")) {
      queCount += 1;
    } else if (selection.equals("Las Primas")) {
      primasCount += 1;
    } else {
      pieCount += 1;
    }
  }
       
  System.out.printf("Que Sabrosa: %s%nLas Primas: %s%nLife of Pie: %s%n",
                    queCount,
                    primasCount,
                    pieCount);
}
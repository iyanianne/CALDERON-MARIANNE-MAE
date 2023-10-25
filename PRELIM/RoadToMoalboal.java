//NAME: Calderon, Marianne Mae

import java.util.Scanner;

public class RoadToMoalboal {
   public static void main (String[] args) {
   
   Scanner sc = new Scanner(System.in);
   
   double distance1 = 84.9;
   double distance2 = 93.9;
   double distance3 = 92.9;
   
   System.out.println("Routes to Moalboal");
   System.out.println("Default Route:           ");
   System.out.println("Cebu City       [Route 1]");
   System.out.println("Minglanilla     [Route 2]");
   System.out.println("San Fernando    [Route 3]");
   System.out.println("CarCar          [Route 4]");
   System.out.println("Barili          [Route 4.1]");
   System.out.println("Dumanjug        [Route 4.1.1]");
   System.out.println("Alcantara       [Route 4.1.2]");
   System.out.println("Moalboal        [End Route]");
   
   System.out.println("\nIs Barili obstructed? (1 = Yes & 2 = No)");
   int barili = sc.nextInt();
   
      if (barili != 1){
         System.out.println("Recommended Route:       ");
         System.out.println("Cebu City       [Route 1]");
         System.out.println("Minglanilla     [Route 2]");
         System.out.println("San Fernando    [Route 3]");
         System.out.println("CarCar          [Route 4]");
         System.out.println("Barili          [Route 4.1]");
         System.out.println("Dumanjug        [Route 4.1.1]");
         System.out.println("Alcantara       [Route 4.1.2]");
         System.out.println("Moalboal        [End Route]");
         
            System.out.println("\nHow fast are you going? ");
            double speed = sc.nextDouble();
            double eta = distance1 / speed;
         
               System.out.println("\nAdditional Data:");
               System.out.println("Distance: " + distance1 + " km");
               System.out.println("Speed: " + speed + " km/h");
               System.out.printf("ETA: %.2f hours", eta);

         
      } else {
         System.out.println("\nIs Dumanjug obstructed? (1 = Yes & 2 = No)");
         int dumanjug = sc.nextInt();
         
            if (dumanjug != 1) {
               System.out.println("Recommended Route:       ");
               System.out.println("Cebu City       [Route 1]");
               System.out.println("Minglanilla     [Route 2]");
               System.out.println("San Fernando    [Route 3]");
               System.out.println("CarCar          [Route 4]");
               System.out.println("Sibonga         [Route 4.2]");
               System.out.println("Dumanjug        [Route 4.2.1]");
               System.out.println("Alcantara       [Route 4.2.2]");
               System.out.println("Moalboal        [End Route]");
            
                  System.out.println("\nHow fast are you going? ");
                  double speed = sc.nextDouble();
                  double eta = distance2 / speed;
         
                     System.out.println("\nAdditional Data:");
                     System.out.println("Distance: " + distance2 + " km");
                     System.out.println("Speed: " + speed + " km/h");
                     System.out.printf("ETA: %.2f hours", eta);
         

            } else {
               System.out.println("Recommended Route:       ");
               System.out.println("Cebu City       [Route 1]");
               System.out.println("Minglanilla     [Route 2]");
               System.out.println("San Fernando    [Route 3]");
               System.out.println("CarCar          [Route 4]");
               System.out.println("Sibonga         [Route 4.1]");
               System.out.println("Argao           [Route 5]");
               System.out.println("Ronda           [Route 5.1]");
               System.out.println("Alcantara       [Route 5.2]");
               System.out.println("Moalboal        [End Route]");
               
                  System.out.println("\nHow fast are you going? ");
                  double speed = sc.nextDouble();
                  double eta = distance1 / speed;
         
                     System.out.println("\nAdditional Data:");
                     System.out.println("Distance: " + distance1 + " km");
                     System.out.println("Speed: " + speed + " km/h");
                     System.out.printf("ETA: %.2f hours", eta);

         

            }
      }
}
}
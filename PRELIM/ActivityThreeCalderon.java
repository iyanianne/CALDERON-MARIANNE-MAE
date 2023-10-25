import java.util.Scanner;

public class ActivityThreeCalderon {
   public static void main (String[] argfs) {

   Scanner sc = new Scanner (System.in);
   double totalPrice = 0.0;
   
   String[] menuItems = {"C1", "C2", "C3"};
   double[] menuPrices = {100.00, 150.00, 200.00};
   
   String[] addonsItems = {"R1", "R2"};
   double[] addonsPrices = {35.00, 50.00};
   
   System.out.println("Menu: ");
   
   for (int i = 0; i < menuItems.length; i++){
      System.out.println((i+1) + ". " + menuItems[1] + " = Php " + menuPrices[i]);
   }
   
   for (int i = 0; i < addonsItems.length; i++){
      System.out.println((i+1) + ". " + addonsItems[i] + " = Php " + addonsPrices[i]);
   }
   
   while (true) {
      System.out.print("\nEnter item number (0 to finish): ");
      int choice = sc.nextInt();
      
      if (choice == 0) {
      break;
      
      } else if (choice >= 1 && choice <= menuItems.length) {
         System.out.print("Enter quantity: ");
         int quantity = sc.nextInt();
         totalPrice += menuPrices [choice - 1] * quantity;
      
      } else if (choice > menuItems.length && choice <= menuItems.length + addonsItems.length) {
         System.out.print("Enter quantitiy: ");
         int quantity = sc.nextInt();
         totalPrice += addonsPrices [choice - menuItems.length - 1] * quantity;
      
      } else {
         System.out.println("Invalid choice. Please Try again.");
   }
 }  
      double dollarToPeso = 56.00;
      double totalInDollars = totalPrice/dollarToPeso;
      
      System.out.println("\nTotal Price in Peso: P " + totalPrice);
      System.out.printf("Total Price in Dollars: $ %.2f", totalInDollars);
      System.out.println("\nThank you. Come again.");
 }
}
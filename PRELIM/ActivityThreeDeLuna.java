import java.util.Scanner;

public class ActivityThreeDeLuna {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      
      double totalPricePHP = 0.0;
      double conversion = 0.0176;
      double totalPriceUSD = 0.0;
      int qnty;
      int totalQnty = 0;
        
      System.out.println("  ======================== Customer Orders ========================  ");
      System.out.printf("\n");
      System.out.println("===== Menu =====                     ||    ===== Adds On =====");
      System.out.println("C1 Jolly Hotdog === PHP 150.00       ||    R1 Ice Cream === PHP 40.00");
      System.out.println("C2 Tuna Pie === PHP 150.00           ||    R2 Coke === PHP 60.00");
      System.out.println("C3 Chicken === PHP 200.00            ||    R3 Halo-halo === PHP 180.00");
      
      System.out.printf("\n\n");
      
      while (true) {
            System.out.print("Enter order (C1, C2, C3, or 'X' to finish): ");
            String options = scanner.nextLine();
            
            if (options.equals("X")) {
                break; 
            }
            
            switch (options) {
               case "C1":
                  System.out.print("Quantity for C1: ");
                  qnty = scanner.nextInt();
                  totalPricePHP += 150.00 * qnty;
                  totalQnty += qnty;
                  scanner.nextLine(); 
                  break;
               case "C2":
                  System.out.print("Quantity for C2: ");
                  qnty = scanner.nextInt();
                  totalPricePHP += 150.00 * qnty;
                  totalQnty += qnty;
                  scanner.nextLine(); 
                  break;
               case "C3":
                  System.out.print("Quantity for C3: ");
                  qnty = scanner.nextInt();
                  totalPricePHP += 200.00 * qnty;
                  totalQnty += qnty;
                  scanner.nextLine(); 
                  break;
               default:
                  System.out.println("Invalid choice. Please try again!");
                  break;
               }
         }
         
         System.out.printf("\n");
         System.out.printf("Total Quantity: %d\n", totalQnty);
         System.out.printf("Total Price in PHP: PHP %.2f\n", totalPricePHP);
        
         totalPriceUSD = totalPricePHP*conversion;
         System.out.printf("Total Price in USD: $%.2f\n", totalPriceUSD);
        
         System.out.printf("\n");
         
         String addItems;
         while (true) {
            System.out.println("");
            System.out.print("Add more items? (Y/N): ");
            String add = scanner.nextLine().toUpperCase();
               if (add.equals("N")) {
                  break;
               } else if (add.equals("Y")) {
                  
                  System.out.print("Enter order (R1, R2, R3, or 'exit' to finish): ");
                  String options = scanner.nextLine();
               
                     if (options.equals("exit")) {
                        break;
                     }
         
                  switch (options) {
                     case "R1":
                        System.out.print("Quantity for R1: ");
                        qnty = scanner.nextInt();
                        totalPricePHP += 40.00 * qnty;
                        totalQnty += qnty;
                        scanner.nextLine(); 
                        break;
                     case "R2":
                        System.out.print("Quantity for R2: ");
                        qnty = scanner.nextInt();
                        totalPricePHP += 60.00 * qnty;
                        totalQnty += qnty;
                        scanner.nextLine(); 
                        break;
                     case "R3":
                        System.out.print("Quantity for R3: ");
                        qnty = scanner.nextInt();
                        totalPricePHP += 180.00 * qnty;
                        totalQnty += qnty;
                        scanner.nextLine(); 
                        break;
                     default:
                        System.out.println("Invalid choice. Please try again!");
                        break;
                     }
                  } else {
                         System.out.println("Invalid choice. Please enter 'Y' or 'N'.");
                     }
                 }
                 
                 totalPriceUSD = totalPricePHP*conversion;
                 
                 System.out.printf("\n");
                 System.out.printf("\nTotal Quantity: %d\n", totalQnty);
                 System.out.printf("Total Price in PHP: PHP%.2f\n", totalPricePHP);
                 System.out.printf("Total Price in USD: $%.2f\n", totalPriceUSD);
    }
}
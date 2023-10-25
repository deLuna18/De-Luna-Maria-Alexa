/*Deluna, Maria Alexa H. Bsit -2B */
import java.util.Scanner;

public class Routes{
   static class Route{
      public void defRoute(){
         System.out.println("Default Route: ");
         System.out.println("Cebu City    === (START)");
         System.out.println("Minglanilla  === (Route 1)");
         System.out.println("San Fernando === (Route 2)");
         System.out.println("Carcar City  === (Route 3)");
         System.out.println("Barili       === (Route 4)");
         System.out.println("Dumanjug     === (Route 4.2.1)");
         System.out.println("Alcantara    === (Route 4.2.2)");
         System.out.println("Moalboal     === (END)");   
      }
      
      public void routeOne(){
         System.out.println("Recommended Route: ");
         System.out.println("Cebu City    === (START)");
         System.out.println("Minglanilla  === (Route 1)");
         System.out.println("San Fernando === (Route 2)");
         System.out.println("Carcar City  === (Route 3)");
         System.out.println("Barili       === (Route 4)");
         System.out.println("Dumanjug     === (Route 4.2.1)");
         System.out.println("Alcantara    === (Route 4.2.2)");
         System.out.println("Moalboal     === (END)");
      }
      
      public void routeTwo(){
         System.out.println("Recomended Route: ");
         System.out.println("Cebu City    === (START)");
         System.out.println("Minglanilla  === (Route 1)");
         System.out.println("San Fernando === (Route 2)");
         System.out.println("Carcar City  === (Route 3)");
         System.out.println("Sibonga      === (Route 4)");
         System.out.println("Dumanjug     === (Route 4.2.1)");
         System.out.println("Alcantara    === (Route 4.2.2)");
         System.out.println("Moalboal     === (END)");
      }
      
      public void routeThree(){
         System.out.println("Recomended Route: ");
         System.out.println("Cebu City    === (START)");
         System.out.println("Minglanilla  === (Route 1)");
         System.out.println("San Fernando === (Route 2)");
         System.out.println("Carcar City  === (Route 3)");
         System.out.println("Sibonga      === (Route 4)");
         System.out.println("Argao        === (Route 4.2.1)");
         System.out.println("Ronda        === (Route 4.2.1)");
         System.out.println("Alcantara    === (Route 4.2.2)");
         System.out.println("Moalboal     === (END)");   
      }
      
      public String eta(double distance, double speed){ 
         double hours = distance / speed;
         int intHours = (int) hours;
         int minutes = (int) ((hours - intHours) * 60);
         String hourString = (intHours > 1) ? intHours + " hrs" : intHours + " hr";
         String minuteString = (minutes > 1) ? minutes + " mins" : minutes + " min";
            return String.format("%s and %s", hourString, minuteString);
      }   
      
   }
   
   public static void main(String[] args){
      Scanner scanner = new Scanner(System.in);
      Route route = new Route();
      double distance;
      int speed;
      
      System.out.println("Welcome to Cebu SouthBus Terminal");
      route.defRoute();
      System.out.printf("\nIs Barili (Route 4) obstructed?[Y/N]: ");
      char options = scanner.next().charAt(0);
      
      while(options != 'N' && options != 'Y'){
         System.out.println("Invalid Input. Please try again!");
         System.out.printf("\nIs Barili (Route 4) obstructed?[Y/N]: ");
         options = scanner.next().charAt(0);
      }
      
      if(options == 'Y'){
         System.out.printf("Is Dumanjug(Route 4.2.1) Obstructed?[Y/N] ");
         char optionOne = scanner.next().charAt(0);
         
            while(optionOne != 'N' && optionOne != 'Y'){
            System.out.println("Invalid Input. Please try again!");
            System.out.printf("\nIs Dumanjug(Route 4.2.1) Obstructed?[Y/N]");
            options = scanner.next().charAt(0);
            }
            
         if(optionOne == 'Y'){
            route.routeThree();
            System.out.printf("\nAdditional Data\n");
            System.out.print("Enter your speed (km/h): ");
            speed = scanner.nextInt();
            distance = 153.6;
            String estimatedHours = route.eta(distance, speed);
            System.out.println("Estimated Time of Arrival: " + estimatedHours);                     
         }else{
            route.routeTwo();
            System.out.printf("\nAdditional Data\n");
            System.out.print("Enter your speed (km/h): ");
            speed = scanner.nextInt();
            distance = 145.7;
            String estimatedHours = route.eta(distance, speed);
            System.out.println("Estimated Time of Arrival: " + estimatedHours);           
         }
      }else{
            route.routeOne();
            System.out.printf("\nAdditional Data\n");
            System.out.print("Enter your speed (km/h): ");
            speed = scanner.nextInt();
            distance = 144.1;
            System.out.println("Distance: "+distance);
            String estimatedHours = route.eta(distance, speed);
            System.out.println("Estimated Time of Arrival: " + estimatedHours);                
      }
   }
}
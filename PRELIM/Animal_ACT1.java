import java.util.Scanner;

class Animal {
    public void makeSound() {
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.print("Arf arf arf");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.print("Meow meow meow");
    }
}

class Cow extends Animal {
    @Override
    public void makeSound() {
        System.out.print("Moo moo moo");
    }
}

class Fox extends Animal {
    @Override
    public void makeSound() {
        System.out.print("Ding ding ding");
    }
}

public class Animal_ACT1{
   public static void main(String args[]){
      char option = 'y';
      Scanner scan = new Scanner(System.in);  
      
      do{
         System.out.println("======== Activity One: What does the animal say? ========");
         System.out.println("Select an animal:");
         System.out.println("1.Dog ");
         System.out.println("2.Cat ");
         System.out.println("3.Cow ");
         System.out.println("4.Fox ");
      
         System.out.print("Enter selected number: ");
         int choice = scan.nextInt();
      
         System.out.println("Animal: "+choice);
         
         Animal animal; 
         
         switch(choice){
            case 1:
               animal = new Dog();
               break;
            case 2: 
               animal = new Cat();
               break;
            case 3:
               animal = new Cow();
               break;
            case 4:
               animal = new Fox();
               break;
            default: 
               System.out.print("Invalid Selection");
               animal = null;
         }        
         
         if (animal != null){
            animal.makeSound();
         }
      
         System.out.printf("\nWould you like to try?(Y/N): ");
         option = scan.next().charAt(0);
         
         System.out.printf("\n");
         
         if (option != 'y' && option != 'Y'){
            break;
         }
         
      }while(option == 'y' || option == 'Y');

      scan.close();
   }  
}
import java.util.Scanner;

class Person {
   private String firstName;
   private String middleName;
   private String lastName;
   private int age;
   private String birthday;
   private String address;

   public String getFirstName() {
      return firstName;
   }

   public void setFirstName(String firstName) {
      this.firstName = firstName;
   }

   public String getMiddleName() {
      return middleName;
   }

   public void setMiddleName(String middleName) {
      this.middleName = middleName;
   }

   public String getLastName() {
      return lastName;
   }

   public void setLastName(String lastName) {
      this.lastName = lastName;
   }

   public int getAge() {
      return age;
   }

   public void setAge(int age) {
      this.age = age;
   }

   public String getBirthday() {
      return birthday;  
   }
   

   public void setBirthday(Scanner scanner) {
      boolean validBirthday = false;
      while (!validBirthday) {
         System.out.printf("Birthday (MMDDYY or MM/DD/YY): ");
         String birthdayInput = scanner.nextLine().replaceAll("\\s", "").trim();

         if ((birthdayInput.length() == 6 || birthdayInput.length() == 8) && birthdayInput.matches("[0-9/]+")) {
            String[] parts = birthdayInput.split("/");
            if (parts.length == 1) {
                this.birthday = parts[0].substring(0, 2) + "/" + parts[0].substring(2, 4) + "/" + parts[0].substring(4, 6);
            } else if (parts.length == 3) {
               this.birthday = parts[0] + "/" + parts[1] + "/" + parts[2];
            }
            validBirthday = true;
         } else {
            System.out.println("Invalid birthday format. Please enter the birthday in MMDDYY or MM/DD/YY format.");
         }
      }
   }  

   public String getAddress() {
      return address;
   }

   public void setAddress(String address) {
      this.address = address;
   }
    
   public static void main(String[] args){
      Scanner scanner = new Scanner(System.in);
      Person person = new Person(); 
      
      System.out.printf("Welcome, dear users. Please fill out the personal information sheets. Rest assured that your data is confidential.\n");
 
      boolean validNames = false;

      while (!validNames) {
         System.out.printf("First Name: ");
         String firstName = scanner.nextLine();
         System.out.printf("Middle Name: ");
         String middleName = scanner.nextLine();
         System.out.printf("Last Name: ");
         String lastName = scanner.nextLine();
      
         if (firstName.matches("[a-zA-Z ]+") && middleName.matches("[a-zA-Z ]+") && lastName.matches("[a-zA-Z ]*")) {
            person.setFirstName(firstName);
            person.setMiddleName(middleName);
            person.setLastName(lastName);
            validNames = true;
         } else {
            System.out.println("Invalid input. Please Enter Names(A-Z).");
         }
      }  
      
      int age;
      while (true) {
         System.out.printf("Age: ");
            if (scanner.hasNextInt()) {
                age = scanner.nextInt();
                if (age >= 0 && age <= 150) {
                    person.setAge(age);
                    scanner.nextLine();
                    break;
                } else {
                    System.out.println("Invalid age. Please enter a valid age between 0 and 150.");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid number for age.");
                scanner.nextLine();
            }
      }   
      
      person.setBirthday(scanner);
  
      System.out.printf("Address: ");
      person.address = scanner.nextLine();
      
      System.out.println("\nFull Details");
      System.out.println("First Name: " + person.getFirstName());
      System.out.println("Middle Name: " + person.getMiddleName());
      System.out.println("Last Name: " + person.getLastName());
      System.out.println("Age: " + person.getAge());
      System.out.println("Birthday: " + person.getBirthday());
      System.out.println("Address: " + person.getAddress());

   }
}
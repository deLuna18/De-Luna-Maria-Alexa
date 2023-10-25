import java.util.Scanner;

class Student {

   String first_name;
   String middle_name;
   String last_name;
   String suffix;
   String full_name;
   
   
   public String getFirstName() {
      return first_name;
   }

   public void setFirstName(String first_name) {
      this.first_name = first_name;
   }

   public String getMiddleName() {
      return middle_name;
   }

   public void setMiddleName(String middle_name) {
      this.middle_name = middle_name;
   }

   public String getLastName() {
      return last_name;
   }

   public void setLastName(String last_name) {
      this.last_name = last_name;
   }

   public String getSuffix() {
      return suffix;
   }

   public void setSuffix(String suffix) {
      this.suffix = suffix;
   }
 


   public static void main(String[] args){
   Scanner scanner = new Scanner(System.in);
   Student student = new Student(); 
      
   System.out.printf("First Name: ");
   student.setFirstName(scanner.nextLine());
      
   System.out.printf("Middle Name: ");
   student.setMiddleName(scanner.nextLine());
      
   System.out.printf("Last Name: ");
   student.setLastName(scanner.nextLine());
      
   System.out.printf("Suffix: " );
   student.setSuffix(scanner.nextLine());
      
   System.out.printf("FullName:" + " " + student.getFirstName() + " " + student.getMiddleName() + " " + student.getLastName() + "" + student.getSuffix());
   }
}
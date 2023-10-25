public class Concat{
   public static void main(String[] args){
      String one = "PHP Exercises and ";
      String two = "Python Exercises";
      
      System.out.println("String 1: "+one);
      System.out.println("String 2: "+two);
      String three = one.concat(two);
      System.out.println(three);
   }
}
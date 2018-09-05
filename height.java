import java.util.*;
class  height {
   public static void main(String[] args ) {
      
      double dblCM = 0.0;
      double dblInch = 0.0;
      double dblFeet = 0.0;
      double dblModulo = 0.0;
        
      Scanner keyboard = new Scanner(System.in); 
      System.out.println("Welcome, this program will convert centimeters to feet and inches.\nEnter length in CM: ");

      dblCM = keyboard.nextDouble();
      dblInch = dblCM / 2.54;    
      dblFeet = dblInch / 12;
      dblModulo = ((dblFeet % 1) * 12);

      System.out.println("\nYour length in feet and inches is: " + (int)dblFeet + " feet and " + (int)dblModulo + " inches.");
   }
      
}
// 1. IMPORT Scanner CLASS
import java.util.Scanner;


public class Main {

   public static void main(String []args) {
      System.out.println("Let's play MadLibs!");

      // 2. Set up a Scanner BBJECT
      Scanner input = new  Scanner(System.in);
      // System.in refers to the physical keyboard!

      // 3. Use the Scanner to take input
      System.out.println("Type your name then press enter: ");
      String player = input.nextLine();
      System.out.println("Welcome, " + player);

      // Create variables for each placeholder word
      String emotion = "tired";
      String pet = "cat";
      String verPastTense = "destroyed"

      // Print your stroy line by line 
      System.out.println("put your story here " + emotion + "add ur story")
      System.out.println("my sorty" + pet + " " + verPastTense + "my HW")
   }
}

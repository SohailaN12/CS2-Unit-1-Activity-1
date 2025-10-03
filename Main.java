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
      String place = "park";
      String verb1 = "dance";
      String adjective1 = "funny";
      String noun1 = "robot";
      String adjective2 = "sunny";
      String family = "cousin";
      String color = "purple";
      String animal = "cat";
      String verb2 = "sing";
      String emotion = "happy";

      // Build the story
      String sentence1 = "Today, I went to the " + place + " to " + verb1 + " with my " + adjective1 + " " + noun1 + ".";
      String sentence2 = "It was a " + adjective2 + " day, and we had lots of fun!";
      String sentence3 = "Then, my " + family + " showed up with a " + color + " " + animal + ".";
      String sentence4 = "We all started to " + verb2 + " together, and it made me feel really " + emotion + "!";

      // Print the story
      System.out.println(sentence1);
      System.out.println(sentence2);
      System.out.println(sentence3);
      System.out.println(sentence4);


      // PART B: using Scanner

      System.out.println("\nNow it's your turn! Fill in the blanks:");

      System.out.print("Enter a place: ");

      System.out.print("Enter a verb: ");

      System.out.print("Enter an adjective: ");

      System.out.print("Enter a noun: ");

      System.out.print("Enter another adjective: ");

      System.out.print("Enter a family member: ");

      System.out.print("Enter a color: ");

      System.out.print("Enter an animal: ");

      System.out.print("Enter another verb: ");

      System.out.print("Enter an emotion: ");

      // Build and print the interactive story
      sentence1 = "Today, I went to the " + place + " to " + verb1 + " with my " + adjective1 + " " + noun1 + ".";
      sentence2 = "It was a " + adjective2 + " day, and we had lots of fun!";
      sentence3 = "Then, my " + family + " showed up with a " + color + " " + animal + ".";
      sentence4 = "We all started to " + verb2 + " together, and it made me feel really " + emotion + "!";

      System.out.println("\nHere’s your story:");
      System.out.println(sentence1);
      System.out.println(sentence2);
      System.out.println(sentence3);
      System.out.println(sentence4);

      scan.close();
   }

import java.util.Scanner;
public class Superhero {
    public static void main(String[] args) throws Exception {
    Scanner hero = new Scanner(System.in);
    System.out.println ("Let's write a story about a superhero.");
      System.out.println ( "Who is the hero of our story?");
      String story1 = hero.nextLine();
      System.out.println ( "What is their superpower ?");
      String story2 = hero.nextLine();
      System.out.println ( "Here is the story:");
      System.out.println ("There once was a superhero named " + story1 +", who had the power of " + story2);
      System.out.println ("As they grew older, " + story1 + "saw that the world needed them.");
      System.out.println (story1 + " used their ability to" + "to save the world.");


    }
}



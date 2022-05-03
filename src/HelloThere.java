import java.util.Scanner;
public class HelloThere {
    public static void main(String[] args) throws Exception {
        Scanner hello = new Scanner(System.in);
        System.out.println("Hello there! How are you doing today?");
        String hi = hello.nextLine();
        // System.out.println(hi);
        System.out.println("Wow - Interesting. Tell me more about yourself!");
        String wow = hello.nextLine();
        // System.out.println(wow);
        System.out.println("Nice chatting with you! Goodbye!");

    

    }
}

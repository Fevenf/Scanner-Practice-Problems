import java.util.Scanner;
public class Greeting {
    public static void main(String[] args) throws Exception {
        Scanner hi = new Scanner(System.in);
        System.out.println("What is your name ?");
       String name = hi.nextLine();
        System.out.println("Hi " + name);
    }
}

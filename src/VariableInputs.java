import java.util.Scanner;
public class VariableInputs {
        public static void main(String[] args) throws Exception {
        Scanner var = new Scanner(System.in);
        System.out.println ("Enter a string of text:");
        String enter =  var.nextLine();
        System.out.println ("Enter an integer:");
        int number = Integer.valueOf(var.nextLine());
        System.out.println ("Enter a double:");
        double value = Double.valueOf(var.nextLine());
        System.out.println ("Enter a boolean value: ");
        boolean value2 = Boolean.valueOf(var.nextLine());
        System.out.println ("Your string is " + enter);
        System.out.println ("Your integer is " + number);
        System.out.println ("Your double is " + value);
        System.out.println ("Your boolean is " + value2);
    }
}


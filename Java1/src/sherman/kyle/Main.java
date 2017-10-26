package sherman.kyle;
import java.util.Scanner;

public class Main {

    public static int subtractor(int x, int y){
        System.out.println("inside the int subtractor");
        return x-y;
    }

    public static double subtractor(double x, double y){
        System.out.println("inside the double subtractor");
        return x-y;
    }

    public static void main(String[] args) {

        System.out.println(subtractor(2,2));
        System.out.println(subtractor(10.0, 7.5));

        System.out.print("User input something: ");
        Scanner in = new Scanner(System.in);

        String s = in.nextLine();
        System.out.print(s+'\n');

        System.out.printf("You typed: %s, %d", s, subtractor(3,5));
        System.out.printf("You typed: %s %s %s", "\u001B[0m","\u001B[46m", s);
    }
}

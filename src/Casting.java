import java.util.Scanner;

public class Casting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n = 112.35;
       int d = (int)n;
       System.out.println("Double: " + n);
       System.out.println("int: " + d);
       String fourNine = "49";
       int fNine = Integer.parseInt(fourNine);
       System.out.println("The string value is: " + fourNine);
       System.out.println("The integer value is: " +fNine);

    }
}
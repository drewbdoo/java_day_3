import java.util.Scanner;

public class Calculations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter another number: ");
        int num2 = scanner.nextInt();
        String n1 = String.valueOf(num1);
        String n2 = String.valueOf(num2);
        System.out.println(n1 + " + " + n2 + " = " + (num1 + num2));
        System.out.println(n1 + " - " + n2 + " = " + (num1 - num2));
        System.out.println(n1 + " * " + n2 + " = " + (num1 * num2));
        System.out.println(n1 + " / " + n2 + " = " + (num1 / num2));
        System.out.println(n1 + " % " + n2 + " = " + (num1 % num2));

    }

}

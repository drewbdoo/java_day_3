import java.util.Scanner;
public class TestScores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name a number between 0 and 100");
        double reply = scanner.nextDouble();
        if (reply>=90){
            System.out.println("Your grade is an A :)");
        } else if(reply<90 && reply>=80){
            System.out.println("Your grade is a B :)");
        }else if (reply<80 && reply >=70){
            System.out.println("Your grade is a C :/");
        }else if(reply<70 && reply >=60){
            System.out.println("Your grade is a D :/");
        }else{
            System.out.println("Your grade is an F :(");
        }
        
    }
    
}

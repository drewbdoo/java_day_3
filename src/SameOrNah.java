import java.util.Scanner;

public class SameOrNah {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word:");
        String reply1 = scanner.nextLine();
        System.out.println("Enter another word:");
        String reply2 = scanner.nextLine();
        if(reply1.equals(reply2)){
            System.out.println("The words are the same");
        }else{
            System.out.println("The words are different");
        }
        
    }
   
    
    
}

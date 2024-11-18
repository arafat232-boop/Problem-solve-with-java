
// Check given number is even or odd //
import java.util.Scanner;

public class code3 {

    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);
        System.out.print("Enter any number: ");

        int number = sn.nextInt();

        if (number % 2 == 0) {
            System.out.println("Given number is even");

        }

        else {
            System.out.println("Given number is odd");
        }
    }

}

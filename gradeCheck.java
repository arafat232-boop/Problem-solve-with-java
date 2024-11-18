import java.util.Scanner;

public class gradeCheck {

    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);
        System.out.print("Enter your mark: ");

        int mark = sn.nextInt();

        if (mark > 100) 
        {
            System.out.println("Input is wrong");
        } 
        
        else if (mark <= 100 && mark >= 80) 
        {
            System.out.println("Grade is A+");
        } 

        else if (mark <= 79 && mark >= 75) 
        {
            System.out.println("Grade is A");
        } 

        else if (mark <= 74 && mark >= 70)
        {
            System.out.println("Grade is A-");
        } 

        else if (mark <= 69 && mark >= 65)
        {
            System.out.println("Grade is B+");
        } 

        else if (mark <= 64 && mark >= 60)
        {
            System.out.println("Grade is B");
        } 

        else if (mark <= 59 && mark >= 55)
        {
            System.out.println("Grade is B-");
        } 

        else if (mark <= 54 && mark >= 50)
        {
            System.out.println("Grade is C+");
        }

         else if (mark <= 49 && mark >= 45) 
        {
            System.out.println("Grade is C");
        } 

        else if (mark <= 44 && mark >= 40) 
        {
            System.out.println("Grade is D");
        } 

        else 
        {
            System.out.println("Grade is F");
        }

    }

}
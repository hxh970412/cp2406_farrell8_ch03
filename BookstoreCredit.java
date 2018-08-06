import java.util.Scanner;

public class BookstoreCredit {
    public static void main(String[] args)
    {
        String StudentName;
        double StudentPoint;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name >>> ");
        StudentName = input.next();
        System.out.print("Enter your grade point average >>> ");
        StudentPoint = input.nextDouble();
        displayMessage(StudentName, StudentPoint);
    }
public static void displayMessage(String a, double b)
{
    System.out.print(a + "'s grade point average is " + b + ". So your credit is $" + b * 10);
}
}

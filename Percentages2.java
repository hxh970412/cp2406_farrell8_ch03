import java.util.Scanner;

public class Percentages2 {
    public static void main(String[] args)
    {
        double num1;
        double num2;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first double value >>> ");
        num1 = input.nextDouble();
        System.out.print("Enter the second double value >>> ");
        num2 = input.nextDouble();
        ComputePercent(num1, num2);
        ComputePercent(num2, num1);
    }
    public static void ComputePercent(double a, double b)
    {
        double c = a / b * 100;
        System.out.println(a + " is " + c + " percent of " + b);
    }
}

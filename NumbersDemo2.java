import java.util.Scanner;
public class NumbersDemo2 {
    public static void main(String[] args)
    {
        int num1;
        int num2;
        num1 = getNumber1();
        num2 = getNumber2();
        displayTwiceTheNumber(num1, num2);
        displayNumberPlusFive(num1, num2);
        displayNumberSquared(num1, num2);
    }
    public static int getNumber1()
    {
        int num1;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        num1 = input.nextInt();
        return num1;
    }
    public static int getNumber2()
    {
        int num2;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the second number: ");
        num2 = input.nextInt();
        return num2;
    }
    public static void displayTwiceTheNumber(int a, int b)
    {
        int TwiceVar1 = a * 2;
        int TwiceVar2 = b * 2;
        System.out.println("The first number twice value is " + TwiceVar1 +
                ", the second number twice value is " + TwiceVar2+ ".");
    }
    public static void displayNumberPlusFive(int a, int b)
    {
        int PlusFive1 = a + 5;
        int PlusFive2 = b + 5;
        System.out.println("The first number plus five is " + PlusFive1 +
                ", the second number plus five is " + PlusFive2 + ".");
    }
    public static void displayNumberSquared(int a, int b)
    {
        int SquaredNum1 = a * a;
        int SquaredNum2 = b * b;
        System.out.print("The first number's squared value is " + SquaredNum1 +
                ", the second number's squared value is " + SquaredNum2 + ".");
    }
}

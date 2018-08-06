import java.util.Scanner;

public class Insurance {
    public static void main(String[] asrgs)
    {
        int currentyear, birthyear;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the current year >>> ");
        currentyear = input.nextInt();
        System.out.print("Enter your birth year >>> ");
        birthyear = input.nextInt();
        int price = calulateInsurace(currentyear, birthyear);
        System.out.print("Your insurace price is $" + price);

    }
    public static int calulateInsurace(int a, int b)
    {
        int age = a - b;
        int ADD_FACTOR = 15;
        int MUL_FACTOR = 20;
        int price = (age / 10 + ADD_FACTOR) * MUL_FACTOR;
        return price;
    }
}

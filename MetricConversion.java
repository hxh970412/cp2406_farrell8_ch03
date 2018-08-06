import java.util.Scanner;

public class MetricConversion {
    public static void main(String[] args)
    {
        int number;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer number >>> ");
        number = input.nextInt();
        computeCentimeter(number);
        computeLiters(number);
    }
    public static void computeCentimeter(int a)
    {
        double FACTOR = 2.54;
        double centimeters = a * FACTOR;
        System.out.println(a + " inches is " + centimeters + " centimeters.");
    }
    public static void computeLiters(int a)
    {
        double FACTOR = 3.7854;
        double liters = a * FACTOR;
        System.out.print(a + " gallons is " + liters + " liters.");
    }
}

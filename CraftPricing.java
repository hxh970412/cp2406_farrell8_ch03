import java.util.Scanner;

public class CraftPricing {
    public static void main(String[] args)
    {
        String name;
        double materialscost;
        double time;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your production name >>> ");
        name = input.next();
        System.out.print("Enter your materials cost >>> ");
        materialscost = input.nextDouble();
        System.out.print("Enter your cost time >>> ");
        time = input.nextDouble();
        double price = calculateprice(materialscost, time);
        System.out.print("Your " + name + "'s price is $" + price);
    }
    public static double calculateprice(double cost, double time)
    {
        double price = cost + 12 * time + 7;
        return price;
    }
}

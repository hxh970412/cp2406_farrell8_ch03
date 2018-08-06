import java.util.Scanner;

public class PaintCalculator {
    public static void main(String[] args)
    {
        double width;
        double height;
        double length;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the width of the room >>> ");
        width = input.nextDouble();
        System.out.print("Enter the height >>> ");
        height = input.nextDouble();
        System.out.print("Enter the length of the room >>> ");
        length = input.nextDouble();
        double roomarea = calculateArea(width, length, height);
        double price = calculatePrice(roomarea);
        System.out.print("the cost to paint a " + width + "-by-" + length + "-foot room with " +
        height + "-foot ceilings is $" + price);
    }
    public static double calculateArea(double a, double b, double c)
    {
        double roomarea = a * c * 2 + b * c * 2;
        return roomarea;
    }
    public static double calculatePrice(double x)
    {
        double GALLON_PER_PRICE = 32;
        double PER_GALLON_SQUARE = 350;
        double price = x / PER_GALLON_SQUARE * GALLON_PER_PRICE;
        return price;
    }
}

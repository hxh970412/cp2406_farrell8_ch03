public class Percentages {
    public static void main(String[] args)
    {
        double num1 = 2.0;
        double num2 = 5.0;
        ComputePercent(num1, num2);
        ComputePercent(num2, num1);
    }
    public static void ComputePercent(double a, double b)
    {
        double c = a / b * 100;
        System.out.println(a + " is " + c + " percent of " + b);
    }
}

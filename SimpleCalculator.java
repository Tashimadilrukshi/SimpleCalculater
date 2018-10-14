import java.util.Scanner;

class SimpleCalculator
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        double x = s.nextDouble();
        double y = s.nextDouble();
        
        System.out.println("Summation of "+x+" and "+y+" is "+(x+y));
        System.out.println("Subtraction of "+x+" and "+y+" is "+(x-y));
        System.out.println("Multiplication of "+x+" and "+y+" is "+(x*y));
        System.out.println("Division of "+x+" and "+y+" is "+(x/y));
        System.out.println("Modulus of "+x+" and "+y+" is "+(x%y));
    }
}

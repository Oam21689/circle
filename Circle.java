import java.util.Scanner;
public class Circle
{
    private static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args)
    {
        //Declare variables
        double ValueOfPi = Math.PI;
        double circumference;
        double radius;
        double areaOfCircle;
        double volumeOfCicle;
        System.out.println("Please enter the radius");
        radius = keyboard.nextDouble();
        circumference = 2 * ValueOfPi * radius;
        areaOfCircle = ValueOfPi * Math.pow(radius,2.0);
        volumeOfCicle = ((4.0/3.0) * ValueOfPi * Math.pow(radius,3.0));

        System.out.printf("The circumference of the circle with a radius of %6.3f is %6.3f \n", radius, circumference);
        System.out.printf("The area of the circle with a radius of %6.3f is %6.3f \n", radius, areaOfCircle);
        System.out.printf("The volume of the circle with a radius of %6.2f is %6.3f \n", radius, volumeOfCicle);

    }

}

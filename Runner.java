import java.util.Scanner;
public class Runner
{
    public void main(String[] args)
    {
    Scanner sc = new Scanner(System.in);
    System.out.println("Type a radius: ");
    double radius = sc.nextDouble();

    Circle circle = new Circle(radius);
    double area = circle.area();
    System.out.println("The area of the circle is " + area);
    System.out.println("Input a new radius: ");
    radius = sc.nextDouble();

    circle.updateRadius(radius);

    double circ = circle.circumference();
    System.out.println("The circumference of the circle is " + circ);

    System.out.print("Input a height: ");
    double height = sc.nextDouble();
    double volume = circle.cylinderVolume(height);
    System.out.println("The volume of the cylinder is " + volume);
    
    }
}
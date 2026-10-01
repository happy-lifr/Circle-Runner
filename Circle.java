public class Circle
{
    //instance variables
    private double radius;

    //constructor
    public Circle(double radius)
    {
        this.radius = radius;
    }

    //methods
    //area
    public double area()
    {
        double area = radius*radius*3.14;
        return area;
    }
    //circumference
    public double circumference()
    {
        double circ = radius*2*3.14;
        return circ;
    }
    //cylinder volume
    public double cylinderVolume(double height)
    {
        double volume = area()*height;
        return volume;
    }
    //update radius
    public void updateRadius(double radius)
    {
        this.radius = radius;
    }

}
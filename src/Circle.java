public class Circle implements Shape{

    private static final double pi = 3.14;
    private int radius;

    public Circle(int radius) {
        super();
        this.radius = radius;
    }

    public double getArea(){
       return pi * Math.pow(this.radius,2);
    }

    public double getPerimeter()
    {
        return pi * 2 * this.radius;
    }
}

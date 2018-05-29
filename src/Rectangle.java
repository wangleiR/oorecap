

public class Rectangle  implements  Shape{

    private double height;
    private double width;

    public static Rectangle Square(double side){
        return new Rectangle(side, side);
    }

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double getArea()
    {
        double area = this.height * this.width;
        return area;
    }


    public double getPerimeter() {
        return 2 * (this.width+this.height);
    }
}

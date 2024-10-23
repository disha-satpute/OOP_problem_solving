
class Shape {
    public double getArea() {
        return 0;
    }
}


class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }


    @Override
    public double getArea() {
        return length * width;
    }
}

public class RectArea {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5.0, 3.0);
        System.out.println("Area of the rectangle: " + rectangle.getArea());
    }
}

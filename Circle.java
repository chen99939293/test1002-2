public class Circle {
    public double PI = 3.14;
    public double radius;

    public Circle(double r) {
        radius = r;
    }

    public double getArea() {
        return PI * radius * radius;
    }

}
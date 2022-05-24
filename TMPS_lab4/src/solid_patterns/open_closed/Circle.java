package solid_patterns.open_closed;

public class Circle implements Shape{
    double radius;

    @Override
    public double calculateArea() {
        return 3.14*radius*radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}

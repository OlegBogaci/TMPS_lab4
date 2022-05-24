package solid_patterns.open_closed;

public class Rectangle extends Square{
    double width;
    double length;

    @Override
    public double calculateArea() {
        return width*length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}

package solid_patterns.open_closed;

public class Square implements Shape{
    double length;

    @Override
    public double calculateArea() {
        return length*length;
    }

    public void setLength(double length) {
        this.length = length;
    }
}

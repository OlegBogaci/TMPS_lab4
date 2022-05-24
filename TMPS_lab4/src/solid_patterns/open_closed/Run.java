package solid_patterns.open_closed;

public class Run {
    public static void main(String[] args) {
        Square square = new Square();
        square.setLength(5);
        System.out.println(square.calculateArea());

        Rectangle rectangle = new Rectangle();
        rectangle.setLength(5);
        rectangle.setWidth(10);
        System.out.println(rectangle.calculateArea());
    }
}

package solid_patterns.single_responsibility;

public class AssembleCar {
    private Car car;

    public AssembleCar(String brand, String color, String type) {
        car = new Car();
        car.setBrand(brand);
        car.setColor(color);
        car.setType(type);
    }

    public Car getCar() {
        return car;
    }
}

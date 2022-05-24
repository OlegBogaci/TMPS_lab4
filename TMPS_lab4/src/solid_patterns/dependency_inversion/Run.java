package solid_patterns.dependency_inversion;

public class Run {
    public static void main(String[] args) {
        Car toyota = new Car(new ElectricEngine());
        toyota.start();
    }
}

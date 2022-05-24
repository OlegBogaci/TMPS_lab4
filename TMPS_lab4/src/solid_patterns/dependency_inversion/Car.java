package solid_patterns.dependency_inversion;

public class Car {
    private final Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }
    public void start() {
        engine.start();
    }
}

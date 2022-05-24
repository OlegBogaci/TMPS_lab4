package solid_patterns.dependency_inversion;

public class ElectricEngine implements Engine{
    @Override
    public void start() {
        System.out.println("Bzz..............");
    }
}

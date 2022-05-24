package solid_patterns.dependency_inversion;

public class PetrolEngine implements Engine{
    @Override
    public void start() {
        System.out.println("Brrrrtbtbtbtb!!!....");
    }
}

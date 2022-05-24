package solid_patterns.single_responsibility;

public class Run {
    public static void main(String[] args) {
        CarShop toyota = new CarShop();
        AssembleCar newCar = new AssembleCar("toyota","red","pickup");

        toyota.addCarToShop(newCar.getCar(),20000);
    }

}

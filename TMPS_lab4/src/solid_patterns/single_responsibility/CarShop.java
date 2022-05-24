package solid_patterns.single_responsibility;

import java.util.ArrayList;
import java.util.List;

public class CarShop {
    List<Car> cars;

    public CarShop(){
        cars=new ArrayList<>();
    }

    public void addCarToShop(Car car, int price){
        car.setPrice(price);
        cars.add(car);
    }
}

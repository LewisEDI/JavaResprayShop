import behaviours.IDeliverable;
import cars.Car;

import java.util.ArrayList;

public class Garage {

    private String name;
    private ArrayList<Car> cars;

    public Garage(String name){
        this.cars = new ArrayList<Car>();
        this.name = name;

    }

    public int vehicleCount(){
        return cars.size();
    }

    public void addVehicles(Car car){
        this.cars.add(car);
        }

    public void scrapVehicles(){
        cars.clear();
    }


}


import behaviours.IDeliverable;

import java.util.ArrayList;

public class Garage {

    private String name;
    private ArrayList<IDeliverable> vehicles;

    public Garage(String name){
        this.vehicles = new ArrayList<IDeliverable>();
        this.name = name;

    }

    public int vehicleCount(){
        return vehicles.size();
    }

    public void addVehicles(IDeliverable vehicle){
        this.vehicles.add(vehicle);
        }

    public void scrapVehicles(){
        vehicles.clear();
    }


}


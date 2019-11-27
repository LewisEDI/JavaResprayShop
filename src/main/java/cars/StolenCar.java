package cars;

import behaviours.IDeliverable;

public class StolenCar extends Car implements IDeliverable {

    boolean heat;


    public StolenCar(String colour, String model, int year, boolean heat){
        super(colour, model, year);
        this.heat = heat;
    }

    public String takeToGarage(){
        return "stolen car taken to garage";
    }
}

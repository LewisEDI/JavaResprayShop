package cars;

import behaviours.IDeliverable;

public class LegalCar extends Car implements IDeliverable {


    public LegalCar(String colour, String model, int year){
        super(colour, model, year);

    }

    public String takeToGarage(){
        return "legal car taken to garage";
    }
}


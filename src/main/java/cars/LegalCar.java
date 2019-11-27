package cars;

import behaviours.ICanPay;
import behaviours.IChargable;
import behaviours.IDeliverable;
import people.Person;

public class LegalCar extends Car implements IDeliverable, IChargable {


    public LegalCar(String colour, String model, int year, boolean stolen){
        super(colour, model, year, stolen);

    }

    public String takeToGarage(){
        return "legal car taken to garage";
    }

    public String getColour(){
        return this.colour;
    }

    public void sprayCar(String newColour){
        this.colour = newColour;
    }

    public double price(){
        return 200;
    }

    public double priceFor(ICanPay person){
        if(person.getPaymentMethod() == "cash"){
            return (price()*2);
        } else {
            return price();
        }
    }
}


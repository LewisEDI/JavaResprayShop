package cars;

import behaviours.ICanPay;
import behaviours.IChargable;
import behaviours.IDeliverable;

public class StolenCar extends Car implements IDeliverable, IChargable {



    public StolenCar(String colour, String model, int year, boolean stolen){
        super(colour, model, year, stolen);

    }

    public String takeToGarage(){
        return "stolen car taken to garage";
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

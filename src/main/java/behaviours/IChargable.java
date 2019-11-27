package behaviours;

import people.Person;

public interface IChargable {

    public double price();
    public double priceFor(ICanPay person);
}

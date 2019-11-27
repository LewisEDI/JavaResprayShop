package people;

import behaviours.ICanPay;

public class Criminal extends Person implements ICanPay {
    private String areaOfCriminalExpertise;
    private String paymentMethod;
    private int availableCash;

    public Criminal(String name, String areaOfCriminalExpertise, String paymentMethod, int availableCash){
        super(name);
        this.areaOfCriminalExpertise = areaOfCriminalExpertise;
        this.paymentMethod = paymentMethod;
        this.availableCash = availableCash;
    }

    public String getAreaOfCriminalExpertise(){
        return this.areaOfCriminalExpertise;
    }


    public String getPaymentMethod(){
        return this.paymentMethod;
    }

    public int getAvailableCash(){
        return this.availableCash;
    }
}

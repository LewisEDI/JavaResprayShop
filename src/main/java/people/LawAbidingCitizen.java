package people;

public class LawAbidingCitizen extends Person {

    private int availableCash;
    private String job;
    private String paymentMethod;

    public LawAbidingCitizen(String name, int availableCash, String job, String paymentMethod){
        super(name);
        this.availableCash = availableCash;
        this.job = job;
        this.paymentMethod = paymentMethod;
    }

    public int getAvailableCash(){
        return this.availableCash;
    }

    public String getJob(){
        return this.job;
    }


    public String getPaymentMethod(){
        return this.paymentMethod;
    }

}

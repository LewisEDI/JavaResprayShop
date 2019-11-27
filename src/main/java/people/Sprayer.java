package people;

import cars.LegalCar;

public class Sprayer extends Person {


    private int paint;

    public Sprayer(String name, int paint){
        super(name);
        this.paint = paint;
    }

    public int getPaint(){
        return this.paint;
    }

    public void reducePaint() {
        this.paint -= 1;

    }

    public void sprays(LegalCar legalCar, String colour) {
        reducePaint();
        legalCar.sprayCar(colour);


    }
}

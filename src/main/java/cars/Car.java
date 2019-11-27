package cars;

public abstract class Car {

    String colour;
    String model;
    int year;

    public Car(String colour, String model, int year){
        this.colour = colour;
        this.model = model;
        this.year = year;
    }

    public String getModel(){
        return this.model;
    }

    public String getColour(){
        return this.colour;
    }

    public int getYear(){
        return this.year;
    }
}

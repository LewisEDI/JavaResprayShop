package cars;

public abstract class Car {

    String colour;
    String model;
    int year;
    boolean stolen;

    public Car(String colour, String model, int year, boolean stolen){
        this.colour = colour;
        this.model = model;
        this.year = year;
        this.stolen = stolen;
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

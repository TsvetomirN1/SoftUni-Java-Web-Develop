package DefiningClasses.constructors;

public class Car {
    private String make;
    private String model;
    private int horsepower;

    public Car(String make){
        this.make = make;
        this.model = "unknown";
        this.horsepower = -1;
    }

    public Car(String make, String model, int horsepower) {
        this(make);
        this.model = model;
        this.setHorsepower(horsepower);
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }
    public String carInfo(){
        return this.toString();
    }
    public String toString(){
        return String.format("The car is: %s %s - %d HP.",
                this.make,this.model,this.horsepower);
    }
}

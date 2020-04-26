package VehicleCatalouge;

public class Car {
    private String type;
    private String model;
    private String color;
    private int horsepower;

    public Car() {

    }

    public Car(String type,String model, String color, int horsepower) {
        this.type = type;
        this.model = model;
        this.color = color;
        this.horsepower = horsepower;
    }

    public int getHorsepower() {
        return this.horsepower;
    }

    public String getType() {
        return this.type;
    }

    public String getModel() {
        return this.model;
    }

    @Override
    public String toString() {
        String result = String.format("Type: %s%nModel: %s%nColor: %s%nHorsepower: %d", this.type, this.model, this.color, this.horsepower);
        return result;
    }

}

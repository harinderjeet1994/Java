public class Vehicle {


    String model;
    String make;
    String color;
    String year;


    public Vehicle(String model, String make, String color, String year) {
        this.model = model;
        this.make = make;
        this.color = color;
        this.year = year;
    }

    public void printDetails(){
        System.out.println("Model " + model);
        System.out.println("Make " + make);
        System.out.println("Color " + color);
        System.out.println("Year " + year);
    }
}

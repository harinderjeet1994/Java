public class Truck extends  Vehicle{
    String loadCapacity = "500 tonnes";

    public Truck(String model, String make, String color, String year, String loadCapacity) {
        super(model, make, color, year);
        this.loadCapacity = loadCapacity;
    }

    public void printTruckDetails(){
        printDetails();
        System.out.println("Load Capacity " + loadCapacity);
    }
}

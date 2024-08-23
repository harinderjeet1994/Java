public class Bike extends Vehicle{
    String passengerCap = "2";

    public Bike(String model, String make, String color, String year, String passengerCap) {
        super(model, make, color, year);
        this.passengerCap = passengerCap;
    }

    public void printBikeDetails(){
       printDetails();
        System.out.println("Passenger Capacity " + passengerCap);
    }
}

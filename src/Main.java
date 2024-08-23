public class Main {
    public static void main(String[] args) {

        Car car = new Car("Elantra","Hyundai","Red","2024","Sedan");
        car.printCarDetails();
        Truck truck = new Truck("520","Peterbilt","Red","2000","500 tonnes");
        truck.printTruckDetails();
        Bike bike = new Bike("Classic","Royal Enfield","Black","2018","2");
        bike.printBikeDetails();
    }
}

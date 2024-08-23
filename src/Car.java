public class Car extends Vehicle {
    String bodyType ;

    public Car(String model, String make, String color, String year, String bodyType) {
        super(model, make, color, year);
        this.bodyType = bodyType;
    }

    public void printCarDetails(){
        printDetails();
        System.out.println("Body Type " + bodyType);
    }
}

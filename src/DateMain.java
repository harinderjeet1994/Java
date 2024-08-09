public class DateMain {
    public static void main(String[] args) {
        Car1 car = new Car1("Charger");
        System.out.println(car.model);
        Car1 newCar = new Car1("Mustang", "Black");
        System.out.println(newCar.model + newCar.color);
        Car1 car2 = new Car1("Corvette", "Blue", "2024");
        System.out.println(car2.model +car2.color + car2.year);


    }
}

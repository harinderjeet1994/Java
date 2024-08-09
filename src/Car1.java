public class Car1 {
    String model;
    String color;
    String year;
    String type;

    public Car1(String model, String color, String year, String type) {
        this.model = model;
        this.color = color;
        this.year = year;
        this.type = type;
    }

    public Car1(String model, String color, String year) {
        this.model = model;
        this.color = color;
        this.year = year;
    }

    public Car1(String model, String color) {
        this.model = model;
        this.color = color;
    }

    public Car1(String model) {
        this.model = model;
    }

    public Car1() {
        String model = "Civic";
        String color = "Red";
        String year = "2023";
        String type = "Sedan";
    }
}

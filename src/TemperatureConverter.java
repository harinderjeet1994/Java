import java.util.Scanner;
public class TemperatureConverter {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the temperature in C ");


        double celsiusTemperature = scanner.nextDouble();

        double fahrenheitTemperature = (celsiusTemperature * 1.8) + 32;
        System.out.println("Temperature in fahrenheit " + fahrenheitTemperature);
        if (fahrenheitTemperature >= 85){
            System.out.println("It's hot outside");
        } else if (fahrenheitTemperature >= 60 && fahrenheitTemperature <= 84) {
            System.out.println("The weather is pleasant");

        } else if (fahrenheitTemperature < 60) {
            System.out.println("It's cold outside");

        }


    }

}

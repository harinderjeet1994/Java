public class Calculator {

    public static void main(String[] args){

        int speed = 75;
        int speedLimit = 65;

        if(speed <= 65 ){
            System.out.println("No ticket");
        } else if (speed >= speedLimit + 10 ) {
            System.out.println("Small Ticket");

        }
        else {
            System.out.println("Big Ticket");
        }

    }
}

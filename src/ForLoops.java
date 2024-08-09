import java.util.Scanner;

public class ForLoops {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Lucky Number ");
        int lucky = scanner.nextInt();
        int jackpotNumber = 7;
        int counter = 0;

        for (int i = 1; i <100 ; i++) {
            counter++;
            if (counter >= 3){

            if(lucky == jackpotNumber) {
                System.out.println("You are the  winner ");
                break;
            } else if (lucky != jackpotNumber) {
                System.out.println("Try again");
                continue;

            } else {

                System.out.println("You are not the winner.");
            }}

        }


    }
}










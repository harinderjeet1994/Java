import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the input for switch");

        int input = scanner.nextInt();

        switch (input) {
            case 1:
                System.out.println("Hello I am in case 1");
                break;

            case 2:
                System.out.println("Hello I am in case 2");
                break;

            case 3:
                System.out.println("Hello I am in case 3");
                break;

            default:
                System.out.println("Invalid input.... Please enter among 1,2,3");
        }


    }
}

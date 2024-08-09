import java.util.Scanner;

public class WhileMultiplication {
    public static void main(String[] args) {

        int x = 1;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the input");
        int n = scanner.nextInt();
        System.out.println("The result of multiplication of " + n + " till 13:");

        while (x <= 13){

            int multiplication = n * x;
            System.out.print(n + " * " );
            System.out.print(x + " = ");
            x++;

            System.out.println(multiplication);

        }



    }

    }


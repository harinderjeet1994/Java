import java.util.Scanner;
public class DoWhileMultiplication {
    public static void main(String[] args) {

        int x = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the input");
        int n = scanner.nextInt();
        do {
            int multiplication = n * x;
            System.out.print(n + " * " );
            System.out.print(x + " = ");
            x++;

            System.out.println(multiplication);
        }while (x <= 10);



    }
}

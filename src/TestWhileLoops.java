import java.util.Scanner;

public class TestWhileLoops {

    public static void main(String[] args) {

        int x = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the input");
        int number = scanner.nextInt();

        int sum = 0;

        while (x < number){
            System.out.println(x);
            x ++;
            sum += x;
        }
        System.out.println(sum);


    }

}

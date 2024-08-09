import java.util.Scanner;

public class Method {
    public static void main(String[] args) {

           char name;

        Scanner scanner = new Scanner(System.in);

        do {


        System.out.println("******************************");
        System.out.println("Welcome to My Calculator...");
        System.out.println("******************************");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Modulus");
        System.out.println("0. Exit");

        int input = scanner.nextInt();
        switch (input) {
            case 1:
                addition();
                break;
            case 2:
                subtraction();
                break;
            case 3:
                multiplication();
                break;
            case 4:
                division();
                break;
            case 5:
                multiplication();
                break;

            case 'Y':
                System.out.println("");
            case 'n':
                break;
            case 'N':
                break;
            default:
                System.out.println("You have successfully exited");
        }
           System.out.println("Do you still want to continue? Y for Yes and N for No");
        name = scanner.next().charAt(0);
           System.out.println(name);












    }while (name != 'N' && name != 'n'); }
    public static void addition(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input num1");
        int num1 = scanner.nextInt();
        System.out.println("Please input num2");
        int num2 = scanner.nextInt();
        int num3 = num1 + num2;

        System.out.println(num3);


   }

    public static void subtraction(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input num1");
        int num1 = scanner.nextInt();
        System.out.println("Please input num2");
        int num2 = scanner.nextInt();
        int num3 = num1 - num2;
        System.out.println(num3);
    }
    public static void multiplication(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input num1");
        int num1 = scanner.nextInt();
        System.out.println("Please input num2");
        int num2 = scanner.nextInt();
        int num3 = num1 * num2;
        System.out.println(num3);

    }

    public static void division(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input num1");
        double num1 = scanner.nextInt();
        System.out.println("Please input num2");
        double num2 = scanner.nextInt();
        double num3 = num1 / num2;
        System.out.println(num3);
   }

    public static void modulus(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input num1");
        int num1 = scanner.nextInt();
        System.out.println("Please input num2");
        int num2 = scanner.nextInt();
        int num3 = num1 % num2;
        System.out.println(num3);
    }








}

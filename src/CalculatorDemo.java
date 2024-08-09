import java.util.Scanner;

public class CalculatorDemo {
    public static void main(String[] args) {
        char name = 0;
        Scanner scanner = new Scanner(System.in);


       do {
           System.out.println("******************************");
           System.out.println("Welcome to My Calculator...");
           System.out.println("******************************");

           System.out.println("1. Addition");
           System.out.println("2. Multiplication");
           System.out.println("3. Subtraction");
           System.out.println("4. Division");
           System.out.println("5. Modulus");
           System.out.println("0. Exit");

           int input = scanner.nextInt();


           switch (input) {

               case 1:
                   System.out.println("Please enter number 1");
                   int num1 = scanner.nextInt();
                   System.out.println("Please enter number 2");
                   int num2 = scanner.nextInt();
                   int sum = num1 + num2;
                   System.out.println("The sum of num 1 and num2 is " + sum);
                   break;

               case 2:
                   System.out.println("Please enter number 1");
                   int num3 = scanner.nextInt();
                   System.out.println("Please enter number 2");
                   int num4 = scanner.nextInt();
                   int multiplication = num3 * num4;
                   System.out.println("The multiplication of num 1 and num2 is " + multiplication);
                   break;

               case 3:
                   System.out.println("Please enter number 1");
                   double num5 = scanner.nextDouble();
                   System.out.println("Please enter number 2");
                   double num6 = scanner.nextDouble();
                   double subtraction = num6 - num5;
                   System.out.println("The subtraction of num 1 and num2 is " + subtraction);
                   break;

               case 4:
                   System.out.println("Please enter number 1");
                   double num7 = scanner.nextInt();
                   System.out.println("Please enter number 2");
                   double num8 = scanner.nextDouble();
                   double division = num8 / num7;
                   System.out.println("The division of num 1 and num2 is " + division);
                   break;

               case 5:
                   System.out.println("Please enter number 1");
                   double num9 = scanner.nextInt();
                   System.out.println("Please enter number 2");
                   double num10 = scanner.nextDouble();
                   double modulus = num9 % num10;
                   System.out.println("The modulus of num 1 and num2 is " + modulus);
                   break;


               case 'Y':
                   System.out.println("");
               case 'N':
                   break;


               default:
                   System.out.println("You have successfully exited");


           }


           System.out.println("Do you still want to continue? Y for Yes and N for No");
           name = scanner.next().charAt(0);
           System.out.println(name);


       }while (name != 'N');

    }}


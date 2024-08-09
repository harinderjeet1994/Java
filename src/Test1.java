import java.util.Scanner;

    public class Test1{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int winningNumber = 55; // Fixed number for the lottery
            int count = 0; // To track the number of attempts

            System.out.println("Enter your lucky number and take your first attempt.");

            // Loop through numbers 1 to 100
            for (int i = 1; i <= 100; i++){

                int x = scanner.nextInt();
                if (x == winningNumber){
                    System.out.println("Congratulations you won");
                    break;

                } else  {
                    System.out.println("You only have two attempts left");

                }
                int y = scanner.nextInt();
                if (y == winningNumber){
                    System.out.println("Congratulations you won");
                    break;
                }
                else {
                    System.out.println("You only have one attempt left");
                }
                int z = scanner.nextInt();
                if (z == winningNumber){
                    System.out.println("Congratulations you won");
                    break;
                }
                else {
                    System.out.println("You lost");
                    break;
                }
        }


        }}



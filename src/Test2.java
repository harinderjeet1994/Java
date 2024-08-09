import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {


    }
    public void lottery(){
        Scanner scanner = new Scanner(System.in);
        int winningNumber = scanner.nextInt();
        System.out.println("Please choose a lucky number and start your first attempt.");
        for (int x = 1; x <= 100; x++){
            if (winningNumber == x){
                System.out.println("You are the winner");
            }
        }

    }
}

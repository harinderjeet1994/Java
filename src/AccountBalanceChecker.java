public class AccountBalanceChecker {

    public static void main(String[] args){

        double balance = 350.50;

        if (balance >= 1000){
            System.out.println("You have a healthy balance");
        }
        else if (balance >= 500 && balance <= 999){
            System.out.println("Your balance is adequate");
        } else if (balance >= 100 && balance <= 499) {
            System.out.println("Your balance is low");

        } else if (balance < 100) {
            System.out.println("Your balance is very low");
        }

    }

}

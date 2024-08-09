import java.util.Scanner;

public class IvrDemoSwitch {
    public static void main(String[] args) {

        System.out.println("Welcome to Rogers!");
        System.out.println("Press 1 for English");
        System.out.println("Press 2 for French");
        Scanner scanner = new Scanner(System.in);
        int ivr = scanner.nextInt();
        switch (ivr) {
            case 1:
                System.out.println("Press 1 for internet");
                System.out.println("Press 2 for Billing");
                System.out.println("Press 3 for for Mobile Services");
                System.out.println("Press 4 for Tech Support");
                System.out.println("Press 5 for General Inquiries");

        }
        int internet = scanner.nextInt();
        switch (internet) {
            case 1: System.out.println("Press 1 if you are a new internet user");
                System.out.println("Press 2 if you are existing user");
            case 2:
                System.out.println("Press 1 for current bill");
                System.out.println("Press 2 for last bill");
                System.out.println("Press 3 to file a dispute");
                System.out.println("Press 4 to talk to agent");
            case 3:
                System.out.println("Press 1 to purchase a new plan");
                System.out.println("Press 2 if you want to make changes to existing plan");
                System.out.println("Press 3 to add a new line");
                System.out.println("Press 4 if you want to purchase a new device.");
                System.out.println("Press 5 to talk to agent.");

        }
    }


}

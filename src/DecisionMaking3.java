public class DecisionMaking3 {

    public static void main(String[] args){
    int age = 19;
    if(age >= 0 && age < 16){
        System.out.println("Not eligible to drive");
    }
    if (age >= 16 && age <= 19){
        System.out.println("You can have learners license");
    }
    if (age > 19){
        System.out.println("Eligible to drive without any restrictions");
    }

}
}

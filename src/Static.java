public class Static {
    public static void main(String[] args) {

        Static s = new Static();
        s.counter();

        Static s1 = new Static();
        s1.counter();
    }
    static int counter = 1;




        public void counter(){

        while (counter < 10){
            counter++;
            System.out.println(counter);


    }
}}

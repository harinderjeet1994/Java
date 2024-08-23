public class StringBuilder {
    public static void main(String[] args) {


        StringBuffer s1 = new StringBuffer("Toronto");
        System.out.println(s1);
        System.out.println(s1.reverse());

        System.out.println(s1.insert(0, 'A'));

        System.out.println(s1.replace(0, 3, "Canada"));
        System.out.println(s1.append('i'));
        System.out.println(s1.capacity());
        System.out.println(s1.charAt(5));
        System.out.println(s1.length());


    }
}

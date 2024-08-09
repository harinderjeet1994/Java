public class MethodOverloading {
    public static void main(String[] args) {


        MethodOverloading m = new MethodOverloading();
        String a = m.profile("Harinderjeet");
        System.out.println(a);
        String b = m.profile("Harinderjeet", "abc@xyz");
        System.out.println(b);
        String c = m.profile("Harinderjeet", "abc@xyz", "123");
        System.out.println(c);



    }
    public String profile(String name) {
        return "Hello " + name;
    }
    public String profile(String name, String email){
        return (name)  + " and your email is " + email;
    }

    public String profile(String name, String email, String phone){
        return name + email + "your phone number is " + phone;
    }
}

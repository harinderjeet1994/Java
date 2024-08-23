public class Student {

    String name = "Harinder";
    String email = "abc@xyz";
    String phone = "12345";
    String address = "Milton";
    static String school = "Pragra";

   public Student(){
        System.out.println("This is the default constructor");
    }
    public Student(String name, String address, String school ){
       this();
       this.name = name;
        System.out.println( name + " This is the parameterized cons with id");
    }
    public Student(String name, String email, String address, String school){

       this.name = name;
       this.email = email;
       this.address = address;
       Student.school = school;

        System.out.println("this is param cons with id and email");

    }

    public void read(){
        System.out.println("Student reads...");
    }
}

public class Student {

    String id;
    String firstName;
    String lastName;
    String email;

   public Student(){
        System.out.println("This is the default constructor");
    }
    public Student(String id){
       this();
       this.id = id;
        System.out.println( id + " This is the parameterized cons with id");
    }
    public Student(String id, String email){
       this("101");
       this.id = id;
       this.email = email;
        System.out.println("this is param cons with id and email");

    }

    public void read(){
        System.out.println("Student reads...");
    }
}

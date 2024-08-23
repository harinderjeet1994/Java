public class Main1 {
    public static void main(String[] args) {



        Student student = new Student("Harinderjeet", "abc@xy", "Toronto", Student.school);
        System.out.println("Student name is " + student.name + ".Email of the student is " + student.email + " Adress: " + student.address + " school is " + student.school);
        student.read();
    }



}


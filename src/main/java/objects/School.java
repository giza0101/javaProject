package objects;

public class School {
    public static void main(String[] args) {

        Student student1 = new Student();
        student1.name = " Leo";
        student1.phone = "123456999 ";
        student1.email = "Leogram@gmail.com";
        student1.age = 18;
        student1.major = "Law";



         Student student2  = new Student();
        student2.name = " Giza";
        student2.phone = "566647888";
        student2.email = "giza@gmail.com";
        student2.age = 35;
        student2.major = "Dentist";


        student1.read();
        student2.read();


        student1.attendClass();
        student2.attendClass();

        student1.printInfo();
        student2.printInfo();
    }
}

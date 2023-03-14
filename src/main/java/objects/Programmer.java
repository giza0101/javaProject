package objects;

public class Programmer {

    int age;
    String name;
    String gender;
    static String profession = "programmer";

    public static void main(String[] args) {

        Programmer object1 = new Programmer();
        object1.age = 25;
        object1.name = "Mark";
        System.out.println(object1.name);
        System.out.println(object1.age);
        System.out.println(object1.gender);
        System.out.println(object1);
        System.out.println(Programmer.profession);//programmer

        object1.name = "Lisa";
        System.out.println(object1.name);//Mark

    }
}

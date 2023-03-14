package objects;

public class Zoo {
    public static void main(String[] args) {

        Animal animal1 = new Animal();
        animal1.type = " Line ";
        animal1.age = "4";
        animal1.habitat = "Africa";
        animal1.isCarnivore = true;
        animal1.IsMammal = true;





        Animal animal2 = new Animal();
        animal2.type = " Snake ";
        animal2.age = "2";
        animal2.habitat = " warm edge";
        animal2.isCarnivore = true;
        animal2.IsMammal = true;


        animal1.sleep();
        animal2.sleep();

        animal1.eat();
        animal2.eat();

        animal1.play();
        animal2.play();



    }
}

package methods;

public class Cat {

    static boolean isCarnivore = true;
    static boolean isMammal = true;

    String type;
    double weight;

    byte age;

    public void eat(){
        System.out.println(type + "is eating");
    }

    public void sleep(int hours){
        System.out.println(type + "slept for"+ hours);

    }

    public static void main(String[] args) {
        System.out.println("Welcome to chicago Zoo! Enter your employee id");
        Cat line = new Cat();
        Cat tiger = new Cat();
        Cat cheetah = new Cat();

        line.age = 4;
        tiger.age = 5;

        cheetah.sleep(4);

       tiger.isMammal = false;


    }

}

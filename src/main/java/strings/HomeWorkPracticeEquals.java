package strings;
public class HomeWorkPracticeEquals {
    public static void main(String[] args) {

        String hello1 = "Hello World";
        String hello2 = "Hello world";
        String hello3 = new String("HelloWorld!");

        //task1
        boolean g1 = hello1.equals(hello2);
        System.out.println(g1);
        //task2
        boolean g2 = !hello1.equals(hello3);
        System.out.println(g2);
        //task3
        boolean g3 = hello1.equals(hello2);
        System.out.println(g3);
        //task4
        String cold1 = hello1.toLowerCase();
        String cold2 = hello2.toLowerCase();
        boolean g4 = hello2.equals(cold1 + cold2);
        System.out.println(g4);
        //task5
        String cold3 = hello1.toUpperCase();
        String cold4 = hello3.toUpperCase();
        boolean g5 = cold3.equals(cold4);
        System.out.println(g5);




    }
}

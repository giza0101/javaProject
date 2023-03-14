package strings;

public class HomeWorkManipulationString {
    public static void main(String[] args) {

        // Task 1
        String hello = "Hello World";
        System.out.println(hello.indexOf('W'));

        // Task 2
        System.out.println(hello.charAt(0));

        // Task 3
        System.out.println(hello.substring(0, 5).toLowerCase());

        // Task 4
        System.out.println(hello.substring(0, 5).toUpperCase());

        // Task 5
        String hello1 = "hello";
        String hello2 = "Hello";
        System.out.println(hello1.equals(hello2));
        System.out.println(hello1.equalsIgnoreCase(hello2));
        System.out.println(!hello1.equals(hello2));
        System.out.println(hello1 == hello2);


        // Task 6
        String a = "the quick brown gox";
        String b = (a.charAt(0) + "" + a.charAt(4) + a.charAt(10)  + a.charAt(16));
        System.out.println(b);
        System.out.println(b.toUpperCase());
        System.out.println(b.toLowerCase());


        // Task 7
        hello = "Hello";
        System.out.println("" + hello.charAt(4) +  hello.charAt(3) +
                hello.charAt(2) + hello.charAt(1) + hello.charAt(0));


        // Task 8

        String helloWorld = "Hello World";
        int count = 0;
        for (int i = 0; i < helloWorld.length(); i++) {
            char ch = helloWorld.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                count++;
            }
        }
        System.out.println("The number of vowels in the string is: " + count);


        // Task 9
        hello = "Hello";
        String world = "World";
        System.out.println(hello + " " + world);

        // Task 10
        hello = "hello";
        hello1 = "HELLO";
        System.out.println(hello.equalsIgnoreCase(hello1));

        // Task 11
        helloWorld = "Hello World";
        System.out.println(helloWorld.length());

        // Task 12
        hello = "Hello";
        System.out.println(hello.charAt(3));

        // Task 13
        System.out.println(helloWorld.indexOf('l'));

        // Task 14
        hello = "hello";
        hello1 = "hello";
        System.out.println(hello == hello1);
        System.out.println(hello.equals(hello1));
        System.out.println(!hello.equals(hello1));

        // Task 15
        hello = "hello";
        hello1 = "HELLO";
        System.out.println(hello.equals(hello1));
        System.out.println(hello == hello1);
        System.out.println(hello.equalsIgnoreCase(hello1));

        // Task 16
        System.out.println(helloWorld.toLowerCase());

        // Task 17
        System.out.println(helloWorld.toUpperCase());

        // Task 18
        helloWorld = "Hello World";
        System.out.println(helloWorld.replace('l', 'r'));

        // Task 19
        a = "the quick brown gox";
        b = (a.charAt(0) + "" + a.charAt(4) + a.charAt(10)  + a.charAt(16));
        System.out.println(b);
        System.out.println(b.toUpperCase());
        System.out.println(b.toLowerCase());




    }
}

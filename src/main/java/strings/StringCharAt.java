package strings;

public class StringCharAt {
    public static void main(String [] args){

        String welcomeSign = "Hello everyone! Welcome to Chicago";
        char c = welcomeSign.charAt(14);
        System.out.println(c);

        char cc = welcomeSign.charAt(2);
        System.out.println(cc);
        /*
        print the char letter using and length methods
         */

        int length = welcomeSign.length();
        System.out.println(length);
        System.out.println(welcomeSign.charAt(welcomeSign.length() -1));


    }
}

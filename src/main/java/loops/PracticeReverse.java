package loops;

import java.util.Scanner;

public class PracticeReverse {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println();

        String name = "Elturan"; //name: "Elturan"
        String reverse = "";//"o" + 'r' reverse
        for( int i = name.length() - 1; i >= 0; i--){
            reverse += name.charAt(i);
        }
        System.out.println();
    }
}

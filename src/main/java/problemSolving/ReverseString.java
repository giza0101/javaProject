package problemSolving;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        /*
        apple=>elppa

        create Scanner and get String from the user
        create String word = comes from Scanner
        create String reversedWord = "";
        loop though the word from end to beggin
        reversed += and get the char

         */


        Scanner scanner = new Scanner(System.in);
        System.out.println("hello Giza");
        String word1 = scanner.next();
        String reversed = "";
        for( int i = word1.length()-1;i>=0;i++){
            reversed += word1.charAt(i);
        }
        System.out.println(reversed);
    }
}

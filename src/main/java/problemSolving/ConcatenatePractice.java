package problemSolving;

import java.util.Locale;
import java.util.Scanner;

public class ConcatenatePractice {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println();
        String word1 = scanner.nextLine();//apple
        String word2 = scanner.nextLine();//banana


        word1 = word1.toLowerCase();
        word2 = word2.toLowerCase();

        System.out.println(word1 + word2.toUpperCase().charAt(0) + word2.substring(1));


        //==============================================
        word1 = word1.toUpperCase().charAt(0) +word1.substring(1);
        word2 = word2.toUpperCase().charAt(0) + word2.substring(1);

        System.out.println(word1 + word2);

        //===============================================

        word1 = word1.toUpperCase();
        word2 = word2.toLowerCase();


        System.out.println( word1.toUpperCase().charAt(word1.length()-2) + " " + word1.charAt(word1.length()-1) +
                word2.toUpperCase().charAt(word2.length()-2) + " " + word2.charAt(word2.length()-1));







    }
}

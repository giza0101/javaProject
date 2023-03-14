package problemSolving;

import java.util.Scanner;

public class LetterFrequency {
    public static void main(String[] args) {

        /*
        1.
        2.create int counter
        3.create for loop which starts from 0 up until the length
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word ");
        String word = scanner.nextLine();


        for ( int i = 0; i < word.length();i++){
            int counter = 0;//exp:apple
            for(int k = 0; k < word.length();k++ ) {


                if (word.charAt(i) == word.charAt(k)){
                    counter++;
                }
            }
            System.out.println(word.charAt(i) + " : " + counter);
        }







    }
}

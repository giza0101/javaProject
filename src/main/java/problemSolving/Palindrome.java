package problemSolving;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        String reverseString = "";
        boolean palindrome = true;

        for (int i = reverseString.length()-1 ; i >= 0; i--) {
            reverseString += reverseString.charAt(i);
        }
        if (reverseString.equals(reverseString)){
            System.out.println("It's a palindrome");
        }else{
            System.out.println("It's not a palindrome");
        }


        int length = word.length();
        boolean isPalindrome= true;


        for( int i = 0; i < length/2; i ++){
            if(word.charAt(i) != word.charAt(length -1-i) ){
                isPalindrome = false;
            }

        }
        System.out.println(isPalindrome);

    }
}

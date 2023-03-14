package loops;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        /*
        write a program that generates a random number  1 to 100
        and ask user to enter number , thr program should say
        "Too low,try again", if guessed number is lower,
        "Too high,try again", if guessed
         */

        int randomNumber = new Random().nextInt( 1,100);

        Scanner user = new Scanner(System.in);
        int number;

        do{
            System.out.println("Enter number");
            number = user.nextInt();
            if(number < randomNumber){
                System.out.println(" To low");

            }
            else if( number > randomNumber){
                System.out.println("To high");
            }
            else{
                System.out.println("U guessed the right number");
                break;
            }
            if( number <1||number>100){
                System.out.println("Enter number in range 1 - 100");
            }

        }while ( number <=100);
    }
}

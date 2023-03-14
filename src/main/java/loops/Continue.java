package loops;

import java.util.Scanner;

public class Continue {
    public static void main(String[] args) {
        /*
        create a program that prints number from 1 to 10
        if number is equal to 5, do not print
         */
        for ( int i =1; i <=10; i ++) {

            if (i == 5) {
                continue;
            }
            System.out.println(i);
        }

/*
print all numbers from1 to 100 skipping even numbers
 */

        for( int a = 1; a <= 100; a ++ ){
            if ( a % 2 ==0){
                continue;
            }
            System.out.println(a);
        }

        //=======================================

        for ( int s = 1; s <= 100; s ++){
            if( s % 3 == 0){
                continue;
            }
            System.out.println(s);
        }

        //=========================================

        Scanner user = new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        int negative = user.nextInt();
        int positive = user.nextInt();
        for ( int e = negative; e <= positive ; e ++){
            if ( e < 0 && e % 2 ==0){

                continue;
            }
            else if (e > 0 && e % 2 != 0){
                continue;
            }
            System.out.println(e);
        }
    }
}

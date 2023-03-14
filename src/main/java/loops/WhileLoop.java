package loops;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {

        int i = 1;

        while (i <= 10) {
            System.out.println(i);
            i++;
        }

        int s = 1;
        while (s <= 100) {
            if (s % 2 == 0) {
                System.out.println(s);
            }

            s++;

        }

        int l = 1;
        while (l <= 10) {
            System.out.println("Good morning everyone");
            l++;
        }

        for (int b = 1; b <= 10; b++) {
            System.out.println("Good afternoon");
        }


        //=============================================




        int g = 1;
        while (g <= 31) {
            System.out.println(g + " January 2023");
            g++;
        }


        //==================================================

        Scanner user = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = user.nextInt();//40 it cannot be
        boolean isPrime= true;

        int bb= 2;
        while( bb<number){
            if(number % bb == 0){
                isPrime = false;
                break;

            }
            bb++;
        }
        if(isPrime){
            System.out.println("Number is prime");
        }
        else{
            System.out.println(" Not prime");
        }




    }

}
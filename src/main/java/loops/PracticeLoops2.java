package loops;

import java.util.Scanner;

public class PracticeLoops2 {
    public static void main(String[] args) {


        Scanner user = new Scanner(System.in);
        System.out.println("Enter number");
        int number = user.nextInt();

        boolean isPrime = true;


        for( int a = 5; a < number; a++ ){

            if( number % a == 0){

                isPrime = false;
                break;
            }
        }
        if(isPrime){
            System.out.println("Number is prime");
        }
        else{
            System.out.println("Not prime");
        }
    }
}

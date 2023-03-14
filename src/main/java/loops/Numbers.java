package loops;

import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        /*
        create a program that will keep asking a user to enter positive numbers,
        until negative number is entered.
        2,4,5,6,7,8,8,8,-7

        enter a positive number(or negative to quit);5
        enter a positive number(or negative to quit);5
        enter a positive number(or negative to quit);9
        enter a positive number(or negative to quit);11
        enter a positive number(or negative to quit);-8
         the overage of all numbers:7.5
         the sum of all numbers:30
         You entered this number at least twice:5
         (optional)The largest number is :11
         (optional)The lowest number is :5
         break continue,while loop,scanner,double, int

         int counter++
         sum++;
         If(number<0){
         break;


         */


        Scanner user = new Scanner(System.in);
        int number1;
        int sum = 0;
        int numOfNumbers = 0;
        while(true){
            System.out.println("Enter a positive number(or negative to quit);");
            int number = user.nextInt();

            if (number ==0){
             continue;

            }
            else if(number<0){
                break;

            }

            sum += number;
            numOfNumbers++;

        }
        System.out.println("The sum of all numbers" + sum);
        System.out.println("the average of all numbers" + sum/ numOfNumbers);
    }
}

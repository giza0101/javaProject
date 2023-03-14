package loops;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        /*
        create a program that asks use enter one number
        arithmetic operator(+,-,*,/,%)
        second number
        output the result


        Ask user if he wants to try again?yes or no
        if yes,calculate again
        if no,stop

        Use do while loop.if else,switch,Scanner
         */

        Scanner user = new Scanner(System.in);

        boolean yesNo = true;
        do {
            System.out.println("Enter number");
            int number = user.nextInt();
            System.out.println("Enter arithmetic operator");
            String str = user.next();
            System.out.println("Enter second number");
            int number2 = user.nextInt();
            System.out.println("Enter output");
            if (str.equals("+")) {
                System.out.println(number + "+" + number2 + "=" + (number + number2));
            } else if (str.equals("/")) {
                System.out.println(number + "/" + number2 + "=" + (number + number2));
            } else if (str.equals("*")) {
                System.out.println(number + "*" + number2 + "=" + (number + number2));
            } else if(str.equals("-")){
                System.out.println(number + "-" + number2 + "=" + (number + number2));
            }else if(str.equals("%")){
                System.out.println(number + "%" + number2 + "=" + (number + number2));
            }else{
                System.out.println("Invalid number");
            }

        }while(yesNo );

    }
}

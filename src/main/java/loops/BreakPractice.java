package loops;


import java.util.Scanner;

public class BreakPractice {
    public static void main(String[] args) {

        /*
        create a program that ask user to enter 2 numbers
        print all numbers up until the sum of 2 numbers
        if there is number which is equal to 45,stop the loop
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter 2 numbers");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        int sum = num1 + num2;
        for(int i = 1; i <=sum;i++ ){
            System.out.println(i);

            if(i==45){
                break;
            }
        }
    }
}

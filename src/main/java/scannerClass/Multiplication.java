package scannerClass;

import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {

        Scanner cc = new Scanner(System.in);

        System.out.println("Enter first number");
        double sum1 = cc.nextDouble();

        System.out.println("Enter second number");
        double sum2 = cc.nextDouble();

        System.out.println("Enter third number");
        double sum3 = cc.nextDouble();

        System.out.println("thanks for your input");
        System.out.println("the result " + (sum1 * sum2 * sum3));
    }
}

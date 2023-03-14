package scannerClass;

import java.util.Scanner;

public class IntroToScanner {
    public static void main(String[] args) {

        Scanner gg = new Scanner(System.in);

        System.out.println("Enter first number");
        int num1 = gg.nextInt();

        System.out.println("Enter second number");
        int num2 = gg.nextInt();

        System.out.println("the sum:" + (num1 +num2));
    }
}

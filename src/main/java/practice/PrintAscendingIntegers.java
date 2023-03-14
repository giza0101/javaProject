package practice;
import java.util.Scanner;
public class PrintAscendingIntegers {
    public static void main(String[] args) {


        Scanner cc = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = cc.nextInt();
        System.out.println("enter 2nd number");
        int b = cc.nextInt();
        System.out.println("enter 3nd number");
        int c = cc.nextInt();
        System.out.println("enter 4 number");
        ;

        if (a > b && a > c) {
            if( b>c)
            System.out.println( "Ascending order" + c + "," + b + "," + a);
            System.out.println("Descending order:" + a + "," + b + "," + c);
        } else {
            System.out.println("ascending order"  + b + "," + c + "," + a);
            System.out.println("descending order" + a + "," + b + "," + c);
        }

    }


    }


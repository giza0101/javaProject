package practice;
import java.util.Scanner;
public class CompareInts {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter first number");

        int a = scanner.nextInt();
        System.out.println("enter 1st number");
        int b = scanner.nextInt();
        System.out.println("enter 2nd number");
        int c = scanner.nextInt();
        System.out.println("enter 3nd number");

        if( a > b && b >c ){
            System.out.println(a);
        }
        else if(a< b && b <c){
            System.out.println(b);
        }
        else if(a>b && c > a){
            System.out.println(c);
        }
        else{
            System.out.println();
        }


    }
}

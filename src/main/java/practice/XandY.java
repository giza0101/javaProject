package practice;
import java.util.Scanner;

public class XandY {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        int x = scanner.nextInt();
        System.out.println("Enter second number");
        int y = scanner.nextInt();
        if(x >0 && y > 0){
            System.out.println("Both x and y positive");
        }
        else if(x==0 ||y==0){
            System.out.println("Either x and y zero");
        }
        else if(x < 0 && y < 0){
            System.out.println("Both x and y negative");

        }
        else {
            System.out.println("one is positive,the other is negative");
        }
    }
}

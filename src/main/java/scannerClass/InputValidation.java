package scannerClass;

import java.util.Scanner;

public class InputValidation {
    public static void main(String[] args) {

        int num = 8;

        Scanner user = new Scanner(System.in);
        System.out.println("Enter an integer between 1 to 10");
        double c1 = user.nextInt();
        System.out.println("input is within the specified");
        String inPut = user.next() ;
        System.out.println("inPut is valid");
        if(num >= 1 && num <=10){
            System.out.println("Valid inPut");
        }
        else{
            System.out.println("Invalid inPut");
        }
    }
}

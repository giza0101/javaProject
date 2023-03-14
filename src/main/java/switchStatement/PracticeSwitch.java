package switchStatement;

import java.util.Scanner;

public class PracticeSwitch {
    public static void main(String[] args) {

        Scanner user = new Scanner(System.in);
        System.out.println("Enter A,B,C,D or F");
        String grade = user.nextLine();
        switch( grade){
            case "A":
                System.out.println( "Good job");
                break;
            case "B":
                System.out.println( " Good morning");
                break;
            case "C":
                System.out.println( " Good evening");
                break;
            case "D":
                System.out.println( "Good day");
                break;
            case "F":
                System.out.println("bad day");
                break;
            default:
                System.out.println("Invalid word");

        }
    }
}

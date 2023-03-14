package practice;
import java.util.Scanner;
public class PracticeStringLength {
    public static void main(String[] args) {

        Scanner gg = new Scanner(System.in);
        System.out.println("enter first string");

        String aa = gg.nextLine();
        System.out.println( "enter second string");
        String ab = gg.nextLine();

        if( aa.length() > ab.length()){
            System.out.println(aa + ":" + aa.length());

        }
        else if ( aa.length()> ab.length()){
            System.out.println(aa + ":" + ab.length());
        }
        else{
            System.out.println(aa + " " + ab + " :"  + aa.length());
        }
    }
}

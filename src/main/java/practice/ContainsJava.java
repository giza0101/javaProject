package practice;

import java.util.Scanner;

public class ContainsJava {
    public static void main(String[] args) {


        Scanner gg = new Scanner(System.in);
        System.out.println( "Giza");
        String Giza = gg.nextLine();

        if(Giza.toLowerCase().contains( "giza")){
            System.out.println("Yes ,contains Giza");
        }
    }
}

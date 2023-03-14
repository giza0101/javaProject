package IfElse;

import java.util.Scanner;

public class ZipCodePractice {
    public static void main(String[] args) {

        Scanner user = new Scanner(System.in);
        System.out.println("Enter 5 digit zip code");
        int zipCod = user.nextInt();//60018
        String zip = zipCod + "";

        if( (zip.length()==5 && !zip.contains("9") && !zip.startsWith("0"))){
            System.out.println("Zip code is valid");
        }
        else {
            System.out.println( " Entered zip cod is not valid.");
        }
    }
}

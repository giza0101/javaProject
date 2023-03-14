package scannerClass;

import java.util.Scanner;

public class Season {
    public static void main(String[] args) {
        /*
        Ask user to enter the name of the month:
        january,february,march,december


        using if else condition ,check the month and print winter ,spring,summer,autumn
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the name of the month");
        String nameofMonth = scanner.next();
        System.out.println("Enter month");
        if(nameofMonth.equalsIgnoreCase("january") ||nameofMonth.equalsIgnoreCase("february" )
                ||nameofMonth.equalsIgnoreCase("december")) {
            System.out.println("Winter time");
        }
        else if(nameofMonth.equalsIgnoreCase("march") ||
        nameofMonth.equalsIgnoreCase("april") ||nameofMonth.equalsIgnoreCase("may")) {
            System.out.println("Spring time");
        }
        else if (nameofMonth.equalsIgnoreCase("june") ||nameofMonth.equalsIgnoreCase("july")
                || nameofMonth.equalsIgnoreCase("august")){
            System.out.println("Summer");
        }
        else if(nameofMonth.equalsIgnoreCase("september") ||nameofMonth.equalsIgnoreCase("october")||
               nameofMonth.equalsIgnoreCase("november")){

            System.out.println( "autumn");
        }
        else{
            System.out.println("Invalid season");
        }





    }
}

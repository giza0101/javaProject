package scannerClass;

import java.util.Scanner;

public class Weather {
    public static void main(String[] args) {

        Scanner user = new Scanner(System.in);

        System.out.println("Enter temperature");
        double temp = user.nextDouble();

        System.out.println("Is it raining?true/false");
        boolean isRaining = user.nextBoolean();

        if(temp<0){
            System.out.println("it is freezing outside!Wear a heavy coat,gloves,and a hat");
        }
        else if(isRaining && temp >=0 &&temp <=10){
            System.out.println("It's chilly and rainy1 Wear a raincoat,boots, and a scarf ");
        }
        else if(isRaining && temp >=0 && temp<= 10){
            System.out.println("its chilly outside! Wear a jacket,gloves and a hat");
        }
        else if(isRaining && temp >=11 && temp <= 20){
            System.out.println("it's cool and rainy1Wear a light jacket,boots and a scarf");
        }




    }
}

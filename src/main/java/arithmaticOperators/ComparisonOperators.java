package arithmaticOperators;

import java.security.PublicKey;

public class ComparisonOperators {

    public static void main(String [] args){

        /*
        Comparison operators are used to campare 2 values
        >
         */
        byte potato = 5;
        byte fries = 10;

        System.out.println( potato > fries);//false
        System.out.println(potato < fries);//true
        System.out.println( potato >= fries);//false
        System.out.println(potato<=fries);//true
        System.out.println(potato==fries);//false
        /*
        -great 2 bytes, 2 shorts,2 int,2 long
        -assign different values
        -compare bytes with shorts and ints
        (first just print,second comparison store in boolean and print)
        -compare longs with bytes and ints
        (first just print,second comparison store in boolean and print)


         */

        int one = 5;
        int two = 4;
        System.out.println(one > two);


        byte rice = 15;
        byte nuts = 20;
        System.out.println(rice > nuts);//false
        System.out.println(rice < nuts);
        System.out.println(rice >= nuts);
        System.out.println(rice <= nuts);
        System.out.println(rice==nuts);
        System.out.println(rice != nuts);

        short game = 30;
        short ball = 40;
        System.out.println(game > ball);
        System.out.println(game < ball);
        System.out.println(game>= ball);
        System.out.println(game == ball);

        System.out.println(1 +2);//3
        System.out.println(1 + 2 + " hello");//3Hello
        System.out.println("hello" + 1 + 2);//hello12
        System.out.println("hello" + 3 + true);
        System.out.println("hello" + (1 + 2));


        int flowers = 50;
        int rose = 60;
        System.out.println(flowers > rose);
        System.out.println(flowers < rose);
        System.out.println(flowers >= rose);
        System.out.println(flowers == rose);
        System.out.println(flowers != rose);

        System.out.println("hello" + "  " + "my" +"  " + "name" + "  " +  "is" + "  "  + "Giza");

        String hello = "hello";

        System.out.println(hello);

        int numberFive = 5;

        System.out.println(numberFive);

        boolean isBotteSvsilsble = true;

        byte number = 1;





    }

}

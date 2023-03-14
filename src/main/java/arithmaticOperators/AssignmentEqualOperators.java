package arithmaticOperators;

public class AssignmentEqualOperators {

    public static void main(String[] args){
        /*

        = assignment operator ( when you give value to variable)
        == equal equal operator (compares two variables if they
        are equal or not)
        != not equal operator(compares if two variables are
        not equal)




         */

        int number1 = 10;//assigment
        int number2 = 8;

        System.out.println(number1 ==number2);//false
        System.out.println(100 == 100);//true

        boolean isEqual = 100 == 101;
        System.out.println(isEqual);

        boolean isDivisibleBy6;
        boolean isEven;// if number can be divided by2

        isEven = 80 % 2 == 0;//true
        isEven = 14324354632430L % 2 == 0;
        System.out.println(isEven);

        boolean Giza1 = 120 == 120;
        System.out.println(Giza1);

        boolean Giza2 = 150 == 70;
        System.out.println(Giza2);

        boolean IceCream = 20 == 3;
        System.out.println(IceCream);



    }
}

package IfElse;

public class HomeWorkIfElsePractice {
        public static void main(String[] args) {
                {
                        {
                        //task
                        int number = 40;
                        if (number < 0 || number > 0) {
                                System.out.println("Number is positive");
                        } else if (number == 0) {
                                System.out.println("number is equal to zero");
                        } else {
                                System.out.println("Number is negative");

                        }

                        //  task2
                        int year = 2019;
                        if ((year % 4 == 0  && year % 100 != 0 )||year % 400 ==0){
                                System.out.println(" is a leap year");
                        } else {
                                System.out.println("is not a leap year");
                        }

                        // task 3.
                        int num1 = 3;
                        int num2 = 123;

                        if (num1 > num2) {
                                System.out.println("num 1 is larger than number 2 ");
                        } else if (num1 < num2) {
                                System.out.println("num1 is less than num2");

                        }

                        // task 4.

                        double tempInFahrenheit = 72.6;
                        if (tempInFahrenheit <= 32 ) {
                                System.out.println("freezing");
                        } else if (tempInFahrenheit >= 212) {
                                System.out.println("boiling");
                        } else  if (tempInFahrenheit >32 && tempInFahrenheit < 212){
                                System.out.println("in between");
                        }


                        // task 5.

                        // byte month = 6;

                        byte month1 = 6;
                        if (month1 == 12 || month1 == 1 || month1 == 2) {
                                System.out.println("winter");
                        } else if (month1 == 3 || month1 == 4 || month1 == 5) {
                                System.out.println("spring");
                        } else if (month1 == 6 || month1 == 7 || month1 == 8) {
                                System.out.println("summer");
                        } else if (month1 == 9 || month1 == 10 || month1 == 11) {
                                System.out.println("fall");
                        } else {
                                System.out.println("does not exist ");

                        }


                }

                }


        }
}




package IfElse;

public record HomeWorkIfElse2() {
    public static void main(String[] args) {

        //task1:
        int num1 = 5;

        int num2 = 7;

        int num3 = 5;

        if (num1 == num2){
            System.out.println("Equal");
        }else if (num1 == num3){
            System.out.println("Two of the numbers are equal");
        } else {
            System.out.println("None of the numbers are equal");
        }

        // Task 2:

        int num = 9;
        if (num % 3 == 0 || num % 5 == 0){
            System.out.println("Multiple of 3 or 5");
        } else {
            System.out.println("Not a multiple of 3 or 5");
        }



        //Task 3:
        int num6 = 4;
        int num7 = 3;
        if ((num6 + num7) % 2 == 0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }

        // Task 4:

        int number = 7;
        if(number % 1 == 0 && (number % number) ==0){
            System.out.println("Prime");
        } else{
            System.out.println("Nop prime");
        }



    }




    }




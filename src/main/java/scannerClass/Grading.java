package scannerClass;

import java.util.Scanner;

public class Grading {
    public static void main(String[] args) {

        Scanner grade = new Scanner(System.in);
        System.out.println("bad,study everything again!");

        int gradeBetween = grade.nextInt();
        System.out.println("grade is between 0 and 20");

        if (gradeBetween >= 0 && gradeBetween <= 20){
            System.out.println("bad ,study evrything again1");
        }
        else if(gradeBetween>=21 && gradeBetween <= 40){
            System.out.println("ok,study more");
        }
        else if(gradeBetween<=41 && gradeBetween>=60){
            System.out.println("good,study more");
        }
        else if(gradeBetween>=61 && gradeBetween <= 80){
            System.out.println("very good,keep up");
        }
        else if(gradeBetween >= 81 && gradeBetween <=95){
            System.out.println("perfect,good job");
        }
        else if(gradeBetween >=96 && gradeBetween <=100){
            System.out.println("exceptional,proud of you");
        }
        else{
            System.out.println("inter the number");
        }




    }
}

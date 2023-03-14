package arithmaticOperators;

public class HomeWorkArithmeticPractice {
    public static void main(String[] args) {
//task1
        int a = 100;
        int b = 200;
        int sum = a + b;
        System.out.println("The sum of a and b is " + sum);
//task2
        int q = 5;
        int w = 9;
        int e = 10;
        int sum2 = q + w + e;
        System.out.println("The sum of q, w and e is " + sum2);

//task3
        int x = 1;
        int y = 2;
        System.out.println(x + " + " + y + " = " + (x+y));
        System.out.println(y + " - " + x + " = " + (y-x));
        int x1 = 2;
        int y1 = 4;
        System.out.println(x1 + " * " + y1 + " = " + (x1*y1));
        System.out.println(x1 + " / " + y1 + " = " + (x1/y1));
        int g = 8;
        int d = 2;
        System.out.println(a + " + " + (g+d) + " = " + (g+g+d));
        System.out.println((g+g+d) + " % 7 = " + ((g+g+d)%7));
//task4

        int length = 9;
        int width = 15;
        int area = length * width;
        int perimeter = 2 * (length + width);
        System.out.println("The area of the rectangle is: " + area);
        System.out.println("The perimeter of the rectangle is: " + perimeter);

//task5

        int num = 2345;
        int sum3 = (num + 8) / 3;
        int result = sum3 % 5 * 5;
        System.out.println("The final result is: " + result);

//task6

        int num2 = 2345;
        num += 8;
        num /= 3;
        num %= 5;
        num *= 5;
        System.out.println("The final result is: " + num2);

//task7

        int num1 = 23;
        int num22 = 45;
        System.out.println( );

//task8
        int sum4 = 10;
        int sum6 = -10;
        System.out.println( sum4 != sum6 );




    }
}

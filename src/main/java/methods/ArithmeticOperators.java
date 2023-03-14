package methods;

public class ArithmeticOperators {

    /*
    crete a method which returns the sum of numbers
    1.takes 2 int
    2.takes 3 int

    create a method which returns the average of numbers
    1.takes 4 int
    2.takes 6 int
     */

    public int arithmeticOperators(int a, int b){
        return a + b;

    }
    public int arithmeticOperators( int a, int b , int c ){
        return  a + b + c ;

    }
    public int arithmeticOperators(int a, int b, int c, int d){
        return  a + b + c + d;
    }
    public int arithmeticOperators(int a, int b, int c, int d,int g ,int s){
        return a + b + c + d + g + s;
    }

    /*
    crete 2 getAreaOfTriangle methods
    1.int base,int height ( 1/2 *base 8 height)
    2.int a,int b, int c
    int s = (a + b + c)/2
    int area = sqrt(s(s-a)(s-b)(s-c) )
    Moth.sqrt()
     */

    public double getAreaOfTriangle(int base, int height){
        return getAreaOfTriangle((double)base, height);
    }

    public double getAreaOfTriangle(int a, int b, int c){
        return getAreaOfTriangle((double)a,b,c);
    }

    public double getAreaOfTriangle(double base, double height){
        return 0.5 * base * height;
    }

    public double getAreaOfTriangle(double a, double b, double c){
        double semiPerimeter = (a + b + c) / 2;
        return Math.sqrt(semiPerimeter * (semiPerimeter - a) * (semiPerimeter - b) * (semiPerimeter - c));
    }

    public static void main(String[] args) {
        System.out.println((double)0.5);
    }




    }





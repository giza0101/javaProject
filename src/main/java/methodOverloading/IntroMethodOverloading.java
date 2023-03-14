package methodOverloading;

public class IntroMethodOverloading {
    /*
    method name must be unique. We cannot have two or more methods to use the same name
     */

    public int getAreaOfRectangle(int length , int width){
        return length * width;
    }
    public int getAreaOfRectangle( long length, long width){
        return (int) (length * width);
    }
    public int getAreaOfRectangle(double length,double width){
        System.out.println(9.4 + "fyg");
        return (int) (length * width);
    }

    /*
    create getPerimiterOfSquare a methods;return type = int;
     */


    public int getPerimeterSquare ( int a ,int b){
        return a *b;
    }
    public int getPerimeterSquare( long a ,long b){
        return (int)( a * b);
    }
    public int getPerimeterSquare(double a, double b){;
        return (int)(a * b);
    }

    /*
    create a method that accepts one number and returns true if its prime,else false user
     must be able to give:

     int
     short
     long
     prime number is the number that can be only divided by itself and by 1
     */


    public boolean isPrime(int a){//short//long
       for(int i = 2; i < a; i ++){
           if(a % i == 0){
               return false;
           }

        }
        return true;
    }

    public static void main(String[] args) {



    }
}

package practice;

public class HomeWorkCalculator {

    public static int addition (int a,int b ){
        return a +b;
    }
    public static int subtraction(int a,int b){
        return a - b;
    }
    public static int multiplication( int a,int b){
        return a * b;
    }
    public static double division( int a,int b){
        if(b !=0) {
            return (double) a / b;

        }else{
          return 0;

        }
    }

}

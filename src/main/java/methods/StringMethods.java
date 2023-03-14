package methods;

public class StringMethods {

    static boolean compareStrings(String str1, String str2){

        if(str2.equalsIgnoreCase(str2)){
            return true;

        }
        return false;
    }


    public static void main(String[] args) {
        boolean isSame = compareStrings("hello","hellooooooo");//false
        System.out.println(isSame);


        compareStrings("bye","sf");
        multiplicationOut(5);
    }



    static String getConcatenated(String a1,String b1){
        return (a1 + b1).toUpperCase();
    }


    static int getConcatenated1(String a,String b){
        return (a + b).length();
    }


    public static boolean evenOrNot( int a ){
        if(a % 2 == 0){
            return true;
        }
        return false;

    }

    public static boolean isDivisible10( int a){
        return a % 10 == 0;
    }


    public static void  multiplicationOut( int s){

        for( int i  = 1;i<= 10;i++){
            System.out.println(s + "*" + i + "=" +(s * i));

        }


    }

    public static int theLargestOne( int a, int b){
        if(a>b){
            System.out.println(a);
            return a;//return must be last one

        }
        System.out.println(b);
        return b;
    }

    public static int average( int a,int b,int c,int d){//signu
        return( a + b + c + d)/4;
    }

    public static int startingFrom1( int a){
        int sum = 0;
        for(int aa = 1;aa <=a;aa++){
            sum += 1;

        }
        return sum;
    }


}

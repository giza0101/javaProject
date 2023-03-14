package methods;

public class MethodsCreation {
    public static int method(int a, int b){
        return a;
    }
    public static boolean method1(int a, int b){
        return true;

    }
    public static void method3(){
        return ;



    }
    public static void method4(){
        return;
    }
    public static void method5(){

    }
    public static int method6( int a){
        return a;
    }
    public static int method7(int i){
        return i;
    }
    public static int method8(byte a){
        return a;
    }
    public static int method9 (int a, int b){
        String str = ("" + (a +b));
        return (a + b);
    }

    public static boolean method10 (int a){
        return false;
    }



    public static void main(String[] args) {
        System.out.println(method9(2, 5));
        System.out.println(method10(3));
    }

    }



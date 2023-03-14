package loops;

public class PracticeLoops {
    public static void main(String[] args) {


        for (int gg = 10; gg >= 1; gg--) {
            System.out.println(" The value of x is: " + gg);
//================================================================

            for (int aa = 10; aa >= 0; aa-=2) {
                System.out.println("The value of y is" + aa);
            }
//================================================================
            for( int ee = 1; ee <= 15; ee += 2){
                System.out.println( " the value of num is " + ee);
            }
//================================================================
            int sum = 0;
            for ( int ii = 1; ii <=10 ; ii ++){
                System.out.println("The value of ii is " +ii);
                sum = sum + ii;//1+2+3+4
            }
            System.out.println( "The result is " + sum);
        }

 //================================================================
        int sum1 = 0;
        for( int h = 2; h<=100; h+=2){
            System.out.println(" The value of  h is" + h );
            sum1 = sum1 + h;
        }
        System.out.println( "the value  is" +sum1);
    }
}
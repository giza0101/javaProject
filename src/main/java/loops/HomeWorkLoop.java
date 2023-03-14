package loops;

public class HomeWorkLoop {
    public static void main(String[] args) {

        //task 1
        for( int a = 1; a <= 50; a++ ){
            if(a % 55==0){
                System.out.println(a);
            }

        }

        //task 3

        for ( int i=10; i >= 1; i --){
            System.out.println(i);
        }

        //task 7
        String number = "1234";
        int s = 0;
        for(int g = 0; g< number.length();g++){
            s += number.charAt(g);
            System.out.println();

        }


        //task 8

        for( int d = 1; d <= 5;d ++){
            for ( int l = 5; l >= d; l--){
                System.out.print("*");
            }
            System.out.println("");

        }

        //task 9
        for ( int i = 1; i <=4;i++){
            for( int k=1; k <= i;k++){
                System.out.print(i);
            }
            System.out.println("");
        }



    }
}

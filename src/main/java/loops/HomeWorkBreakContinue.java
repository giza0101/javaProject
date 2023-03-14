package loops;
import java.util.Scanner;

public class HomeWorkBreakContinue {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a positive number");
        int number = scanner.nextInt();


        if( number >= 3){
            for( int i =1;i < number;i++){

                if( number % 3 ==0){
                    System.out.println(i);
                    if(number % 5 !=0){

                    }
                }
            }

        }else if(number<0){
            System.out.println("Input must be positive");
        }else{
            System.out.println();
        }

    }
}

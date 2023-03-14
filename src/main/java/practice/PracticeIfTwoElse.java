package practice;
import java.util.Scanner;
public class PracticeIfTwoElse {
    public static void main(String[] args) {


        Scanner ss = new Scanner(System.in);

        System.out.println( " Enter month; 1-12");
        int gg = ss.nextInt();

        if(gg == 1||gg ==3 ||gg ==5||gg==7||gg==8||gg==10||gg==12){
            System.out.println("31 days");
        }
        else if( gg ==2){
            System.out.println("28 days");

        }
        else if(gg ==4||gg==6||gg==9||gg==11){
            System.out.println("30 days");

        }
        else{
            System.out.println("invalid");
        }
    }
}

package switchStatement;

public class IntroToSwitch {
    public static void main(String[] args) {

        int number = 5;

        switch (number){
            case 1 :
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            case 4:
                System.out.println("four");
                break;
            case 5:
                System.out.println("five");
            default:
                System.out.println("invalid number");



  //         ==========================================================================

                String digit = "three";
                switch(digit) {
                    case "one":
                        System.out.println(1);
                        break;
                    case "two":
                        System.out.println(2);
                        break;
                    case "three":
                        System.out.println(3);
                        break;
                    case "four":
                        System.out.println(4);
                        break;
                    case "five":
                            System.out.println(5);
                            break;
                    default:
                        System.out.println("invalid");



                }

                String num = "five";

                if( num == "one"){
                    System.out.println(1);

                }
                else if(num == "two"){
                    System.out.println(2);
                }
                else if(num == "three"){
                    System.out.println(3);
                }
                else if(num =="four"){
                    System.out.println(4);
                }
                else if(num == "five"){
                    System.out.println(5);
                }
                else{
                    System.out.println("invalid number");
                }




        }
    }

}

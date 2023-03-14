package IfElse;

public class IfElseIf {
    public static void main(String[] args) {

        if (20 < 5){
            System.out.println("2 is less than 5");
        }
        else if (200 <5){
            System.out.println("2 is more than 5");
        }
        else if (100==100){
            System.out.println("whatever");
        }
        else if ( "apple".equals("apple")){
            System.out.println("false");
        }
        else{
            System.out.println("2 is equal to 5");
        }


        String actualPassword = "abc123";
        String enterPassword = "ABC123";
        if(actualPassword.equals(actualPassword)){
            System.out.println("Succcessfuly logged in");
        }

    }
}





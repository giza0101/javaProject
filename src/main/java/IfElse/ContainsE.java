package IfElse;

import java.util.Scanner;

public class ContainsE {
    public static void main(String[] args) {

        Scanner user = new Scanner(System.in);
        System.out.println("Enter any word");
        String word = user.nextLine();

        if (word.contains("e")){
            System.out.println(word.indexOf("e"));
        }
        else if(!word.contains("e")){
            System.out.println("The word doesn't contain e");
        }

        String letter = "Hello world";
        if(letter.contains("e")){
            System.out.println("e");

        }
        else{
            System.out.println("The word doesn't contain e");
        }

        }
    }


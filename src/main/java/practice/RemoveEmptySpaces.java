package practice;
import java.util.Scanner;
public class RemoveEmptySpaces {
    public static void main(String[] args) {


        Scanner g = new Scanner(System.in);
        System.out.println("Enter anything ");

        String sentence = g.nextLine();
        sentence= sentence.replaceAll("  ","  ");
        System.out.println(sentence);


    }
}

package strings;

public class StringToLowerCase {
    public static void main(String[] args){

        String word = "Hello Evryone! How are you doing";
        System.out.println(word);
        word = word.toLowerCase();//convert to lower case
        System.out.println(word);
        String word2 = "Hello guys, I am good. And you?";
        System.out.println(word2);
        word2 = word2.toUpperCase();
        System.out.println(word2);

        String word3 = "Hello evryone";
        String word4 = "HELLO EVRYONE";
        word3 = word.toLowerCase();
        System.out.println(word3);
        word4 = word.toUpperCase();
        System.out.println(word4);

        System.out.println(word3.toUpperCase().equals(word4));


    }
}

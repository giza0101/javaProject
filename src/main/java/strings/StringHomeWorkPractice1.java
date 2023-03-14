package strings;

public class StringHomeWorkPractice1 {
    public static void main(String[] args) {


        String massageSign = "Hello everyone, Let do Java String exercises";
         char y = massageSign.charAt(10);
        System.out.println(y);

        int length = massageSign.length();
        System.out.println(length);

         massageSign = massageSign.toUpperCase();
         System.out.println(massageSign);

         massageSign = massageSign.toLowerCase();
         System.out.println(massageSign);

         char letter = massageSign.charAt(4);
         System.out.println(letter);

         char lastLetter = massageSign.charAt( length -1);
         System.out.println(lastLetter);//lastLetter is s

        String firstLetter = massageSign.substring(0,1);
        String case2 = firstLetter.toLowerCase();
        System.out.println(case2);

        String case3 = massageSign.substring(length -1);
        case3 = case3.toUpperCase();
        System.out.println(case3);








    }
}

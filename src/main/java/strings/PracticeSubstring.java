package strings;

public class PracticeSubstring {
    public static void main(String[] args) {

        String first_name = "Jacob";
        String last_name = "Coffee";

        /*
         String name1 = Jee
         String name2 = Cee
         string name3 = Jacee
         String name4 = Cob
         String name5 = Feeco
         String mane6 = Ofja
         */

        System.out.println(first_name.substring(0,1) +last_name.substring(4,6));
        System.out.println(last_name.replace("Coff","J"));
        System.out.println(last_name.replace("Coff","J"));
        System.out.println(last_name.substring(0,3)+ last_name.substring(4,6));
        System.out.println(last_name.charAt(0) + "" +last_name.charAt(1) + first_name.charAt(4));
        System.out.println(last_name.toUpperCase().charAt(2) + last_name.substring(4) +
                first_name.substring(2,4));
        System.out.println(last_name.toUpperCase().charAt(1) + last_name.charAt(2) +
                first_name.toLowerCase());





    }
}

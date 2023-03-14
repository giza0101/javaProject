package strings;

public class PracticeStrings {
    public static void main(String[] args) {

        String singerName = "Mickael Jackson ";
        System.out.println(singerName.length());//returns number of chars

        System.out.println(singerName.endsWith("on"));//true
        System.out.println(singerName.startsWith("Misha"));//false
        System.out.println(!singerName.isEmpty());//true
        System.out.println(singerName.toLowerCase());//mickael jackson
        System.out.println(singerName);//Mickael Jackson

        singerName = singerName.toUpperCase();
        System.out.println(singerName);

        System.out.println(singerName.charAt(0));//M
        System.out.println(" "+ singerName.charAt(0) + singerName.charAt(3));//Mh

        System.out.println(singerName.indexOf("c"));//2
        System.out.println(singerName.indexOf("C",3));
        System.out.println(singerName.indexOf("W"));//-1


        System.out.println(singerName.charAt(2352));//index out of bounds error

        String singerName2 = "Justin Bieber";
        boolean areTheySame = singerName2.equals(singerName);//false
        System.out.println(areTheySame);

        System.out.println(!singerName.equals(singerName2));//true

        singerName = singerName2;

        System.out.println(singerName.equals(singerName2));//true
        System.out.println(singerName == singerName2);//true



    }
}

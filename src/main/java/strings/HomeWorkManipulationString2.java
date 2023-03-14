package strings;

public class HomeWorkManipulationString2 {
    public static void main(String[] args) {
        //task1
        String gg1 = "Hello Universe";
        char s2 = '0';
        System.out.println(gg1.indexOf(s2));
        //task2
        String gg2 = "Hello, World";
        int start = 7;
        int end = 12;
        String str = gg2.substring(start, end);
        System.out.println(str);
        //task3
        String gg3 = "Good morning World";
        char a = gg3.charAt(13);
        System.out.println(a);
        //task4
        String gg4 ="    I love coding    ";
        gg4 = gg4.trim();
        System.out.println(gg4);
        //task5
        String gg5 = "Learn as if you will live forever,live like you will die tomorrow";
        gg5 = gg5.replace("o","");
        System.out.println(gg5);





    }
}

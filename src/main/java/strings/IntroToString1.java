package strings;

public class IntroToString1 {
    public static void main(String [] args){

        String city = "London";
        System.out.println(city);

        String city2 =  new String("New York");
        System.out.println(city2);

        //====================================================

        System.out.println(city.length()); //6
        /*
        length() method return us the number of chars in String
         */

        String name = "Antananarivo";
        System.out.println("the length of Antananarivo is;" + name.length());

        System.out.println("madrid");
        System.out.println(true);
        System.out.println(234);

        int b = 234;


        String school = "Codewise";
        school = "Codewise Academy";
        /*
        equal () method compares values of 2 Strings
         */

        String fruit1 = "apple";
        String fruit2 = "apple";
        String fruit3 = "Apple";
        boolean isSame =  fruit1.equals(fruit2);
        System.out.println(isSame);//true

        isSame = fruit1.equals(fruit3);
        System.out.println(isSame);//false

        fruit1 = "banana";
        fruit2 = "orange";
        System.out.println("is banana same as orange?" + fruit1.equals(fruit2));//false

        boolean isSame2 = !fruit1.equals(fruit2);//not equals,true




        String state1 = "California";
        String state2 = "illinois";
        String state3 = "Florida";
        String state4 = "Illinois";
        String state5 = "florida";
        System.out.println(state1.equals(state2));

        boolean gg = !state1.equals(state2);
        System.out.println(gg);
        boolean vv = !state3.equals(state4);
        System.out.println(vv);
        boolean cc = !state5.equals(state3);
        System.out.println(cc);



        int cucumber = 5;
        int tomato = 10;

        System.out.println("cucumber:" + cucumber);//cucumber: 10
        System.out.println("tomato:" + tomato);//tomato: 5

        int empty = cucumber;//5
        cucumber = tomato;//10
        tomato = empty;//5

        int aa = 5;
        int bb = 10;
        int cv = aa;


        aa += cv;//10
        bb -= cv;//5


        System.out.println("aa:" + aa);
        System.out.println("bb" + bb);



    }
}

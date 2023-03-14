package primitiveDataTypes;

public class IntroToPrimitives {
    public static void main(String[] args) {

        int age = 35;
        int number = 100;

        System.out.println(age);

        System.out.println(35);
        System.out.println(100);

        age = 37;
        System.out.println(age);

        //===================================================================

        byte myByte1 = 36; //declaring variable
        byte myByte2 = 117;
        byte myByte3 = 127;
        byte myByte4 = -128;

        myByte1 = 100; //reassigning value
        System.out.println(myByte1);

        myByte1 = 40;
        System.out.println(myByte1); //40

        myByte2 = 70;
        System.out.println(myByte2); //70

        myByte3 = 110;
        System.out.println(myByte3); //110

        myByte4 = -125;
        System.out.println(myByte4); //-125

        short iceCreamPerDay = 5000;
        short iceCreamPerWeek = 2500;
        // short iceCreamPerMonth = 100000; will not work,because more than 32000


        System.out.println(iceCreamPerDay);
        System.out.println(iceCreamPerWeek);


        int numofFollowers = 1300;
        numofFollowers = 300000;
        numofFollowers = 2130000000;
        System.out.println(numofFollowers);
        System.out.println(numofFollowers);

        long creditCard1 = 1111222233334444L;
        long creditCard2 = 12341236467553456l;
        System.out.println(creditCard1);
        System.out.println(creditCard2);

        short Giza1 = 250;
        short Giza2 = 500;
        System.out.println(Giza1);
        System.out.println(Giza2);


    }
}

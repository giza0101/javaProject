package primitiveDataTypes;

public class PracticeVariableDeclaration {

    public static void main (String [] args){

        byte myByte; //declare variable
        byte _another_byte;

        myByte = 5;
        myByte = 10;

        System.out.println(myByte); //10

        myByte = 20;

        System.out.println(myByte); //20

        short myShort = 30;

        System.out.println(myShort); //30

        short myLove = 40;

        System.out.println(myLove);

        short mySon = 50;
        System.out.println(mySon);

        short myGiza = 60;
        System.out.println(myGiza);

        short myNas = 70;
        System.out.println(myNas);

        int myInt = 5000;
        System.out.println(myInt);
        int myCodwise = 4600;
        System.out.println(myCodwise);
        int myInt1 = 4700;
        System.out.println(myInt1);
        int myInt2 = 4800;
        System.out.println(myInt2);
        int myInt3 = 4900;
        System.out.println(myInt3);
        int myWater = 4300;
        System.out.println(myWater);
        int myGlass = 4200;
        System.out.println(myGlass);

        //=========================================

        /*
        -2  147  000 to 2 147 000 000 range of integer

         */

        long longNumber = 1;
        longNumber = 2000;

        long longNumber2 = -21478465375l;
        long longNumber3 = 21446553347l;

        System.out.println(longNumber2);

        byte byteNumber = 0;
        short shortNumber = 0;
        int intNumber = 3236;
        long longNumber1 = 2000;


        //CASTING - is used to store longer variable values into smaller variable values
        intNumber = (int)longNumber;
        byteNumber = (byte)intNumber;

        longNumber3 = 2000;
        intNumber = (byte)longNumber3;
        System.out.println(longNumber);

        intNumber = 3236;
        shortNumber = (short)intNumber;
        System.out.println(shortNumber);

        longNumber = 5000;
        intNumber = (int)longNumber;
        System.out.println(intNumber);

        shortNumber = 10;
        longNumber = (int)shortNumber;
        System.out.println(longNumber);

        longNumber = 207694;
        intNumber = (int)longNumber;
        System.out.println(intNumber);

        intNumber = 20501;
        System.out.println(intNumber);











        longNumber = byteNumber;
        longNumber = shortNumber;
        intNumber = shortNumber;
        intNumber = byteNumber;
        // shortNumber = LongNumber;
        // short number = intNumber; NOT WORK















        //----------------------------------------------------
        /*
        create 5 short variable
         */


        /*
        this method takes number and multiplies
        1. Declare variable (means create container)
        2. Assign value to variable (put value inside variable)
        3. Reassign value to variable(put new value to the variable)
        --------------------

        VARIABLE DECLARATION

        byte myByte
        short myShort
        int myInt
        long myLong

        VALUE ASSIGNMENT

        byte myByte = 3; (declare variable and assign value)

        short age; (declaring variable
        age = 40; ( assigning value to variable)

        REASSIGN VALUE

        int number = 100;
        number = 30;



        NAMING CONVENTION
        -all variable must start with lower case
        -all variable must use camelCase (thisIsMyCamelCaseLongWord)
        -all classes must start with upper case,use camelCase
        -all packages must start




         */

        // single line comment
    }
}

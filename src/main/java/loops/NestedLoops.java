package loops;

public class NestedLoops {
    public static void main(String[] args) {

        /*
        nested loops - loop inside loop
         */

        for (int g = 1; g <= 15; g++) {
            for (int ga = 1; ga <= 15; ga++) {
                System.out.print((g * ga) + "\t");
            }
            System.out.println();
        }


        /*
         *
         * *
         * * *
         * * * *
         * * * * *
         * * * * * *

         */


        for (int f = 1; f <= 10; f++) {
            for (int fa = 1; fa <= f; fa++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int k = 0; k < 10; k++) {
            for (int c = 0; c < 10 - c; c++) {
                System.out.print(" ");
                for (int ca = 0; ca < (2 * k + 1); ca++) {
                    System.out.print("* ");
                }
                System.out.println();


                //=================================================


            }

        }
        }


    }

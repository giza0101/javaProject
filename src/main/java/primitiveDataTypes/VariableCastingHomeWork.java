package primitiveDataTypes;

public class VariableCastingHomeWork {
        public static void main(String[] args) {
            byte b = 5;
            short s = 100;
            int i = 1000;
            long l = 1000000L;
            float f = 4.14f;
            double d = 2.14159;

            //
            b = (byte) s;
            b = (byte) i;
            b = (byte) l;
            b = (byte) f;
            b = (byte) d;

            //
            s = b;
            s = (short) i;
            s = (short) l;
            s = (short) f;
            s = (short) d;

            //
            i = s;
            i = b;
            i = (int) l;
            i = (int) f;
            i = (int) d;

            //
            l = s;
            l = i;
            l = b;
            l = (long) f;
            l = (long) d;

            //
            f = s;
            f = i;
            f = l;
            f = b;
            f = (float) d;

            // e
            d = s;
            d = i;
            d = l;
            d = f;
            d = b;
        }
    }



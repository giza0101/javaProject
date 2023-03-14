package methods;

public class HomeWorkMethods {
    public class PracticeMethods {
        //1

        public static int multiply(int num1, int num2){

            return num1 * num2;
        }
        //2

        public String toLowerCase(String str){

            return str.toLowerCase();
        }
        //3

        public double divide(int num1, int num2){

            return (double)num1 / num2;
        }
        //4

        public static boolean isPalindrome(String str){
            String reversed = new StringBuilder(str).reverse().toString();
            return str.equals(reversed);
        }
        //5

        public double multiplyBy100(double num){

            return num * 100;
        }
        //6

        public static boolean isConsonant(char c){
            String vowels = "gizaGIZZA";
            return !vowels.contains(Character.toString(c));
        }
        //7

        public boolean isDifferenceEqualTo5(int num1, int num2){
            int difference = Math.abs(num1 - num2);
            return difference == 5;
        }
        //8

        public boolean isValidEmail(String email){

            return email.contains("@") && email.contains(".");
        }
        //9

        public boolean isPrime(int num){
            if (num <= 1) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(num); i++){
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        }
        //10

        public static boolean haveSameParity(int num1, int num2){

            return num1 % 2 == num2 % 2;
        }
    }

}

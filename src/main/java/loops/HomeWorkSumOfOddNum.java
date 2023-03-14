package loops;

public class HomeWorkSumOfOddNum {
    public static void main(String[] args) {

        int number = -5;
        int sum = 0;
        if (number > 0) {

            for (int i = 1; i <= number; i++) {
                if (i % 2 != 0) {
                    sum += i;
                }

            }
            System.out.println(sum);
        }else{
            System.out.println("Number must be positive");
        }




    }
}